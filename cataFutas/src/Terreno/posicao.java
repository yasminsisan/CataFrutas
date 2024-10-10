package Terreno;
import Arvores.abacateiro;
import Arvores.aceroleira;
import Arvores.amoreira;
import Arvores.arvore;
import Arvores.coqueiro;
import Arvores.goiabeira;
import Arvores.laranjeira;
import Frutas.*;
import Jogador.*;

/**
 * Classe que representa cada posição do terreno. Cada posição pode conter diferentes elementos.
 * @author Pedro Thalles Lima Ricarte
 * @version 1.0
 */
public class posicao {
	/**
	 * Atributos de instância
	 */
	private Fruta fruta;
	private grama grama;
	private pedra pedra;
	private arvore arvore;
	private Competidor competidor;
	
	/**
	 * Método que adiciona uma pedra à posição
	 */
	public void setPedra(){
		this.pedra = new pedra();
	}
	/**
	 * Método que mostra se aquela posição possui uma pedra ou não
	 * @return o valor lógico de se a posição tem uma pedra
	 */
	public boolean temPedra() {
		return this.pedra != null;
	}
	
	/**
	 * Método que adiciona grama à posição
	 */
	public void setGrama() {
		this.grama = new grama();
	}
	
	/**
	 * Método que adiciona uma árvore específica à posição
	 * @param instância da classe filha da classe arvore desejada
	 */
	public void setArvore(arvore arvore) {
		this.arvore = arvore;
	}
	
	/**
	 * Método que mostra se aquela posição tem uma árvore
	 * @return o valor lógico de se tem uma árvore na posição
	 */
	public boolean temArvore() {
		return this.arvore != null;
	}
	
	/**
	 * Método pelo qual se obtém a instância da classe arvore que está na posição
	 * @return A instância da classe arvore que está naquela posição
	 */
	public arvore getArvore() {
		return this.arvore;
	}
	/**
	 * Método que adiciona uma fruta específica à posição
	 * @param instância da classe filha da classe fruta desejada
	 */
	public void setFruta(Fruta fruta) {
		this.fruta = fruta;
	}
	/**
	 * Método que mostra se aquela posição possui um fruta.
	 * @return O valor lógico de se há uma fruta na posição
	 */
	public boolean temFruta() {
		return this.fruta != null;
	}
	/**
	 * Método pelo qual se obtém a instância da classe Fruta que está na posição
	 * @return a instância da classe Fruta na posição
	 */
	public Fruta getFruta() {
		return this.fruta;
	}
	/**
	 * Método que mostra se há um competidor na posição
	 * @return valor lógico de se há um competidor na posição
	 */
	public boolean temCompetidor() {
		return this.competidor !=null;
	}
	/**
	 * Método que adiciona o competidor a uma posição
	 * @param Nome do competidor
	 * @param Capacidade da mochila do competidor/
	 */
	public void setCompetidor(String nome,int mochila) {
		this.competidor = new Competidor(nome,mochila);
	}
	
}
