package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double medip = 0;
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for(int i =0;i<numeros.length;i+=1) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
			if(numeros[i]%2==0) {
				medip += numeros[i];
			}
		}
		
		medip = medip/numeros.length;
		
		if(medip==0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			System.out.printf("MEDIA DOS PARES = %.1f%n", medip);
		}
		
		
		
		
		sc.close();
	}
}
