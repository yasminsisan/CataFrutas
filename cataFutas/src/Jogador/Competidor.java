package Jogador;

import Frutas.*;

/**
  * Classe que representa o competidor do jogo, listando seus atributos e possíveis ações
 */
public class Competidor {
	
	private String nome;
	private int pontosMovimento;
	private int pontosVitoria;
	private int forca;
	private Mochila mochila;
	private boolean comeuBichada;
	
	public Competidor(String nome, int tamanhoMochila) {
		this.nome = nome;
		this.pontosMovimento = 0;
		this.pontosVitoria = 0;
		this.forca = 0;
		this.mochila = new Mochila(tamanhoMochila);
		this.comeuBichada = false;
	}
	
	/**
	 * Método que torna o atributo 'comeuBichada' em false
	 * Utilizado quando o usuário comer uma fruta antídoto
	 * @author lfcor
	 */
	public void curarCompetidor() {
		this.comeuBichada = false;
	}
	
	/**
	 * Método que torna o atributo 'comeuBichada' em true
	 * Utilizado quando o usuário comer uma fruta bichada
	 * @author lfcor
	 */
	public void ficarDoente() {
		this.comeuBichada = true;
	}
	
	/**
	 * Método que aumenta a força do competidor em 1 ponto
	 * Esse efeito é causado por todas as frutas
	 * @author lfcor
	 */
	public void incrementaPoderForça() {
		this.forca++;
	}
	
	/**
	 * Método que dobra os pontos de movmento do competidor
	 * Esse efeito é causado pela fruta Coco
	 * @author lfcor
	 */
	public void dobrarPontosMovimento() {
		this.pontosMovimento *= 2;
	}
	
	/**
	 * Método que dobra a força do competidor
	 * Esse efeito é causado pela fruta Abacate
	 * @author lfcor
	 */
	public void dobrarForca() {
		this.forca *= 2;
	}
	
	/**
	 * Método que incrementa o atributo 'pontosVitoria'
	 * Esse efeito é causado pela fruta Maracujá(fruta ouro)
	 * @author lfcor
	 */
	public void incrementaPontosVitoria() {
		this.pontosVitoria++;
	}


	public void movimentar() {
		if (pontosMovimento > 0) {
			this.pontosMovimento--; 
		} else {
			throw new IllegalArgumentException("Pontos de movimento insuficientes");
		}
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
