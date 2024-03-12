package teoria;

public class operacao_split {

	public static void main(String[] args) {
		String s = "potato apple lemon";
		
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		
		System.out.println("Original: "+ s);
		System.out.println("Vetor[0]: "+ word1);
		System.out.println("Vetor[1]: "+ word2);
		System.out.println("Vetor[2]: "+ word3);
	}

}
