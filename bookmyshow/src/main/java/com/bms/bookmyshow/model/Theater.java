package com.bms.bookmyshow.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Theater extends Base {

  private String name;

  private String address;

  @OneToMany
  private List<Auditorium> auditoriums;

  @ManyToOne
  private City city;
}
