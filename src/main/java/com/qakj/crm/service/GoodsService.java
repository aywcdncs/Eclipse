package com.qakj.crm.service;

import java.util.List;

import com.qakj.crm.pojo.Goods;

public interface GoodsService {
	
	List<Goods> findAll();
	
	void addGoods(Goods goods);
	
	void deleteGoods(int id);

}
