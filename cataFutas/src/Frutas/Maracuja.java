package Frutas;

import Jogador.*;
/**
 * Implementação da fruta Maracuja
 * É a fruta ouroo efeito dela é aumentar os pontos de vitória
 */
public class Maracuja extends Fruta {
	
	/**
	 * O construtor define a fruta sendo ouro e não bichada
	 * @author felipeTojal
	 */
	public Maracuja() {
		this.bichada = false;
		this.ouro = true;
	}
	
	/**
	 * O efeito causado pelo maracujá é que ele fornece um ponto de vitória ao jogador, por ser uma fruta ouro
	 * @author felipeTojal
	 */
	@Override
	public void causarEfeito(Competidor competidor) {
		competidor.incrementaPontosVitoria(); // Efeito específico do Maracuja
		super.causarEfeito(competidor); // Chama o efeito comum definido na classe Fruta
	}

}

