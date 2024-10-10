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
public class posicao {
	private Fruta fruta;
	private grama grama;
	private pedra pedra;
	private arvore arvore;
	private Competidor competidor;
	
	public void setPedra(){
		this.pedra = new pedra();
	}
	
	public boolean temPedra() {
		return this.pedra != null;
	}
	
	
	public void setGrama() {
		this.grama = new grama();
	}
	
	
	public void setArvore(arvore arvore) {
		this.arvore = arvore;
	}
	
	
	public boolean temArvore() {
		return this.arvore != null;
	}
	
	
	public arvore getArvore() {
		return this.arvore;
	}
	
	public void setFruta(Fruta fruta) {
		this.fruta = fruta;
	}
	public boolean temFruta() {
		return this.fruta != null;
	}
	
	public Fruta getFruta() {
		return this.fruta;
	}
	
	public boolean temCompetidor() {
		return this.competidor !=null;
	}
	
	public void setCompetidor(String nome,int mochila) {
		this.competidor = new Competidor(nome,mochila);
	}
	
}
