package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.SupplierinfoMapper;
import com.qakj.crm.pojo.Supplierinfo;
import com.qakj.crm.pojo.SupplierinfoExample;
import com.qakj.crm.pojo.SupplierinfoExample.Criteria;
import com.qakj.crm.service.SupplierinfoService;
@Transactional
@Service
public class SupplierinfoServiceImpl implements SupplierinfoService{
	@Autowired
	private SupplierinfoMapper mapper;
	@Override
	public List<Supplierinfo> getAll(int currentPage, int pageSize, String number) {
		List<Supplierinfo> list = mapper.selectSupp((currentPage-1)*pageSize, pageSize, number);
		return list;
	}

	@Override
	public int getSuppCount(String number) {
		SupplierinfoExample example = new SupplierinfoExample();
		Criteria criteria = example.createCriteria();
		//criteria.andSuppNameLike(number);
		criteria.andSuppNumberLike(number);
		int count = mapper.countByExample(example);
		return count;
	}

	@Override
	public List<Supplierinfo> getAll() {
		SupplierinfoExample example = new SupplierinfoExample();
		List<Supplierinfo> list = mapper.selectByExample(example);
		return list;
	}

	@Override
	public void deleteById(int id) {
		mapper.deleteByPrimaryKey(id);
	}

	@Override
	public void addSupp(Supplierinfo supplierinfo) {
		mapper.insertSelective(supplierinfo);
		
	}
	
	
}
