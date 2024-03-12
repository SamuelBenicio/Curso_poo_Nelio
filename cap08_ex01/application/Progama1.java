package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Progama1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.Width = sc.nextDouble();
		rectangle.Height = sc.nextDouble();
		
		System.out.println("AREA = "+ rectangle.Area());
		System.out.println("PERIMETER = " + rectangle.Perimeter());
		System.out.println("DIAGONAL = "+ rectangle.Diagonal());
		
		
		
		sc.close();
	}

}
