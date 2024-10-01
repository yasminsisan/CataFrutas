package cataFrutas;
import Frutas.*;
public class posicao {
	public String teste = "Funcionando";
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
		if(arvore instanceof coqueiro ) {
			this.arvore = new coqueiro();
		} else if(arvore instanceof abacateiro) {
			this.arvore = new abacateiro();
		} else if(arvore instanceof laranjeira) {
			this.arvore = new laranjeira();
		}else if(arvore instanceof aceroleira) {
			this.arvore = new aceroleira();
		}else if(arvore instanceof amoreira) {
			this.arvore = new amoreira();
		}else if(arvore instanceof goiabeira) {
			this.arvore = new goiabeira();
		}
	}
	
	
	public boolean temArvore() {
		return this.arvore != null;
	}
	
	
	public arvore getArvore() {
		return this.arvore;
	}
}
