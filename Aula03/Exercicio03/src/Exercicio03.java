import java.util.Scanner;

public class Exercicio03 { //In�cio programa
	
	public static void main(String[] args) {// In�cio main
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe a matr�cula:");
		String matriculas = leitor.nextLine();
		
		System.out.println("Informe o nome:");
		String nomes = leitor.nextLine();
		
		double[] notas = new double[5];
		
		int contador = 0;
		do {
			System.out.println("Informar uma nota entre 0 e 10.");
			System.out.println("Digite a nota" + (contador + 1) + ":");
			double temp = leitor.nextDouble();
			
			if (temp >= 0 && temp <= 10) {
				notas[contador] = temp;
				contador++;
			}
			else {
				System.out.println("A nota " + temp + "� inv�lida!");
			}
			
		} while(contador < 5);
		
		System.out.println();
		System.out.println("---------------RELAT�RIO---------------");
		System.out.println("Matr�cula: " + matriculas);
		System.out.println("Nome: " + nomes);
		
		for(int i = 0; i < notas.length; i++) {
			System.out.println("Nota " + (i + 1) + ":" + notas[1]);
		}
		
		leitor.close();
		
	} //Fim main

} //Fim programa