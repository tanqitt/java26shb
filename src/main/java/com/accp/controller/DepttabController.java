package com.accp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.accp.entity.Depttab;
import com.accp.service.impl.DepttabServiceImpl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;

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
	private DepttabServiceImpl  impl;
	
	@RequestMapping("/selectall")
	@ResponseBody
	public List<Depttab> selectall(){
		QueryWrapper<Depttab> query = new QueryWrapper<Depttab>();
		query.lambda().eq(Depttab::getEnables, "1");
		return impl.list(query);
	}
}

