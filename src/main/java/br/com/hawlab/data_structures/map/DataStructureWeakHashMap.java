package br.com.hawlab.data_structures.map;

import java.util.Map;
import java.util.WeakHashMap;

public class DataStructureWeakHashMap {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (WeakHashMap)");

        Map<Object, String> weakHashMap = new WeakHashMap<>();
        Object key1 = new Object();
        Object key2 = new Object();

        weakHashMap.put(key1, "Value1");
        weakHashMap.put(key1, "Value1");
        weakHashMap.put(key2, "Value2");

        weakHashMap.forEach((key, value) -> System.out.println(key + ": " + value));

        key1 = null;

        System.gc();

        System.out.println("After GC: " + weakHashMap);

        System.out.println("------------------------------------------");
    }
}
