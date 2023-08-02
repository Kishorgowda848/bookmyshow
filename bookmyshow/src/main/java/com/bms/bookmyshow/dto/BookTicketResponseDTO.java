package com.bms.bookmyshow.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketResponseDTO {

  private int amount;

  private List<String> seatNumber;

  private Long ticketId;

  private String paymentLink;
}
