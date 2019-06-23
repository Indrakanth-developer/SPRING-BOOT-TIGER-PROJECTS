package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Tiger;

public interface TigerRepo extends MongoRepository<Tiger, String> {

}
