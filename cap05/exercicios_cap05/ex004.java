package exercicios_cap05;

import java.util.Scanner;

public class ex004 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hi,hf,tot;
		hi = sc.nextInt();
		hf = sc.nextInt();
		
		if(hi<hf) {
			tot = hf-hi;
			System.out.printf("O JOGO DUROU %d HORA(S)%n",tot);
		}
		if(hi>hf) {
			tot = (hf+24)-hi;
			System.out.printf("O JOGO DUROU %d HORA(S)%n",tot);
		}
		if(hi==hf) {
			System.out.printf("O JOGO DUROU 24 HORA(S)%n");
		}
		
		sc.close();
	}
}
