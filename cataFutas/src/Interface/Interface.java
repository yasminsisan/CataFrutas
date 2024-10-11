package Interface;
import Frutas.*;
import java.lang.NumberFormatException;
import Terreno.*;
import javax.swing.*;
import Arvores.*;
import Jogador.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

/**
 * Classe utilizada para gerar a interface gráfica do Jogo.
 * 
 * @author Pedro Thalles Lima Ricarte
 * @version 1.0
 */
public class Interface {

    /**
     * Método que gera a janela do Jogo, que, por sua vez, conterá o terreno a ser visualizado
     * @param config Instância da classe Configuracao
     */
	public static void criarJanelaComMatriz(Configuracao config) {
	
	    	//Obtendo as informações do objeto configuracao
	    	 
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
	        
	    // cria a janela, ou frame, onde os elementos visuais aparecerão   
        JFrame frame = new JFrame("Tabuleiro " + tamanho + "x" + tamanho);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);  
        frame.setResizable(false);  
        frame.setLayout(null);  
        
        // Painel reservado para o tabuleiro, com tamanho fixo
        JPanel tabuleiroPanel = new JPanel();
        tabuleiroPanel.setBounds(100, 0, 600, 600);  
        tabuleiroPanel.setLayout(new GridLayout(tamanho, tamanho));
        int botaoLargura = tabuleiroPanel.getWidth() / tamanho;
        int botaoAltura = tabuleiroPanel.getHeight() / tamanho;
        // criação de um botão com opção de salvar mapa criado
        JButton botaoArmazenar = new JButton("Salvar Mapa");
        botaoArmazenar.setBounds(300,650,200,100);
        
        
        // Armazena imagem da grama, para quando for necessário utilizar
        String caminhoImagemGrama = "/Interface/grama.jpg";
        ImageIcon imagemIconGrama = new ImageIcon(Interface.class.getResource(caminhoImagemGrama));
        Image imagemGrama = imagemIconGrama.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaGrama = new ImageIcon(imagemGrama);
        
        
        
        
     // Armazena imagem da pedra, para quando for necessário utilizar
        String caminhoImagemPedra = "/Interface/pedra.jpg";
        ImageIcon imagemIconPedra = new ImageIcon(Interface.class.getResource(caminhoImagemPedra));
        Image imagemPedra = imagemIconPedra.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaPedra = new ImageIcon(imagemPedra);
        
        
        
        
     // Armazena imagem da laranjeira, para quando for necessário utilizar
        String caminhoImagemLaranjeira = "/Interface/Laranjeira.jpg";
        ImageIcon imagemIconLaranjeira = new ImageIcon(Interface.class.getResource(caminhoImagemLaranjeira));
        Image imagemLaranjeira = imagemIconLaranjeira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaLaranjeira = new ImageIcon(imagemLaranjeira);

        
        
        
     // Armazena imagem do abacateiro, para quando for necessário utilizar
        String caminhoImagemAbacateiro = "/Interface/Abacateiro.jpg";
        ImageIcon imagemIconAbacateiro = new ImageIcon(Interface.class.getResource(caminhoImagemAbacateiro));
        Image imagemAbacateiro = imagemIconAbacateiro.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAbacateiro = new ImageIcon(imagemAbacateiro);

        
        
        
     // Armazena imagem do coqueiro, para quando for necessário utilizar
        String caminhoImagemCoqueiro = "/Interface/Coqueiro.jpg";
        ImageIcon imagemIconCoqueiro = new ImageIcon(Interface.class.getResource(caminhoImagemCoqueiro));     
        Image imagemCoqueiro = imagemIconCoqueiro.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaCoqueiro = new ImageIcon(imagemCoqueiro);

        
        
        
     // Armazena imagem da aceroleira, para quando for necessário utilizar
        String caminhoImagemAceroleira = "/Interface/Aceroleira.jpg";
        ImageIcon imagemIconAceroleira = new ImageIcon(Interface.class.getResource(caminhoImagemAceroleira));               
        Image imagemAceroleira = imagemIconAceroleira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAceroleira = new ImageIcon(imagemAceroleira);

        
        
        
     // Armazena imagem da amoreira, para quando for necessário utilizar
        String caminhoImagemAmoreira = "/Interface/Amoreira.jpg";
        ImageIcon imagemIconAmoreira = new ImageIcon(Interface.class.getResource(caminhoImagemAmoreira));                
        Image imagemAmoreira = imagemIconAmoreira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAmoreira = new ImageIcon(imagemAmoreira);

        
        
        
     // Armazena imagem da goiabeira, para quando for necessário utilizar
        String caminhoImagemGoiabeira = "/Interface/Goiabeira.jpg";
        ImageIcon imagemIconGoiabeira = new ImageIcon(Interface.class.getResource(caminhoImagemGoiabeira));        
        Image imagemGoiabeira = imagemIconGoiabeira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaGoiabeira = new ImageIcon(imagemGoiabeira);
        
        
     // Armazena imagem do maracujá, para quando for necessário utilizar
        
