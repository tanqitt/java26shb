package com.accp.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.entity.Depttab;
import com.accp.service.impl.DepttabServiceImpl;
import com.alibaba.fastjson.JSON;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
@Controller
@RequestMapping("/depttab")
public class DepttabController {
	
	@Autowired
	private DepttabServiceImpl depttabServiceImpl;
	
	/*
	 * 查询
	 */
	@RequestMapping("/query")	
	@ResponseBody
	public List<Depttab> query(){
		System.out.println("=====================");
		List<Depttab> list = depttabServiceImpl.list();
		System.out.println(JSON.toJSONString(list));
		return list;
	}
	
	/*
	 * 新增
	 */
	
	@RequestMapping("/insert")	
	@ResponseBody
	public List<Depttab> insert(Depttab depttab){
		System.out.println("=====================");
		List<Depttab> list = depttabServiceImpl.list();
		System.out.println(JSON.toJSONString(list));
		return list;
	}
	
	/*
	 * 修改
	 */
	@RequestMapping("/update")	
	@ResponseBody
	public List<Depttab> update(){
		System.out.println("=====================");
		List<Depttab> list = depttabServiceImpl.list();
		System.out.println(JSON.toJSONString(list));
		return list;
	}
	
	
	/*
	 * 删除
	 */
	@RequestMapping("/delete")	
	@ResponseBody
	public List<Depttab> delete(Integer id){
		System.out.println("=====================");
		List<Depttab> list = depttabServiceImpl.list();
		System.out.println(JSON.toJSONString(list));
		return list;
	}
}

