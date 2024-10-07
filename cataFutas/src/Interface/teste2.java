package Interface;
import cataFrutas.*;

import Frutas.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class teste2 {

    // Função para criar a interface gráfica com a matriz
	public static void criarJanelaComMatriz(Configuracao config) {
		/**
	    	 * Obtendo as informações do objeto configuracao
	    	 */
	    	int tamanho = config.getDimensaoMatriz();
	        int pedra = config.getQuantPedras();
	        int maracujaTotal = config.getQuantMaracujaTotal();
	        int maracujaChao = config.getQuantMaracujaInicio();
	        int laranjeira = config.getQuantLaranjeira();
	        int laranja = config.getQuantLaranja();
	        int abacateiro = config.getQuantAbacateira();
	        int abacate = config.getQuantAbacate();
	        int coqueiro = config.getQuantCoqueiro();
	        int coco = config.getQuantCoco();
	        int aceroleira = config.getQuantAceroleira();
	        int acerola = config.getQuantAcerola();
	        int amoreira = config.getQuantAmoreira();
	        int amora = config.getQuantAmora();
	        int goiabeira = config.getQuantGoiabeira();
	        int goiaba = config.getQuantGoiaba();
	        float bicho = config.getChanceBichada();
	        int mochila = config.getTamanhoMochila();
	        
	        
        JFrame frame = new JFrame("Tabuleiro " + tamanho + "x" + tamanho);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);  // Define o tamanho fixo da janela
        frame.setResizable(false);  // Impede que o usuário redimensione a janela
        frame.setLayout(null);  // Desativa o layout padrão para controlar a posição manualmente
        
        // Painel reservado para o tabuleiro, com tamanho fixo
        JPanel tabuleiroPanel = new JPanel();
        tabuleiroPanel.setBounds(100, 50, 600, 600);  // Define o espaço reservado para o tabuleiro
        tabuleiroPanel.setLayout(new GridLayout(tamanho, tamanho));  // Define layout em grade
        
        int botaoLargura = tabuleiroPanel.getWidth() / tamanho;
        int botaoAltura = tabuleiroPanel.getHeight() / tamanho;
        
        //################### IMAGEM DA GRAMA ###########################
       
        
        String caminhoImagemGrama = "/Interface/grama.jpg";
        ImageIcon imagemIconGrama = new ImageIcon(teste2.class.getResource(caminhoImagemGrama));
        Image imagemGrama = imagemIconGrama.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaGrama = new ImageIcon(imagemGrama);
        
        
        
        
        //######################## IMAGEM DA PEDRA ###################3
        String caminhoImagemPedra = "/Interface/pedra.jpg";
        ImageIcon imagemIconPedra = new ImageIcon(teste2.class.getResource(caminhoImagemPedra));
        Image imagemPedra = imagemIconPedra.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaPedra = new ImageIcon(imagemPedra);
        
        
        
        
        //######################## IMAGEM DA LARANJEIRA ###################3
        String caminhoImagemLaranjeira = "/Interface/Laranjeira.jpg";
        ImageIcon imagemIconLaranjeira = new ImageIcon(teste2.class.getResource(caminhoImagemLaranjeira));
        Image imagemLaranjeira = imagemIconLaranjeira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaLaranjeira = new ImageIcon(imagemLaranjeira);

        
        
        
        //######################## IMAGEM DA ABACATEIRO ###################3
        String caminhoImagemAbacateiro = "/Interface/Abacateiro.jpg";
        ImageIcon imagemIconAbacateiro = new ImageIcon(teste2.class.getResource(caminhoImagemAbacateiro));
        Image imagemAbacateiro = imagemIconAbacateiro.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAbacateiro = new ImageIcon(imagemAbacateiro);

        
        
        
        //######################## IMAGEM DA Coqueiro ###################3
        String caminhoImagemCoqueiro = "/Interface/Coqueiro.jpg";
        ImageIcon imagemIconCoqueiro = new ImageIcon(teste2.class.getResource(caminhoImagemCoqueiro));     
        Image imagemCoqueiro = imagemIconCoqueiro.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaCoqueiro = new ImageIcon(imagemCoqueiro);

        
        
        
        //######################## IMAGEM DA Aceroleira ###################3
        String caminhoImagemAceroleira = "/Interface/Aceroleira.jpg";
        ImageIcon imagemIconAceroleira = new ImageIcon(teste2.class.getResource(caminhoImagemAceroleira));               
        Image imagemAceroleira = imagemIconAceroleira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAceroleira = new ImageIcon(imagemAceroleira);

        
        
        
        //######################## IMAGEM DA Amoreira ###################3
        String caminhoImagemAmoreira = "/Interface/Amoreira.jpg";
        ImageIcon imagemIconAmoreira = new ImageIcon(teste2.class.getResource(caminhoImagemAmoreira));                
        Image imagemAmoreira = imagemIconAmoreira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAmoreira = new ImageIcon(imagemAmoreira);

        
        
        
        //######################## IMAGEM DA Goiabeira ###################3
        String caminhoImagemGoiabeira = "/Interface/Goiabeira.jpg";
        ImageIcon imagemIconGoiabeira = new ImageIcon(teste2.class.getResource(caminhoImagemGoiabeira));        
        Image imagemGoiabeira = imagemIconGoiabeira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaGoiabeira = new ImageIcon(imagemGoiabeira);
        
        
        //###############  MARACUJA #########################
        
        String caminhoImagemMaracuja = "/Interface/maracuja.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconMaracuja = new ImageIcon(teste2.class.getResource(caminhoImagemMaracuja));            
        Image imagemMaracuja = imagemIconMaracuja.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaMaracuja = new ImageIcon(imagemMaracuja);
        
        //###############  LARANJA #########################
        
        String caminhoImagemLaranja = "/Interface/Laranja.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconLaranja = new ImageIcon(teste2.class.getResource(caminhoImagemLaranja));            
        Image imagemLaranja = imagemIconLaranja.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaLaranja = new ImageIcon(imagemLaranja);
        
        
        //###############  ABACATE #########################
        
        String caminhoImagemAbacate = "/Interface/Abacate.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconAbacate = new ImageIcon(teste2.class.getResource(caminhoImagemAbacate));            
        Image imagemAbacate = imagemIconAbacate.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAbacate = new ImageIcon(imagemAbacate);
        
        
        //###############  COCO #########################
        
        String caminhoImagemCoco = "/Interface/Coco.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconCoco = new ImageIcon(teste2.class.getResource(caminhoImagemCoco));            
        Image imagemCoco = imagemIconCoco.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaCoco = new ImageIcon(imagemCoco);
        
        
        //###############  ACEROLA #########################
        
        String caminhoImagemAcerola = "/Interface/Acerola.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconAcerola = new ImageIcon(teste2.class.getResource(caminhoImagemAcerola));            
        Image imagemAcerola = imagemIconAcerola.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAcerola = new ImageIcon(imagemAcerola);
        
        
        //###############  AMORA #########################
        
        String caminhoImagemAmora = "/Interface/Amora.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconAmora = new ImageIcon(teste2.class.getResource(caminhoImagemAmora));            
        Image imagemAmora = imagemIconAmora.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAmora = new ImageIcon(imagemAmora);
        
        
        //###############  GOIABA #########################
        
        String caminhoImagemGoiaba = "/Interface/Goiaba.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconGoiaba = new ImageIcon(teste2.class.getResource(caminhoImagemGoiaba));            
        Image imagemGoiaba = imagemIconGoiaba.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaGoiaba = new ImageIcon(imagemGoiaba);
        
        
       
                    
                    
        floresta floresta = new floresta(tamanho,pedra, maracujaTotal, maracujaChao,
    			laranjeira, laranja, abacateiro, abacate,
    			coqueiro, coco, aceroleira, acerola, 
    			 amoreira, amora,  goiabeira, goiaba,
    			 bicho,mochila);
        
        if(!floresta.eValido()) {
        	JOptionPane.showMessageDialog(frame, "Entradas Inválidas");
        	return;
        } else {
        	// Criar uma matriz de botões
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                JButton botao = new JButton();  // Cria um novo botão
                
                if(floresta.matriz[i][j].temPedra()) {
                	botao.setIcon(imagemRedimensionadaPedra);
                } else if(floresta.matriz[i][j].getArvore()instanceof laranjeira) {
                	botao.setIcon(imagemRedimensionadaLaranjeira);
                } else if(floresta.matriz[i][j].getArvore()instanceof abacateiro) {
                	botao.setIcon(imagemRedimensionadaAbacateiro);
                } else if(floresta.matriz[i][j].getArvore()instanceof coqueiro) {
                	botao.setIcon(imagemRedimensionadaCoqueiro);
                } else if(floresta.matriz[i][j].getArvore()instanceof aceroleira) {
                	botao.setIcon(imagemRedimensionadaAceroleira);
                } else if(floresta.matriz[i][j].getArvore()instanceof amoreira) {
                	botao.setIcon(imagemRedimensionadaAmoreira);
                } else if(floresta.matriz[i][j].getArvore()instanceof goiabeira) {
                	botao.setIcon(imagemRedimensionadaGoiabeira);
                } else {
                	 botao.setIcon(imagemRedimensionadaGrama);  // Define a imagem do botão
                }
                
                if(floresta.matriz[i][j].getFruta()instanceof Maracuja) {                                                        
                	botao.setIcon(imagemRedimensionadaMaracuja);
                } else if(floresta.matriz[i][j].getFruta()instanceof Laranja) {                                                        
                	botao.setIcon(imagemRedimensionadaLaranja);
                } else if(floresta.matriz[i][j].getFruta()instanceof Abacate) {                                                        
                	botao.setIcon(imagemRedimensionadaAbacate);
                } else if(floresta.matriz[i][j].getFruta()instanceof Coco) {                                                        
                	botao.setIcon(imagemRedimensionadaCoco);
                } else if(floresta.matriz[i][j].getFruta()instanceof Acerola) {                                                        
                	botao.setIcon(imagemRedimensionadaAcerola);
                } else if(floresta.matriz[i][j].getFruta()instanceof Amora) {                                                        
                	botao.setIcon(imagemRedimensionadaAmora);
                } else if(floresta.matriz[i][j].getFruta()instanceof Goiaba) {                                                        
                	botao.setIcon(imagemRedimensionadaGoiaba);
                } 
               
                botao.setPreferredSize(new Dimension(botaoLargura, botaoAltura));  // Define o tamanho do botão
                botao.setText("");  // Limpa o texto do botão (opcional)

                // Adiciona um ActionListener para o botão
                int linha = i; 
                int coluna = j; 
                botao.addActionListener(e -> {
                    JOptionPane.showMessageDialog(frame, "Você clicou na posição: (" + linha + ", " + coluna + ")");
                });

                tabuleiroPanel.add(botao);  // Adiciona o botão ao painel do tabuleiro
            }
        }

        frame.add(tabuleiroPanel);  // Adiciona o painel do tabuleiro à janela
        frame.setLocationRelativeTo(null);  // Centraliza a janela na tela
        frame.setVisible(true);  // Torna a janela visível
        
        for(int i=0;i<tamanho;i++) {
			for(int j=0;j<tamanho;j++) {
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
				}else if(floresta.matriz[i][j].getFruta() instanceof Coco) { 
					System.out.println("COCO  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getFruta() instanceof Abacate) { 
					System.out.println("ABACATE  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getFruta() instanceof Acerola) { 
					System.out.println("ACEROLA  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getFruta() instanceof Amora) { 
					System.out.println("AMORA  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getFruta() instanceof Goiaba) { 
					System.out.println("GOIABA  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getFruta() instanceof Laranja) { 
					System.out.println("LARANJA  i: "+i+" j: "+j);
				}else if(floresta.matriz[i][j].getFruta() instanceof Maracuja) { 
					System.out.println("MARACUJA  i: "+i+" j: "+j);
				}
        
			}
		}
        }
        
        
        
    }

    public static void main(String[] args) {
    	JFrame frame = new JFrame("Selecionar Arquivo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,400, 180);
        frame.setLayout(null);
        
        JButton botaoSelecionar = new JButton("Selecionar Arquivo");
        botaoSelecionar.setBounds(10, 25, 170, 100);
        JButton botaoSetar = new JButton ("Criar Mapa");
        botaoSetar.setBounds(200,25,170,100);
        
        // Adiciona a funcionalidade de abrir o explorador de arquivos ao clicar no botão
        
        botaoSelecionar.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                // Cria um JFileChooser para permitir a seleção do arquivo
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setDialogTitle("Selecione o arquivo de configuração");

             // Abre o explorador de arquivos e espera a seleção
                int resultado = fileChooser.showOpenDialog(null);
                // Verifica se o usuário selecionou um arquivo
                if (resultado == JFileChooser.APPROVE_OPTION) {
                    File arquivoSelecionado = fileChooser.getSelectedFile();
                    JOptionPane.showMessageDialog(null, "Arquivo selecionado: " + arquivoSelecionado.getAbsolutePath());
                    
                    Arquivo arquivo = new Arquivo(arquivoSelecionado);
                    Configuracao config = arquivo.lerArquivo();
                    
                    criarJanelaComMatriz(config);
                    frame.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum arquivo foi selecionado.");
                }
            }
        });
        
        botaoSetar.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Deu certo");
                
             // Solicita ao usuário para inserir o tamanho da matriz
                
                int tamanhoMatriz;
                int qPedras=0 ;
                int qMaracujaTotal=0;
                int qMaracujaChao=0;
                int qLaranjeira=0;
                int qLaranja=0;
                int qAbacateiro=0;
                int qAbacate=0;
                int qCoqueiro=0;
                int qCoco=0;
                int qAceroleira=0;
                int qAcerola=0;
                int qAmoreira=0;
                int qAmora=0;
                int qGoiabeira=0;
                int qGoiaba=0;
                float bicho=0;
                int mochila=0;
                // Valida a entrada do usuário
                
                String inputTam = JOptionPane.showInputDialog("Insira o tamanho da matriz (ex: 6 para 6x6):");
                try {
                    tamanhoMatriz = Integer.parseInt(inputTam);
                    
                    if (tamanhoMatriz <= 0) {
                        throw new NumberFormatException("O tamanho deve ser maior que zero.");
                    }
                } catch (NumberFormatException f) {
                    JOptionPane.showMessageDialog(null, "Entrada inválida! O programa será encerrado.");
                    return; // Encerra o programa em caso de entrada inválida
                }
                
                String inputPed = JOptionPane.showInputDialog("Insira a quantidade de Pedras");
                try {
                	qPedras = Integer.parseInt(inputPed);
                	
                	if(qPedras <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException g){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputMarTot = JOptionPane.showInputDialog("Insira a quantidade total de Maracujás");
                try {
                	qMaracujaTotal = Integer.parseInt(inputMarTot);
                	
                	if(qMaracujaTotal <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException h){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputMarChao = JOptionPane.showInputDialog("Insira a quantidade de Maracujás do Chão");
                try {
                	qMaracujaChao = Integer.parseInt(inputMarChao);
                	
                	if(qMaracujaChao <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException i){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputLara = JOptionPane.showInputDialog("Insira a quantidade de Laranjeiras");
                try {
                	qLaranjeira = Integer.parseInt(inputLara);
                	
                	if(qLaranjeira <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException j){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputLar = JOptionPane.showInputDialog("Insira a quantidade de Laranjas");
                try {
                	qLaranja = Integer.parseInt(inputLar);
                	
                	if(qLaranja <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputAbac = JOptionPane.showInputDialog("Insira a quantidade de Abacateiros");
                try {
                	qAbacateiro = Integer.parseInt(inputAbac);
                	
                	if(qAbacateiro <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputAba = JOptionPane.showInputDialog("Insira a quantidade de Abacates");
                try {
                	qAbacate = Integer.parseInt(inputAba);
                	
                	if(qAbacate <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputCoq = JOptionPane.showInputDialog("Insira a quantidade de Coqueiros");
                try {
                	qCoqueiro = Integer.parseInt(inputCoq);
                	
                	if(qCoqueiro <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputCoco = JOptionPane.showInputDialog("Insira a quantidade de Cocos");
                try {
                	qCoco = Integer.parseInt(inputCoco);
                	
                	if(qCoco <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputAcer = JOptionPane.showInputDialog("Insira a quantidade de Aceroleiras");
                try {
                	qAceroleira = Integer.parseInt(inputAcer);
                	
                	if(qAceroleira <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputAce = JOptionPane.showInputDialog("Insira a quantidade de Acerolas");
                try {
                	qAcerola = Integer.parseInt(inputAce);
                	
                	if(qAcerola <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputAmor = JOptionPane.showInputDialog("Insira a quantidade de Amoreiras");
                try {
                	qAmoreira = Integer.parseInt(inputAmor);
                	
                	if(qAmoreira <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputAmo = JOptionPane.showInputDialog("Insira a quantidade de Amoras");
                try {
                	qAmora = Integer.parseInt(inputAmo);
                	
                	if(qAmora <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputGoia = JOptionPane.showInputDialog("Insira a quantidade de Goiabeiras");
                try {
                	qGoiabeira = Integer.parseInt(inputGoia);
                	
                	if(qGoiabeira <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputGoi = JOptionPane.showInputDialog("Insira a quantidade de Goiabas");
                try {
                	qGoiaba = Integer.parseInt(inputGoi);
                	
                	if(qGoiaba <0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputBicho = JOptionPane.showInputDialog("Insira a probabilidade das frutas estarem bichadas");
                try {
                	bicho = Float.parseFloat(inputBicho);
                	
                	if(bicho <0) {
                		throw new NumberFormatException("A probabilidade deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                String inputMochila = JOptionPane.showInputDialog("Insira o tamanho da mochila");
                try {
                	mochila = Integer.parseInt(inputMochila);
                	
                	if(mochila <=0) {
                		throw new NumberFormatException("O tamanho deve ser maior ou igual a zero.");
                	}
                } catch(NumberFormatException k){
                	JOptionPane.showMessageDialog(null, "Entrada inválida! Insira um valor maior ou igual a zero.");
                }
                
                Configuracao config = new Configuracao();
                config.setDimensaoMatriz(tamanhoMatriz);
                config.setQuantPedras(qPedras);
                config.setQuantMaracujaTotal(qMaracujaTotal);
                config.setQuantMaracujaInicio(qMaracujaChao);
                config.setQuantLaranjeira(qLaranjeira);
                config.setQuantLaranja(qLaranja);
                config.setQuantAbacateira(qAbacateiro);
                config.setQuantAbacate(qAbacate);
                config.setQuantCoqueiro(qCoqueiro);
                config.setQuantCoco(qCoco);
                config.setQuantAceroleira(qAceroleira);
                config.setQuantAcerola(qAcerola);
                config.setQuantAmoreira(qAmoreira);
                config.setQuantAmora(qAmora);
                config.setQuantGoiabeira(qGoiabeira);
                config.setQuantGoiaba(qGoiaba);
                config.setChanceBichada(bicho);
                config.setTamanhoMochila(mochila);
                
                criarJanelaComMatriz(config);
                frame.setVisible(false);
                
            }
        });
        
        
        frame.add(botaoSelecionar);
        frame.add(botaoSetar);
        frame.setLocationRelativeTo(null);  // Centraliza a janela
        frame.setVisible(true);
        
        
        
    }
}
