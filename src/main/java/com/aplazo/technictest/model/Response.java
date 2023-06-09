package com.aplazo.technictest.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Responses")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "payment_number")
    Integer payment_number;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "payment_date")
    private Date payment_date;

    public Response( Integer payment_number, Double amount, Date payment_date) {
        this.payment_number = payment_number;
        this.amount = amount;
        this.payment_date = payment_date;
    }

    public Integer getPayment_number() {
        return payment_number;
    }

    public void setPayment_number(Integer payment_number) {
        this.payment_number = payment_number;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
    }


}