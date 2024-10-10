package Terreno;
//oi


import java.util.Random;

import Arvores.abacateiro;
import Arvores.aceroleira;
import Arvores.amoreira;
import Arvores.coqueiro;
import Arvores.goiabeira;
import Arvores.laranjeira;
import Frutas.*;
import Jogador.*;
public class floresta{
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
	private boolean valido = true;
	public int getNumMaracujaTotal() {
		return this.qMaracujaTotal;
	}
	public int getNumMaracujaChao() {
		return this.qMaracujaChao;
	}
	public boolean eValido() {
		return this.valido;
	}
	public floresta(int dim,int pedra,int maracujaTotal,int maracujaChao,
			int laranjeira,int laranja,int abacateiro,int abacate,
			int coqueiro, int coco,  int aceroleira,int acerola, 
			int amoreira,int amora, int goiabeira, int goiaba,
			float bicho,int mochila) {
		
		try {
			//gerando matriz do mapa e colocando as instâncias da classe posicao
			if(pedra + maracujaChao+laranjeira+laranja+abacateiro+abacate+coqueiro
				+coco+aceroleira+acerola+amoreira+amora+goiabeira+goiaba>((dim*dim)-2)) {
				this.valido = false;
				return;
			} else {
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
				//########POSIÇÕES###########
				for(int i = 0; i<this.dimensao; i++) {
					for(int j = 0; j<this.dimensao; j++) {
						this.matriz[i][j] = new posicao(); 
					}                                      
				}		
				//#########PEDRAS###########
				for(int i=0;i<this.qPedra;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setPedra();									
				}	
				//########GRAMAS#############
				for(int i=0;i<this.dimensao;i++) {
					for(int j=0;j<this.dimensao;j++) {
						if(this.matriz[i][j].temPedra()==false) {
							this.matriz[i][j].setGrama();
						}
					}
				}
				// ###########LARANJEIRAS############  
				for(int i=0;i<this.qLaranjeira;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new laranjeira());				
				}
				// ###########ABACATEIROS############ 
				for(int i=0;i<this.qAbacateiro;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new abacateiro());				
				}
				//###########COQUEIROS############ 
				for(int i=0;i<this.qCoqueiro;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new coqueiro());		
				}			
						//###########ACEROLEIRAS############  
				for(int i=0;i<this.qAceroleira;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new aceroleira());			
				}			
						//###########AMOREIRAS############  
				for(int i=0;i<this.qAmoreira;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new amoreira());		
				}		
						//###########GOIABEIRAS############  
				for(int i=0;i<this.qGoiabeira;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setArvore(new goiabeira());
							
				}
				//###########MARACUJÁS DO CHÃO############
				for(int i=0;i<this.qMaracujaChao;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Maracuja());
							
				}
				//###########LARANJAS############
				for(int i=0;i<this.qLaranja;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Laranja());			
				}
				//###########ABACATES############
				for(int i=0;i<this.qAbacate;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Abacate());			
				}
				//###########COCOS############
				for(int i=0;i<this.qCoco;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Coco());			
				}
				//###########ACEROLAS############
				for(int i=0;i<this.qAcerola;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Acerola());		
				}
				//###########AMORAS############
				for(int i=0;i<this.qAmora;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Amora());		
				}
				//###########GOIABAS############
				for(int i=0;i<this.qGoiaba;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true||this.matriz[j][k].temFruta()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setFruta(new Goiaba());		
				}
				//###########COMPETIDORES############
				for(int i=0;i<2;i++) {
					int j = random.nextInt(this.dimensao);
					int k = random.nextInt(this.dimensao);
					while(this.matriz[j][k].temCompetidor()==true) {
						j = random.nextInt(this.dimensao);
						k = random.nextInt(this.dimensao);
					}						
					this.matriz[j][k].setCompetidor("Nome",mochila);		
				}
			}
		} catch (Exception e){
			System.out.println(e.getMessage());
			this.valido = false;
		}
		
				
	}
}
		
