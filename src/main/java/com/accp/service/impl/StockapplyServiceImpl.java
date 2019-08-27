package com.accp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.StockapplyDao;
import com.accp.entity.Stockapply;
import com.accp.service.IStockapplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
@Service
public class StockapplyServiceImpl extends ServiceImpl<StockapplyDao, Stockapply> implements IStockapplyService {

	@Autowired
	private StockapplyDao examMapper;
	
	public PageInfo<Stockapply> queryAll(Integer currentPage,Integer pageSize,String name){
		Page<Stockapply> page = PageHelper.startPage(currentPage, pageSize, true);
		examMapper.queryAll(name);
		return page.toPageInfo();
	}
	
}
