package exercicios_cap06;

import java.util.Locale;
import java.util.Scanner;

public class ex04_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		double div = 0;
		int n = sc.nextInt();
		for (int i = 0; i < n; i += 1) {
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				div = x / y;
				System.out.printf("%.1f%n", div);
			}
		}
		sc.close();
	}
}
