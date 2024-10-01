package Frutas;

import Jogador.Competidor;
/**
 * Implementação da fruta Abacate 
 * O efeito causado pelo abacate é o de dobrar os pontos de força do competidor
 */
public class Abacate extends Fruta{
	
	/**
	 * O construtor de Abacate chama o construtor da super classe
	 * @author felipeTojal
	 */
	public Abacate() {
		super();
	}
	
	/**
	 * Método que implementa o efeito causado pelo Coco
	 * O Coco dobra a força do competidor
	 * @author felipeTojal
	 */
	@Override
	public void causarEfeito(Competidor competidor) {
		competidor.dobrarForca();  // Efeito específico do Abacate
		super.causarEfeito(competidor); // Chama o efeito comum definido na classe Fruta
	}
}
