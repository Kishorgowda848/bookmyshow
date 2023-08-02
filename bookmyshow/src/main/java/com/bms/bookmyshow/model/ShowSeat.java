package com.bms.bookmyshow.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import com.bms.bookmyshow.enums.SeatStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends Base {

  @ManyToOne
  private Show show;

  @ManyToOne
  private Seat seat;

  @Enumerated(EnumType.STRING)
  private SeatStatus seatStatus;

  private Date lockedAt;
}
