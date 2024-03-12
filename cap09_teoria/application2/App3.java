package application2;

import java.util.Locale;
import java.util.Scanner;

import entitites.Product;

public class App3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		Product product = new Product(name, price);
		
		product.setName("Computer");
		System.out.println("Uptaded name: "+ product.getName());
		System.out.print("Set new price: ");
		product.setPrice(sc.nextDouble());
		System.out.println("Updated price: "+product.getPrice());
		
		System.out.println("");
		System.out.println("Product data: " + product);

		System.out.println("");
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		System.out.println("Updated data: " + product);

		System.out.println("");
		System.out.printf("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		System.out.println("Updated data: " + product);

		sc.close();
	}
}
