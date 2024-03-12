package exercicios;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int pos=0;
		double maior=0;
		int n = sc.nextInt();
		
		double[] numeros = new double[n];
		for(int i=0;i<numeros.length;i+=1) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			if(i==numeros.length-1) {
				for(int k=0;k<numeros.length;k+=1) {
					if(k==0) {
						maior = numeros[0];
					}
					else {
						if(maior<numeros[k]) {
							maior = numeros[k];
							pos = k;
						}
					}
					
				}
			}
		}
		
		
		
		System.out.printf("MAIOR VALOR = %.2f%n",maior);
		System.out.println("POSICAO DO MAIOR VALOR = "+pos);
		sc.close();
	}

}
