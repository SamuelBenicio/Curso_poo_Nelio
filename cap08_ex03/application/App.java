package application;

	import java.util.Locale;
import java.util.Scanner;

import entities.Student;
public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Student student = new Student();
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.print("FINAL GRADE: ");
		System.out.println(student.FinalGrade());
		
		student.Aprovado();
		
		sc.close();
	}

}
