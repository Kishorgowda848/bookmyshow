package com.bms.bookmyshow.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignupUserDTORequest {

  private String email;

  private String password;
}