        String caminhoImagemMaracuja = "/Interface/maracuja.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconMaracuja = new ImageIcon(Interface.class.getResource(caminhoImagemMaracuja));            
        Image imagemMaracuja = imagemIconMaracuja.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaMaracuja = new ImageIcon(imagemMaracuja);
        
     // Armazena imagem da laranja, para quando for necessário utilizar
        
        String caminhoImagemLaranja = "/Interface/Laranja.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconLaranja = new ImageIcon(Interface.class.getResource(caminhoImagemLaranja));            
        Image imagemLaranja = imagemIconLaranja.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaLaranja = new ImageIcon(imagemLaranja);
        
        
     // Armazena imagem do abacate, para quando for necessário utilizar
        
        String caminhoImagemAbacate = "/Interface/Abacate.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconAbacate = new ImageIcon(Interface.class.getResource(caminhoImagemAbacate));            
        Image imagemAbacate = imagemIconAbacate.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAbacate = new ImageIcon(imagemAbacate);
        
        
     // Armazena imagem do coco, para quando for necessário utilizar
        
        String caminhoImagemCoco = "/Interface/Coco.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconCoco = new ImageIcon(Interface.class.getResource(caminhoImagemCoco));            
        Image imagemCoco = imagemIconCoco.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaCoco = new ImageIcon(imagemCoco);
        
        
     // Armazena imagem da acerola, para quando for necessário utilizar
        
        String caminhoImagemAcerola = "/Interface/Acerola.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconAcerola = new ImageIcon(Interface.class.getResource(caminhoImagemAcerola));            
        Image imagemAcerola = imagemIconAcerola.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAcerola = new ImageIcon(imagemAcerola);
        
        
     // Armazena imagem da amora, para quando for necessário utilizar
        
        String caminhoImagemAmora = "/Interface/Amora.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconAmora = new ImageIcon(Interface.class.getResource(caminhoImagemAmora));            
        Image imagemAmora = imagemIconAmora.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAmora = new ImageIcon(imagemAmora);
        
        
     // Armazena imagem da goiaba, para quando for necessário utilizar
        
        String caminhoImagemGoiaba = "/Interface/Goiaba.jpg"; // Supondo que a imagem do maracujá seja transparente
        ImageIcon imagemIconGoiaba = new ImageIcon(Interface.class.getResource(caminhoImagemGoiaba));            
        Image imagemGoiaba = imagemIconGoiaba.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaGoiaba = new ImageIcon(imagemGoiaba);
        
        
       
                    
          // Cria instância da classe floresta, com os atributos da instância da classe Configuracao colocada neste método construtor          
        floresta floresta = new floresta(tamanho,pedra, maracujaTotal, maracujaChao,
    			laranjeira, laranja, abacateiro, abacate,
    			coqueiro, coco, aceroleira, acerola, 
    			 amoreira, amora,  goiabeira, goiaba,
    			 bicho,mochila);
        
