package br.com.hawlab.data_structures.map;

import java.util.EnumMap;
import java.util.Map;

public class DataStructureEnumMap {
    public enum Fruit {
        APPLE, BANANA, ORANGE, GRAPE
    }

    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (EnumMap)");

        Map<Fruit, Integer> enumMap = new EnumMap<>(Fruit.class);
        enumMap.put(Fruit.APPLE, 5);
        enumMap.put(Fruit.BANANA, 3);
        enumMap.put(Fruit.ORANGE, 8);
        enumMap.put(Fruit.ORANGE, 8);
        enumMap.put(Fruit.GRAPE, 2);

        enumMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("Size: " + enumMap.size());
        System.out.println("Contains Key 'APPLE': " + enumMap.containsKey(Fruit.APPLE));
        System.out.println("Value for 'ORANGE': " + enumMap.get(Fruit.ORANGE));
        enumMap.remove(Fruit.BANANA);
        System.out.println("After Removal: " + enumMap);

        System.out.println("------------------------------------------");
    }
}
