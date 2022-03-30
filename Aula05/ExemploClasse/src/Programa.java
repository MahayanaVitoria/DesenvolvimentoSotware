import java.util.Iterator;

public class Programa {
	public static void main(String[] args) {
		
		File arquivo = new File(C:\Users\09199732998\Downloads\Aula05\ExemploClasse\src);
		Scanner leitor = new Scanner(arquivo);
		leitor.nextLine();
		
		Aluno[] alunos = new Aluno[5];
		int contador = 0;
		
//		String texto = "texto";
//		
//		//objeto: aluno1
//			Aluno aluno1 = new Aluno();
//			aluno1.matricula = "01";
//			aluno1.nome = "João";
//			aluno1.nota1 = 7.8;
//			aluno1.nota2 = 8.3;
//			aluno1.nota3 = 5.6;
//		//objeto: aluno1/aluno2
//			Aluno aluno2 = new Aluno();
//			aluno2.matricula = "02";
//			aluno2.nome = "Maria";
//			aluno2.nota1 = 7.8;
//			aluno2.nota2 = 8.3;
//			aluno2.nota3 = 5.6;
//			
//		//vetor para objetos			
//			Aluno[] alunos = new Aluno[2];
//			alunos[0] = aluno1;
//			alunos[1] = aluno2;
			
			while(leitor.hasNext()) {
				String linha = leitor.nextLine();
				String[] dados = linha.split(";");
				String matricula = dados[0];
				String nome = dados[1];
				String nota1 = dados[2];
				String nota2 = dados[3];
				String nota3 = dados[4];
			
			
			Aluno aluno = new Aluno();
			aluno.matricula = matricula;
			aluno.nome = nome;
			aluno.nota1 = Double.parseDouble(nota1);
			aluno.nota2 = Double.parseDouble(nota2);
			aluno.nota3 = Double.parseDouble(nota3);
			
			alunos[contador] = aluno;
			contador++;
			}
			
		//for para imprimir o resultado
			for (int i = 0; i < alunos.length; i++) {
				Aluno a = alunos[i];
				System.out.println("Matrícula: " + a.matricula);
				System.out.println("Nome: " + a.nome);
				System.out.println("Nota 1: " + a.nota1);
				System.out.println("Nota 2: " + a.nota2);
				System.out.println("Nota 3: " + a.nota3);
				//faz espaço entre um resultado e outro
				System.out.println();
				
			}
	}

}
