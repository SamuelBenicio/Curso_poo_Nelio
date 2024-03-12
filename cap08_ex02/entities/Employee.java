package entities;

public class Employee {

	public String name;
	public double GrossSalary;
	public double Tax;

	public double NetSalary() {
		return GrossSalary-Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		percentage = percentage/100;
		GrossSalary = ((GrossSalary*percentage)+GrossSalary);
		 
	}
	public String toString() {
		return name
				+", $ "
				+ String.format("%.2f", NetSalary());
	}
}
