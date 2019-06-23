package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Indra;

public interface IndraRepo extends MongoRepository<Indra, String> {

}
