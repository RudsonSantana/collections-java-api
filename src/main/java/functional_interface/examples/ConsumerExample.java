package main.java.functional_interface.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/**
 * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
 * É utilizada principalmente para realizar ações, ou efeitos colaterais nos elementos do Stream sem modificar, ou
 * retornar um valor.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        // Criar uma lista de números inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.forEach(imprimirNumeroPar);

        // Usar o Consumer para imprimir números pares no Stream
        numeros.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // outra opção usando o consumer para imprimir números pares
        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.print(n + " ");
                }
            }
        });

        // mais uma opção usando função lambda para imprimir numeros pares
        numeros.forEach(n -> {if (n % 2 == 0) {System.out.print(n + " ");}});

        // Usar o Consumer para imprimir números pares da lista
        for (Integer numero : numeros) {
            imprimirNumeroPar.accept(numero);
        }
    }
}
