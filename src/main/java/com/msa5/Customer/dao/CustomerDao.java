package com.msa5.Customer.dao;

import org.springframework.stereotype.Service;

import com.msa5.Customer.entity.Customer;
import com.msa5.Customer.storage.Customers;


@Service
public class CustomerDao {
	
	private static Customers list= new Customers();

	static
	{
		list.getCustomerList().add(new Customer(1,"Anusha","female",22,"veg"));
		list.getCustomerList().add(new Customer(2,"Anjali","female",12,"veg"));
		list.getCustomerList().add(new Customer(1,"Bobby","male",28,"non-veg"));   
	}
	
	public Customers getAllCustomers()
	{
	  return list;
	}
	
	 public void addCustomer(Customer customer)
	{
	    list.getCustomerList().add(customer);    
	}

}
