package com.bms.bookmyshow.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

import com.bms.bookmyshow.enums.Feature;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Auditorium extends Base {

  private String name;

  @OneToMany
  private List<Seat> seats;

  @Enumerated(EnumType.STRING)
  @ElementCollection
  private List<Feature> features;
}
