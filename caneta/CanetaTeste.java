package caneta;

public class CanetaTeste {
    public static void main(String[] args) {
        // instanciar
        Caneta c1 = new Caneta();

        // chamando os atributos
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        // chamando método
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
