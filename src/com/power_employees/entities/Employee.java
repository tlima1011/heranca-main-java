package com.power_employees.entities;

import java.util.ArrayList;

public class Employee {
	
	private String Name; 
	private int Hours; 
	private double ValuePerHour;
	
	public ArrayList<Employee> employees = new ArrayList<>(); 
	
	public Employee() { 
		
	}

	public Employee(String name, int hours, double valuePerHour) {
		Name = name;
		Hours = hours;
		ValuePerHour = valuePerHour;
	}
	
	public double payment() { 
		return Hours * ValuePerHour; 
	}
	
	public void addEmployee(Employee e) {
		employees.add(e);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Name + " - + $ " + String.format("%.2f", payment())+"\n");
		return sb.toString(); 
	}
}
