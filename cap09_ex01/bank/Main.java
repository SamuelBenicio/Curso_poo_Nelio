package bank;

import java.util.Locale;
import java.util.Scanner;

import utilities.Account;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Account account;
		
		double initialDeposit=0;
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();  //Consumir a quebra de linha pendente
		String name = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char cont = sc.next().charAt(0);
		if(cont=='y') {
			 System.out.print("Enter initial deposit value: ");
			 initialDeposit  = sc.nextDouble();
			 account = new Account(accountNumber, name, initialDeposit);
		}
		else {
			 account = new Account(accountNumber,name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data");
		System.out.println(account);
		
		sc.close();
	}

}
