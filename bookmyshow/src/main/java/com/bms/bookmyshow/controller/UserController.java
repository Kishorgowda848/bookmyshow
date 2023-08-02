package com.bms.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bms.bookmyshow.dto.SignUpUserDTOResponse;
import com.bms.bookmyshow.dto.SignupUserDTORequest;
import com.bms.bookmyshow.model.User;
import com.bms.bookmyshow.service.UserService;

@Controller
public class UserController {

  @Autowired
  private UserService userService;

  public SignUpUserDTOResponse signUpUser(SignupUserDTORequest request) {
    User user = userService.signUp(request.getEmail(), request.getPassword());
    SignUpUserDTOResponse response = new SignUpUserDTOResponse();
    response.setUserId(user.getId());
    return response;
  }

}
