package exercicios;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar: ");
		int n = sc.nextInt();
		int[] numeros = new int[n];
		
		for(int i=0;i<numeros.length;i+=1) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextInt();
		}
		
		System.out.println();
		int pares =0;
		System.out.println("NUMEROS PARES: ");
		for(int k=0;k<numeros.length;k+=1) {
			if(numeros[k]%2==0) {
				System.out.printf("%d ",numeros[k]);
				pares +=1;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = "+pares);
		
		sc.close();
	}

}
