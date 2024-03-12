package membros_estaticos1_util;

public class Calculator {
	public static final double PI = 3.14159; //Pi nao pode ser alterado, 

	
	public static double circumference(double radius) {
		return PI*(2*radius);
	}
	
	public static double volume(double radius) {
		return (4*PI*(Math.pow(radius, 3))/3);
	}
}
