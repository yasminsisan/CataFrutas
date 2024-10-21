package Terreno;



import java.util.Random;	
import Arvores.abacateiro;
import Arvores.aceroleira;
import Arvores.amoreira;
import Arvores.coqueiro;
import Arvores.goiabeira;
import Arvores.laranjeira;
import Frutas.*;
import Jogador.*;

/**
 * Classe responsável por construir o terreno do Jogo, com todos os seus elementos estáticos e dinâmicos.
 * 
 * @author Pedro Thalles Lima Ricarte
 * @version 1.0
 */

public class floresta{
	//atributos de intância, por meio dos quais o terreno é gerado
	private int dimensao;
	public posicao[][] matriz;
	private int qPedra;
	private int qMaracujaTotal;
	private int qMaracujaChao;
	private int qLaranjeira;
	private int qLaranja;
	private int qAbacateiro;
	private int qAbacate;
	private int qCoqueiro;
	private int qCoco;
	private int qAceroleira;
	private int qAcerola;
	private int qAmoreira;
	private int qAmora;
	private int qGoiabeira;
	private int qGoiaba;
	private int mochila;
	private float bicho;
	
	/**
	 * Método que obtém a quantidade total de Maracujás.
	 * 
	 * @return a quantidade total de Maracujás.
	 */
	public int getNumMaracujaTotal() {
		return this.qMaracujaTotal;
	}
	
	/**
	 * Método que obtém a quantidade de Maracujás que estão no chão no início da partida.
	 * @return Quantidade de Maracujás do chão
	 */
	public int getNumMaracujaChao() {
		return this.qMaracujaChao;
	}
	
	public int getDimensao() {
		return this.dimensao;
	}
	
