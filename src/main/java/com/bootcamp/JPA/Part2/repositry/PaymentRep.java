package com.bootcamp.JPA.Part2.repositry;

import com.bootcamp.JPA.Part2.entities.Payment;
import org.springframework.data.repository.CrudRepository;

public interface PaymentRep extends CrudRepository<Payment,Integer> {
}
