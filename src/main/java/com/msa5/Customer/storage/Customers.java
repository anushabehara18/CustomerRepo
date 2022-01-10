package com.msa5.Customer.storage;

import java.util.ArrayList;
import java.util.List;

import com.msa5.Customer.entity.Customer;


public class Customers {


		private List<Customer> customerList;
		public List<Customer> getCustomerList()
		{
		   if (customerList == null) 
		   {
		      customerList= new ArrayList<>();
		   }
		   return customerList;     
		}
		  
		public void setCustomerList(List<Customer> customerList)
		{
		    this.customerList= customerList;
		}
	}

