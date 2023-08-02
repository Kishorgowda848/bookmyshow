package com.bms.bookmyshow.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class SeatType extends Base {

  private String name;
}
