package com.bms.bookmyshow.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bms.bookmyshow.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {

}
