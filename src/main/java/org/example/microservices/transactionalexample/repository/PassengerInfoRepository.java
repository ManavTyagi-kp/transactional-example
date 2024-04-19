package org.example.microservices.transactionalexample.repository;

import org.example.microservices.transactionalexample.entity.PassengerInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerInfoRepository extends JpaRepository<PassengerInfo, Long> {
}
