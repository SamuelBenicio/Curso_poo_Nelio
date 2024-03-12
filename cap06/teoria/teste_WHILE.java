package teoria;

import java.util.Scanner;

public class teste_WHILE {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int soma = 0;
		while (n1 != 0) {
			soma += n1;
			n1 = sc.nextInt();
		}
		System.out.printf("%d", soma);

		sc.close();
	}
}
