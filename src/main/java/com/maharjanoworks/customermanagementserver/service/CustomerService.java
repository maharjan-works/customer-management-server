package com.maharjanoworks.customermanagementserver.service;

import com.maharjanoworks.customermanagementserver.model.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Map;

public interface CustomerService {

    List<Customer> findCustomers();

    Customer createCustomer(Customer customer);

    Customer getCustomerById(Long customerId);

    Customer updateCustomer(Long customerId, Customer customerDetails);

    Map<String, Boolean> deleteCustomer(Long customerId);
}
