package com.power_employees.entities;

public class OutsourcedEmployee extends Employee{ 
	
	private double AdditionalCharge; 
	
	public OutsourcedEmployee() { 
		
	}
	
	public OutsourcedEmployee(String n, int h, double vpr, double ac) { 
		super(n, h, vpr); 
		AdditionalCharge = ac; 
	}
	
	@Override
	public final double payment() { 
		return super.payment() + (1.1 * AdditionalCharge); 
	}
}
