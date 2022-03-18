import java.util.Scanner;

public class Exercicio04 { //Início programa
	
	public static void main(String[] args) {// Início main
		
		Scanner leitor = new Scanner(System.in);
		
		String[] nomes = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome " + (i + 1) + ":");
			nomes[i] = leitor.nextLine();
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Nome" + (i + 1) + ": " + nomes[i]);
		}		
		
		leitor.close();
		
	} //Fim main

} //Fim programa