package com.ashu.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ashu.demo.repository.Employee;
import com.ashu.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	@RequestMapping("employees/{id}")
	public Employee getEmployee(@PathVariable String id){
		return employeeService.getEmployee(id);
	}

	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.addEmployee(employee);
	}
	@RequestMapping(value = "/employees", method = RequestMethod.PUT)
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.updateEmployee(employee);
	}
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
	public void removeEmployee(@PathVariable String id) {
		employeeService.removeEmployee(id);
	}
}
