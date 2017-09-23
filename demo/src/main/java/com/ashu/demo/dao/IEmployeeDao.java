package com.ashu.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.ashu.demo.repository.Employee;

public interface IEmployeeDao extends CrudRepository<Employee, String> {

}
