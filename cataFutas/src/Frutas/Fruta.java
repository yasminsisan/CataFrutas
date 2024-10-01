package Frutas;

import Jogador.*;

/**
 * Classe Fruta que servirá como base para os tipos de frutas do jogo
 */
public abstract class Fruta {
	
	protected boolean ouro;
	protected boolean bichada;
	
	public Fruta() {
		this.bichada = false;
		this.ouro = false;
	}
	
	/**
	 * Esse método serve para alterar o atributo 'bichada' para true e indicar que a fruta está bichada
	 * @author felipeTojal
	 */
	public void frutaBichada() {
		this.bichada = true;
	}
	/**
	 * O método causar efeito representa o efeito que uma fruta terá no competidor
	 * Cada fruta causa um efeito diferente, portanto cada uma implementará esse método de maneira separada
	 * O único efeito geral das frutas é fornecer poder de força 1 ao competidor
	 * @author felipeTojal
	 */
	public void causarEfeito(Competidor competidor) {
		competidor.incrementaPoderForça();
	}
	
}
