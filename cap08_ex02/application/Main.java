package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Employee employee = new Employee();
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println("");
		System.out.println("Employee: "+ employee);
		
		System.out.println("");
		System.out.print("Which percentage to increase salary? ");
		double raise = sc.nextInt();
		employee.IncreaseSalary(raise);
		
		
		System.out.println("");
		System.out.println("Updated data: " + employee);
		
		
		
		sc.close();
	}
}
