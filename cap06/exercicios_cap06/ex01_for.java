package exercicios_cap06;

import java.util.Scanner;

public class ex01_for {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n1 = sc.nextInt();
			for (int i=1;i<=n1;i +=2) {
				System.out.println(""+i);
			}
			sc.close();
		}

	}


