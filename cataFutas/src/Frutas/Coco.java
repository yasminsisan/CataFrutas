package Frutas;

import Jogador.*;
/**
 * Implementação da fruta Coco
 * O efeito causado pelo Coco é o de dobrar os pontos de movmento do competidor
 */
public class Coco extends Fruta{
	
	/**
	 * O construtor de Coco utiliza o da super classe
   * @author felipeTojal
	 */
	public Coco() {
		super();
	}
	
	/**
	 * O efeito causado é dobrar o número de pontos de movimento de uma rodada
	 * @author felipeTojal
	 */
	@Override
	public void causarEfeito(Competidor competidor) {
		competidor.dobrarPontosMovimento(); // Efeito específico do Coco
		super.causarEfeito(competidor); // Chama o efeito comum definido na classe Fruta
	}
}
