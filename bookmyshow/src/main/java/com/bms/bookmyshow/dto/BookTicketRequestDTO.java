package com.bms.bookmyshow.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookTicketRequestDTO {

  private List<Long> seatId;

  private Long userId;

  private Long showId;
}
