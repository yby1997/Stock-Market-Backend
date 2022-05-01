package com.example.CompanyRegistration.repository;

import com.example.CompanyRegistration.model.Company;
import com.example.CompanyRegistration.model.Stock;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface StockRepository extends MongoRepository<Stock, String> {
}
