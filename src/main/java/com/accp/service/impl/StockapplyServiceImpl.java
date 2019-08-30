package com.accp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.StockapplyDao;
import com.accp.dao.StockapplydetailsDao;
import com.accp.entity.Stockapply;
import com.accp.service.IStockapplyService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

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
	
	@Autowired
	private StockapplydetailsDao examMapper1;
	//添加主表
	public int  addz(Stockapply apply) {
		 
		return examMapper.addz(apply);
	}
	
	//添加从表
	public int  addc(Stockapply apply) {
		
			return examMapper1.addc(apply.getApplydetails());
	}
	

	//删除
	@Override
	public int deleteid(String appid) {
		// TODO Auto-generated method stub
		examMapper.deleteid(appid);
		return 0;
	}
	
}
