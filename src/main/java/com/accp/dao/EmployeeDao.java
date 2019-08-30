package com.accp.dao;

import java.util.List;

import com.accp.entity.Employee;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lhp
 * @since 2019-08-26
 */
public interface EmployeeDao extends BaseMapper<Employee> {

	public List<Employee> selectall();
}
