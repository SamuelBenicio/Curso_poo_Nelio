package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		
		for(int i=0;i<n;i+=1) {
			System.out.printf("Dados da %da pessoa:%n",i+1);
			System.out.println("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		
		double soma =0,media=0,porcen=0;
		for(int k=0;k<n;k+=1) {
			soma += altura[k];
			if(idade[k]<16) {
				porcen +=1;
			}
		}
		media = soma/n;
		System.out.printf("Altura media: %.2f%n",media);
		porcen = (porcen/n)*100;
		System.out.println("Pessoas com menos de 16 anos: "+porcen+"%");
		
		for(int j=0;j<n;j+=1) {
			if(idade[j]<16) {
				System.out.println(nome[j]);
			}
		}
		
		
		
		sc.close();
	}

}
