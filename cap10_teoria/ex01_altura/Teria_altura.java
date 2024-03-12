package ex01_altura;

import java.util.Locale;
import java.util.Scanner;

public class Teria_altura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		double[] vect = new double[n1];
		for (int i=0;i<n1;i+=1) {
			System.out.printf("Digite o %dº valor do vetor: ",i);
			vect[i] = sc.nextDouble();
			
		}
		
		double sum=0;
		for(int k=0;k<n1;k+=1) {
			sum += vect[k];
		}
		double media = sum/n1;
		System.out.printf("AVERAGE HEIGHT = %.2f%n ",media);
		
		sc.close();
	}

}
