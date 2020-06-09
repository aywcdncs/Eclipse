package com.qakj.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qakj.crm.mapper.GoodsMapper;
import com.qakj.crm.pojo.Goods;
import com.qakj.crm.service.GoodsService;
@Transactional
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsMapper goodsMapper;
	
	@Override
	public List<Goods> findAll() {
		List<Goods> list = goodsMapper.selectByExample(null);
		return list;
	}

	@Override
	public void addGoods(Goods goods) {
		goodsMapper.insertSelective(goods);
	}

	@Override
	public void deleteGoods(int id) {
		goodsMapper.deleteByPrimaryKey(id);
		
	}

}
