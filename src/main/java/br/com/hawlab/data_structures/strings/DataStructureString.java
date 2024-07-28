package br.com.hawlab.data_structures.strings;

public class DataStructureString {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Data Structures (String)");

        String str = "Hello, World!";

        // Concatenação
        String str2 = str + " How are you?";
        System.out.println("Concatenação: " + str2);

        // Substring
        String substr = str.substring(7, 12);
        System.out.println("Substring: " + substr);

        // Substituição
        String replaced = str.replace("World", "Java");
        System.out.println("Substituição: " + replaced);

        // Split
        String[] words = str.split(", ");
        System.out.println("Split: ");
        for (String word : words) {
            System.out.println(word);
        }

        // Comparação
        boolean equals = str.equals("Hello, World!");
        System.out.println("Igualdade: " + equals);

        // Comparação Ignorando Case
        boolean equalsIgnoreCase = str.equalsIgnoreCase("hello, world!");
        System.out.println("Igualdade ignorando case: " + equalsIgnoreCase);

        // Conversão para Maiúsculas e Minúsculas
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        System.out.println("Maiúsculas: " + upper);
        System.out.println("Minúsculas: " + lower);

        // Trim
        String trimmed = "   Espaços em branco   ".trim();
        System.out.println("Trim: '" + trimmed + "'");

        System.out.println("------------------------------------------");
    }
}
