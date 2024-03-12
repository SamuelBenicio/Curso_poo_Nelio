package ex02_produtos;

import java.util.Locale;
import java.util.Scanner;

public class Teoria_produtos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n]; //Criacao do vetor vect
		
		for(int i =0;i<vect.length;i+=1) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i] = new Product(name,price); //Ex na posicao 0 do vetor vai ter o nome do produto e o preco.
			
		}
		
		double sum =0;
		for(int k=0;k<vect.length;k+=1) {
			sum += vect[k].getPrice(); //Acesso vetor na posicao k e pego o preco e adiciono a soma.
		}
		double avg = sum/vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n",avg);
		
		sc.close();
	}

}
