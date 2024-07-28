package br.com.hawlab.data_structures.set;

import java.util.EnumSet;

public class DataStructureEnumSet {
    enum Fruit {
        APPLE, BANANA, ORANGE, GRAPE
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (EnumSet)");

        EnumSet<Fruit> enumSet = EnumSet.of(Fruit.APPLE, Fruit.BANANA);

        // Adição de Elementos
        enumSet.add(Fruit.ORANGE);

        // Iteração e Operações Básicas
        enumSet.forEach(System.out::println);

        // Operações Adicionais com EnumSet
        EnumSet<Fruit> complementSet = EnumSet.complementOf(enumSet);
        System.out.println("Complemento: " + complementSet);

        EnumSet<Fruit> rangeSet = EnumSet.range(Fruit.BANANA, Fruit.GRAPE);
        System.out.println("Intervalo: " + rangeSet);

        System.out.println("------------------------------------------");
    }
}
