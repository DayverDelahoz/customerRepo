package com.mainclass.custumerservice.Services;

import com.mainclass.custumerservice.Models.Customer;
import com.mainclass.custumerservice.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {

     @Autowired
     private CustomerRepository customerRepository;

     public Iterable<Customer> findAllCustomer(){
         return customerRepository.findAll();
     }

    public Customer findCustomerById(String id){

        Optional<Customer> customer = customerRepository.findById(id);

        if (customer.isPresent()){
            return customer.get();
        }

        return null;
    }

    public void deleteCustomer(Customer cust){
        customerRepository.delete(cust);
    }

    public Customer createCustomer(Customer cust){
        return customerRepository.save(cust);
    }

    public Customer editCustomer(Customer cust){
        return customerRepository.save(cust);
    }


}
