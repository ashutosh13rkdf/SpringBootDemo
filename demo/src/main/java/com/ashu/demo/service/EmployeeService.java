package com.ashu.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashu.demo.dao.IEmployeeDao;
import com.ashu.demo.repository.Employee;

@Service
public class EmployeeService {
	@Autowired
	private IEmployeeDao iEmployeeDao;

	public IEmployeeDao getiEmployeeDao() {
		return iEmployeeDao;
	}

	public void setiEmployeeDao(IEmployeeDao iEmployeeDao) {
		this.iEmployeeDao = iEmployeeDao;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> employees = new ArrayList<Employee>();
		iEmployeeDao.findAll().forEach(employees::add);
		return employees;
	}

	public Employee getEmployee(String id) {
		return iEmployeeDao.findOne(id);
	}

	public void addEmployee(Employee employee) {
		iEmployeeDao.save(employee);
	}

	public void updateEmployee(Employee employee) {
		iEmployeeDao.save(employee);
	}

	public void removeEmployee(String id) {
		iEmployeeDao.delete(id);
	}
}
