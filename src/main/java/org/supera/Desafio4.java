package org.supera;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade de entrada para frase? ");

        try {
            int qtde = scanner.nextInt();
            for (int x = 0; x <= qtde; x++) {
                String frase = scanner.nextLine();

                System.out.println(decifrarString(frase));
            }
        } catch (InputMismatchException ex) {
            System.out.println("Só valores inteiros não nulos");
        }
    }

    public static StringBuilder decifrarString(String frase) {
        StringBuilder primeiraParteString = new StringBuilder(frase.substring(0, frase.length() / 2));
        StringBuilder segundaParteString = new StringBuilder(frase.substring(frase.length() / 2));

        primeiraParteString.reverse();
        segundaParteString.reverse();

        return new StringBuilder(primeiraParteString).append(segundaParteString);
    }
}
