package membros_estaticos1;

import java.util.Locale;
import java.util.Scanner;

import membros_estaticos1_util.Calculator;


public class Progam2 {
 

	public static void main(String[] args) {
		 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		double c = Calculator.circumference(radius);
		System.out.printf("Cicumference: %.2f%n", c);
		
		double v = Calculator.volume(radius);
		System.out.printf("volume: %.2f%n", v);
		
		System.out.printf("PI: %.2f%n", Calculator.PI);
		
		sc.close();
	}
}
