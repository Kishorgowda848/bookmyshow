package com.bms.bookmyshow.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bookmyshow.model.Seat;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {

  List<Seat> findAllByIdIn(List<Long> ids);

}
