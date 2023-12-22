package com.maharjanoworks.customermanagementserver.service;

import com.maharjanoworks.customermanagementserver.model.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CustomerService {

    List<Customer> findCustomers();

    Customer createCustomer(Customer customer);

    Customer getCustomerById(Long customerId);
}
