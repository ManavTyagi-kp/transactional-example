package org.example.microservices.transactionalexample.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.microservices.transactionalexample.entity.PassengerInfo;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowledgement {
    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
