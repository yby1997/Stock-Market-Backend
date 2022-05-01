package com.example.CompanyRegistration.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;
import java.util.UUID;

public class Stock {
    @Id
    private ObjectId companyCode;
    private double price;
    private LocalDateTime date;

    public Stock(ObjectId companyCode, double price, LocalDateTime date) {
        this.companyCode = companyCode;
        this.price = price;
        this.date = date;
    }

    public ObjectId getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(ObjectId companyCode) {
        this.companyCode = companyCode;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "companyCode=" + companyCode +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}
