package com.bridgelabz.ioemployeepayroll;

import java.util.Scanner;

public class EmployeeService {
	
	public static void main(String[] args) {
	   EmployeePayRoll employee = new EmployeePayRoll();	
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter the name of the employee: ");
		String name = sc.next();

		System.out.print("Enter the id of the employee: ");
		int id = sc.nextInt();

		System.out.print("Enter the salary of the employee: ");
		double salary = sc.nextDouble();
		
		employee.setName(name);
		employee.setId(id);
		employee.setSalary(salary);
		
		System.out.println(employee);
		sc.close();
	}
}
