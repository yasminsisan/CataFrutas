package Interface;

/**
 * Classe que será passada como parâmetro para a criação da floresta
 * Os atributos serão lidos de um arquivo e armazenados na instância de Configuracao
 * @author Felipe Tojal
 * @version 1.0
 */
public class Configuracao {
	
	/**
	 * Atributos necessários para a criação do terreno
	 * @author felipeTojal
	 */
	private int quantMaracujaInicio;
	private int quantAcerola;
	private int quantAmora;
	private int quantCoco;
	private int quantAbacate;
	private int quantLaranja;
	private int quantGoiaba;
	private int quantGoiabeira;
	private int quantLaranjeira;
	private int quantAbacateira;
	private int quantCoqueiro;
	private int quantAmoreira;
	private int quantAceroleira;
	private int quantMaracujaTotal;
	private int dimensaoMatriz;
	private int tamanhoMochila;
	private float chanceBichada;
	private int quantPedras;
	
	/**
	 * Construtor da classe configuração
	 * @author felipeTojal
	 */
	public Configuracao() {
		
	}
	
	/*
	 * 
	 *	Método get e set para quantPedras
	 * 
	 */
	
	/**
	 * Método set para quantPedras
	 * @param quantPedras Quantidade de pedras no tabuleiro
	 * @throws IllegalArgumentException Caso o valor de quantPedras for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantPedras(int quantPedras) {
		if (quantPedras < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantPedras = quantPedras;
	}
	
	/**
	 * Método get para quantPedras
	 * @return quantPedras Quantidade de pedras no tabuleiro
	 * @author felipeTojal
	 */
	public int getQuantPedras() {
		return this.quantPedras;
	}
	
	/*
	 *
	 *  Método set e get para chanceBichada
	 * 
	 */
	
	/**
	 * Método set para chanceBichada
	 * O valor de bichada aqui é transformado em porcentagem
	 * @throws IllegalArgumentException Se o valor de chanceBichada for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setChanceBichada(float chanceBichada) {
		
		if (chanceBichada < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.chanceBichada = chanceBichada/100;
	}
	
	/**
	 * Método que retorna o valor de chanceBichada
	 * @return chanceBichada A chance em porcentagem da fruta vir bichada
	 * @author felipeTojal
	 */
	public float getChanceBichada() {
		return this.chanceBichada;
	}
	
	/*
	 * 
	 *  Método set e get para mochila
	 * 
	 */
	
	/**
	 * Método que define o tamanho da mochila
	 * @param tamanhoMochila Tamanho da mochila
	 * @throws IllegalArgumentException Caso o tamanho da mochila for menor ou igual a 0, lança exceção
	 * @author felipeTojal
	 */
	public void setTamanhoMochila(int tamanhoMochila) {
		if (tamanhoMochila > 0) {
			this.tamanhoMochila = tamanhoMochila;
		} else {
			throw new IllegalArgumentException("O tamanho da mochila deve ser maior que zero");
		}
	}
	
	/**
	 * Método get para tamanhoMochila
	 * @return tamanhoMochila O tamanho da mochila
	 * @author felipeTojal
	 */
	public int getTamanhoMochila() {
		return this.tamanhoMochila;
	}
	
	/*
	 * 
	 * Métodos get e set para as frutas
	 * 
	 */
	
	/**
	 * Método get para quantMaracuja
	 * @return quantMaracuja Quantidade de maracujas no terreno
	 * @author felipeTojal
	 */
	public int getQuantMaracujaInicio() {
		return quantMaracujaInicio;
	}

	/**
	 * Método set para quantMaracuja
	 * @param quantMaracuja Quantidade de maracuja que existirão na floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantMaracujaInicio(int quantMaracujaInicio) {
		if (quantMaracujaInicio < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		} else if(quantMaracujaInicio > this.quantMaracujaTotal) {
			throw new IllegalArgumentException("Erro! O número de Maracujás do chão não pode ser maior que o total de Maracujás da partida");
		}
		
		this.quantMaracujaInicio = quantMaracujaInicio;
	}

	/**
	 * Método get para quantAcerola
	 * @return quantAcerola Quantidade de acerolas no terreno
	 * @author felipeTojal
	 */
	public int getQuantAcerola() {
		return quantAcerola;
	}

