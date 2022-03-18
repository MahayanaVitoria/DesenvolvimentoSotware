import java.util.Scanner;

public class Exercicio03EntradaDados { //Início programa
	
	public static void main (String[] args) {// Início main
		
//		String matricula = "12345";
//   	String nome = "João";
//		double nota1 = 7.5;
//		double nota2 = 6.7;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a matrícula:");
		String matricula = leitor.nextLine();
		
		System.out.println("Digite o nome:");
		String nome = leitor.nextLine();
		
		System.out.print("Digite a nota 1:");
		double nota1 = leitor.nextDouble();
		//leitor.nextLine();
		
		System.out.println("Digite a nota2:");
		double nota2 = leitor.nextDouble();
		//leitor.nextLine();
		
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
		
		leitor.close();
		
	} //Fim main

} //Fim programa