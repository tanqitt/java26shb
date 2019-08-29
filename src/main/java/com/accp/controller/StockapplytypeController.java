package com.accp.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.accp.entity.Stockapply;
import com.accp.entity.Stockapplytype;
import com.accp.service.impl.StockapplytypeServiceImpl;
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
@RequestMapping("/stockapplytype")
public class StockapplytypeController {

	@Autowired
	private StockapplytypeServiceImpl impl;
	
	@RequestMapping("/selectall")
	@ResponseBody
	public List<Stockapplytype> selectall(){
		QueryWrapper<Stockapplytype> query = new QueryWrapper<Stockapplytype>();
		query.lambda().eq(Stockapplytype::getEnable, "1");
		return impl.list(query);
	}
}

