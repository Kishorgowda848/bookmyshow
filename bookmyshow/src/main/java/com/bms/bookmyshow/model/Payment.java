package com.bms.bookmyshow.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.bms.bookmyshow.enums.PaymentStatus;
import com.bms.bookmyshow.enums.PaymentType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends Base {

  private double amount;

  private String providers;

  private LocalDateTime time;

  private String refersnceNumber;

  @Enumerated(EnumType.STRING)
  private PaymentStatus paymentStatus;

  @Enumerated(EnumType.STRING)
  private PaymentType paymentType;
}
