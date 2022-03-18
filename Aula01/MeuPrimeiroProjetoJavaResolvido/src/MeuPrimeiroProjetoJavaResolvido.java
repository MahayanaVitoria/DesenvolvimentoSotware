public class MeuPrimeiroProjetoJavaResolvido { //Início programa
	
	public static void main (String[] args) {// Início main
		
		String matricula = "12345";
		String nome = "João";
		double nota1 = 7.5;
		double nota2 = 6.7;
		double notaFinal = (nota1 + nota2)/2;
		
		// igual ou superior a 6
		
		System.out.println("Matrícula: " + matricula); //concatenação
		System.out.println("Nome: " + nome);
		
		if (notaFinal >=6) {
			
			System.out.println("Aprovado: Sim ( ) Não (x)");
			
		} else {
			
			System.out.println("Aprovado: Sim (x) Não ( )");
			
		}
		
		System.out.println("Nota final: " + notaFinal);
		
	} //Fim main

} //Fim programa