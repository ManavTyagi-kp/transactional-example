package org.example.microservices.transactionalexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.microservices.transactionalexample.entity.PassengerInfo;
import org.example.microservices.transactionalexample.entity.PaymentInfo;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingRequest {
    private PassengerInfo passengerInfo;
    private PaymentInfo paymentInfo;
}
