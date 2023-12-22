package com.maharjanoworks.customermanagementserver.controller;

import com.maharjanoworks.customermanagementserver.model.Customer;
import com.maharjanoworks.customermanagementserver.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin(origins="http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/")
public class CustomerController {

    @Autowired private CustomerService customerService;

    @GetMapping("/customer")
    public List<Customer> findCustomers(){
        return this.customerService.findCustomers();
    }

    @PostMapping("/customer")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(this.customerService.createCustomer(customer));
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("customerId") Long customerId){
        return ResponseEntity.ok(this.customerService.getCustomerById(customerId));
    }

    @PutMapping("/customer/{customerId}")
    public Customer updateCustomer(@PathVariable("customerId") Long customerId, @RequestBody Customer customerDetails){
        return this.customerService.updateCustomer(customerId,customerDetails);
    }

    @DeleteMapping("/customer/{customerId}")
    public Map<String, Boolean> deleteCustomer(@PathVariable("customerId") Long customerId){
      return   this.customerService.deleteCustomer(customerId);
    }




}
