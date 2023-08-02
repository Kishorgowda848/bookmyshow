package com.bms.bookmyshow.model;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "users")
public class User extends Base {
  /* User is reserve word in postgresql */
  private Long age;
  private String name;
  private String email;
  private String password;
  private String phoneNumber;
}
