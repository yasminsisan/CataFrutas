package Jogador;

import Frutas.*;

/**
  * Classe que representa o competidor do jogo, listando seus atributos e possíveis ações
  * @author Felipe Tojal
 */
public class Competidor {
	//atributos da instância
	private String nome;
	private int pontosMovimento;
	private int pontosVitoria;
	private int forca;
	private Mochila mochila;
	private boolean comeuBichada;
	/**
	 * Construtor para objetos da classe Competidor
	 * @param nome Nome do Competidor
	 * @param tamanhoMochila Capacidade da mochila do competidor
	 */
	public Competidor(String nome, int tamanhoMochila) {
		this.nome = nome;
		this.pontosMovimento = 0;
		this.pontosVitoria = 0;
		this.forca = 0;
		this.mochila = new Mochila(tamanhoMochila);
		this.comeuBichada = false;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	
	/**
	 * Método que torna o atributo 'comeuBichada' em false
	 * Utilizado quando o usuário comer uma fruta antídoto
	 * @author Felipe Tojal
	 */
	public void curarCompetidor() {
		this.comeuBichada = false;
	}
	
	/**
	 * Método que torna o atributo 'comeuBichada' em true
	 * Utilizado quando o usuário comer uma fruta bichada
	 * 
	 */
	public void ficarDoente() {
		this.comeuBichada = true;
	}
	
	/**
	 * Método que aumenta a força do competidor em 1 ponto
	 * Esse efeito é causado por todas as frutas
	 * @author Felipe Tojal
	 */
	public void incrementaPoderForça() {
		this.forca++;
	}
	
	/**
	 * Método que dobra os pontos de movmento do competidor
	 * Esse efeito é causado pela fruta Coco
	 * 
	 */
	public void dobrarPontosMovimento() {
		this.pontosMovimento *= 2;
	}
	
	/**
	 * Método que dobra a força do competidor
	 * Esse efeito é causado pela fruta Abacate
	 * 
	 */
	public void dobrarForca() {
		this.forca *= 2;
	}
	
	/**
	 * Método que incrementa o atributo 'pontosVitoria'
	 * Esse efeito é causado pela fruta Maracujá(fruta ouro)
	 * 
	 */
	public void incrementaPontosVitoria() {
		this.pontosVitoria++;
	}
	
	/**
	 * Método que configura a quantidade de pontos de movimento 
	 * @param pontos os pontos gerados pelo lançamento dos dados
	 */
	public void setPontosMovimento(int pontos) {
		this.pontosMovimento = pontos;
	}
	/**
	 * Método de acesso aos pontos de movimento
	 * @return os pontos de movimento
	 */
	public int getPontosMovimento() {
		return this.pontosMovimento;
	}
	
	/*
	 * 	Não criei todas os métodos
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
}