        	// Cria uma matriz de botões
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
                botao.setPreferredSize(new Dimension(botaoLargura, botaoAltura));
                botao.setText("");  
                //adiciona o botão à matriz
                tabuleiroPanel.add(botao);  
            }
        }
        // adiciona um ActionListener, para observar se há um clique no botão de armazenar arquivo
        botaoArmazenar.addActionListener(j -> {
        	String inputNomeArquivo = JOptionPane.showInputDialog("Nomeie o arquivo do seu mapa");
        	
        	//cria um seletor de pastas do computador
        	JFileChooser fileChooser = new JFileChooser();
        	fileChooser.setCurrentDirectory(new java.io.File("."));
        	fileChooser.setDialogTitle("Selecione a Pasta");
        	fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        	fileChooser.setAcceptAllFileFilterUsed(false);
        	int resultado = fileChooser.showOpenDialog(null);
        	File selectedFolder = fileChooser.getSelectedFile();
        	//obtém o caminho da pasta selecionada
        	String caminho = selectedFolder.getAbsolutePath();
        	caminho = caminho.replaceAll("/","\\");
        	caminho +="\\"+ inputNomeArquivo + ".txt";
        	
        	//cria o texto a ser escrito num arquivo txt
        	String conteudo ="dimensao "+tamanho+"\npedras "+pedra+"\nmaracuja "
        	+maracujaTotal+" "+maracujaChao+"\nlaranja "
        	+laranjeira+" "+laranja+"\nabacate "+abacateiro+" "+abacate
        	+"\ncoco "+coqueiro+" "+coco+"\nacerola "+aceroleira+" "+acerola+"\namora "
        	+amoreira+" "+amora+"\ngoiaba "+goiabeira+" "+goiaba+"\nbichadas "+ (int) (bicho*100)
        	+"\nmochila "+mochila;
        	
        	//escreve o texto no arquivo txt
        	try {
				FileWriter writer = new FileWriter(caminho);
				writer.write(conteudo);
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        	
        });
        // adiciona os elementos à janela
        frame.add(tabuleiroPanel);  
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);  
        frame.add(botaoArmazenar);
        // Printa no console a posição de cada elemento do terreno, para que seja possível localizar o que está armazenado e comparar com a interface
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
				} else if(floresta.matriz[i][j].temCompetidor()) {
					System.out.println("JOGADOR i: "+i+" j: "+j);
				}
        
			}
		}
        
        
        
        
    }
	/**
	 * Método main, que vai executar o programa
	 * @param args
	 */
    public static void main(String[] args) {
    	//Cria Janela de início
    	JFrame frame = new JFrame("Início");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(0,0,400, 180);
        frame.setLayout(null);
        //Cria botão para selecionar um arquivo
        JButton botaoSelecionar = new JButton("Selecionar Arquivo");
        botaoSelecionar.setBounds(10, 25, 170, 100);
        //Cria botão para Criar mapa manualmente
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
                    //Cria instância da classe arquivo com o arquivo selecionado
                    Arquivo arquivo = new Arquivo(arquivoSelecionado);
                    //Cria instância da classe configuração a partir da leitura de arquivo feio pelo método lerArquivo() da classe arquivo
                    try {
                    	Configuracao config = arquivo.lerArquivo();
                    	//cria a interface gráfica do terreno
                    	criarJanelaComMatriz(config);
                    }catch(IllegalArgumentException k) {
                    	JOptionPane.showMessageDialog(null, k.getMessage());
                    }
                    frame.setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Nenhum arquivo foi selecionado.");
                }
            }
        });
        // Adiciona a funcionalidade de criar o terreno manualmente ao clicar no botão
        botaoSetar.addActionListener(new ActionListener() {
        	@Override
            public void actionPerformed(ActionEvent e) {
        		// cria variáveis que mais tarde serão usadas para gerar o terreno
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
                // Cria instância da classe configuração
                Configuracao config = new Configuracao();
                // solicita ao usuário para colocar a dimensão do terreno e configura esse valor na instância da classe Configuracao
                String inputTam = JOptionPane.showInputDialog("Insira o tamanho da matriz (ex: 6 para 6x6):");
                try {
                	try {
                		tamanhoMatriz = Integer.parseInt(inputTam);
                		config.setDimensaoMatriz(tamanhoMatriz); 
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                	return;
                	}
                	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                }
             // solicita ao usuário para colocar a quantidade de pedras e configura esse valor na instância da classe Configuracao
                String inputPed = JOptionPane.showInputDialog("Insira a quantidade de Pedras");
                try {
                	try {
                		qPedras = Integer.parseInt(inputPed);
                		config.setQuantPedras(qPedras); 
                		
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                }
             // solicita ao usuário para colocar a quantidade total de maracujás e configura esse valor na instância da classe Configuracao
                 String inputMarTot = JOptionPane.showInputDialog("Insira a quantidade total de Maracujás"); 
                try {
                	try {
                		qMaracujaTotal = Integer.parseInt(inputMarTot);
                		config.setQuantMaracujaTotal(qMaracujaTotal); 
                		
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}         		
                	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de maracujás do início e configura esse valor na instância da classe Configuracao
                String inputMarChao = JOptionPane.showInputDialog("Insira a quantidade de Maracujás do Chão");
                try {
                	try {
                		qMaracujaChao = Integer.parseInt(inputMarChao);
                		config.setQuantMaracujaInicio(qMaracujaChao);
                		
                	} catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}    	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de Laranjeiras e configura esse valor na instância da classe Configuracao
                String inputLara = JOptionPane.showInputDialog("Insira a quantidade de Laranjeiras");  
                try {
                	try {
                		qLaranjeira = Integer.parseInt(inputLara);
                		config.setQuantLaranjeira(qLaranjeira); 
                		
                		
                	} catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}     	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de laranjas e configura esse valor na instância da classe Configuracao
                String inputLar = JOptionPane.showInputDialog("Insira a quantidade de Laranjas");  
                try {
                	try {
                		qLaranja = Integer.parseInt(inputLar);
                		config.setQuantLaranja(qLaranja); 
                		
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}       	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de Abacateiros e configura esse valor na instância da classe Configuracao
                String inputAbac = JOptionPane.showInputDialog("Insira a quantidade de Abacateiros");  
                try {
                	try {
                		qAbacateiro = Integer.parseInt(inputAbac);
                		config.setQuantAbacateira(qAbacateiro); 
                		
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	} 	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de abacates e configura esse valor na instância da classe Configuracao
                String inputAba = JOptionPane.showInputDialog("Insira a quantidade de Abacates");     
                try {
                	try {
                		qAbacate = Integer.parseInt(inputAba);
                		config.setQuantAbacate(qAbacate); 
                		
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}          	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de coqueiros e configura esse valor na instância da classe Configuracao
                String inputCoq = JOptionPane.showInputDialog("Insira a quantidade de Coqueiros");
                try {
                	try {
                		qCoqueiro = Integer.parseInt(inputCoq);
                		config.setQuantCoqueiro(qCoqueiro); 
                		
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}          	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de cocos e configura esse valor na instância da classe Configuracao
                String inputCoco = JOptionPane.showInputDialog("Insira a quantidade de Cocos");  
                try {
                	try {
                		
                		qCoco = Integer.parseInt(inputCoco);
                		config.setQuantCoco(qCoco); 
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}     	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                }
             // solicita ao usuário para colocar a quantidade de aceroleiras e configura esse valor na instância da classe Configuracao
                String inputAcer = JOptionPane.showInputDialog("Insira a quantidade de Aceroleiras");  
                try {
                	try {
                		qAceroleira = Integer.parseInt(inputAcer);
                		config.setQuantAceroleira(qAceroleira); 
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}      	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de acerolas e configura esse valor na instância da classe Configuracao
                String inputAce = JOptionPane.showInputDialog("Insira a quantidade de Acerolas");
                try {
                	try {
                		qAcerola = Integer.parseInt(inputAce);
                		config.setQuantAcerola(qAcerola); 
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}      	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de amoreiras e configura esse valor na instância da classe Configuracao
                String inputAmor = JOptionPane.showInputDialog("Insira a quantidade de Amoreiras"); 
                try {
                	try {
                		qAmoreira = Integer.parseInt(inputAmor);
                		config.setQuantAmoreira(qAmoreira); 
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}         	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de amoras e configura esse valor na instância da classe Configuracao
                String inputAmo = JOptionPane.showInputDialog("Insira a quantidade de Amoras");    
                try {
                	try {
                		qAmora = Integer.parseInt(inputAmo);
                		config.setQuantAmora(qAmora); 
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}         	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de goiabeiras e configura esse valor na instância da classe Configuracao
                String inputGoia = JOptionPane.showInputDialog("Insira a quantidade de Goiabeiras"); 
                try {
                	try {
                		qGoiabeira = Integer.parseInt(inputGoia);
                		config.setQuantGoiabeira(qGoiabeira); 
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}         	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a quantidade de goiabas e configura esse valor na instância da classe Configuracao
                String inputGoi = JOptionPane.showInputDialog("Insira a quantidade de Goiabas");    
                try {
                	try {
                		qGoiaba = Integer.parseInt(inputGoi);
                		config.setQuantGoiaba(qGoiaba); 
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}   	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a probabilidade de as frutas estarem bichadas e configura esse valor na instância da classe Configuracao
                String inputBicho = JOptionPane.showInputDialog("Insira a probabilidade das frutas estarem bichadas"); 
                try {
                	try {
                		bicho = Float.parseFloat(inputBicho);
                		config.setChanceBichada(bicho); 
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}          	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                } 
             // solicita ao usuário para colocar a capacidade da mochila e configura esse valor na instância da classe Configuracao
                String inputMochila = JOptionPane.showInputDialog("Insira o tamanho da mochila");
                try {
                	try {
                		mochila = Integer.parseInt(inputMochila);
                		config.setTamanhoMochila(mochila); 
                		
                	}catch(NumberFormatException j) {
                		JOptionPane.showMessageDialog(null,"Erro! Insira apenas números!");
                		return;
                	}    	
                } catch(IllegalArgumentException k) {
                	JOptionPane.showMessageDialog(null, k.getMessage());
                	return;
                }
                //cria a interface gráfica do terreno gerado manualmente
                try {
                	criarJanelaComMatriz(config);
                } catch (IllegalArgumentException j) {
                	JOptionPane.showMessageDialog(null,j.getMessage());
                	return;
                }
                
                frame.setVisible(false);
                
    	                
            }
        });
        
        //adiciona os botões à janela
        frame.add(botaoSelecionar);
        frame.add(botaoSetar);
        frame.setLocationRelativeTo(null);  
        frame.setVisible(true);
        
        
        
    }
}
