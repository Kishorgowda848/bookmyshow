package com.bms.bookmyshow.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;

import com.bms.bookmyshow.enums.Feature;
import com.bms.bookmyshow.enums.Language;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Show extends Base {

  @ManyToOne
  private Auditorium auditorium;

  private LocalDateTime startTime;

  private LocalDate endTime;

  @ManyToOne
  private Movie movie;

  @Enumerated(EnumType.STRING)
  private Language language;

  @Enumerated(EnumType.STRING)
  @ElementCollection
  private List<Feature> feature;
}
