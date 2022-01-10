package com.msa5.Customer.controller;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.msa5.Customer.dao.CustomerDao;
import com.msa5.Customer.entity.Customer;
import com.msa5.Customer.storage.Customers;


@RestController
@RequestMapping(path = "/")
public class CustomerController {
	
	@Autowired
	private CustomerDao customerDao;
	
	@GetMapping(path = "/customers")
	 public Customers getCustomers()
	 {
	  return customerDao.getAllCustomers();
	 }
	
	 @PostMapping(path = "/customers")
	 public ResponseEntity<Object> addCustomer(@RequestBody Customer customer)
	 {
		  Integer id= customerDao.getAllCustomers().getCustomerList().size()+ 1;
		  customer.setId(id);
		  customerDao.addCustomer(customer);
		  URI location= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(customer.getId()).toUri();
		  return ResponseEntity.created(location).build();
	  }
}
