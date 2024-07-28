package br.com.hawlab.data_structures.strings;

public class DataStructureStringBuffer {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (StringBuffer)");

        StringBuffer sbf = new StringBuffer("Hello");

        // Concatenação
        sbf.append(", ").append("World!");
        System.out.println("Append: " + sbf.toString());

        // Inserção
        sbf.insert(5, " Java");
        System.out.println("Inserção: " + sbf.toString());

        // Substituição
        sbf.replace(5, 10, " Amazing");
        System.out.println("Substituição: " + sbf.toString());

        // Deleção
        sbf.delete(5, 13);
        System.out.println("Deleção: " + sbf.toString());

        // Reversão
        sbf.reverse();
        System.out.println("Reversão: " + sbf.toString());
        sbf.reverse(); // Revertendo para o estado original

        // Capacidade e Redimensionamento
        int capacity = sbf.capacity();
        System.out.println("Capacidade: " + capacity);
        sbf.ensureCapacity(100);
        System.out.println("Nova capacidade: " + sbf.capacity());

        System.out.println("------------------------------------------");
    }
}
