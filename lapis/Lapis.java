package lapis;

public class Lapis {
    String material;
    String cor;
    String marca;
    int quantidade;

    void quantosLapis(int quantidadeLapis) {
        quantidade += quantidadeLapis;
    }

    void tirouQuantosLapis(int menosQuantidade) {
        quantidade -= menosQuantidade;
    }
}
