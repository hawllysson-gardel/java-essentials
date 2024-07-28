package br.com.hawlab.data_structures.set;

import java.util.HashSet;
import java.util.Set;

public class DataStructureHashSet {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (HashSet)");

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Banana"); // Elemento Duplicado Ignorado

        // Iteração e Operações Básicas
        hashSet.forEach(System.out::println);

        // Verificação de Existência
        if (hashSet.contains("Apple")) {
            System.out.println("Contém Apple");
        }

        // Remoção
        hashSet.remove("Banana");
        System.out.println("Após Remoção: " + hashSet);

        // Conversão para Array
        String[] array = hashSet.toArray(new String[0]);
        System.out.println("Array: " + java.util.Arrays.toString(array));

        System.out.println("------------------------------------------");
    }
}
