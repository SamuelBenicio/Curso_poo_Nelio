package exercicios_ca04;

import java.util.Locale;
import java.util.Scanner;

public class ex002 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ex 002
		double raio,pi,area;
		Locale.setDefault(Locale.US);
		pi = 3.141519;
		raio = sc.nextDouble();
		area = pi*Math.pow(raio, 2);
		System.out.printf("A=%.4f%n",area);
		sc.close();
		

	}

}
