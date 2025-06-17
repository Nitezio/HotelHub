package com.example.hotelhub.service;

import com.example.hotelhub.model.Customer;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer save(Customer customer);
    Customer findById(Long id);
}
