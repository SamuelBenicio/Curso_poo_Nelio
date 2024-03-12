package exercicios;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vao ter cada vetor?" );
		int n = sc.nextInt();
		
		int[] v1 = new int[n];
		int[] v2 = new int[n];
		
		System.out.println("Digite os valores do vetor A: ");
		for(int i=0;i<v1.length;i+=1) {
			v1[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B: ");
		for(int k=0;k<v2.length;k+=1) {
			v2[k] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE");
		int[] v3 = new int[n];
		for(int j=0;j<v3.length;j+=1) {
			v3[j] = v1[j] +v2[j];
			System.out.println(v3[j]);
		}
		
		sc.close();
	}

}
