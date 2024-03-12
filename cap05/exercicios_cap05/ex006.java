package exercicios_cap05;

import java.util.Scanner;

public class ex006 {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		double n1;
		n1 = sc.nextDouble();
		
		if(n1>=0 && n1<=25) {
			System.out.println("Intervalo [0,25]");
		}
		if(n1>25 && n1<=50) {
			System.out.println("Intervalo (25,50]");
		}
		if(n1>50 && n1<=75) {
			System.out.println("Intervalo (50,75]");
		}
		if(n1>75 && n1<=100) {
			System.out.println("Intervalo (75,100]");
		}
		if(n1<0 || n1>100) {
			System.out.println("Fora de intervalo");
		}
		sc.close();
	}

}
