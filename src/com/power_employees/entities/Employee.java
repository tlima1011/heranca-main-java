package com.power_employees.entities;

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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Name + " - + $ " + String.format("%.2f", payment())+"\n");
		return sb.toString(); 
	}
}
