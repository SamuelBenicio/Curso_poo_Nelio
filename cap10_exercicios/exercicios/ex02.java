package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i=0;i<vect.length;i+=1) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		double soma =0,media=0;
		for(int k=0;k<vect.length;k+=1) {
			if(k==0) {
				System.out.print("Valores = ");
			}
			if(k==vect.length-1) {
				System.out.printf("%.1f%n",vect[k]);
			}
			else{
			System.out.printf("%.1f ",vect[k]);
			}
			soma += vect[k];
		}
		media = soma/vect.length;
		System.out.printf("Soma = %.2f%n",soma);
		System.out.printf("MEDIA = %.2f%n",media);
		
		
		sc.close();
	}
}
