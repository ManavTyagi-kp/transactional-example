package org.example.microservices.transactionalexample.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PAYMENT_INFO")
public class PaymentInfo {
    @Id
    @GeneratedValue(generator = "uuid1")
    @GenericGenerator(name = "uuid1", strategy = "org.hibernate.id.UUIDGenerator")
    private String paymentId;
    private String accountNo;
    private double amount;
    private String cardType;

    private Long passengerType;
}
