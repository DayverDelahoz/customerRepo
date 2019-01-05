package com.mainclass.custumerservice.Repository;

import com.mainclass.custumerservice.Models.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,String> {

}
