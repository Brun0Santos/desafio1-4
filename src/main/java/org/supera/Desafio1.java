package org.supera;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numeros");

        List<Integer> numeros = new ArrayList<>();
        int qtde = scanner.nextInt();

        for (int i = 0; i < qtde; i++) {
            numeros.add(scanner.nextInt());
        }

        List<Integer> resultadoOrdenacao = numerosOrdenados(numeros);
        resultadoOrdenacao.forEach(System.out::println);
    }

    public static List<Integer> numerosOrdenados(List<Integer> listaNumeros) {
        List<Integer> impares = new ArrayList<>();
        List<Integer> pares = new ArrayList<>();

        for (int x : listaNumeros) {
            if (x % 2 == 0) pares.add(x);
            else impares.add(x);
        }
        return ordenacaoNumeros(pares, impares);
    }

    public static List<Integer> ordenacaoNumeros(List<Integer> listaPares, List<Integer> listaImpares) {
        Collections.sort(listaPares);
        listaImpares.sort(Collections.reverseOrder());
        return new ArrayList<>() {{
            addAll(listaPares);
            addAll(listaImpares);
        }};
    }
}
