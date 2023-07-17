package org.supera;

import java.util.Scanner;

public class Desafio3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Tamanho do Array");
        int array = scanner.nextInt();

        System.out.println("Alvo");
        int alvo = scanner.nextInt();

        int[] arr = new int[array];

        int numeroMaior = 0;

        for (int x = 0; x < arr.length; x++) {
            System.out.printf("Valor %d\n", x + 1);
            arr[x] = scanner.nextInt();
        }

        int result = 0;

        for (int i : arr) {
            if (i > numeroMaior) {
                numeroMaior = i;
            }
        }

        for (int i : arr) {
            if (numeroMaior - i == alvo) {
                result = i;
                break;
            }
        }
        System.out.println("Saida " + result);
    }
}
