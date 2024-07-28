package br.com.hawlab.data_structures.list;

import java.util.Stack;
import java.util.Vector;

public class DataStructureStack {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (Stack)");

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < 10; i++) {
            stack.push(i);
        }

        // Operações de Pilha
        System.out.println("Topo da Pilha: " + stack.peek());
        System.out.println("Elemento Desempilhado: " + stack.pop());

        // Verificação de Elementos
        boolean containsFive = stack.contains(5);
        System.out.println("A pilha Contém 5? " + containsFive);

        // Busca de Elementos (Retorna a Posição a Partir do Topo)
        int position = stack.search(5);
        System.out.println("Posição do Elemento 5: " + position);

        // Iteração
        stack.forEach(System.out::println);

        System.out.println("------------------------------------------");
    }
}
