package com.ashu.demo.service;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.ashu.demo.dao.IEmployeeDao;
import com.ashu.demo.repository.Employee;

public class EmployeeServiceTest extends EmployeeService {
	@Mock
	private IEmployeeDao mIEmployeeDao;
	@Mock
	private Employee mEmployee;

	private EmployeeService employeeService;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		employeeService = new EmployeeService();
		employeeService.setiEmployeeDao(mIEmployeeDao);
	}

	@Test
	public void testGetEmployee() {
		when(mIEmployeeDao.findOne("1")).thenReturn(mEmployee);
		Employee employee = employeeService.getEmployee("1");
		assertNotNull(employee);
	}

	@After
	public void tearDown() throws Exception {
		employeeService = null;
	}
}
