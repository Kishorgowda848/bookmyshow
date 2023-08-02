package com.bms.bookmyshow.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class City extends Base {

  private String name;

  @OneToMany
  private List<Theater> theaters;
}
