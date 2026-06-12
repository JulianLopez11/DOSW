package edu.dosw.api.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.dosw.api.model.entity.User;

public interface UserRepository extends MongoRepository<User,String> {
    Optional<User> findById(String id);

    
}
