package com.power_employees.entities;

import java.util.ArrayList;

public class Employee {

	private String Name;
	private int Hours;
	private double ValuePerHour;

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

	public void getPayments(ArrayList<Employee> list) {
		System.out.println();
		System.out.println("PAYMENTS:");
		for (Employee employee : list) {
			System.out.println(employee.Name + " - $ " + String.format("%.2f", employee.payment()));
		}	
	}
}
