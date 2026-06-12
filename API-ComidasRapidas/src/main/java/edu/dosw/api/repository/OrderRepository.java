package edu.dosw.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.dosw.api.model.entity.Order;

public interface OrderRepository extends MongoRepository<Order, String> {
}
