package com.accp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.entity.Employee;
import com.accp.entity.Stockapplytype;
import com.accp.service.impl.EmployeeServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeServiceImpl impl;
	
	
	
	@RequestMapping("/selectall")
	@ResponseBody
	public List<Employee> selectall(){
		QueryWrapper<Employee> query = new QueryWrapper<Employee>();
		query.lambda().eq(Employee::getEnables, "1");
		return impl.list(query);
	}
	
	
	
}

