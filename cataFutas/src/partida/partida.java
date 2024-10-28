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
			if(linha!=0) {
				if(this.floresta.matriz[linha-1][coluna].temPedra()) {
					if(this.competidor1.getPontosMovimento()>=2) {
						if(this.floresta.matriz[linha-1][coluna].temCompetidor()) {
							System.out.println(this.competidor1.getNome()+" Empurrou um jogador para a frente");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha-1][coluna].setCompetidor(this.competidor1);
							System.out.println(this.competidor1.getNome()+" Se movimentou para frente");						
						}
						this.competidor1.setPontosMovimento(this.competidor1.getPontosMovimento()-2);
						if(this.competidor1.getPontosMovimento()==0) {
							this.rodada++;
							this.rolarDados();
						}
					} else {
						System.out.println(this.competidor1.getNome()+" Não tem pontos de jogo suficientes");
					}
				} else {
					if(this.competidor1.getPontosMovimento()>=1) {
						if(this.floresta.matriz[linha-1][coluna].temCompetidor()) {
							System.out.println(this.competidor1.getNome()+" Empurrou um jogador para a frente");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha-1][coluna].setCompetidor(this.competidor1);
							System.out.println(this.competidor1.getNome()+" Se movimentou para frente");						
						}
						this.competidor1.setPontosMovimento(this.competidor1.getPontosMovimento()-1);
						if(this.competidor1.getPontosMovimento()==0) {
						this.rodada++;
						this.rolarDados();
						}
					}
				}
					
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
			if(linha!=0) {
				if(this.floresta.matriz[linha-1][coluna].temPedra()) {
					if(this.competidor2.getPontosMovimento()>=2) {
						if(this.floresta.matriz[linha-1][coluna].temCompetidor()) {
							System.out.println(this.competidor2.getNome()+" Empurrou um jogador para a frente");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha-1][coluna].setCompetidor(this.competidor2);
							System.out.println(this.competidor2.getNome()+" Se movimentou para frente");						
						}
						this.competidor2.setPontosMovimento(this.competidor2.getPontosMovimento()-2);
						if(this.competidor2.getPontosMovimento()==0) {
							this.rodada++;
							this.rolarDados();
						}
					} else {
						System.out.println(this.competidor2.getNome()+" Não tem pontos de jogo suficientes");
					}
				} else {
					if(this.competidor2.getPontosMovimento()>=1) {
						if(this.floresta.matriz[linha-1][coluna].temCompetidor()) {
							System.out.println(this.competidor2.getNome()+" Empurrou um jogador para a frente");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha-1][coluna].setCompetidor(this.competidor2);
							System.out.println(this.competidor2.getNome()+" Se movimentou para frente");						
						}
						this.competidor2.setPontosMovimento(this.competidor2.getPontosMovimento()-1);
						if(this.competidor2.getPontosMovimento()==0) {
						this.rodada++; 
						this.rolarDados();
						}
					}
				}
					
			}else {
				System.out.println(this.competidor2.getNome()+" Tentou se movimentar para frente, mas atingiu a borda do terreno");
			}
		}
	}
	public void andarTras() {
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
			if(linha!= this.floresta.getDimensao()-1) {
				if(this.floresta.matriz[linha+1][coluna].temPedra()) {
					if(this.competidor1.getPontosMovimento()>=2) {
						if(this.floresta.matriz[linha+1][coluna].temCompetidor()) {
							System.out.println(this.competidor1.getNome()+" Empurrou um jogador para trás");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha+1][coluna].setCompetidor(this.competidor1);
							System.out.println(this.competidor1.getNome()+" Se movimentou para trás");						
						}
						this.competidor1.setPontosMovimento(this.competidor1.getPontosMovimento()-2);
						if(this.competidor1.getPontosMovimento()==0) {
							this.rodada++;
							this.rolarDados(); 
						} 
					} else {
						System.out.println(this.competidor1.getNome()+" Não tem pontos de jogo suficientes");
					}
				} else {
					if(this.competidor1.getPontosMovimento()>=1) {
						if(this.floresta.matriz[linha+1][coluna].temCompetidor()) {
							System.out.println(this.competidor1.getNome()+" Empurrou um jogador para trás");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha+1][coluna].setCompetidor(this.competidor1);
							System.out.println(this.competidor1.getNome()+" Se movimentou para trás");						
						}
						this.competidor1.setPontosMovimento(this.competidor1.getPontosMovimento()-1);
						if(this.competidor1.getPontosMovimento()==0) {
						this.rodada++; 
						this.rolarDados(); 
						}
					}
				}
					
			}else {
				System.out.println(this.competidor1.getNome()+" Tentou se movimentar para trás, mas atingiu a borda do terreno");
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
			if(linha!= this.floresta.getDimensao()-1) {
				if(this.floresta.matriz[linha+1][coluna].temPedra()) {
					if(this.competidor2.getPontosMovimento()>=2) {
						if(this.floresta.matriz[linha+1][coluna].temCompetidor()) {
							System.out.println(this.competidor2.getNome()+" Empurrou um jogador para trás");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha+1][coluna].setCompetidor(this.competidor2);
							System.out.println(this.competidor2.getNome()+" Se movimentou para trás");						
						}
						this.competidor2.setPontosMovimento(this.competidor2.getPontosMovimento()-2);
						if(this.competidor2.getPontosMovimento()==0) {
							this.rodada++; 
							this.rolarDados();
						}
					} else {
						System.out.println(this.competidor2.getNome()+" Não tem pontos de jogo suficientes");
					}
				} else {
					if(this.competidor2.getPontosMovimento()>=1) {
						if(this.floresta.matriz[linha+1][coluna].temCompetidor()) {
							System.out.println(this.competidor2.getNome()+" Empurrou um jogador para trás");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha+1][coluna].setCompetidor(this.competidor2);
							System.out.println(this.competidor2.getNome()+" Se movimentou para trás");						
						}
						this.competidor2.setPontosMovimento(this.competidor2.getPontosMovimento()-1);
						if(this.competidor2.getPontosMovimento()==0) {
						this.rodada++;
						this.rolarDados(); 
						}
					}
				}
					
			}else {
				System.out.println(this.competidor2.getNome()+" Tentou se movimentar para trás, mas atingiu a borda do terreno");
			}
			
		}
		
	}
	public void andarEsquerda() {
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
			if(coluna!=0) {
				if(this.floresta.matriz[linha][coluna-1].temPedra()) {
					if(this.competidor1.getPontosMovimento()>=2) {
						if(this.floresta.matriz[linha][coluna-1].temCompetidor()) {
							System.out.println(this.competidor1.getNome()+" Empurrou um jogador para a esquerda");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha][coluna-1].setCompetidor(this.competidor1);
							System.out.println(this.competidor1.getNome()+" Se movimentou para a esquerda");						
						}
						this.competidor1.setPontosMovimento(this.competidor1.getPontosMovimento()-2);
						if(this.competidor1.getPontosMovimento()==0) {
							this.rodada++; 
							this.rolarDados();
						}
					} else {
						System.out.println(this.competidor1.getNome()+" Não tem pontos de jogo suficientes");
					}
				} else {
					if(this.competidor1.getPontosMovimento()>=1) {
						if(this.floresta.matriz[linha][coluna-1].temCompetidor()) {
							System.out.println(this.competidor1.getNome()+" Empurrou um jogador para a esquerda");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha][coluna-1].setCompetidor(this.competidor1);
							System.out.println(this.competidor1.getNome()+" Se movimentou para a esquerda");						
						}
						this.competidor1.setPontosMovimento(this.competidor1.getPontosMovimento()-1);
						if(this.competidor1.getPontosMovimento()==0) {
						this.rodada++; 
						this.rolarDados();
						}
					}
				}
					
			}else {
				System.out.println(this.competidor1.getNome()+" Tentou se movimentar para a esquerda, mas atingiu a borda do terreno");
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
			if(coluna!=0) {
				if(this.floresta.matriz[linha][coluna-1].temPedra()) {
					if(this.competidor2.getPontosMovimento()>=2) {
						if(this.floresta.matriz[linha][coluna-1].temCompetidor()) {
							System.out.println(this.competidor2.getNome()+" Empurrou um jogador para a esquerda");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha][coluna-1].setCompetidor(this.competidor2);
							System.out.println(this.competidor2.getNome()+" Se movimentou para a esquerda");						
						}
						this.competidor2.setPontosMovimento(this.competidor2.getPontosMovimento()-2);
						if(this.competidor2.getPontosMovimento()==0) {
							this.rodada++; 
							this.rolarDados();
						}
					} else {
						System.out.println(this.competidor2.getNome()+" Não tem pontos de jogo suficientes");
					}
				} else {
					if(this.competidor2.getPontosMovimento()>=1) {
						if(this.floresta.matriz[linha][coluna-1].temCompetidor()) {
							System.out.println(this.competidor2.getNome()+" Empurrou um jogador para a esquerda");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha][coluna-1].setCompetidor(this.competidor2);
							System.out.println(this.competidor2.getNome()+" Se movimentou para a esquerda");						
						}
						this.competidor2.setPontosMovimento(this.competidor2.getPontosMovimento()-1);
						if(this.competidor2.getPontosMovimento()==0) {
						this.rodada++; 
						this.rolarDados();
						}
					}
				}
					
			}else {
				System.out.println(this.competidor2.getNome()+" Tentou se movimentar para a esquerda, mas atingiu a borda do terreno");
			}
			
		}
		
	}
	public void andarDireita() {
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
			if(coluna!= this.floresta.getDimensao()-1) {
				if(this.floresta.matriz[linha][coluna+1].temPedra()) {
					if(this.competidor1.getPontosMovimento()>=2) {
						if(this.floresta.matriz[linha][coluna+1].temCompetidor()) {
							System.out.println(this.competidor1.getNome()+" Empurrou um jogador para a direita");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha][coluna+1].setCompetidor(this.competidor1);
							System.out.println(this.competidor1.getNome()+" Se movimentou para a direita");						
						}
						this.competidor1.setPontosMovimento(this.competidor1.getPontosMovimento()-2);
						if(this.competidor1.getPontosMovimento()==0) {
							this.rodada++; 
							this.rolarDados();
						}
					} else {
						System.out.println(this.competidor1.getNome()+" Não tem pontos de jogo suficientes");
					}
				} else {
					if(this.competidor1.getPontosMovimento()>=1) {
						if(this.floresta.matriz[linha][coluna+1].temCompetidor()) {
							System.out.println(this.competidor1.getNome()+" Empurrou um jogador para a direita");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha][coluna+1].setCompetidor(this.competidor1);
							System.out.println(this.competidor1.getNome()+" Se movimentou para a direita");						
						}
						this.competidor1.setPontosMovimento(this.competidor1.getPontosMovimento()-1);
						if(this.competidor1.getPontosMovimento()==0) {
						this.rodada++; 
						this.rolarDados();
						}
					}
				}
					
			}else {
				System.out.println(this.competidor1.getNome()+" Tentou se movimentar para a direita, mas atingiu a borda do terreno");
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
			if(coluna!= this.floresta.getDimensao()-1) {
				if(this.floresta.matriz[linha][coluna+1].temPedra()) {
					if(this.competidor2.getPontosMovimento()>=2) {
						if(this.floresta.matriz[linha][coluna+1].temCompetidor()) {
							System.out.println(this.competidor2.getNome()+" Empurrou um jogador para a direita");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha][coluna+1].setCompetidor(this.competidor2);
							System.out.println(this.competidor2.getNome()+" Se movimentou para a direita");						
						}
						this.competidor2.setPontosMovimento(this.competidor2.getPontosMovimento()-2);
						if(this.competidor2.getPontosMovimento()==0) {
							this.rodada++; 
							this.rolarDados();
						}
					} else {
						System.out.println(this.competidor2.getNome()+" Não tem pontos de jogo suficientes");
					}
				} else {
					if(this.competidor2.getPontosMovimento()>=1) {
						if(this.floresta.matriz[linha][coluna+1].temCompetidor()) {
							System.out.println(this.competidor2.getNome()+" Empurrou um jogador para a direita");
						} else {
							this.floresta.matriz[linha][coluna].removerCompetidor();
							this.floresta.matriz[linha][coluna+1].setCompetidor(this.competidor2);
							System.out.println(this.competidor2.getNome()+" Se movimentou para a direita");						
						}
						this.competidor2.setPontosMovimento(this.competidor2.getPontosMovimento()-1);
						if(this.competidor2.getPontosMovimento()==0) {
						this.rodada++; 
						this.rolarDados();
						}
					}
				}
					
			}else {
				System.out.println(this.competidor2.getNome()+" Tentou se movimentar para a direita, mas atingiu a borda do terreno");
			}
			
		}
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
		floresta floresta1 = new floresta(6,0,3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,10);
		
		partida partida = new partida(competidor1,competidor2,floresta1);
		
		partida.ExibirInfo();
		
		
		
		partida.rolarDados();
		
		partida.floresta.exibirFloresta();
		
		partida.andarFrente();
		
		partida.floresta.exibirFloresta();
		
		partida.andarEsquerda();
		
		partida.floresta.exibirFloresta();
		
		partida.andarTras();
		
		partida.floresta.exibirFloresta();
		
		partida.andarDireita();
		
		partida.floresta.exibirFloresta();
		
		partida.andarFrente();
		
		partida.floresta.exibirFloresta();
		
		partida.andarEsquerda();
		
		partida.floresta.exibirFloresta();
		
		partida.andarTras();
		
		partida.floresta.exibirFloresta();
		
		partida.andarDireita();
		
		partida.floresta.exibirFloresta();
		
		partida.andarDireita();
		
		partida.floresta.exibirFloresta();
		
		partida.andarFrente();
		
		partida.floresta.exibirFloresta();
		
		partida.andarEsquerda();
		
		partida.floresta.exibirFloresta();
		
		partida.andarTras();
		
		partida.floresta.exibirFloresta();
		
		partida.andarDireita();
		
		partida.floresta.exibirFloresta();
		
		
		
	}
}
