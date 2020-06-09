package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Supplierinfo;

public interface SupplierinfoService {
	
	List<Supplierinfo> getAll(int currentPage,int pageSize,String number);
	int getSuppCount(String number);
	
	List<Supplierinfo> getAll();
	
	void deleteById(int id);
	
	void addSupp(Supplierinfo supplierinfo);
}
