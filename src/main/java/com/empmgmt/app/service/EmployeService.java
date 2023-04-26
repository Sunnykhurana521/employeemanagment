package com.empmgmt.app.service;

import com.empmgmt.app.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeService {
	
	@Autowired
	List<Employee> empList;
	
	public List<Employee> getAllEmployee() {
		return empList;
	}
	
	public Employee getWork(Integer empId) {
		Employee employee = empList.stream().filter(x -> x.getEmpId() == empId).findFirst()
                .orElse(null);
		employee.setVacations(260 - employee.getEmpPrecent());
		if(employee.getEmpType().equals("H")) {
			employee.setTotalVacation(10.0);
		} else if(employee.getEmpType().equals("M")) {
			employee.setTotalVacation(30.0);
		} else if(employee.getEmpType().equals("S")) {
			employee.setTotalVacation(15.0);
		}
		
		return employee;
	}

	public Employee takeVacation(Integer empId) {
		Double vacationDays = 0.0;
		Employee employee = empList.stream().filter(x -> x.getEmpId() == empId).findFirst()
                .orElse(null);
	return employee;
}
}
