package exercicios_cap06;

import java.util.Scanner;

public class ex06_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i += 1) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();
	}
}
