package carrovelocidade;

public class Carro {
    String nome;
    String modelo;
    int ano;
    int velocidade;

    //métodos
    void acelerar(int aceleracao){
        velocidade += aceleracao;
    }

    void freiar(int reduzir){
        velocidade -= reduzir;
    }
}
