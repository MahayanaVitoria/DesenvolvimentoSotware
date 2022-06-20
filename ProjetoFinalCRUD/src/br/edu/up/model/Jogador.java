package br.edu.up.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Jogador {
@Id
@GeneratedValue(strategy= GenerationType.AUTO)
private Integer id;
private String NomeJogador ;
private String Posicao;
private Integer AlturaJog;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getNomeJogador() {
	return NomeJogador;
}
public void setNomeJogador(String nomeJogador) {
	NomeJogador = nomeJogador;
}
public String getPosicao() {
	return Posicao;
}
public void setPosicao(String posicao) {
	Posicao = posicao;
}
public Integer getAlturaJog() {
	return AlturaJog;
}
public void setAlturaJog(Integer alturaJog) {
	AlturaJog = alturaJog;
}


}
