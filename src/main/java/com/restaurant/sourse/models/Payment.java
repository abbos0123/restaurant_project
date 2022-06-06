package com.restaurant.sourse.models;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "data")
    private String data;

    @Column(name = "time")
    private LocalDate time;

    @Column(name = "is_successful")
    private boolean isSuccessful;

    @Column(name = "payment_type")
    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Column(name = "amount")
    private double amount;

    public Payment() {
    }

    public Payment(long id, String data, LocalDate time, boolean isSuccessful, PaymentType paymentType, double amount) {
        this.id = id;
        this.data = data;
        this.time = time;
        this.isSuccessful = isSuccessful;
        this.paymentType = paymentType;
        this.amount= amount;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public LocalDate getTime() {
        return time;
    }

    public void setTime(LocalDate time) {
        this.time = time;
    }

    public boolean isSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(boolean successful) {
        isSuccessful = successful;
    }

    public PaymentType getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", data='" + data + '\'' +
                ", time=" + time +
                ", isSuccessful=" + isSuccessful +
                ", paymentType=" + paymentType +
                ", amount=" + amount +
                '}';
    }
}
