package com.bms.bookmyshow.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.bms.bookmyshow.enums.Language;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Movie extends Base {

  @Enumerated(EnumType.STRING)
  @ElementCollection
  private List<Language> languages;

  private String name;
}
