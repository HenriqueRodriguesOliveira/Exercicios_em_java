package lapis;

public class LapisTeste {
    public static void main(String[] args) {
        Lapis lapis1 = new Lapis();

        lapis1.cor = "amarelo";
        lapis1.marca = "Fabrica Castelo";
        lapis1.material = "Madeira tipo 2";
        lapis1.quantidade = 41;

        lapis1.quantosLapis(14);
        System.out.println(lapis1.quantidade);
    }
}
