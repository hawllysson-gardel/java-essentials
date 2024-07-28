package br.com.hawlab.data_structures.list;

import java.util.Vector;

public class DataStructureVector {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (Vector)");

        Vector<String> vector = new Vector<>();
        vector.add("Red");
        vector.add("Blue");
        vector.add("Green");
        vector.add("Yellow");

        // Sincronização Explícita
        synchronized (vector) {
            vector.forEach(System.out::println);
        }

        // Capacidade e Incremento
        System.out.println("Capacidade Inicial: " + vector.capacity());
        vector.ensureCapacity(20);
        System.out.println("Capacidade Após EnsureCapacity: " + vector.capacity());

        // Adição
        vector.insertElementAt("Purple", 2);
        System.out.println("Vector Após Inserção: " + vector);

        // Acesso e Modificação
        String color = vector.elementAt(3);
        System.out.println("Elemento na Posição 3: " + color);
        vector.setElementAt("Orange", 3);
        System.out.println("Vector Após Modificação: " + vector);

        System.out.println("------------------------------------------");
    }
}
