package partida;
import Arvores.*;
import Frutas.*;
import Interface.*;
import Terreno.*;
import Jogador.*;
import java.util.Random;
public class partida {
	private Competidor competidor1;
	private Competidor competidor2;
	private int dado;
	private int rodada;
	private floresta floresta;
	
	
	
	
	public partida(Competidor competidor1, Competidor competidor2,floresta floresta) {
		
		Random random = new Random();
		
		boolean moeda = random.nextBoolean();
		
		if(moeda == true) {
			this.competidor1 = competidor1;
			this.competidor2 = competidor2;
		} else if(moeda == false) {
			this.competidor1 = competidor2;
			this.competidor2 = competidor1;
		}
		
		this.floresta = floresta;
		this.rodada = 1;
		
		
		
		int j = random.nextInt(this.floresta.getDimensao());
		int k = random.nextInt(this.floresta.getDimensao());
		while(this.floresta.matriz[j][k].temPedra() == true||this.floresta.matriz[j][k].temArvore()==true||this.floresta.matriz[j][k].temFruta()==true||this.floresta.matriz[j][k].temCompetidor()) {
			j = random.nextInt(this.floresta.getDimensao());
			k = random.nextInt(this.floresta.getDimensao());
		}						
		this.floresta.matriz[j][k].setCompetidor(competidor1);	
		
		j = random.nextInt(this.floresta.getDimensao());
		k = random.nextInt(this.floresta.getDimensao());
		while(this.floresta.matriz[j][k].temPedra() == true||this.floresta.matriz[j][k].temArvore()==true||this.floresta.matriz[j][k].temFruta()==true||this.floresta.matriz[j][k].temCompetidor()) {
			j = random.nextInt(this.floresta.getDimensao());
			k = random.nextInt(this.floresta.getDimensao());
		}						
		this.floresta.matriz[j][k].setCompetidor(competidor2);
		
		
			
	}
	
	
	public void rolarDados() {
		Random random = new Random();
		int dado1 = random.nextInt(7);
		int dado2 = random.nextInt(7);
		int total = dado1+dado2;
		
		if(this.rodada%2 !=0) {
			this.competidor1.setPontosMovimento(total);
		} else if(this.rodada%2 == 0) {
			this.competidor2.setPontosMovimento(total);
		}
	}
	
	public void andarFrente() {
		if(this.rodada%2 !=0) {
			
			int linha=0;
			int coluna=0;
			for(int i = 0; i<this.floresta.getDimensao();i++) {
				for(int j=0; j<this.floresta.getDimensao();j++) {
					if(this.floresta.matriz[i][j].getCompetidor()==this.competidor1) {
						linha = i;
						coluna = j;
					}
				}
			}
			this.floresta.matriz[linha][coluna].removerCompetidor();
			if(linha!=0) {
				this.floresta.matriz[linha-1][coluna].setCompetidor(competidor1);
				System.out.println(this.competidor1.getNome()+" Se movimentou para frente");
			}else {
				System.out.println(this.competidor1.getNome()+" Tentou se movimentar para frente, mas atingiu a borda do terreno");
			}
			
		} else if(this.rodada%2 == 0) {
			
			int linha=0;
			int coluna=0;
			for(int i = 0; i<this.floresta.getDimensao();i++) {
				for(int j=0; j<this.floresta.getDimensao();j++) {
					if(this.floresta.matriz[i][j].getCompetidor()==this.competidor2) {
						linha = i;
						coluna = j;
					}
				}
			}
			this.floresta.matriz[linha][coluna].removerCompetidor();
			if(linha!=0) {
				this.floresta.matriz[linha-1][coluna].setCompetidor(competidor2);
				System.out.println(this.competidor2.getNome()+" Se movimentou para frente");
			}else {
				System.out.println(this.competidor2.getNome()+" Tentou se movimentar para frente, mas atingiu a borda do terreno");
			}
			
		}
		this.rodada++;
	}
	public void andarTras() {
		
	}
	public void andarEsquerda() {
		
	}
	public void andarDireita() {
		
	}
	
	public void ExibirInfo() {
		System.out.println("Primeiro jogador: "+this.competidor1.getNome());
		System.out.println("Segundo jogador: "+this.competidor2.getNome());
	}
	
	
	public Competidor getCompetidor1() {
		return this.competidor1;
	}
	public void setCompetidor1(String nome, int mochila) {
		this.competidor1 = new Competidor(nome, mochila);
	}
	public Competidor getCompetidor2() {
		return this.competidor2;
	}
	public void setCompetidor2(String nome, int mochila) {
		this.competidor2 = new Competidor(nome, mochila);
	}
	
	public floresta getFloresta() {
		return this.floresta;
	}
	
	
	
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextBoolean());
		
		Competidor competidor1 = new Competidor("Pedro",10);
		Competidor competidor2 = new Competidor("Fábio",10);
		floresta floresta1 = new floresta(3,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10);
		
		partida partida = new partida(competidor1,competidor2,floresta1);
		
		partida.ExibirInfo();
		
		partida.floresta.exibirFloresta();
		
		partida.rolarDados();
		
		partida.andarFrente();
		
		partida.floresta.exibirFloresta();
		
		partida.andarFrente();
		
		partida.floresta.exibirFloresta();
		
		
		
	}
}
