package com.accp.dao;

import java.util.List;

import com.accp.entity.Stockapply;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import io.lettuce.core.dynamic.annotation.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
public interface StockapplyDao extends BaseMapper<Stockapply> {

	
	public int deleteid(@Param("appid") String appid);
	
}
