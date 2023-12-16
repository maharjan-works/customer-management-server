package com.maharjanoworks.customermanagementserver.controller;

import com.maharjanoworks.customermanagementserver.model.Customer;
import com.maharjanoworks.customermanagementserver.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

    @Autowired private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> findCustomers(){
        return this.customerService.findCustomers();
    }

}
