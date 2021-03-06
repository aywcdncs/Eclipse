package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Customer;
import com.qakj.crm.service.CustomerService;
@RequestMapping("/customerController")
@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/getCustomers")
	public Object getCustomers(@RequestParam("currentPage") int currentPage,@RequestParam("pageSize") int pageSize,@RequestParam("searchName") String searchName){
		if(searchName == null || "".equals(searchName)){
			searchName = "%%";
		}else{
			searchName = "%"+searchName+"%";
		}
		
		List<Customer> list = customerService.getCustomers(currentPage, pageSize, searchName);
		int count = customerService.getCustomerCount(searchName);
		//计算总页数
		int countPage = count%pageSize==0?count/pageSize:(count/pageSize)+1;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", list);
		map.put("countPage", countPage);
		return map;
	}
	
	@RequestMapping("/getCustomerById")
	public Object getCustomerById(@RequestParam("id") Integer id){
		Customer customer = customerService.getCustomerById(id);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("code", "200");
		map.put("data", customer);
		return map;
	}
	
	@RequestMapping("/delete/{id}")
	public Object delete(@PathVariable("id") int id){
		customerService.deleteById(id);
		return "客户信息删除成功！！";
	}
	@RequestMapping("/update")
	public Object update(Customer customer){
		customerService.updateCustomerById(customer);
		return "信息修改成功！！";
		
	}
	@RequestMapping("/add")
	public Object add(Customer customer){
		customerService.addCustomer(customer);
		return "添加成功了呦！！";
	}
}
