package br.com.hawlab.interfaces.functional;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.*;

public class Functional {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Functional Interfaces");
        System.out.println("------------------------------------------");

        System.out.println("Functional Interface: Function");
        Function<Integer, String> intToString = i -> "Number: " + i;
        System.out.println(intToString.apply(5));
        System.out.println("------------------------------------------");

        System.out.println("Functional Interface: Supplier");
        Supplier<String> stringSupplier = () -> "Hello, World!";
        System.out.println(stringSupplier.get());
        System.out.println("------------------------------------------");

        System.out.println("Functional Interface: Consumer");
        Consumer<String> printConsumer = s -> System.out.println(s);
        printConsumer.accept("Hello, Consumer!");
        System.out.println("------------------------------------------");

        System.out.println("Functional Interface: Predicate");
        Predicate<Integer> isEven = i -> i % 2 == 0;
        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));
        System.out.println("------------------------------------------");

        System.out.println("Functional Interface: Comparator");
        String[] words = {"apple", "banana", "cherry"};
        Comparator<String> lengthComparator = (s1, s2) -> Integer.compare(s1.length(), s2.length());
        Arrays.sort(words, lengthComparator);
        System.out.println(Arrays.toString(words));
        System.out.println("------------------------------------------");

        System.out.println("Functional Interface: UnaryOperator");
        UnaryOperator<Integer> square = i -> i * i;
        System.out.println(square.apply(5));
        System.out.println("------------------------------------------");

        System.out.println("Functional Interface: BinaryOperator");
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println(sum.apply(2, 3));
        System.out.println("------------------------------------------");
    }
}
