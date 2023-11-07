package caneta;

public class Caneta {
    String cor;
    String marca;
    int quantidade;
    int nivelDaCor;

    void escreve(int quantidade) {
        nivelDaCor += quantidade;
    }

    void naoEscreve(int menosQuantidade) {
        nivelDaCor -= menosQuantidade;
    }
}
