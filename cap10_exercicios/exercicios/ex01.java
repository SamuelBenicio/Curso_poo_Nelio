package exercicios;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] negativos = new int[n];
		for (int i=0;i<negativos.length;i+=1) {
			negativos[i] = sc.nextInt();
		}
		
		for(int k=0;k<negativos.length;k+=1) {
			if(negativos[k]<0) {
				System.out.println(negativos[k]);
			}
		}
		
		
		sc.close();
	}

}
