package org.supera;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Integer> listaNotas = List.of(100, 50, 20, 10, 5, 2);
        List<Double> listaMoedas = List.of(1.0, 0.5, 0.25, 0.1, 0.05, 0.01);
        Scanner inputValor = new Scanner(System.in);
        try {
            System.out.print("Digite o valor: ");
            float valor = inputValor.nextFloat();

            impressaoNotas(listaNotas, valor);
            impressaoMoedas(listaNotas, valor);

        } catch (InputMismatchException ex) {
            System.err.print("Número com virgula não é permitido");
        }
    }

    public static void impressaoNotas(List<Integer> listaNotas, float valor) {
        System.out.println("Notas:");
        for (int nota : listaNotas) {
            int quantidadeNotas = (int) (valor / nota);
            valor -= quantidadeNotas * nota;
            System.out.printf("%d nota(s) de R$ %d.00\n", quantidadeNotas, nota);
        }
    }

    public static void impressaoMoedas(List<Integer> listaMoedas, float valor) {
        System.out.println("Moedas:");
        for (double moeda : listaMoedas) {
            int quantidadeMoedas = (int) (valor / moeda);
            valor -= quantidadeMoedas * moeda;
            System.out.printf("%d moedas(s) de R$ %.2f\n", quantidadeMoedas, moeda);
        }
    }
}
