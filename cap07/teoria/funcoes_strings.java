package teoria;

public class funcoes_strings {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase(); //Transforma todas as letras da string em letras minusculas
		String s02 = original.toUpperCase(); //Transforma todas as letras da string em letras maiusculas
		String s03 = original.trim(); //Elimina os espaços no final da string
		String s04 = original.substring(2); //Pega o caractere do numero inteiro digitado em diante
		String s05 = original.substring(2,9); //Pega o caractere do numero inteiro digitado em diante até o outro numero digitado
		String s06 = original.replace('a','x'); //Troca o caractere digitado pelo o outro que foi digitado, no caso foi trocado o 'a' pelo 'x'
		String s07 = original.replace("abc","xy"); //Troca os caracteres digitados pelos os outros que foram digitados, no caso foram trocados o 'abc' pelo 'xy'
		int i = original.indexOf("bc"); //Retorna a primeira posicao em que o "bc" foi encontrado
		int j = original.lastIndexOf("bc"); //Retorna a ultima posicao em que "bc" foi encontrado
		
		
		System.out.println("Original: -"+original+"-");
		System.out.println("toLowerCase: "+s01+"-"); 
		System.out.println("toUpperCase: -"+s02 +"-");
		System.out.println("trim: -"+s03 +"-"); 
		System.out.println("substring(2): -"+s04 +"-");
		System.out.println("substring(2,9): -"+s05 +"-");
		System.out.println("replace('a','x'): -"+s06 +"-");
		System.out.println("replace('abc','xy'): -"+s07 +"-");
		System.out.println("Index of 'bc' : " + i);
		System.out.println("Last index of 'bc' : " + j);
		
	}

}
