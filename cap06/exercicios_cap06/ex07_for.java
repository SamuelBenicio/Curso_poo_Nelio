package exercicios_cap06;

import java.util.Scanner;

public class ex07_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quad = 0, cubo = 0;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i += 1) {
			System.out.print("" + i);
			quad = i * i;
			System.out.print(" " + quad);
			cubo = i * i * i;
			System.out.println(" " + cubo);
		}

		sc.close();
	}
}
