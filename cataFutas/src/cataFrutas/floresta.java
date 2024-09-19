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
	private int numeroLaranjeita;
	private int numeroLaranja;
	private int numeroAceroleira;
	private int numeroAcerola;
	private int numeroAmoreira;
	private int numeroAmora;
	private int numeroGoiabeira;
	private int numeroGoiaba;
	private float chanceBicho;
	
	public floresta(int dim, int pedra/*, int maracuja, int coqueiro, int coco, int abacateiro, int abacate, int laranjeira, int laranja, int aceroleira, int acerola, int amoreira, int amora, int goiabeira, int goiaba, float bicho*/) {
		//gerando matriz do mapa e colocando as instâncias da classe posicao
		this.dimensao = dim;
		this.numeroPedra = pedra;
		Random random = new Random();
		this.matriz = new posicao[this.dimensao][this.dimensao];  // cria a matriz que representa o mapa
		for(int i = 0; i<this.dimensao; i++) {
			for(int j = 0; j<this.dimensao; j++) {
				this.matriz[i][j] = new posicao(); // nesses dois for, o algoritmo vai passar em cada um dos espaços da matriz 
			}                                      // e vai colocar instâncias da classe posicao neles.
		}
		
		// colocando as pedras no mapa
		for(int i=0;i<this.numeroPedra;i++) {//aqui ele vai varrer a matriz, de maneira aleatória, e vai colocar as pedras nas posições aleatórias. Quantas vezes? o numero de pedras vezes.
			int j = random.nextInt(this.dimensao);
			int k = random.nextInt(this.dimensao);
			int l = random.nextInt(this.dimensao);
			int m = random.nextInt(this.dimensao);//aqui foram criados 4 valores inteiros aleatórios que não ultrapassam a dimensão da matriz. Foram 4 valores por precaução  
			if(this.matriz[j][k].getPedra()== false) { // aqui ele testa se a posição aleatória já tem uma pedra. Se não tem, ele coloca uma pedra
				this.matriz[j][k].setPedra();
			} else if(this.matriz[l][m].getPedra()==false) { // mas e se ele encontra, aleatoriamente uma posição que já possui um pedra? ele vai para outra posição aleatória. Por isso quatro valores aleatórios
				this.matriz[l][m].setPedra();
			}
			
		}
		
	}
	
	public static void main(String[] args) { //o método main aqui é usado para fazer testes no algoritmo da classe floresta.
		floresta floresta = new floresta(3,2);
		
		for(int i=0;i<floresta.dimensao;i++) {
			for(int j=0;j<floresta.dimensao;j++) {
				if(floresta.matriz[i][j].getPedra()==true) {
					System.out.println("i: "+i+" j: "+j);
				}
			}
		}
		
	}
	
}
