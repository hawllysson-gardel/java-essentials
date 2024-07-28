package br.com.hawlab.data_structures.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class DataStructureLinkedHashSet {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (LinkedHashSet)");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana"); // Elemento Duplicado Ignorado

        // Iteração e Operações Básicas
        linkedHashSet.forEach(System.out::println);

        // Manutenção da Ordem de Inserção
        linkedHashSet.add("Grape");
        linkedHashSet.add("Pineapple");
        System.out.println("Após Novas Adições: " + linkedHashSet);

        // Remoção de Elementos
        linkedHashSet.remove("Banana");
        System.out.println("Após Remoção: " + linkedHashSet);

        System.out.println("------------------------------------------");
    }
}
