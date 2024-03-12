package exercicios_cap06;

import java.util.Scanner;

public class ex02_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 1, y = 1;
		while (x != 0 && y != 0) {
			x = sc.nextInt();
			y = sc.nextInt();
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
			}
		}

		sc.close();

	}

}
