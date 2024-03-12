package entities;

public class Student {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double FinalGrade() {
		return nota1+nota2+nota3;
	}
	public void Aprovado() {
		if(FinalGrade()>=60) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAILED");
			double missing = 60-FinalGrade();
			System.out.printf("%.2f",missing);
		}
	}
	
}
