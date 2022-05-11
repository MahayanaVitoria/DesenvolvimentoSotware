package br.edu.up.model;

public class Animal {

	private int idade;
	public String nome;
	
	
	public void setIdade(int idade) throws Exception {
		if (idade < 0 || idade > 150) {
			throw new Exception(idade + " � uma idade inv�lida!");
		}
		
		this.idade = idade;
	}

}
