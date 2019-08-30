package com.accp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accp.dao.EmployeeDao;
import com.accp.entity.Employee;
import com.accp.service.IEmployeeService;
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
public class EmployeeServiceImpl extends ServiceImpl<EmployeeDao, Employee> implements IEmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	public List<Employee> selectall(){
		
		return dao.selectall();
	}
}
