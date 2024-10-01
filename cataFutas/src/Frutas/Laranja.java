package Frutas;

import Jogador.*;
/**
 * Implementação da fruta laranja
 * A Laranja tem o poder de curar o competidor, caso ele tenha comido alguma fruta bichada
 */
public class Laranja extends Fruta {
	
	/**
	 * O construtor de Laranja utiliza o construtor da super classe
	 * @author felipeTojal
	 */
	public Laranja() {
		super();
	}
	
	/**
	 * O efeito causado pela laranja é o de cura
	 * @author lfcor
	 */
	@Override
	public void causarEfeito(Competidor competidor) {
		competidor.curarCompetidor(); // Efeito específico da Laranja
		super.causarEfeito(competidor); // Chama o efeito comum definido na classe Fruta
	}

}
