package app;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Progam1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double amount = sc.nextDouble();
		
		double result = CurrencyConverter.dollarToReais(amount,dollarPrice);
		System.out.printf("Amount to be paid in reais = %.2f%n",result);
		
		
		sc.close();
	}

}
