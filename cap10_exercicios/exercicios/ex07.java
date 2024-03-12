package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double media=0,soma=0;
		System.out.print("Quantos elementos vao ter o vetor? ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i =0;i<vect.length;i+=1) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma += vect[i];
		}
		
		System.out.println();
		media = soma/vect.length;
		System.out.printf("MEDIA DO VEOTR = %.3f%n",media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA");
		for(int k=0;k<n;k+=1) {
			if(vect[k]<media) {
				System.out.printf("%.1f%n",vect[k]);
			}
		}
		

		sc.close();
	}

}
