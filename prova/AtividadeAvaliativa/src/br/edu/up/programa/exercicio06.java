package br.edu.up.programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

import br.edu.up.modelo.Grupo;

public class exercicio06 {
	
	public static void main(String[] args) {
	
		Scanner leitor = getLeitor();
		if (leitor == null) {
			System.out.println("N�oo foi poss�vel execut�-lo!");
		} else {
			
			Grupo[] grupos = carregarDados(leitor);
			gravarRelatorio(grupos);
		}
		
		System.out.println("Deu boa!");
	}
	
	public static void gravarRelatorio(Grupo[] grupos) {
		try { Formatter gravador = new Formatter(
					"C:\\_src\\ws-ter-noi\\Ex06\\src\\relatorio-de-grupos.txt");
			
			int vlrTotal = 0;
			for (int i = 0; i < grupos.length; i++) {
				Grupo grp = grupos[i];
				gravador.format("Valor do grupo " + grp.letra
						 + ": " + grp.getValor() + "\n");
				vlrTotal += grp.getValor();
			}
			gravador.format("Valor total: " + vlrTotal);
			
			gravador.close();
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
	}
	
	public static Grupo[] carregarDados(Scanner leitor) {
		Grupo grupoA = new Grupo("A");
		Grupo grupoB = new Grupo("B");
		Grupo grupoC = new Grupo("C");
		Grupo grupoD = new Grupo("D");
		Grupo grupoE = new Grupo("E");
		Grupo grupoF = new Grupo("F");
		
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
				break;
			}						
		}
		
		Grupo[] grupos = new Grupo[6];
		grupos[0] = grupoA;
		grupos[1] = grupoB;
		grupos[2] = grupoC;
		grupos[3] = grupoD;
		grupos[4] = grupoE;
		grupos[5] = grupoF;
		
		return grupos;
	}
	
	public static Scanner getLeitor() {
		File arquivo = new File("C:\\_src\\ws-ter-noi\\Ex06\\src\\grupos-tabulados.txt");
		
		Scanner leitor = null;
		try {
			leitor = new Scanner(arquivo);
		} catch (FileNotFoundException e) {
			System.out.println("O arquivo no foi encontrado!");
		}
		return leitor;
	}	

}