	/**
	 * Método set para quantAcerola
	 * @param quantAcerola Quantidade de acerolas que existirão na floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantAcerola(int quantAcerola) {
		if (quantAcerola < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantAcerola = quantAcerola;
	}

	/**
	 * Método get para quantAmora
	 * @return quantAmora Quantidade de amoras no terreno
	 * @author felipeTojal
	 */
	public int getQuantAmora() {
		return quantAmora;
	}

	/**
	 * Método set para quantAmora
	 * @param quantAmora Quantidade de amora que existirão na floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantAmora(int quantAmora) {
		if (quantAmora < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantAmora = quantAmora;
	}

	/**
	 * Método get para quantCoco
	 * @return quantCoco Quantidade de cocos no terreno
	 * @author felipeTojal
	 */
	public int getQuantCoco() {
		return quantCoco;
	}

	/**
	 * Método set para quantCoco
	 * @param quantCoco Quantidade de coco que existirão na floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantCoco(int quantCoco) {
		if (quantCoco < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantCoco = quantCoco;
	}

	/**
	 * Método get para quantAbacate
	 * @return quantAbacate Quantidade de abacates no terreno
	 * @author felipeTojal
	 */
	public int getQuantAbacate() {
		return quantAbacate;
	}

	/**
	 * Método set para quantAbacate
	 * @param quantAbacate Quantidade de abacate que existirão na floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantAbacate(int quantAbacate) {
		if (quantAbacate < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantAbacate = quantAbacate;
	}

	/**
	 * Método get para quantLaranja
	 * @return quantLaranja Quantidade de laranjas no terreno
	 * @author felipeTojal
	 */
	public int getQuantLaranja() {
		return quantLaranja;
	}

	/**
	 * Método set para quantLaranja
	 * @param quantLaranja Quantidade de laranja que existirão na floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantLaranja(int quantLaranja) {
		if (quantLaranja < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantLaranja = quantLaranja;
	}

	/**
	 * Método get para quantGoiaba
	 * @return quantGoiaba Quantidade de goiabas no terreno
	 * @author felipeTojal
	 */
	public int getQuantGoiaba() {
		return quantGoiaba;
	}

	/**
	 * Método set para quantGoiaba
	 * @param quantGoiaba Quantidade de goiaba que existirão na floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantGoiaba(int quantGoiaba) {
		if (quantGoiaba < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantGoiaba = quantGoiaba;
	}

	/*
	 * 
	 * Métodos get e set para as árvores
	 * 
	 */
	
	/**
	 * Método get para quantGoiabeira
	 * @return quantGoiabeira Retorna a quantidade de goiaba na floresta
	 * @author felipeTojal
	 */
	public int getQuantGoiabeira() {
		return quantGoiabeira;
	}

