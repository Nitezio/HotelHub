package com.example.hotelhub.service;

import com.example.hotelhub.model.Payment;
import java.util.List;

public interface PaymentService {
    List<Payment> findAll();
    Payment save(Payment payment);
    Payment findById(Long id);
}

