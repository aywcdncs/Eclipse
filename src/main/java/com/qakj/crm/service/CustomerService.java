package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Customer;

public interface CustomerService {
	List<Customer> getCustomers(int currentPage,int pageSize,String searchName);

	int getCustomerCount(String searchName);
	
	Customer getCustomerById(int id);
	
	void deleteById(int id);
	
	void updateCustomerById(Customer customer);
	
	void addCustomer(Customer customer);
	
	/*List<Customer> getCustomer(int currentPage,int pageSize,String searchName);
	
	int getCount(String searchName);
	
	List<Customer> getAll();
	
	void deleteById(int id);
	
	void addCustomer(Customer customer);
	
	Customer getById(int id);
	
	void update(Customer customer);*/
}
