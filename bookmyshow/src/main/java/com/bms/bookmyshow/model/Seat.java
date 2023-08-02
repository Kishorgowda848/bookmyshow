package com.bms.bookmyshow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends Base {

  private String number;

  private int row;

  /* column is reserved word in postgresql */
  @Column(name = "col")
  private int column;

  @ManyToOne
  private SeatType seatType;
}
