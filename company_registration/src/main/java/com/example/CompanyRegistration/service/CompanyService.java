package com.example.CompanyRegistration.service;

import com.example.CompanyRegistration.model.Company;
import com.example.CompanyRegistration.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {
    @Autowired
    private final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    public Company createCompany(Company company){
        return companyRepository.save(company);
    }


}
