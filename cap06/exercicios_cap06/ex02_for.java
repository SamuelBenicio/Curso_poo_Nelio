package exercicios_cap06;

import java.util.Scanner;

public class ex02_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = 0, out = 0;

		int n = sc.nextInt();
		for (int i = 0; i < n; i += 1) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in += 1;
			} else {
				out += 1;
			}
		}
		System.out.printf("%d in%n", in);
		System.out.printf("%d out%n", out);

		sc.close();
	}
}
