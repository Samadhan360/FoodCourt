package com.example.foodCourtEntities.service;
import java.util.List;

import com.example.foodCourtEntities.entity.Customer;

public interface CustomerService {
Customer addCustomer(Customer Customer);
	
	List<Customer> getAllCustomers();
	
	Customer getCustomerById(Long CustomerId);
	
	Customer updateCustomer(Long CustomerId,Customer Customer);
	
	void deleteCustomerById(Long CustomerId);
	
	void deleteAllCustomer();
	
	boolean isCustomerExists(Long CustomerId);
}
