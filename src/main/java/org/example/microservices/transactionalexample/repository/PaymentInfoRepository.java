package org.example.microservices.transactionalexample.repository;

import org.example.microservices.transactionalexample.entity.PaymentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {
}
