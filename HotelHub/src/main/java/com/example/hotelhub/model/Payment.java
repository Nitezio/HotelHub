package com.example.hotelhub.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long paymentId;
    @ManyToOne
    private Booking booking;
    private LocalDate paymentDate;
    private String method;
    private String status;
    // Getters and Setters

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Payment() {
    }

    public Payment(Long paymentId, Booking booking, LocalDate paymentDate, String method, String status) {
        this.paymentId = paymentId;
        this.booking = booking;
        this.paymentDate = paymentDate;
        this.method = method;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", booking=" + booking +
                ", paymentDate=" + paymentDate +
                ", method='" + method + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
