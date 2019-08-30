package com.accp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.entity.Stockapply;
import com.accp.service.impl.StockapplyServiceImpl;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
@RestController
@RequestMapping("/stockapply")
public class StockapplyController {

	@Autowired
	private StockapplyServiceImpl impl;
	
	//分页查询
	@RequestMapping("/selectall")
	@ResponseBody
	public Page<Stockapply> queryAll(Integer currentPage,String name,Integer myts) {
		System.out.println("11");
		//非空操作
		if(myts==null) {
			myts=2;
		}
		if(currentPage==null) {
			currentPage=1;
		}
		if(name==null) {
			name="";
		}
		
		Page<Stockapply> page = new Page<>(currentPage, myts);
		QueryWrapper<Stockapply> query = new QueryWrapper<Stockapply>();
		query.lambda().like(Stockapply::getAppid, name).eq(Stockapply::getEnables, "1");
		impl.page(page,query);
		return page;

	}
	
	//删除appid
	@RequestMapping("/deleteid")
	@ResponseBody
	public int deleteid(String appid) {
		int i = impl.deleteid(appid);
		return i;

	}
	
	//添加
	@RequestMapping("/addstock")
	@ResponseBody
	public int addstock( @RequestBody Stockapply addstock) {
		
		try {
			int i = impl.addz(addstock);
			if(i>0) {
				System.out.println(addstock.getAppid()+"addid");
				int j = impl.addc(addstock);
				
				if(j>0) {
					return j;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	
	

	
	
	
	
}

