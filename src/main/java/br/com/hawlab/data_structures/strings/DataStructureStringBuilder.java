package br.com.hawlab.data_structures.strings;

public class DataStructureStringBuilder {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (StringBuilder)");

        StringBuilder sb = new StringBuilder("Hello");

        // Concatenação
        sb.append(", ").append("World!");
        System.out.println("Append: " + sb.toString());

        // Inserção
        sb.insert(5, " Java");
        System.out.println("Inserção: " + sb.toString());

        // Substituição
        sb.replace(5, 10, " Amazing");
        System.out.println("Substituição: " + sb.toString());

        // Deleção
        sb.delete(5, 13);
        System.out.println("Deleção: " + sb.toString());

        // Reversão
        sb.reverse();
        System.out.println("Reversão: " + sb.toString());

        sb.reverse();

        // Capacidade e Redimensionamento
        int capacity = sb.capacity();
        System.out.println("Capacidade: " + capacity);
        sb.ensureCapacity(100);
        System.out.println("Nova Capacidade: " + sb.capacity());

        System.out.println("------------------------------------------");
    }
}
