package com.maharjanoworks.customermanagementserver.repository;

import com.maharjanoworks.customermanagementserver.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
