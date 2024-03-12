package exercicios_cap05;

import java.util.Scanner;

public class ex001 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ex 001
		int n1;
		n1 = sc.nextInt();
		if (n1 >= 0) {
			System.out.println("NAO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		sc.close();
	}

}
