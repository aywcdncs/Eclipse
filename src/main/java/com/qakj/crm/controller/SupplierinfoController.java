package com.qakj.crm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.qakj.crm.pojo.Supplierinfo;
import com.qakj.crm.service.SupplierinfoService;
@RequestMapping("/supplierinfoController")
@RestController
public class SupplierinfoController {
	@Autowired
	private SupplierinfoService service;
	
	@RequestMapping("/getAll2")
	public Object getAll(@RequestParam("currentPage") int currentPage,@RequestParam("pageSize") int pageSize,@RequestParam("number") String number){
		if(number == null || "".equals(number)){
			number = "%%";
		}else{
			number = "%"+number+"%";
		}
		List<Supplierinfo> list = service.getAll(currentPage, pageSize, number);
		int count = service.getSuppCount(number);
		int countPage = count % pageSize==0?count / pageSize:(count/pageSize)+1;
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("code", "200");
		map.put("data", list);
		map.put("countPage", countPage);
		return map;
		
	}
	
	
	
	@RequestMapping("/getAll")
	public Object getAll(){
		List<Supplierinfo> list = service.getAll();
		Map<String,Object> map = new HashMap<String,Object>();
		if(list!= null && list.size()>0){
			map.put("code", "200");
			map.put("data", list);
			map.put("msg", "查询成功");
			return map;
		}
		map.put("code", "444");
		map.put("msg","失败");
		return map;
	}
	
	@RequestMapping("/delete/{id}")
	public Object deleteById(@PathVariable("id") int id){
		service.deleteById(id);
		return "删除供应商成功！！";
		
	}
	
	
	@RequestMapping("/add")
	public Object add(Supplierinfo supplierinfo){
		service.addSupp(supplierinfo);
		return "添加供应商成功！！";
		
	}
}
