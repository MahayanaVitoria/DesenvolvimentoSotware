package br.edu.up;

import java.util.ArrayList;
import java.util.List;

import br.edu.up.model.Cachorro;
import br.edu.up.model.Gato;
import br.edu.up.model.Homem;
import br.edu.up.model.Humano;
import br.edu.up.model.Mulher;
import br.edu.up.model.Animal;


public class ExercicioOrientObjt01 {
	
	public static void main(String[] args) {
		
	try {
		
//		List listaDeObjetos = new ArrayList();
		List<Animal> listaDeAnimais = new ArrayList();
		List<Cachorro> listaDeCachorros = new ArrayList();
		
		
		Cachorro cachorro1 = new Cachorro();
		cachorro1.raca = "Rottweiler";
		cachorro1.nome = "Eros";
		cachorro1.setIdade(3);
		cachorro1.porte = "Médio";
		
		listaDeCachorros.add(cachorro1);
		listaDeAnimais.add(cachorro1);

		Cachorro cachorro2 = new Cachorro();
		cachorro2.raca = "Vira-Lata";
		cachorro1.nome = "Suzi";
		cachorro1.setIdade(3);
		cachorro1.porte = "Pequeno";
		
		listaDeCachorros.add(cachorro2);
		
		Cachorro cachorro3 = new Cachorro();
		cachorro3.raca = "Vira-Lata";
		cachorro1.nome = "Goa";
		cachorro1.setIdade(2);
		cachorro1.porte = "Médio";
		
		listaDeCachorros.add(cachorro3);
		
		Gato gato = new Gato();
		gato.setIdade(4);
		gato.nome = "Fred";
		
		listaDeAnimais.add(gato);
		
		Homem homem = new Homem();
		homem.setIdade(54);
		homem.nome = "Gabriel";
		
		Humano humano = new Humano();
		humano.setIdade(96);
		humano.nome = "Elisabeth";
		
		listaDeAnimais.add(humano);
		
		Mulher mulher = new Mulher();
		mulher.setIdade(43);
		mulher.nome = "Cleonice";
		
		for (Animal animal : listaDeAnimais) {
			System.out.println("Nome " + animal.nome);

		}
		
	} catch (Exception e) {
		System.out.println(e.toString());
	}
	
	}

}
