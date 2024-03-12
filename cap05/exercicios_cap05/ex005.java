package exercicios_cap05;

import java.util.Locale;
import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int cod,qtd;
		double tot;
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if(cod==1) {
			tot = 4*qtd;
			System.out.printf("Total: R$ %.2f%n",tot);
		}
		if(cod==2) {
			tot = 4.5*qtd;
			System.out.printf("Total: R$ %.2f%n",tot);
		}	
		if(cod==3) {
			tot = 5*qtd;
			System.out.printf("Total: R$ %.2f%n",tot);
		}
		if(cod==4) {
			tot = 2*qtd;
			System.out.printf("Total: R$ %.2f%n",tot);
		}
		if(cod==5) {
			tot = 1.5*qtd;
			System.out.printf("Total: R$ %.2f%n",tot);
		}	
		sc.close();

	}

}
