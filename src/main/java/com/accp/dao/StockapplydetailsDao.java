package com.accp.dao;

import java.util.List;

import com.accp.entity.Stockapply;
import com.accp.entity.Stockapplydetails;
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
public interface StockapplydetailsDao extends BaseMapper<Stockapplydetails> {

	public int addc(@Param("list") List<Stockapplydetails> list);
}
