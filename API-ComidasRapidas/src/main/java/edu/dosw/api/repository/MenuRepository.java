package edu.dosw.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import edu.dosw.api.model.entity.Menu;

public interface MenuRepository extends MongoRepository<Menu, String> {
}
