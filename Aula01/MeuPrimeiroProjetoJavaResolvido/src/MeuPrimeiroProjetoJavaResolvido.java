public class MeuPrimeiroProjetoJavaResolvido { //In�cio programa
	
	public static void main (String[] args) {// In�cio main
		
		String matricula = "12345";
		String nome = "Jo�o";
		double nota1 = 7.5;
		double nota2 = 6.7;
		double notaFinal = (nota1 + nota2)/2;
		
		// igual ou superior a 6
		
		System.out.println("Matr�cula: " + matricula); //concatena��o
		System.out.println("Nome: " + nome);
		
		if (notaFinal >=6) {
			
			System.out.println("Aprovado: Sim ( ) N�o (x)");
			
		} else {
			
			System.out.println("Aprovado: Sim (x) N�o ( )");
			
		}
		
		System.out.println("Nota final: " + notaFinal);
		
	} //Fim main

} //Fim programa