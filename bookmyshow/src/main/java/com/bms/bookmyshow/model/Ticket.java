package com.bms.bookmyshow.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.bms.bookmyshow.enums.TicketStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Ticket extends Base {

  private double amount;

  private Date bookingTime;

  @ManyToMany
  private List<Seat> seats;

  @ManyToOne
  private User user;

  @ManyToOne
  private Show show;

  @Enumerated(EnumType.STRING)
  private TicketStatus ticketStatus;

  @OneToMany
  private List<Payment> payments;

}
