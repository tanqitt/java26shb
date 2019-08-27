package com.accp.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.entity.Stockapply;
import com.accp.service.impl.StockapplyServiceImpl;
import com.alibaba.fastjson.JSON;
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
	
	@RequestMapping("/selectall")
	@ResponseBody
	public PageInfo<Stockapply> queryAll(Integer currentPage,String name,Integer myts) {
		
		
		if(myts==null) {
			myts=5;
		}
		if(currentPage==null) {
			currentPage=1;
		}
		
		if(name==null) {
			name="";
		}
		PageInfo<Stockapply> list = impl.queryAll(currentPage, myts, name);
		System.out.println(JSON.toJSONString(list));
		return list;
	}
	
	
}

