package br.com.hawlab.data_structures.set;

import java.util.Comparator;
import java.util.TreeSet;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class DataStructureTreeSet {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (TreeSet)");

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Orange");
        treeSet.add("Banana"); // Elemento Duplicado Ignorado

        // Iteração e Operações Básicas
        treeSet.forEach(System.out::println);

        // Operações Adicionais com TreeSet
        System.out.println("Primeiro Elemento: " + treeSet.first());
        System.out.println("Último Elemento: " + treeSet.last());

        // Subconjunto
        TreeSet<String> subSet = (TreeSet<String>) treeSet.subSet("Apple", "Orange");
        System.out.println("Subconjunto: " + subSet);

        Comparator<Person> nameComparator = Comparator.comparing(Person::getName);

        TreeSet<Person> personTreeSet = new TreeSet<>(nameComparator);
        personTreeSet.add(new Person("Alice", 30));
        personTreeSet.add(new Person("Charlie", 35));
        personTreeSet.add(new Person("Bob", 25));

        personTreeSet.forEach(System.out::println);

        System.out.println("------------------------------------------");
    }
}
