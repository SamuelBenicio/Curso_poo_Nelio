package util;

public class CurrencyConverter {
	
	
	public static final double IOF = 1.06;
	
	public static double dollarToReais(double amount, double dollarPrice) {
		return (amount*dollarPrice)*IOF;
	}
	
}
