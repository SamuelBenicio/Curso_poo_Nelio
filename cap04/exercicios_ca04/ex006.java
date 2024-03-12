package exercicios_ca04;

import java.util.Locale;
import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
		// ex 006
		Scanner sc = new Scanner(System.in);
		double A, B, C, pi, AT, AC, ATRAP, AQ, AR;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		pi = 3.14159;
		Locale.setDefault(Locale.US);
		AT = (A * C) / 2;
		AC = (C * C) * pi;
		ATRAP = ((A + B) * C) / 2;
		AQ = Math.pow(B, 2);
		AR = A * B;

		System.out.printf("TRIANGULO: %.3f%n", AT);
		System.out.printf("CIRCULO: %.3f%n", AC);
		System.out.printf("TRAPEZIO: %.3f%n", ATRAP);
		System.out.printf("QUADRADO: %.3f%n", AQ);
		System.out.printf("RETANGULO: %.3f%n", AR);
		sc.close();

	}

}
