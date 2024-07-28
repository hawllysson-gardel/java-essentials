package br.com.hawlab.data_structures.map;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class DataStructureConcurrentHashMap {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (ConcurrentHashMap)");

        ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();

        Thread addThread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                concurrentMap.put("Thread1-" + i, i);
            }
        });

        Thread addThread2 = new Thread(() -> {
            for (int i = 100; i < 200; i++) {
                concurrentMap.put("Thread2-" + i, i);
            }
        });

        Thread removeThread2 = new Thread(() -> {
            for (int i = 100; i < 200; i++) {
                concurrentMap.remove("Thread2-" + i);
            }
        });

        addThread1.start();
        addThread2.start();
        removeThread2.start();

        try {
            addThread1.join();
            addThread2.join();
            removeThread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }

        System.out.println("Final State of ConcurrentHashMap:");
        concurrentMap.forEach((key, value) -> System.out.println(key + ": " + value));

        System.out.println("------------------------------------------");
    }
}
