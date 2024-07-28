package br.com.hawlab.data_structures.map;

import java.util.HashMap;
import java.util.Map;

public class DataStructureHashMap {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (HashMap)");

        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 30);
        hashMap.put("Bob", 25);
        hashMap.put("Charlie", 35);
        hashMap.put("Charlie", 30); // Chave com Valor Duplicado

        // Iteração e Operações Básicas
        hashMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // Operações Adicionais
        System.out.println("Size: " + hashMap.size());
        System.out.println("Contains Key 'Alice': " + hashMap.containsKey("Alice"));
        System.out.println("Value for 'Bob': " + hashMap.get("Bob"));
        hashMap.remove("Charlie");
        System.out.println("After Removal: " + hashMap);

        System.out.println("------------------------------------------");
    }
}
