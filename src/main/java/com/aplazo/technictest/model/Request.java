package com.aplazo.technictest.model;

import jakarta.persistence.*;

import javax.validation.constraints.*;


@Entity
@Table(name = "Requests")
public class Request {


    public long getId() {
        return id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotNull
    @Min(value = 1, message = "The amount should be more than $1.00, the max should be lesser than $999,999.00")
    @Max(value = 100, message = "The amount should be more than $1.00, the max should be lesser than $999,999.00")
    @Column(name = "amount")
    private Double amount;

    @NotNull
    @Min(value = 4, message = "the payment can be paid is 52, the minimum should be 4.")
    @Max(value = 52, message = "the payment can be paid is 52, the minimum should be 4.")
    @Column(name = "terms")
    private Integer terms;

    @NotNull
    @Min(value = 1, message = "The rate should bigger than 1%, lesser than 100%.")
    @Max(value = 100, message = "The rate should bigger than 1%, lesser than 100%.")
    @Column(name = "rate")
    private Double rate;

    public Request(Double amount, Integer terms, Double rate) {
        this.amount = amount;
        this.terms = terms;
        this.rate = rate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getTerms() {
        return terms;
    }

    public void setTerms(Integer terms) {
        this.terms = terms;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }
}
