package br.edu.up.modelo;

public class Grupo {
	
	public String letra;
	public int[] valores = new int [12];
	
	private int contador = 0;
	
	public void adicionarValor(String vlr) {
		int vlrInteiro = Integer.parseInt(vlr);
		this.valores[this.contador] = vlrInteiro;
		this.contador++;
	}

}
