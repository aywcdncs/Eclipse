package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Customer;
import com.qakj.crm.pojo.User;

public interface UserService {
	
	User getUserByUsernameAndPassword(String username,String password);
	
	void updateUserById(Integer id,String password);
	
	
	
	
	

}