	public void exibirFloresta() {
		for(int i=0;i<this.dimensao;i++) {
			for(int j=0;j<this.dimensao;j++) {
				if(this.matriz[i][j].temPedra()==true) {
					System.out.println("PEDRA  i: "+i+" j: "+j);
				} else if(this.matriz[i][j].getArvore() instanceof coqueiro) { 
					System.out.println("COQUEIRO  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getArvore() instanceof abacateiro) { 
					System.out.println("ABACATEIRO  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getArvore() instanceof aceroleira) { 
					System.out.println("ACEROLEIRA  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getArvore() instanceof amoreira) { 
					System.out.println("AMOREIRA  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getArvore() instanceof goiabeira) { 
					System.out.println("GOIABEIRA  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getArvore() instanceof laranjeira) { 
					System.out.println("LARANJEIRA  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getFruta() instanceof Coco) { 
					System.out.println("COCO  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getFruta() instanceof Abacate) { 
					System.out.println("ABACATE  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getFruta() instanceof Acerola) { 
					System.out.println("ACEROLA  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getFruta() instanceof Amora) { 
					System.out.println("AMORA  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getFruta() instanceof Goiaba) { 
					System.out.println("GOIABA  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getFruta() instanceof Laranja) { 
					System.out.println("LARANJA  i: "+i+" j: "+j);
				}else if(this.matriz[i][j].getFruta() instanceof Maracuja) { 
					System.out.println("MARACUJA  i: "+i+" j: "+j);
				} else if(this.matriz[i][j].temCompetidor()) {
					System.out.println("JOGADOR i: "+i+" j: "+j);
					System.out.println("Nome do jogador: "+this.matriz[i][j].getCompetidor().getNome());
				
				}
        
			}
		}
	}
	
	/**
	 * Construtor para objetos da classe floresta
	 * @param dim Dimensão do terreno
	 * @param pedra Número de pedras do terreno
	 * @param maracujaTotal Número total de Maracujás
	 * @param maracujaChao Número de Maracujás do início
	 * @param laranjeira Número de Laranjeiras
	 * @param laranja Número de Laranjas
	 * @param abacateiro Número de Abacateiros
	 * @param abacate Número de Abacates
	 * @param coqueiro Número de Coqueiros
	 * @param coco Número de Cocos
	 * @param aceroleira Número de Aceroleiras
	 * @param acerola Número de Acerolas
	 * @param amoreira Número de Amoreiras
	 * @param amora Número de Amoras
	 * @param goiabeira Número de Goiabeiras
	 * @param goiaba Número de Goiabas
	 * @param bicho Probabilidade de as frutas estarem bichadas
	 * @param mochila Capacidade da mochila dos competidores
	 * @throws IllegalArgumentException, se há muitos elementos para o tamanho do terreno
	 */
	public floresta(int dim,int pedra,int maracujaTotal,int maracujaChao,
			int laranjeira,int laranja,int abacateiro,int abacate,
			int coqueiro, int coco,  int aceroleira,int acerola, 
			int amoreira,int amora, int goiabeira, int goiaba,
			float bicho,int mochila) {
		
		
			// Se há muitos elementos para o tamanho do terreno, lança uma excessão de Argumento Ilegal (IllegalArgumentException)
			if(pedra + maracujaChao+laranjeira+laranja+abacateiro+abacate+coqueiro
				+coco+aceroleira+acerola+amoreira+amora+goiabeira+goiaba>((dim*dim)-2)) {
				throw new IllegalArgumentException("Erro! O terreno é pequeno demais para a quantidade de elementos");
			} else {
				//inicializam-se as variáveis da instância
				Random random = new Random();
				this.dimensao = dim;
				this.matriz = new posicao[this.dimensao][this.dimensao];  // cria a matriz que representa o mapa
				this.qPedra = pedra;
				this.qMaracujaTotal = maracujaTotal;
				this.qMaracujaChao = maracujaChao;
				this.qLaranjeira = laranjeira;
				this.qLaranja = laranja;
				this.qAbacateiro = abacateiro;
				this.qAbacate = abacate;
				this.qCoqueiro = coqueiro;
				this.qCoco = coco;
				this.qAceroleira = aceroleira;
				this.qAcerola = acerola;
				this.qAmoreira = amoreira;
				this.qAmora = amora;
				this.qGoiabeira =goiabeira;
				this.qGoiaba = goiaba;
				this.mochila = mochila;
				this.bicho = bicho/100;
				
				
				
				 //Coloca instâncias da classe posiçao nas posições da matriz que representa o terreno
				 
				for(int i = 0; i<this.dimensao; i++) {
					for(int j = 0; j<this.dimensao; j++) {
						this.matriz[i][j] = new posicao(); 
					}                                      
				}		
				//Coloca, de maneira aleatória, instâncias da classe pedra nas posições da matriz que representa o terreno
				for(int i=0;i<this.qPedra;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setPedra();									
				}	
				//Coloca, de maneira aleatória, instâncias da classe grama nas posições da matriz que representa o terreno
				for(int i=0;i<this.dimensao;i++) {
					for(int j=0;j<this.dimensao;j++) {
						if(this.matriz[i][j].temPedra()==false) {
							this.matriz[i][j].setGrama();
						}
					}
				}
				//Coloca, de maneira aleatória, instâncias da classe laranjeira nas posições da matriz que representa o terreno
				for(int i=0;i<this.qLaranjeira;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new laranjeira());				
				}
				//Coloca, de maneira aleatória, instâncias da classe abacateiro nas posições da matriz que representa o terreno 
				for(int i=0;i<this.qAbacateiro;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new abacateiro());				
				}
				//Coloca, de maneira aleatória, instâncias da classe coqueiro nas posições da matriz que representa o terreno
				for(int i=0;i<this.qCoqueiro;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new coqueiro());		
				}			
				//Coloca, de maneira aleatória, instâncias da classe aceroleira nas posições da matriz que representa o terreno 
				for(int i=0;i<this.qAceroleira;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new aceroleira());			
				}			
				//Coloca, de maneira aleatória, instâncias da classe amoreira nas posições da matriz que representa o terreno  
				for(int i=0;i<this.qAmoreira;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new amoreira());		
				}		
				//Coloca, de maneira aleatória, instâncias da classe goiabeira nas posições da matriz que representa o terreno  
				for(int i=0;i<this.qGoiabeira;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new goiabeira());
							
				}
				//Coloca, de maneira aleatória, instâncias da classe Maracuja nas posições da matriz que representa o terreno
				for(int i=0;i<this.qMaracujaChao;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Maracuja());
							
				}
				//Coloca, de maneira aleatória, instâncias da classe Laranja nas posições da matriz que representa o terreno
				for(int i=0;i<this.qLaranja;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Laranja());			
				}
				//Coloca, de maneira aleatória, instâncias da classe Abacate nas posições da matriz que representa o terreno
				for(int i=0;i<this.qAbacate;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Abacate());			
				}
				//Coloca, de maneira aleatória, instâncias da classe Coco nas posições da matriz que representa o terreno
				for(int i=0;i<this.qCoco;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Coco());			
				}
				//Coloca, de maneira aleatória, instâncias da classe Acerola nas posições da matriz que representa o terreno
				for(int i=0;i<this.qAcerola;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Acerola());		
				}
				//Coloca, de maneira aleatória, instâncias da classe Amora nas posições da matriz que representa o terreno
				for(int i=0;i<this.qAmora;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Amora());		
				}
				//Coloca, de maneira aleatória, instâncias da classe Goiaba nas posições da matriz que representa o terreno
				for(int i=0;i<this.qGoiaba;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Goiaba());		
				}
				
				
			}
		 
		
				
	}
}
		
