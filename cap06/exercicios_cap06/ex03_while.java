package exercicios_cap06;

import java.util.Scanner;

public class ex03_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, contA = 0, contG = 0, contD = 0;
		while (n1 != 4) {
			n1 = sc.nextInt();
			if (n1 == 1) {
				contA += 1;
			} else if (n1 == 2) {
				contG += 1;
			} else if (n1 == 3) {
				contD += 1;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + contA);
		System.out.println("Gasolina: " + contG);
		System.out.println("Diesel: " + contD);

		sc.close();

	}

}
