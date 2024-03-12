package desafio_pensionato;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] quartos = new int[10];
		System.out.println("How many rooms will be rented? ");
		int n = sc.nextInt();
		Students[] estudantes = new Students[n];
		
		for(int i=0;i<estudantes.length;i+=1) {
			System.out.printf("RENT #%d%n",i+1);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			String email = sc.nextLine();
			int room = sc.nextInt();
			
			estudantes[i] = new Students(name,email,room);
			quartos[i] = 
			}
		
		
		
		
		
		
		sc.close();
	}

}
