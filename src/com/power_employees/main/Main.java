package com.power_employees.main;

import java.util.Locale;
import java.util.Scanner;

import com.power_employees.entities.Employee;
import com.power_employees.entities.OutsourcedEmployee;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner ler = new Scanner(System.in); 
		
		System.out.print("Enter the number of employees: ");
		int n = ler.nextInt();
		//3 
		Employee e = new Employee(); 
		OutsourcedEmployee o = new OutsourcedEmployee(); 
		
		for(int i = 1; i <= n;i++) {
			System.out.printf("Employee #%d data:\n", i); 
			System.out.print("Outsourced (y/n)? ");
			Character out = ler.nextLine().charAt(0); 
			out = out.toLowerCase(out);
			System.out.print("Name: ");
			String nome = ler.nextLine(); 
			System.out.print("Hours: ");
			int h = ler.nextInt(); 
			System.out.print("Value per hour: ");
			double vph = ler.nextDouble();  
			if(out == 'n') {
				e = new Employee(nome, h, vph);
				e.addEmployee(e);
			}else if(out == 'y'){
				System.out.print("Additional charge: ");
				double ac = ler.nextDouble(); 
				Employee oe = new OutsourcedEmployee(nome, h, vph, ac); 
				e.addEmployee(oe);
			}
		}
		
		
		//Employee #1 data:
		//Outsourced (y/n)? n
		//Name: Alex
		//Hours: 50
		//Value per hour: 20.00
		/*Employee #2 data:
		Outsourced (y/n)? y
		Name: Bob
		Hours: 100
		Value per hour: 15.00
		Additional charge: 200.00*/
		
		
		
		ler.close();
	}

}
