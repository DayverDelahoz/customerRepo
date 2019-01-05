package com.mainclass.custumerservice.Controllers;

import com.mainclass.custumerservice.Models.Customer;
import com.mainclass.custumerservice.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/{cusId}")
    public Customer findCustomerById(@PathVariable("cusId") String cusId){
        return customerService.findCustomerById(cusId);
    }

    @GetMapping
    public Iterable<Customer> findAllCustomer(){
        return customerService.findAllCustomer();
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer cust){
       return customerService.createCustomer(cust);
    }

    @PutMapping
    public Customer editCustomer(@RequestBody Customer cust){

        Customer customer = customerService.findCustomerById(cust.getId());

        if (customer != null){
            return customerService.editCustomer(cust);
        }
        return null;
    }

    @DeleteMapping
    public void deleteCustomerById(@RequestParam("cusId") String cusId){
        customerService.deleteCustomer(new Customer(cusId));
    }
}
