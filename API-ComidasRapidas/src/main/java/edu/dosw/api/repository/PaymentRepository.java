package edu.dosw.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.dosw.api.model.entity.Payment;

public interface PaymentRepository extends MongoRepository<Payment, String> {
}
