package com.kafwihi.springmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.kafwihi.springmongodb.model.User;

public interface UserRepository extends MongoRepository<User, String> {
}