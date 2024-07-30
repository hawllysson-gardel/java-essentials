package br.com.hawlab.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lambdas {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Lambdas");
        System.out.println("------------------------------------------");

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe");

        names.forEach(name -> System.out.println(name));
        Runnable task = () -> System.out.println("Task is running in a separate thread.");
        Comparator<String> reverseOrder = (s1, s2) -> s2.compareTo(s1);
        Function<String, String> toUpperCase = s -> s.toUpperCase();
        Predicate<String> isLongerThanFive = s -> s.length() > 5;
        Consumer<String> printElement = s -> System.out.println(s);

        System.out.println("------------------------------------------");
    }
}
