package com.empmgmt.app;

import com.empmgmt.app.domain.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class EmployeeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementApplication.class, args);
	}

	@Bean
	public List<Employee> loadData(){
		ArrayList<Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "John", "H", 250.0));
		emp.add(new Employee(2, "Ravi", "H", 255.0));
		emp.add(new Employee(3, "Peter", "H", 254.0));
		emp.add(new Employee(4, "Rahesh", "H", 258.0));
		emp.add(new Employee(5, "Mani", "H", 252.0));
		emp.add(new Employee(6, "Sam", "H", 253.0));
		emp.add(new Employee(7, "Rose", "H", 260.0));
		emp.add(new Employee(8, "Jim", "H", 259.0));
		emp.add(new Employee(9, "Aadhi", "H", 256.0));
		emp.add(new Employee(10, "aravind", "H", 251.0));

		emp.add(new Employee(1, "John", "S", 245.0));
		emp.add(new Employee(2, "Ravi", "S", 244.0));
		emp.add(new Employee(3, "Peter", "S", 246.0));
		emp.add(new Employee(4, "Rahesh", "S", 247.0));
		emp.add(new Employee(5, "Mani", "S", 248.0));
		emp.add(new Employee(6, "Sam", "S", 249.0));
		emp.add(new Employee(7, "Rose", "S", 250.0));
		emp.add(new Employee(8, "Jim", "S", 255.0));
		emp.add(new Employee(9, "Aadhi", "S", 253.0));
		emp.add(new Employee(10, "aravind", "S", 250.0));

		emp.add(new Employee(1, "John", "M", 230.0));
		emp.add(new Employee(2, "Ravi", "M", 240.0));
		emp.add(new Employee(3, "Peter", "M", 234.0));
		emp.add(new Employee(4, "Rahesh", "M", 255.0));
		emp.add(new Employee(5, "Mani", "M", 247.0));
		emp.add(new Employee(6, "Sam", "M", 254.0));
		emp.add(new Employee(7, "Rose", "M", 240.0));
		emp.add(new Employee(8, "Jim", "M", 250.0));
		emp.add(new Employee(9, "Aadhi", "M", 241.0));
		emp.add(new Employee(10, "aravind", "M", 246.0));
		return emp;
	}
}
