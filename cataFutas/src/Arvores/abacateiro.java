package Arvores;
import Frutas.*;
/**
 * Classe que representa o Abacateiro
 * @author Pedro Thalles Lima Ricarte
 */
public class abacateiro extends arvore {
/**
 * Método que cria uma instância da classe Abacate
 * @return instância da classe Abacate
 */
 public Fruta gerarFruta() {
        return new Abacate();
    }
}

