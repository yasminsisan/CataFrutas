package Interface;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Classe para armazenar o arquivo a ser lido na iniciação do terreno
 */
public class Arquivo {

    /**
     * Atributo para armazenar o arquivo
     */
    private File arquivoSelecionado;

    /**
     * Construtor da classe Arquivo
     */
    public Arquivo(File arquivoSelecionado) {
        this.arquivoSelecionado = arquivoSelecionado;
    }

    /**
     * Método para ler o arquivo 
     * Os dados lidos serão armazenados em um objeto da classe Configuracao
     * @throws IllegalArgumentException Caso não seja encontrado nenhum arquivo, lança exceção
     * @throws NumberFormatException Caso haja erro para converter string lida em número, lança exceção
     * @throws IOException Caso haja erro na leitura do arquivo, lança exceção
     */
    public Configuracao lerArquivo() {
        Configuracao config = new Configuracao();

        if (!arquivoSelecionado.exists() || !arquivoSelecionado.isFile()) {
            throw new IllegalArgumentException("Arquivo não encontrado: " + arquivoSelecionado.getPath());
        }

        try (BufferedReader input = new BufferedReader(new FileReader(arquivoSelecionado))) {
            String linha;
            
            while ((linha = input.readLine()) != null) {
                System.out.println("Linha lida: " + linha); // Log de depuração

                String[] partes = linha.split(" ");
                if (partes.length < 2) {
                    System.err.println("Linha inválida: " + linha);
                    continue; // Ignora linhas inválidas
                }
                
                switch (partes[0]) {
                    case "dimensao":
                        int dim = Integer.parseInt(partes[1]);
                        config.setDimensaoMatriz(dim);    
                        System.out.println("Dimensão lida: " + dim); // Log de depuração
                        break;
                    case "maracuja":
                    	int frutaMaracujaTotal = Integer.parseInt(partes[1]); 
                        int frutaMaracujaInicio = Integer.parseInt(partes[2]);
                        config.setQuantMaracujaTotal(frutaMaracujaTotal);
                        config.setQuantMaracujaInicio(frutaMaracujaInicio);
                        break;
                    case "laranja":
                        int frutaLaranja = Integer.parseInt(partes[2]);
                        int arvoreLaranja = Integer.parseInt(partes[1]);
                        config.setQuantLaranja(frutaLaranja);
                        config.setQuantLaranjeira(arvoreLaranja);
                        break;
                    case "coco":
                        int frutaCoco = Integer.parseInt(partes[2]);
                        int arvoreCoco = Integer.parseInt(partes[1]);
                        config.setQuantCoco(frutaCoco);
                        config.setQuantCoqueiro(arvoreCoco);
                        break;
                    case "abacate":
                        int frutaAbacate = Integer.parseInt(partes[2]);
                        int arvoreAbacate = Integer.parseInt(partes[1]);
                        config.setQuantAbacate(frutaAbacate);
                        config.setQuantAbacateira(arvoreAbacate);
                        break;
                    case "amora":
                        int frutaAmora = Integer.parseInt(partes[2]);
                        int arvoreAmora = Integer.parseInt(partes[1]);
                        config.setQuantAmora(frutaAmora);
                        config.setQuantAmoreira(arvoreAmora);
                        break;
                    case "acerola":
                        int frutaAcerola = Integer.parseInt(partes[2]);
                        int arvoreAcerola = Integer.parseInt(partes[1]);
                        config.setQuantAcerola(frutaAcerola);
                        config.setQuantAceroleira(arvoreAcerola);
                        break;
                    case "goiaba":
                        int frutaGoiaba = Integer.parseInt(partes[2]);
                        int arvoreGoiaba = Integer.parseInt(partes[1]);
                        config.setQuantGoiaba(frutaGoiaba);
                        config.setQuantGoiabeira(arvoreGoiaba);
                        break;
                    case "mochila":
                        int tamanhoMochila = Integer.parseInt(partes[1]);
                        config.setTamanhoMochila(tamanhoMochila);
                        break;
                    case "bichadas":	// O valor não foi salvo em porcentagem, só é salvo o número X, e não 0.0X;
                        float chanceBichada = (float) Integer.parseInt(partes[1]);
                        config.setChanceBichada(chanceBichada);
                        break;
                    case "pedras":
                    	int quantPedras = Integer.parseInt(partes[1]);
                    	config.setQuantPedras(quantPedras);
                    	break;
                    default:
                        System.err.println("Linha desconhecida: " + linha);
                }
            }

            return config;

        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro ao converter número: " + e.getMessage());
        }

        return null;
    }    
}