	/**
	 * Método set para quantGoiabeira
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @param quantGoiabeira Quantidade de goiabeiras que existirão na floresta
	 * @author felipeTojal
	 */
	public void setQuantGoiabeira(int quantGoiabeira) {
		if (quantGoiabeira < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantGoiabeira = quantGoiabeira;
	}

	/**
	 * Método get para quantLaranjeira
	 * @return quantLaranjeira Retorna a quantidade de laranjeiras na floresta
	 * @author felipeTojal
	 */
	public int getQuantLaranjeira() {
		return quantLaranjeira;
	}

	/**
	 * Método set para quantLaranjeira
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @param quantLaranjeira Quantidade de laranjeiras que existirão na floresta
	 * @author felipeTojal
	 */
	public void setQuantLaranjeira(int quantLaranjeira) {
		if (quantLaranjeira < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantLaranjeira = quantLaranjeira;
	}

	/**
	 * Método get para quantAbacateira
	 * @return quantAbacateira Retorna a quantidade de abacteiras na floresta
	 * @author felipeTojal
	 */
	public int getQuantAbacateira() {
		return quantAbacateira;
	}

	/**
	 * Método set para quantAbacateira
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @param quantAbacateira Quantidade de abacateiras que existirão na floresta
	 * @author felipeTojal
	 */
	public void setQuantAbacateira(int quantAbacateira) {
		if (quantAbacateira < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantAbacateira = quantAbacateira;
	}

	/**
	 * Método get para quantCoqueiro
	 * @return quantCoqueiro Retorna a quantidade de coqueiros na floresta
	 * @author felipeTojal
	 */
	public int getQuantCoqueiro() {
		return quantCoqueiro;
	}

	/**
	 * Método set para quantCoqueiro
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @param quantCoqueiro Quantidade de coqueiros que existirão na floresta
	 * @author felipeTojal
	 */
	public void setQuantCoqueiro(int quantCoqueiro) {
		if (quantCoqueiro < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantCoqueiro = quantCoqueiro;
	}

	/**
	 * Método get para quantAmoreira
	 * @return quantAmoreira Retorna a quantidade de amoreira na floresta
	 * @author felipeTojal
	 */
	public int getQuantAmoreira() {
		return this.quantAmoreira;
	}

	/**
	 * Método set para quantAmoreira
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @param quantAmoreira Quantidade de amoreiras que existirão na floresta
	 * @author felipeTojal
	 */
	public void setQuantAmoreira(int quantAmoreira) {
		if (quantAmoreira < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantAmoreira = quantAmoreira;
	}

	/**
	 * Método get para quantAceroleira
	 * @return quantAceroleira Retorna a quantidade de aceroleiras na floresta
	 * @author felipeTojal
	 */
	public int getQuantAceroleira() {
		return quantAceroleira;
	}
	
	/**
	 * Método set para quantAceroleira
	 * @param quantAceroleira Quantidade de aceroleiras que existirão na floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantAceroleira(int quantAceroleira) {
		if (quantAceroleira < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantAceroleira = quantAceroleira;
	}

	/**
	 * Método get para quantMaracujazeiro
	 * @return quantMaracujazeiro Retorna a quantidade de maracujazeiros na floresta
	 * @author felipeTojal
	 */
	public int getQuantMaracujaTotal() {
		return quantMaracujaTotal;
	}

	/**
	 * Método set para quantMaracujazeiro
	 * @param quantMaracujazeiro Quantidade de maracujazeiros que existirão na floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 0, lança exceção
	 * @author felipeTojal
	 */
	public void setQuantMaracujaTotal(int quantMaracujaTotal) {
		if (quantMaracujaTotal < 0) {
			throw new IllegalArgumentException("Valor inválido! Insira um valor maior ou igual a zero.");
		}
		
		this.quantMaracujaTotal = quantMaracujaTotal;
	}

	/**
	 * Método get para dimensãoMatriz
	 * @return dimensaoMatriz Retorna o valor da dimensão da matriz quadrada
	 * @author felipeTojal
	 */
	public int getDimensaoMatriz() {
		return dimensaoMatriz;
	}

	/**
	 * Método set para dimensaoMatriz
	 * @param dimensaoMatriz Dimensão da matriz quadrada da floresta
	 * @throws IllegalArgumentException Caso a quantidade inserida for menor que 3, lança exceção
	 * @author felipeTojal
	 */
	public void setDimensaoMatriz(int dimensaoMatriz) {
		if (dimensaoMatriz < 3) {
			throw new IllegalArgumentException("Valor inválido! A dimensão deve ser maior ou igual a 3");
		}
		
		this.dimensaoMatriz = dimensaoMatriz;
	}
	
	
}
