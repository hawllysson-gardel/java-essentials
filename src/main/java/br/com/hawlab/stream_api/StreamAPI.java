package br.com.hawlab.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("Java Essentials: Stream API");
        System.out.println("------------------------------------------");

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Doe", "Doe");

        System.out.println("Stream API: Filter (Filtragem)");
        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(filteredNames);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: Map (Mapeamento)");
        List<Integer> nameLengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(nameLengths);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: Reduce (Redução)");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println(sum);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: ForEach (Iteração)");
        names.stream().forEach(System.out::println);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: Collect (Coleta)");
        Set<String> nameSet = names.stream().collect(Collectors.toSet());
        System.out.println(nameSet);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: Sorted (Ordenação)");
        List<String> sortedNames = names.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNames);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: Limit (Limitação)");
        List<String> limitedNames = names.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(limitedNames);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: Skip (Pular Elementos)");
        List<String> skippedNames = names.stream()
                .skip(2)
                .collect(Collectors.toList());
        System.out.println(skippedNames);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: Distinct (Distinto)");
        List<String> distinctNames = names.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(distinctNames);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: FindFirst (Busca)");
        Optional<String> firstName = names.stream()
                .findFirst();
        System.out.println(firstName.orElse("No name found"));
        System.out.println("------------------------------------------");

        System.out.println("Stream API: AllMatch (Match)");
        boolean allStartWithJ = names.stream()
                .allMatch(name -> name.startsWith("J"));
        System.out.println(allStartWithJ);
        System.out.println("------------------------------------------");

        System.out.println("Stream API: Peek");
        names.stream()
                .peek(name -> System.out.println("Processing: " + name))
                .collect(Collectors.toList());
        System.out.println("------------------------------------------");

        System.out.println("Stream API: Parallel Stream");
        List<String> filteredParallelNames = names.parallelStream()
                .filter(name -> name.startsWith("J"))
                .collect(Collectors.toList());
        System.out.println(filteredParallelNames);
        System.out.println("------------------------------------------");
    }
}
