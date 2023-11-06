package carrovelocidade;

public class CarroTestar {
    public static void main(String[] args) {
        Carro c1 = new Carro();

        c1.nome = "Argo";
        c1.modelo = "Fiat";
        c1.ano = 2018;
        c1.velocidade = 60;

        c1.acelerar(54);

        System.out.println("Velocidade: " + c1.velocidade);

        c1.freiar(10);

        System.out.println("Velocidade: " + c1.velocidade);
    }
}
