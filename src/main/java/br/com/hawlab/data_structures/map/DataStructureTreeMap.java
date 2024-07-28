package br.com.hawlab.data_structures.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class DataStructureTreeMap {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (TreeMap)");

        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);

        TreeMap<Person, Integer> treeMap = new TreeMap<>(nameComparator);

        treeMap.put(new Person("Diana"), 28);
        treeMap.put(new Person("Alice"), 30);
        treeMap.put(new Person("Bob"), 25);
        treeMap.put(new Person("Charlie"), 35);
        treeMap.put(new Person("Charlie"), 35);

        System.out.println("TreeMap Ordered by Name:");
        for (Map.Entry<Person, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("------------------------------------------");
    }
}
