package com.bms.bookmyshow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.bms.bookmyshow.dto.BookTicketRequestDTO;
import com.bms.bookmyshow.dto.BookTicketResponseDTO;
import com.bms.bookmyshow.exception.SeatNotAvailableException;
import com.bms.bookmyshow.model.Ticket;
import com.bms.bookmyshow.service.BookTicketService;

@Controller
public class TicketController {

  @Autowired
  private BookTicketService bookTicketService;

  public BookTicketResponseDTO bookTicket(BookTicketRequestDTO bookTicket) throws SeatNotAvailableException {

    BookTicketResponseDTO response = new BookTicketResponseDTO();

    try {
      Ticket ticket =
          bookTicketService.bookTicket(bookTicket.getSeatId(), bookTicket.getUserId(), bookTicket.getShowId());
      response.setTicketId(ticket.getId());

    } catch (Exception e) {
      // TODO: handle exception
    }

    return response;
  }
}
