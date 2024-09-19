package cataFrutas;

public class posicao {
	public String teste = "Funcionando";
	private fruta fruta;
	private grama grama;
	private pedra pedra;
	private arvore arvore;
	private competidor competidor;
	
	public void setPedra(){
		this.pedra = new pedra();
	}
	
	public boolean getPedra() {
		return this.pedra != null;
	}
}
