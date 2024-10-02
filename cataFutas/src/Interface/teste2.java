package Interface;
import cataFrutas.*;
import Frutas.*;
import javax.swing.*;
import java.awt.*;

public class teste2 {

    // Função para criar a interface gráfica com a matriz
    public static void criarJanelaComMatriz(int tamanho,int pedra,int maracujaTotal,int maracujaChao,
			int laranjeira,int laranja,int abacateiro,int abacate,
			int coqueiro, int coco,  int aceroleira,int acerola, 
			int amoreira,int amora, int goiabeira, int goiaba,
			int bicho,int mochila) {
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
        // Caminho da imagem (certifique-se de que a imagem esteja no diretório correto)
        String caminhoImagemGrama = "C:\\Users\\pedro\\Documents\\java-ws\\cataFutas\\src\\Interface\\grama.jpg";
        ImageIcon imagemIconGrama = new ImageIcon(caminhoImagemGrama);
        // Calcula o tamanho de cada botão com base no tamanho do tabuleiro
        

        // Redimensiona a imagem apenas uma vez
        Image imagemGrama = imagemIconGrama.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaGrama = new ImageIcon(imagemGrama);
        
        
        
        
        
        //######################## IMAGEM DA PEDRA ###################3
        String caminhoImagemPedra = "C:\\Users\\pedro\\Documents\\java-ws\\cataFutas\\src\\Interface\\pedra.jpg";
        ImageIcon imagemIconPedra = new ImageIcon(caminhoImagemPedra);
        // Calcula o tamanho de cada botão com base no tamanho do tabuleiro
        

        // Redimensiona a imagem apenas uma vez
        Image imagemPedra = imagemIconPedra.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaPedra = new ImageIcon(imagemPedra);
        
        
        
        
        //######################## IMAGEM DA LARANJEIRA ###################3
        String caminhoImagemLaranjeira = "C:\\Users\\pedro\\Documents\\java-ws\\cataFutas\\src\\Interface\\Laranjeira.jpg";
        ImageIcon imagemIconLaranjeira = new ImageIcon(caminhoImagemLaranjeira);
        // Calcula o tamanho de cada botão com base no tamanho do tabuleiro
        

        // Redimensiona a imagem apenas uma vez
        Image imagemLaranjeira = imagemIconLaranjeira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaLaranjeira = new ImageIcon(imagemLaranjeira);

        
        
        
        //######################## IMAGEM DA ABACATEIRO ###################3
        String caminhoImagemAbacateiro = "C:\\Users\\pedro\\Documents\\java-ws\\cataFutas\\src\\Interface\\Abacateiro.jpg";
        ImageIcon imagemIconAbacateiro = new ImageIcon(caminhoImagemAbacateiro);
        // Calcula o tamanho de cada botão com base no tamanho do tabuleiro
        

        // Redimensiona a imagem apenas uma vez
        Image imagemAbacateiro = imagemIconAbacateiro.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAbacateiro = new ImageIcon(imagemAbacateiro);

        
        
        
        //######################## IMAGEM DA Coqueiro ###################3
        String caminhoImagemCoqueiro = "C:\\Users\\pedro\\Documents\\java-ws\\cataFutas\\src\\Interface\\Coqueiro.jpg";
        ImageIcon imagemIconCoqueiro = new ImageIcon(caminhoImagemCoqueiro);
        // Calcula o tamanho de cada botão com base no tamanho do tabuleiro
        

        // Redimensiona a imagem apenas uma vez
        Image imagemCoqueiro = imagemIconCoqueiro.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaCoqueiro = new ImageIcon(imagemCoqueiro);

        
        
        
        //######################## IMAGEM DA Aceroleira ###################3
        String caminhoImagemAceroleira = "C:\\Users\\pedro\\Documents\\java-ws\\cataFutas\\src\\Interface\\Aceroleira.jpg";
        ImageIcon imagemIconAceroleira = new ImageIcon(caminhoImagemAceroleira);
        // Calcula o tamanho de cada botão com base no tamanho do tabuleiro
        

        // Redimensiona a imagem apenas uma vez
        Image imagemAceroleira = imagemIconAceroleira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAceroleira = new ImageIcon(imagemAceroleira);

        
        
        
        //######################## IMAGEM DA Amoreira ###################3
        String caminhoImagemAmoreira = "C:\\Users\\pedro\\Documents\\java-ws\\cataFutas\\src\\Interface\\Amoreira.jpg";
        ImageIcon imagemIconAmoreira = new ImageIcon(caminhoImagemAmoreira);
        // Calcula o tamanho de cada botão com base no tamanho do tabuleiro
        

        // Redimensiona a imagem apenas uma vez
        Image imagemAmoreira = imagemIconAmoreira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaAmoreira = new ImageIcon(imagemAmoreira);

        
        
        
        //######################## IMAGEM DA Goiabeira ###################3
        String caminhoImagemGoiabeira = "C:\\Users\\pedro\\Documents\\java-ws\\cataFutas\\src\\Interface\\Goiabeira.jpg";
        ImageIcon imagemIconGoiabeira = new ImageIcon(caminhoImagemGoiabeira);
        // Calcula o tamanho de cada botão com base no tamanho do tabuleiro
        

        // Redimensiona a imagem apenas uma vez
        Image imagemGoiabeira = imagemIconGoiabeira.getImage().getScaledInstance(botaoLargura, botaoAltura, Image.SCALE_SMOOTH);
        ImageIcon imagemRedimensionadaGoiabeira = new ImageIcon(imagemGoiabeira);
        
        
        
        floresta floresta = new floresta(tamanho,pedra, maracujaTotal, maracujaChao,
    			laranjeira, laranja, abacateiro, abacate,
    			coqueiro, coco, aceroleira, acerola, 
    			 amoreira, amora,  goiabeira, goiaba,
    			 bicho,mochila);
        
        
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

    public static void main(String[] args) {
        // Solicita ao usuário para inserir o tamanho da matriz
        String input = JOptionPane.showInputDialog("Insira o tamanho da matriz (ex: 6 para 6x6):");
        int tamanhoMatriz;

        // Valida a entrada do usuário
        try {
            tamanhoMatriz = Integer.parseInt(input);
            if (tamanhoMatriz <= 0) {
                throw new NumberFormatException("O tamanho deve ser maior que zero.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Entrada inválida! O programa será encerrado.");
            return; // Encerra o programa em caso de entrada inválida
        }

        // Criar a janela com a matriz
        criarJanelaComMatriz(tamanhoMatriz,7,0,0,2,0,2,0,2,0,1,0,1,0,1,0,0,10);
        
        
        
    }
}

