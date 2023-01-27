import java.util.Scanner;

public class exercicio02 {

	public static void main (String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int alunos = 5;
		
		String[] matricula = new String[alunos];
		String[] nome = new String[alunos];
		double[] nota1 = new double[alunos];
		double[] nota2 = new double[alunos];
		double[] notaFinal = new double[alunos];
		
		for (int i = 0; i < alunos; i++) {
			
		System.out.println("Informe a matrícula: ");
		matricula[i] = leitor.nextLine();
		
		System.out.println("Informe o nome: ");
		nome[i] = leitor.nextLine();
		
		System.out.println("Informe a nota 1: ");
		nota1[i] = leitor.nextDouble();
		
		System.out.println("Informe a nota 2: ");
		nota2[i] = leitor.nextDouble();
		
		notaFinal[i] = (nota1[i] + nota2[i])/2;
		
		leitor.nextLine();

		}
		
		for (int i = 0; i < alunos; i++) {
		
		System.out.println("Matrícula: " + matricula[i]);
		System.out.println("Nome: " + nome[i]);
		
		
		if(notaFinal[i] >= 6) {
			System.out.println("Aprovado: ( x ) Sim ( ) Não");
		} else {
			System.out.println("Aprovado: (  ) Sim ( x ) Não");
		}
		System.out.println("Nota Final: " + notaFinal[i]);
		System.out.println();
		}
		
	}
	
}
