package estruturaderepeticao;

import java.util.Random;
import java.util.Scanner;

public class ForElse {
    public static void main(String[] args) {
        // Verificar números pares e ímpares:Escreva um programa que imprime os números
        // de 1 a 10 e, para cada número, indique se ele é par ou ímpar.
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é ímpar");
            }
        }

        // Crie um programa que imprima uma contagem regressiva de 10 a 1 e, em seguida,
        // exiba "Feliz Ano Novo!".
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Feliz Ano Novo!");

        // Escreva um programa que solicite ao usuário um número e imprima a tabuada
        // desse número de 1 a 10.
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Digite um número: ");
        // int numero = scanner.nextInt();

        // for (int i = 1; i <= 10; i++) {
        // System.out.println(numero + " x " + i + " = " + (numero * i));
        // }
        // scanner.close();

        // Crie um jogo onde o computador escolhe um número aleatório entre 1 e 100, e o
        // jogador tenta adivinhar. O programa deve fornecer dicas (maior/menor) e
        // contar quantas tentativas o jogador fez.

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        System.out.println("Adivinhe o número entre 1 e 100.");
        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroAleatorio) {
                System.out.println("Tente um número maior.");
            } else if (palpite > numeroAleatorio) {
                System.out.println("Tente um número menor.");
            }
        } while (palpite != numeroAleatorio);

        System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
        scanner.close();

    }
}
