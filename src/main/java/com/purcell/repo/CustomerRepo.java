package com.purcell.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerRepo extends CrudRepository<Customer, Long> { // interface not class

    List<Customer> findByLastName(String lastName);

}
