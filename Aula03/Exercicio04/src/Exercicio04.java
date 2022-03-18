import java.util.Scanner;

public class Exercicio04 { //Início programa
	
	public static void main(String[] args) {// Início main
		
		Scanner leitor = new Scanner(System.in);
		
		String[] matriculas = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite a matrícula " + (i + 1) + ":");
			matriculas[i] = leitor.nextLine();
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Matrícula " + (i + 1) + ": " + matriculas[i]);
		}		
		
		String[] nomes = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Digite o nome " + (i + 1) + ":");
			nomes[i] = leitor.nextLine();
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
		}
		
		String[] n1 = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Primeira nota " + (i + 1) + ":");
			n1[i] = leitor.nextLine();
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Nota " + (i +1) + ": " + n1[i]);
		}
		
		String[] n2 = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Segunda nota " + (i + 1) + ":");
			n2[i] = leitor.nextLine();
		}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("Nota " + (i +1) + ": " + n2[i]);
		}
		
		String[] n3 = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Terceira nota " + (i + 1) + ":");
			n3[i] = leitor.nextLine();
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Nota " + (i +1) + ": " + n3[i]);
		}
		
		String[] n4 = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Quarta nota " + (i + 1) + ":");
			n4[i] = leitor.nextLine();
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Nota " + (i +1) + ": " + n4[i]);
		}
		
		String[] n5 = new String[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Quinta nota " + (i + 1) + ":");
			n5[i] = leitor.nextLine();
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Nota " + (i +1) + ": " + n5[i]);
		}
		
		leitor.close();
			
		double[] nFinal = new double [3];

		
		nFinal[0] = Double.parseDouble(n1[0]) + Double.parseDouble(n2[0]) + Double.parseDouble(n3[0]) + Double.parseDouble(n4[0]) + Double.parseDouble(n5[0]) /2;
		nFinal[0] = Double.parseDouble(n1[1]) + Double.parseDouble(n2[1]) + Double.parseDouble(n3[1]) + Double.parseDouble(n4[1]) + Double.parseDouble(n5[1]) /2;
		nFinal[0] = Double.parseDouble(n1[2]) + Double.parseDouble(n2[2]) + Double.parseDouble(n3[2]) + Double.parseDouble(n4[2]) + Double.parseDouble(n5[2]) /2;
		
		System.out.println("Nota final 1: " + nFinal[0]);
		System.out.println("Nota final 2: " + nFinal[1]);
		System.out.println("Nota final 2: " + nFinal[2]);
		
		if (nFinal[0] >=6) {
			
			System.out.println("Reprovado");
			
		} else {
			
			System.out.println("Aprovado");
		}
	
		if (nFinal[1] >=6) {
			
			System.out.println("Reprovado");
			
		} else {
			
			System.out.println("Aprovado");
		}
		
		if (nFinal[2] >=6) {
			
			System.out.println("Reprovado");
			
		} else {
			
			System.out.println("Aprovado");
		}
		
	} //Fim main
	
} //Fim programa