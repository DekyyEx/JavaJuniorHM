package hm1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = IntStream.rangeClosed(0, 10)
                .boxed()
                .toList();
        System.out.println("\nИсходный список чисел: " + numbers);

        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .toList();
        System.out.println("\nСписок четных чисел: " + evenNumbers);

        double average = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToInt(i -> i)
                .average()
                .orElse(0);
        System.out.println("\nСреднее значение четных чисел: " + average);
    }
}
