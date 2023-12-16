package com.maharjanoworks.customermanagementserver.service;

import com.maharjanoworks.customermanagementserver.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> findCustomers();
}
