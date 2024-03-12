package exercicios_ca04;

import java.util.Locale;
import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		// ex 005
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int c1, n1, c2, n2;
		double v1, v2, total;

		c1 = sc.nextInt();
		n1 = sc.nextInt();
		v1 = sc.nextDouble();

		c2 = sc.nextInt();
		n2 = sc.nextInt();
		v2 = sc.nextDouble();

		total = (n1 * v1) + (n2 * v2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();

	}

}
