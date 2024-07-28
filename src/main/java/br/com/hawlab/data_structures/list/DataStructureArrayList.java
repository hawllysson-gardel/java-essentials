package br.com.hawlab.data_structures.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DataStructureArrayList {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (ArrayList)");

        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Banana", "Apple", "Orange", "Mango");

        // Ordenação
        Collections.sort(list);
        System.out.println("ArrayList Ordenado: " + list);

        // Ordenação Personalizada
        list.sort(Comparator.comparingInt(String::length));
        System.out.println("ArrayList Ordenado por Tamanho: " + list);

        // Busca Binária
        int index = Collections.binarySearch(list, "Apple");
        System.out.println("Índice de 'Apple': " + index);

        // Remoção
        list.removeIf(s -> s.startsWith("A"));
        System.out.println("ArrayList Após Remoção: " + list);

        // Substituição
        Collections.replaceAll(list, "Orange", "Grapes");
        System.out.println("ArrayList Após Substituição: " + list);

        // Iteração com Stream API
        list.stream()
                .filter(s -> s.contains("e"))
                .forEach(System.out::println);

        System.out.println("------------------------------------------");
    }
}
