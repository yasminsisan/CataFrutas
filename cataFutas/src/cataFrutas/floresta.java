package cataFrutas;
import java.util.Random;
public class floresta{
	private int dimensao;
	public posicao[][] matriz;
	private int numeroPedra;
	private int numeroMaracuja;
	private int numeroCoqueiro;
	private int numeroCoco;
	private int numeroAbacateiro;
	private int numeroAbacate;
	private int numeroLaranjeira;
	private int numeroLaranja;
	private int numeroAceroleira;
	private int numeroAcerola;
	private int numeroAmoreira;
	private int numeroAmora;
	private int numeroGoiabeira;
	private int numeroGoiaba;
	private float chanceBicho;
	
	public floresta(int dim, int pedra, int coqueiro, int abacateiro, int laranjeira, int aceroleira, int amoreira, int goiabeira/*, int coco, int abacate, int laranja, int acerola, int amora, int goiaba, int maracuja, float bicho, int mochila*/) {
		//gerando matriz do mapa e colocando as instâncias da classe posicao
		Random random = new Random();
		
		
		
		
		this.dimensao = dim;
		
		this.matriz = new posicao[this.dimensao][this.dimensao];  // cria a matriz que representa o mapa
		
		
		this.numeroPedra = pedra;		
		this.numeroCoqueiro = coqueiro;
		this.numeroAbacateiro = abacateiro;
		this.numeroLaranjeira = laranjeira;
		this.numeroAceroleira = aceroleira;
		this.numeroAmoreira = amoreira;
		this.numeroGoiabeira =goiabeira;
		
		
		
		for(int i = 0; i<this.dimensao; i++) {
			for(int j = 0; j<this.dimensao; j++) {
				this.matriz[i][j] = new posicao(); // nesses dois for, o algoritmo vai passar em cada um dos espaços da matriz 
			}                                      // e vai colocar instâncias da classe posicao neles.
		}
		
		// colocando as pedras no mapa
		for(int i=0;i<this.numeroPedra;i++) {//aqui ele vai varrer a matriz, de maneira aleatória, e vai colocar as pedras nas posições aleatórias. Quantas vezes? o numero de pedras vezes.
			int j = random.nextInt(this.dimensao);
			int k = random.nextInt(this.dimensao);
			while(this.matriz[j][k].temPedra() == true) {
				j = random.nextInt(this.dimensao);
				k = random.nextInt(this.dimensao);
			}						
			this.matriz[j][k].setPedra();									
		}
		
		//colocando as gramas
		for(int i=0;i<this.dimensao;i++) {
			for(int j=0;j<this.dimensao;j++) {
				if(this.matriz[i][j].temPedra()==false) {
					this.matriz[i][j].setGrama();
				}
			}
		}
		
		// colocando os coqueiros 
		for(int i=0;i<this.numeroCoqueiro;i++) {
			int j = random.nextInt(this.dimensao);
			int k = random.nextInt(this.dimensao);
			while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
				j = random.nextInt(this.dimensao);
				k = random.nextInt(this.dimensao);
			}						
			this.matriz[j][k].setArvore(new coqueiro());		
		}
		
		// colocando os abacateiros 
		for(int i=0;i<this.numeroAbacateiro;i++) {
			int j = random.nextInt(this.dimensao);
			int k = random.nextInt(this.dimensao);
			while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
				j = random.nextInt(this.dimensao);
				k = random.nextInt(this.dimensao);
			}						
			this.matriz[j][k].setArvore(new abacateiro());
					
		}
				
				// colocando as Laranjeiras 
		for(int i=0;i<this.numeroLaranjeira;i++) {
			int j = random.nextInt(this.dimensao);
			int k = random.nextInt(this.dimensao);
			while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
				j = random.nextInt(this.dimensao);
				k = random.nextInt(this.dimensao);
			}						
			this.matriz[j][k].setArvore(new laranjeira());
					
		}
				
				// colocando as aceroleiras 
		for(int i=0;i<this.numeroAceroleira;i++) {
			int j = random.nextInt(this.dimensao);
			int k = random.nextInt(this.dimensao);
			while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
				j = random.nextInt(this.dimensao);
				k = random.nextInt(this.dimensao);
			}						
			this.matriz[j][k].setArvore(new aceroleira());
					
		}
				
				// colocando as amoreiras 
		for(int i=0;i<this.numeroAmoreira;i++) {
			int j = random.nextInt(this.dimensao);
			int k = random.nextInt(this.dimensao);
			while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
				j = random.nextInt(this.dimensao);
				k = random.nextInt(this.dimensao);
			}						
			this.matriz[j][k].setArvore(new amoreira());
					
		}
				
				// colocando as goiabeiras 
		for(int i=0;i<this.numeroGoiabeira;i++) {
			int j = random.nextInt(this.dimensao);
			int k = random.nextInt(this.dimensao);
			while(this.matriz[j][k].temPedra() == true||this.matriz[j][k].temArvore()==true) {
				j = random.nextInt(this.dimensao);
				k = random.nextInt(this.dimensao);
			}						
			this.matriz[j][k].setArvore(new goiabeira());
					
		}
		
		
		
	}
	
	public static void main(String[] args) { //o método main aqui é usado para fazer testes no algoritmo da classe floresta.
		floresta floresta = new floresta(7,3,3,3,3,3,3,3);
		
		for(int i=0;i<floresta.dimensao;i++) {
			for(int j=0;j<floresta.dimensao;j++) {
				if(floresta.matriz[i][j].temPedra()==true) {
					System.out.println("PEDRA  i: "+i+" j: "+j);
				} else if(floresta.matriz[i][j].getArvore() instanceof coqueiro) { 
					System.out.println("COQUEIRO  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getArvore() instanceof abacateiro) { 
					System.out.println("ABACATEIRO  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getArvore() instanceof aceroleira) { 
					System.out.println("ACEROLEIRA  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getArvore() instanceof amoreira) { 
					System.out.println("AMOREIRA  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getArvore() instanceof goiabeira) { 
					System.out.println("GOIABEIRA  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getArvore() instanceof laranjeira) { 
					System.out.println("LARANJEIRA  i: "+i+" j: "+j);
				}
			}
		}
		
	}
	
}
