package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double menor=0,maior=0,mediam=0;
		int numeroh = 0;
		
		System.out.print("Digite a quantidade de pessoas: ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		int[] genero = new int[n];
		
		for(int i =0; i<altura.length;i+=1) {
			System.out.printf("Altura da %da pessoa: ",i+1);
			altura[i] = sc.nextDouble();
			System.out.printf("Genero da %da pessoa(M/F): ",i+1);
			genero[i] = sc.next().charAt(0);
			if(genero[i]=='M') {
				numeroh +=1;
			}
			if(genero[i]=='F') {
				mediam += altura[i];
			}
			if(i==0) {
				menor = altura[i];
				maior = altura[i];
			}
			if(altura[i]<menor) {
				menor = altura[i];
			}
			if(altura[i]>maior) {
				maior = altura[i];
			}
		}
		mediam = mediam/n;
		System.out.printf("Menor altura: %.2f%n",menor);
		System.out.printf("Menor altura: %.2f%n",maior);
		System.out.printf("Media das alturas das mulheres: %.2f%n",mediam);
		System.out.printf("Numero de homens = %d ",numeroh);
		
		
		
		sc.close();
	}

}
