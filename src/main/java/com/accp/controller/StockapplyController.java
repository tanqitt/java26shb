package com.accp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.entity.Stockapply;
import com.accp.service.impl.StockapplyServiceImpl;
import com.github.pagehelper.PageHelper;
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
		//非空操作
		if(myts==null) {
			myts=5;
		}
		if(currentPage==null) {
			currentPage=1;
		}
		if(name==null) {
			name="";
		}
		//分页查询
		PageHelper.startPage(currentPage,myts);
		List<Stockapply> list = impl.queryAll(name);
		PageInfo<Stockapply> pageInfo = new PageInfo<Stockapply>(list);
		return pageInfo;

	}
	
	
	
	
}

