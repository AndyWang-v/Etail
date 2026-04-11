package com.eb.accounts.repository;

import com.eb.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository /* Spring JPA framework will create a bean implementation of this interface based upon the configuration */
public interface CustomerRepository extends JpaRepository<Customer, Long/*primary key type*/> {

    /**
     * Whenever we use the convention "findBy", we are telling the Spring JPA framework to
     * run a select query using column MobileNumber (mobile_number),so make sure spelling is correct
     */
    Optional<Customer> findByMobileNumber(String mobileNumber);
}
