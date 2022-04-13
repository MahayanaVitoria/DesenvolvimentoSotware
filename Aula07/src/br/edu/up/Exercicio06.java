package br.edu.up;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import br.edu.up.modelo.Grupo;

public class Exercicio06 {
	
	public static void main(String[] args) {
	
		// 1. Carregar o arquivo
		Scanner leitor = getLeitor();
		if (leitor == null) {
			System.out.println("Não foi possível executar o programa!");
		} else {
			
			// 2. Carregar Dados
			Grupo[] grupos = carregarDados(leitor);
			
			// 3. Gravar relatório
			gravarRelatorio(grupos);
		}
		
		public static void gravarRelatorio(Grupo[] grupos) {
			try {
			Formatter gravador = new Formatter ("");
			}
	}
	public static Grupo[] carregarDados(Scanner)
			
			Grupo grupoA = new Grupo();
			Grupo grupoB = new Grupo();
			Grupo grupoC = new Grupo();
			Grupo grupoD = new Grupo();
			Grupo grupoE = new Grupo();
			Grupo grupoF = new Grupo();
			
			while(leitor.hasNext()) {
				String linha = leitor.nextLine();
				String[] dadosLinha = linha.split("\t");
				switch (dadosLinha[0]) {
				case "A":
					grupoA.adicionarValor(dadosLinha[1]);
					break;
				case "B":
					grupoB.adicionarValor(dadosLinha[1]);
					break;
				case "C":
					grupoC.adicionarValor(dadosLinha[1]);
					break;
				case "D":
					grupoD.adicionarValor(dadosLinha[1]);
					break;
				case "E":
					grupoE.adicionarValor(dadosLinha[1]);
					break;
				case "F":
					grupoF.adicionarValor(dadosLinha[1]);
//					.valores[?] = dadosLinha[1];
					break;
				}//switch
			}//while
		}
		
	}
	
	public static Scanner getLeitor() {
		File arquivo = new File ("C:\\Users\\Aluno\\eclipse-workspace\\Aula07\\src\\grupos-tabulados.txt");
		
		Scanner leitor = null;
		try {
			leitor = new Scanner(arquivo);
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("O arquivo não foi encontrado!");
		}
		return leitor;
	}

}
