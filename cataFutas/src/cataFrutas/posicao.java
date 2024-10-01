package cataFrutas;
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
	
	public void setFruta(Fruta fruta) {
		if(fruta instanceof Maracuja ) {
			this.fruta = new Maracuja();
		} else if(fruta instanceof Laranja) {
			this.fruta = new Laranja();
		} else if(fruta instanceof Abacate) {
			this.fruta = new Abacate();
		}else if(fruta instanceof Coco) {
			this.fruta = new Coco();
		}else if(fruta instanceof Acerola) {
			this.fruta = new Acerola();
		}else if(fruta instanceof Amora) {
			this.fruta = new Amora();
		}else if(fruta instanceof Goiaba) {
			this.fruta = new Goiaba();
		}
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
