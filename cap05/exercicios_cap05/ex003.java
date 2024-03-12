package exercicios_cap05;

import java.util.Scanner;

public class ex003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A, B;
		A = sc.nextInt();
		B = sc.nextInt();

		if (A > B && A % B == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}

		if (B > A && B % A == 0) {
			System.out.println("Sao multiplos");
		} else {
			System.out.println("Nao sao multiplos");
		}

		sc.close();
	}

}
