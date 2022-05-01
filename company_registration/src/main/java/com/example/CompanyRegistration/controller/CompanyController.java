package com.example.CompanyRegistration.controller;

import com.example.CompanyRegistration.model.Company;
import com.example.CompanyRegistration.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1.0/market/company")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService){
        this.companyService = companyService;
    }

    @PostMapping("/register")
    public ResponseEntity<Company> createCompany(@RequestBody Company company){
        return new ResponseEntity(companyService.createCompany(company), HttpStatus.CREATED);
    }

}
