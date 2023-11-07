package caneta;

public class CanetaTeste {
    public static void main(String[] args) {
        Caneta caneta = new Caneta();

        caneta.cor = "Azul";
        caneta.marca = "Bique";
        caneta.nivelDaCor = 45;
        caneta.quantidade = 12;

        caneta.escreve(14);
        System.out.println(caneta.nivelDaCor);
    }
}
