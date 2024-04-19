package org.example.microservices.transactionalexample.controller;

import org.example.microservices.transactionalexample.dto.FlightBookingAcknowledgement;
import org.example.microservices.transactionalexample.dto.FlightBookingRequest;
import org.example.microservices.transactionalexample.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("/bookFlightTicket")
    public FlightBookingAcknowledgement bookFlightTicket(@RequestBody FlightBookingRequest request){
        return flightBookingService.bookFlightTicket(request);
    }
}
