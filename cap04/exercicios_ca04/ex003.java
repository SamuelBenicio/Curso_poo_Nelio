package exercicios_ca04;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		// ex 003
		Scanner sc = new Scanner(System.in);
		int A, B, C, D, dif;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		dif = (A * B) - (C * D);
		System.out.println("DIFERENÇA = " + dif);
		sc.close();

	}

}
