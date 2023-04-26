package com.empmgmt.app.controller;

import com.empmgmt.app.domain.Employee;
import com.empmgmt.app.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmployeeController {
	
	@Autowired
	private EmployeService employeService;
	
	@GetMapping("/all-employee")
	public ResponseEntity<Object> getEmployees(){
		List<Employee> employees = employeService.getAllEmployee();
		return ResponseEntity.status(HttpStatus.OK).body(employees);
	}
	
	@GetMapping("/work/{empId}")
	public ResponseEntity<Object> work(@PathVariable Integer empId){
		Employee emp = employeService.getWork(empId);
		return ResponseEntity.status(HttpStatus.OK).body(emp);
	}
	
	@GetMapping("/take-vacation/{empId}")
	public ResponseEntity<Object> takeVacation(@PathVariable Integer empId){
		Employee employee = employeService.takeVacation(empId);
		return ResponseEntity.status(HttpStatus.OK).body(employee);
	}
}
