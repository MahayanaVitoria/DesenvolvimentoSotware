public class Programa { //In�cio programa
	
	public static void main (String[] args) {// In�cio main
		
		String matricula = "12345";
		String nome = "Jo�o";
		double nota1 = 7.5;
		double nota2 = 6.7;
		double notaFinal = (nota1 + nota2);
		
		// igual ou superior a 6
		
		if (notaFinal >=6) {
			
			System.out.printIn("Matr�cula: " + matricula); //concatena��o
			System.out.printIn("Nome: " + nome);
			System.out.printIn("Aprovado: Sim ( ) N�o (x)");
			System.out.printIn("Nota final: " + notaFinal);
			
		} else {
			
			System.out.printIn("Matr�cula: " + matricula); //concatena��o
			System.out.printIn("Nome: " + nome);
			System.out.printIn("Aprovado: Sim (x) N�o ( )");
			System.out.printIn("Nota final: " + notaFinal);
			
		}
		
	} //Fim main

} //Fim programa