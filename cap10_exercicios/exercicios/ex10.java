package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de alunos: ");
		int n = sc.nextInt();
		double media=0;
		
		String[] nomes = new String[n];
		double[] nota1 = new double[n];
		double[] nota2 = new double[n];
		
		for(int i=0;i<nomes.length;i+=1) {
			System.out.print("Digite o nome do(a) aluno(a): "); 
			sc.nextLine();
			nomes[i] = sc.nextLine();
			System.out.printf("Digite a primeira nota do(a) %s: ",nomes[i]);
			nota1[i] = sc.nextDouble();
			System.out.printf("Digite a segunda nota do(a) %s: ",nomes[i]);
			nota2[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("Alunos aprovados: ");
		for(int k=0;k<nomes.length;k+=1) {
			media += (nota1[k] +nota2[k])/2;
			if(media>=6) {
				System.out.printf("%s com media %.2f%n",nomes[k],media);
			}
			media =0;
		}
		
		
		sc.close();
	}

}
