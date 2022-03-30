
public class ExemploString {
	
	public static void main(String[] args) {
	
		//Tipos Primitivos
		int numero = 100;
		
		//numero.
		
		
		//Classe -> vari�vel � um Objeto
		String texto = "S� sei que nada sei. (S�crates)";
		//lenght retorna o comprimento de uma string
		int comprimento = texto.length();

		System.out.println("Comprimento: " + comprimento);
		
		String subTexto = texto.substring(5, 31);
		System.out.println("Sub: " + subTexto);
		
		char caractere = texto.charAt(9);
		System.out.println("Char: " + caractere);
		
//		for use index on array (alterar args)		
		for (int i = 0; i < texto.length(); i++) {
			System.out.println(texto.charAt(i));
		}
		
		//quebrar as palavras para pr�xima linha
		String[] palavras = texto.split(" ");
		//foreach
		for (String palavra : palavras) {
			System.out.println(palavra);	
		}
		
		//dividir palavras com h�fen
		String textoHifen = texto.replace(" ", "-");
		System.out.println(textoHifen);
		
		//quebrar palavras com tab
		String textoTab = texto.replace(" ", "	");
		System.out.println(textoTab);
		
		//quebra com tab e quebra linha
		String[]palavrasTab = textoTab.split("\t");
		for (String palavra : palavrasTab) {
			System.out.println(palavra);
		}
	}
}
