package com.bms.bookmyshow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.bms.bookmyshow.controller.UserController;
import com.bms.bookmyshow.dto.SignupUserDTORequest;

@SpringBootApplication
@EnableJpaAuditing
public class BookmyshowApplication implements CommandLineRunner {

  @Autowired
  private UserController userController;

  public static void main(String[] args) {
    SpringApplication.run(BookmyshowApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

    SignupUserDTORequest request = new SignupUserDTORequest();
    request.setEmail("Kishore@gmail.com");
    request.setPassword("kishore124");

    userController.signUpUser(request);

    System.out.println("Initialized Sucessfully");

  }

}
