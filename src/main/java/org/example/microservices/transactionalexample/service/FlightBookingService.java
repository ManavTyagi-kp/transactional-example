package org.example.microservices.transactionalexample.service;

import org.example.microservices.transactionalexample.dto.FlightBookingAcknowledgement;
import org.example.microservices.transactionalexample.dto.FlightBookingRequest;
import org.example.microservices.transactionalexample.entity.PassengerInfo;
import org.example.microservices.transactionalexample.entity.PaymentInfo;
import org.example.microservices.transactionalexample.repository.PassengerInfoRepository;
import org.example.microservices.transactionalexample.repository.PaymentInfoRepository;
import org.example.microservices.transactionalexample.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private PassengerInfoRepository passengerInfoRepository;

    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional //(readOnly = false, isolation = Isolation.READ_COMMITTED, propagation = Propagation.REQUIRED)
    public FlightBookingAcknowledgement bookFlightTicket(FlightBookingRequest request){
        FlightBookingAcknowledgement acknowledgement = null;
        PassengerInfo passengerInfo = request.getPassengerInfo();
        passengerInfo = passengerInfoRepository.save(passengerInfo);

        PaymentInfo paymentInfo = request.getPaymentInfo();

        PaymentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());

        paymentInfo.setPassengerType(passengerInfo.getPId());
        paymentInfo.setAmount(passengerInfo.getFare());
        paymentInfoRepository.save(paymentInfo);
        return new FlightBookingAcknowledgement("Success", passengerInfo.getFare(), UUID.randomUUID().toString().split("-")[0], passengerInfo);
    }
}
