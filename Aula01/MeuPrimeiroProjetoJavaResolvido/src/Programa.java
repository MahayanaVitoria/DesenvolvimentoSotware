public class Programa { //Início programa
	
	public static void main (String[] args) {// Início main
		
		String matricula = "12345";
		String nome = "João";
		double nota1 = 7.5;
		double nota2 = 6.7;
		double notaFinal = (nota1 + nota2);
		
		// igual ou superior a 6
		
		if (notaFinal >=6) {
			
			System.out.printIn("Matrícula: " + matricula); //concatenação
			System.out.printIn("Nome: " + nome);
			System.out.printIn("Aprovado: Sim ( ) Não (x)");
			System.out.printIn("Nota final: " + notaFinal);
			
		} else {
			
			System.out.printIn("Matrícula: " + matricula); //concatenação
			System.out.printIn("Nome: " + nome);
			System.out.printIn("Aprovado: Sim (x) Não ( )");
			System.out.printIn("Nota final: " + notaFinal);
			
		}
		
	} //Fim main

} //Fim programa