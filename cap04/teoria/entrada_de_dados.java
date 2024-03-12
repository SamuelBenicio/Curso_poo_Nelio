package teoria;

import java.util.Scanner;

public class entrada_de_dados {

	public static void main(String[] args) {
		/*teste1 - nome
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		System.out.printf("O nome da pessoa é: %s ", x);
		sc.close();
		*/
		
		/*teste 2 - numero inteiro
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		System.out.printf("O valor digitado foi: %d ", x);
		sc.close
		*/
		
		/*teste 3 - numero flutuante
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();
		System.out.printf("O valor digitado em ponto flutuante foi: %.2f%n ", x);
		sc.close();
		*/
		
		/*teste 4 - unico caractere
		Scanner sc = new Scanner(System.in);
		char x;
		x = sc.next().charAt(0);
		System.out.printf("O primeiro caractere digitado foi: %s ",x);
		sc.close();
		*/
		
		//teste 5 - varias leituras
		Scanner sc = new Scanner(System.in);
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt(); //Pode ser digitado em uma linha(separado por espaço) todos os dados ou em 3 linhas
		z = sc.nextDouble();
		
		System.out.println("Dados digitados");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		sc.close();

	}

}
