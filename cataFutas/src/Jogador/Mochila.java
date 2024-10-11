package Jogador;

import java.util.ArrayList;
import Frutas.*;

/**
 * Implementação da mochila
 * @author Felipe Tojal
 */
public class Mochila {
	
	protected ArrayList<Fruta> listaFrutas;
	protected int tamanho;
	
	/**
	 * Construtor da classe mochila
	 * Recebe o tamanho da mochila no construtor e cria a mochila
	 * @throws IllegalArgumentException Se o tamanho inserido for menor ou igual a 0, uma exceção é lançada
	 * @param tamanho Capacidade da mochila
	 * 
	 */
	public Mochila(int tamanho) {
		if (tamanho <= 0) {
			throw new IllegalArgumentException("Tamanho da mochila é inválido");
		} else {
			listaFrutas = new ArrayList<>(tamanho);
			this.tamanho = tamanho;
		}
	}
	
	/**
	 * Método que adiciona elemento na mochila
	 * Recebe um elemento do tipo Fruta
	 * @throws IllegalArgumentException Se a mochila estiver cheia, lança uma exceção
	 * @param fruta instancia da classe filha de classe fruta desejada
	 * 
	 */
	public void adicionarFruta(Fruta fruta) {
		
		int quantElemMochila = listaFrutas.size(); 	// Calcula a quantidade de elementos na mochila
		
		if (quantElemMochila < tamanho) {
			listaFrutas.add(fruta);
		} else {
			throw new IllegalArgumentException("A mochila está cheia");
		}
		
	}
	
	/**
	 * Método que remove elemento da mochila
	 * @throws IllegalArgumentException Caso a fruta não seja encontrada na mochila, retorna uma exceção
	 * @param fruta instância da classe filha da classe fruta desejada
	 * 
	 */
	public void removerFruta(Fruta fruta) {
		
		if (listaFrutas.contains(fruta)) {
			listaFrutas.remove(fruta);
		} else {
			throw new IllegalArgumentException("A fruta não está na mochila");
		}
		
	}
}
