package com.example.CompanyRegistration.repository;

import com.example.CompanyRegistration.model.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CompanyRepository extends MongoRepository<Company, String> {
}
