package com.shiblesadik.instagram.repository;

import com.shiblesadik.instagram.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}