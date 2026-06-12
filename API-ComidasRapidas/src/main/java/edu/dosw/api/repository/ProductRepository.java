package edu.dosw.api.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.dosw.api.model.entity.Product;

public interface ProductRepository extends MongoRepository<Product,String> {
    Optional<Product> findById(String id);

    
}
