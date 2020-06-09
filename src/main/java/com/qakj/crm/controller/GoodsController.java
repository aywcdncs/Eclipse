package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Goods;
import com.qakj.crm.service.GoodsService;

@RequestMapping("/goodsController")
@RestController
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/getAllGoods")
	public Object getAllGoods(){
		List<Goods> list = goodsService.findAll();
		Map<String,Object> map = new HashMap<String,Object>();
		if(list!= null&& list.size()>0){
			map.put("data", list);
			map.put("code", "200");
			return map;
		}
		return null;
	}
	
	@RequestMapping("/addGoods")
	public Object addGoods(Goods goods){
		goodsService.addGoods(goods);
		return "添加成功";
	}
	
	@RequestMapping("/delGoods/{id}")
	public Object delGoods(@PathVariable("id") Integer id){
		goodsService.deleteGoods(id);
		return "删除成功";
	}
	
}
