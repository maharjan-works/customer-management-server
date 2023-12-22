package com.maharjanoworks.customermanagementserver.service;

import com.maharjanoworks.customermanagementserver.exception.CustomerNotFoundException;
import com.maharjanoworks.customermanagementserver.model.Customer;
import com.maharjanoworks.customermanagementserver.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired private CustomerRepository customerRepository;

    @Override
    public List<Customer> findCustomers() {
        return this.customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return this.customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(Long customerId) {
       return this.customerRepository.findById(customerId)
               .orElseThrow(()-> new CustomerNotFoundException("Customer not found with ID: "+ customerId));
    }
}
