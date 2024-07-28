package br.com.hawlab.data_structures.set;

import java.util.concurrent.CopyOnWriteArraySet;

public class DataStructureCopyOnWriteArraySet {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (CopyOnWriteArraySet)");

        CopyOnWriteArraySet<String> cowSet = new CopyOnWriteArraySet<>();
        cowSet.add("Apple");
        cowSet.add("Banana");
        cowSet.add("Orange");
        cowSet.add("Banana"); // Elemento Duplicado Ignorado

        // Iteração e Operações Básicas
        cowSet.forEach(System.out::println);

        // Operações Adicionais com CopyOnWriteArraySet
        Thread thread1 = new Thread(() -> {
            cowSet.add("Grape");
            System.out.println("Thread 1: Adicionou Grape");
        });

        Thread thread2 = new Thread(() -> {
            cowSet.remove("Banana");
            System.out.println("Thread 2: Removeu Banana");
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }

        System.out.println("Conjunto Final: " + cowSet);

        System.out.println("------------------------------------------");
    }
}
