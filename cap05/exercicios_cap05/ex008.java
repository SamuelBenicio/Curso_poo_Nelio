package exercicios_cap05;

import java.util.Locale;
import java.util.Scanner;

public class ex008 {

	public static void main(String[] args) {
		double n1, taxa;
		Scanner sc = new Scanner(System.in);
		n1 = sc.nextDouble();
		Locale.setDefault(Locale.US);
		if (n1 >= 0 && n1 <= 2000) {
			System.out.println("Isento");
		}
		if (n1 > 2000 && n1 <= 3000) {
			taxa = (n1 - 2000) * 0.08;
			System.out.printf("R$ %.2f%n", taxa);
		}
		if (n1 > 3000 && n1 <= 4500) {
			taxa = 80 + ((n1 - 3000) * 0.18);
			System.out.printf("R$ %.2f%n", taxa);
		}
		if (n1 > 4500) {
			taxa = 350 + ((n1 - 4500) * 0.28);
			System.out.printf("R$ %.2f%n", taxa);
		}
		sc.close();

	}

}
