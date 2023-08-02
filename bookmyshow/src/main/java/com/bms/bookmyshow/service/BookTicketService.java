package com.bms.bookmyshow.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.bms.bookmyshow.enums.SeatStatus;
import com.bms.bookmyshow.exception.SeatNotAvailableException;
import com.bms.bookmyshow.model.Seat;
import com.bms.bookmyshow.model.Show;
import com.bms.bookmyshow.model.ShowSeat;
import com.bms.bookmyshow.model.Ticket;
import com.bms.bookmyshow.model.User;
import com.bms.bookmyshow.repositories.SeatRepository;
import com.bms.bookmyshow.repositories.ShowRepository;
import com.bms.bookmyshow.repositories.ShowSeatRepository;
import com.bms.bookmyshow.repositories.TicketRepository;
import com.bms.bookmyshow.repositories.UserRepository;

@Service
public class BookTicketService {

  @Autowired
  private SeatRepository seatRepository;

  @Autowired
  private ShowSeatRepository showSeatRepository;

  @Autowired
  private ShowRepository showRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private TicketRepository ticketRepository;

  @Transactional(isolation = Isolation.SERIALIZABLE, timeout = 2)
  public Ticket bookTicket(List<Long> seatIds, Long userId, Long showId) throws SeatNotAvailableException {
    // Get all the Seats by Id
    List<Seat> seats = seatRepository.findAllByIdIn(seatIds);

    Optional<Show> show = showRepository.findById(showId);

    Optional<User> user = userRepository.findById(userId);

    if (show.isEmpty()) {
      throw new IllegalArgumentException("Show By Id: " + showId + " does't exists");
    }

    if (user.isEmpty()) {
      throw new IllegalArgumentException("User by Id " + userId + " does't exists");
    }

    List<ShowSeat> showSeats = showSeatRepository.findBySeatInAndShow(seats, show.get());

    for (ShowSeat showSeat : showSeats) {

      if (!showSeat.getSeatStatus().equals(SeatStatus.AVALIBLE)) {
        throw new SeatNotAvailableException();
      }

    }

    for (ShowSeat showSeat : showSeats) {
      showSeat.setSeatStatus(SeatStatus.LOCKED);
      showSeat.setLockedAt(new Date());
    }

    List<ShowSeat> savedShowSeat = showSeatRepository.saveAll(showSeats);

    Ticket ticket = new Ticket();
    ticket.setUser(user.get());
    ticket.setSeats(seats);
    ticket.setShow(show.get());
    ticket.setAmount(0);
    ticket.setBookingTime(new Date());

    return ticketRepository.save(ticket);
  }
}
