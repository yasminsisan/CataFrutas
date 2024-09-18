package cataFrutas;
	
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
	
	public floresta(int dim, int pedra, int maracuja, int coqueiro, int coco, int abacateiro, int abacate, int laranjeira, int laranja, int aceroleira, int acerola, int amoreira, int amora, int goiabeira, int goiaba, float bicho) {
		this.matriz= new posicao[dim][dim];
		this.matriz[0][0] = new posicao();
	}
	
}
