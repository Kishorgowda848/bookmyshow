package com.bms.bookmyshow.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeatType extends Base {

  @ManyToOne
  private Show show;

  @ManyToOne
  private SeatType seatType;

  private double price;
}
