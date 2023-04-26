package com.empmgmt.app.domain;

public class Employee {
	
	private Integer empId;
	private String name;
	private String empType;
	private Double empPrecent;
	private Double vacations;
	private Double totalVacation;
	
	Employee(){}
	
	public Employee(Integer empId, String name, String empType, Double empPrecent){
		this.empId = empId;
		this.name = name;
		this.empType = empType;
		this.empPrecent = empPrecent;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpType() {
		return empType;
	}

	public void setEmpType(String empType) {
		this.empType = empType;
	}

	public Double getEmpPrecent() {
		return empPrecent;
	}

	public void setEmpPrecent(Double empPrecent) {
		this.empPrecent = empPrecent;
	}

	public Double getVacations() {
		return vacations;
	}

	public void setVacations(Double vacations) {
		this.vacations = vacations;
	}

	public Double getTotalVacation() {
		return totalVacation;
	}

	public void setTotalVacation(Double totalVacation) {
		this.totalVacation = totalVacation;
	}
	
}
