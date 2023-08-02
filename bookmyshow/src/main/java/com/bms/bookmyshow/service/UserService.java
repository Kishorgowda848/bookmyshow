package com.bms.bookmyshow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bms.bookmyshow.model.User;
import com.bms.bookmyshow.repositories.UserRepository;

@Service
public class UserService {

  @Autowired
  private UserRepository userRepository;

  public User signUp(String email, String password) {
    User user = new User();
    user.setEmail(email);
    user.setPassword(password);
    return userRepository.save(user);
  }
}
