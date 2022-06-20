package br.edu.up;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.up.model.Jogador;


public class Programa {

	static EntityManagerFactory emf;
	static EntityManager em;

	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("prj-jpa-sqlite");
		em = emf.createEntityManager();
		
		Scanner leitor = new Scanner(System.in);
		
		
		int opcao = 0;
		int menu = 0;
		while(opcao != 5) {
			System.out.println(".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.");
			System.out.println("CADASTRAR JOGADOR - CORITIBA FOOTBALL CLUB");
			System.out.println(".*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.*.");
			while(menu != 5) {
				menu();
				
				System.out.println("Digite a opção desejada:");
				opcao = Integer.parseInt(leitor.nextLine());
				
				if(opcao == 1) {
					System.out.println("NOVO JOGADOR");
					
					System.out.println("Nome: ");
					String nomeJogador = leitor.nextLine();
					System.out.println("Posição: ");
					String posicaoJogador = leitor.nextLine();
					System.out.println("Altura (em cm): ");
					int alturaJog = Integer.parseInt(leitor.nextLine());
					
					cadastrarJogador(nomeJogador, posicaoJogador, alturaJog);
					
					opcao = 0;
				}
				else if(opcao == 2){
					System.out.println("ATUALIZAR DADOS DO JOGADOR");
					
					System.out.println("Id: ");
					int id = Integer.parseInt(leitor.nextLine());
					System.out.println("Nome: ");
					String nomeJogador = leitor.nextLine();
					System.out.println("Posição: ");
					String posicaoJogador = leitor.nextLine();
					System.out.println("Altura (em cm): ");
					int alturaJog = Integer.parseInt(leitor.nextLine());
					
					atualizarJogador(id, nomeJogador, posicaoJogador, alturaJog);
					opcao = 0;
				}
					
				else if(opcao ==3) {
					mostrarJogadores();
					
					opcao = 0;
				}
				else if(opcao == 4) {
					System.out.println("Digite o ID do jogador para removê-lo:");
					int id = Integer.parseInt(leitor.nextLine());
					apagar(id);
				}
				
				
				
				else if(opcao == 5) {
					System.out.println("Operação realizada com sucesso!");
					menu = 5;
					break;
					
					
				}
				
				
				
			}		
			
			
			
		}
		
	leitor.close();	
	}
	
	public static void menu() {
		
		System.out.println("Menu:");
		System.out.println("(1)-Cadastrar novo jogador");
		System.out.println("(2)-Atualizar dados do jogador");
		System.out.println("(3)-Listar todos os jogadores");
		System.out.println("(4)-Apagar dados do jogador");
		System.out.println("(5)-Sair");
		System.out.println("\n");

	}
	
	
	public static void cadastrarJogador(String nome, String posicao, int altura) {
		
		Jogador jogador = new Jogador();
		jogador.setNomeJogador(nome);
		jogador.setPosicao(posicao);
		jogador.setAlturaJog(altura);
		salvar(jogador);
		
	}
	
	public static void atualizarJogador(int id, String nome, String posicao, int altura) {
		
		Jogador jogador = localizar(id);
		String nomeJogador = jogador.getNomeJogador();
		String posicaoJogador = jogador.getPosicao();
		int alturaJogador = jogador.getAlturaJog();
		
		if(!nome.equals(nomeJogador)) {
			nomeJogador = nome;
		}
		if (!posicao.equals(posicaoJogador)) {
			posicaoJogador = posicao;
		}
		if(alturaJogador != altura) {
			alturaJogador = altura;
		}

		
		jogador.setNomeJogador(nomeJogador);
		jogador.setPosicao(posicaoJogador);
		jogador.setAlturaJog(alturaJogador);
		
		atualizar(jogador);

	}
	
	public static void mostrarJogadores() {
		List<Jogador> jogador = listarJogadores();

		System.out.println(".......................................");	
		System.out.println("---------------------------------------");
		System.out.println("ID | Jogador | Posição | Altura" );
		System.out.println("---------------------------------------");
		for (Jogador jogador2 : jogador) {
			System.out.println(jogador2.getId() + " | " +  jogador2.getNomeJogador() + " | " + jogador2.getPosicao() + " | " + jogador2.getAlturaJog());
			System.out.println("---------------------------------------");
		}	
		
		System.out.println(".......................................");
	}
	
	public static List<Jogador> listarJogadores(){
		List<Jogador> jogadores = em.createQuery("from Jogador", Jogador.class).getResultList();
		
		return jogadores;
		
	}
	

	public static Integer salvar(Jogador jogador) {
		em.getTransaction().begin();
		em.persist(jogador);
		em.getTransaction().commit();
		return jogador.getId();
			
	}

	

	public static Jogador localizar(Integer id) {
		Jogador jogador = em.find(Jogador.class, id);
		return jogador;
	
	}
	

	public static void atualizar(Jogador jogador) {
		em.getTransaction().begin();
		em.merge(jogador);
		em.getTransaction().commit();
			
	}

	public static void apagar(Integer id) {
		Jogador jogador = em.find(Jogador.class, id);
		em.getTransaction().begin();
		em.remove(jogador);
		em.getTransaction().commit();
		
	}

	@SuppressWarnings("unused")
	private static void imprimir(Jogador jogador) {
				System.out.println(jogador);
    }
}
