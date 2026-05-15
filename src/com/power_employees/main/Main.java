package com.power_employees.main;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import com.power_employees.entities.Employee;
import com.power_employees.entities.OutsourcedEmployee;

public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		System.out.print("Enter the number of employees: ");
		int n = ler.nextInt();
		// 3
		Employee e = new Employee();
		// OutsourcedEmployee o = new OutsourcedEmployee();
		ler.nextLine();
		for (int i = 1; i <= n; i++) {
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
			ler.nextLine();
			if (out == 'n') {
				list.add(new Employee(nome, h, vph));
			} else if (out == 'y') {
				System.out.print("Additional charge: ");
				double ac = ler.nextDouble();
				ler.nextLine();
				list.add(new OutsourcedEmployee(nome, h, vph, ac));
			}
		}
		e.getPayments(list);
		ler.close();
	}
}
