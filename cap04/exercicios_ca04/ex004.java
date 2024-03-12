package exercicios_ca04;

import java.util.Locale;
import java.util.Scanner;

public class ex004 {

	public static void main(String[] args) {
		// ex 004
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int H, D;
		double DH, salario;
		H = sc.nextInt();
		D = sc.nextInt();
		DH = sc.nextDouble();
		salario = D * DH;
		System.out.printf("NUMBER = %d%n", H);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		sc.close();

	}

}
