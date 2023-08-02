package com.bms.bookmyshow.repositories;

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

import com.bms.bookmyshow.model.Seat;
import com.bms.bookmyshow.model.Show;
import com.bms.bookmyshow.model.ShowSeat;

@Repository
public interface ShowSeatRepository extends JpaRepository<ShowSeat, Long> {

  @Lock(LockModeType.PESSIMISTIC_WRITE)
  List<ShowSeat> findBySeatInAndShow(List<Seat> seat, Show show);

}
