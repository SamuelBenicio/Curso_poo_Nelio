package exercicios_cap06;

import java.util.Scanner;

public class ex05_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int fat = 1;
		int n = sc.nextInt();
		for (int i = 1; i <= n; i += 1) {
			fat = fat * i;
		}
		System.out.println(fat);
		sc.close();
	}
}
