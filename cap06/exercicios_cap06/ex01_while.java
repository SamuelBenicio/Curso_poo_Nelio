package exercicios_cap06;

import java.util.Scanner;

public class ex01_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();

		while (n1 != 2002) {
			System.out.println("Senha Invalida");
			n1 = sc.nextInt();
		}
		System.out.println("Acesso permitido");
		sc.close();
	}

}
