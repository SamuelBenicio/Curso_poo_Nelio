package exercicios;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas pessoas voce vai digitar: ");
		int n = sc.nextInt();
		int maior = 0;
		String maiorn = null;
		
		String[] nomes = new String[n];
		int[] idade = new int[n];
		
		for(int i =0;i<n;i+=1) {
			System.out.printf("Dados da %da pessoa: %n",i+1);
			System.out.print("Nome: ");
			sc.nextLine();
			nomes[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			if(i==0) {
				maior = idade[i];
			}
			if(idade[i]>maior) {
				maiorn = nomes[i];
				maior = idade[i];
			}
		}
		System.out.printf("PESSOA MAIS VELHA: %s com %d anos",maiorn,maior);
		
		
		
		
		
		
		
		sc.close();
	}

}
