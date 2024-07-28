package br.com.hawlab.data_structures.list;

import java.util.LinkedList;

public class DataStructureLinkedList {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (LinkedList)");

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
        }

        linkedList.addFirst(-1);
        linkedList.addLast(10);

        System.out.println("LinkedList Após Adições: " + linkedList);
        System.out.println("Primeiro Elemento: " + linkedList.getFirst());
        System.out.println("Último Elemento: " + linkedList.getLast());

        linkedList.removeFirst();
        linkedList.removeLast();

        System.out.println("LinkedList Após Remoções: " + linkedList);

        // Iteração Reversa
        linkedList.descendingIterator().forEachRemaining(System.out::println);

        System.out.println("------------------------------------------");
    }
}
