package br.com.hawlab.data_structures.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class DataStructureLinkedHashMap {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (LinkedHashMap)");

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Alice", 30);
        linkedHashMap.put("Bob", 25);
        linkedHashMap.put("Bob", 25);
        linkedHashMap.put("Charlie", 35);
        linkedHashMap.put("Diana", 30);

        // Iteração Mantém a Ordem de Inserção
        linkedHashMap.forEach((key, value) -> System.out.println(key + ": " + value));

        // Operações Adicionais
        System.out.println("Size: " + linkedHashMap.size());
        System.out.println("Contains Key 'Bob': " + linkedHashMap.containsKey("Bob"));
        System.out.println("Value for 'Diana': " + linkedHashMap.get("Diana"));
        linkedHashMap.remove("Alice");
        System.out.println("After Removal: " + linkedHashMap);

        System.out.println("------------------------------------------");
    }
}
