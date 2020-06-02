package com.shiblesadik.instagram.repository;

import com.shiblesadik.instagram.models.Admin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdminRepository extends MongoRepository<Admin, String> {
}