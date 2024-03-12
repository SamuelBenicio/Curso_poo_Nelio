package teoria;

import java.util.Scanner;

public class teste_FOR {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int soma = 0, n1 = 0;
		int N = sc.nextInt();
		for (int i = 0; i < N; i += 1) {
			n1 = sc.nextInt();
			soma += n1;
		}
		System.out.println("" + soma);

		sc.close();
	}
}
