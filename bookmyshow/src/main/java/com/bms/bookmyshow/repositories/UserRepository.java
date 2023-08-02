package com.bms.bookmyshow.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bookmyshow.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  @Override
  Optional<User> findById(Long id);

}
