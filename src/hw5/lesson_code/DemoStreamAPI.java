package hw5.lesson_code;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class DemoStreamAPI {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8);

        System.out.println("Classic approach: ");
        demoWithClassicApproach(numbers);

        System.out.println("StreamAPI approach: ");
        demoWithStreamApiApproach(numbers);

        System.out.println("StreamAPI terminal operations demo: ");
        demoStreamTerminalOperations(numbers);

        System.out.println("StreamAPI intermediate operations demo:");
        demoStreamIntermediateOperations(numbers);
        
        List<Person> people = List.of(
                new Person(1, "Yukisa", 19, List.of("fencing", "drawing")),
                new Person(2, "Lacus", 20, List.of("music", "singing")),
                new Person(3, "Lutikoria", 19, List.of("chess", "medicine")),
                new Person(4, "Dalia", 22, List.of("fencing", "dogs")),
                new Person(5, "Vi", 18, List.of("tea", "fencing"))
        );

        System.out.println("Letters count in people names: " + countLetters(people));
        System.out.println("Unique letters: " + uniqueLetters(people));
        System.out.println("All hobbies: " + allHobbies(people));

        Map<String, Person> peopleByName = groupPeopleByName(people);
        System.out.println("People by name: " + peopleByName);

        double midAge = peopleByName.entrySet().stream()
                .map(Map.Entry::getValue)
                .mapToDouble(Person::getAge)
                .average().orElse(0);
        System.out.println("People mid age is " + midAge);
    }

    private static Map<String, Person> groupPeopleByName(List<Person> people) {
        return people.stream().collect(toMap(Person::getName, identity()));
    }


    private static List<String> allHobbies(List<Person> people) {
        return people.stream()
                .flatMap(person -> person.getHobbies().stream())
                .distinct()
                .toList();
    }

    private static Set<Character> uniqueLetters(List<Person> people) {
        return people.stream()
                .map(Person::getName)
                .flatMap(personName -> personName.chars().mapToObj(i -> (char) i))
                .collect(toSet());
    }

    private static int countLetters(List<Person> people) {
        return people.stream()
                .map(Person::getName)
                .mapToInt(String::length)
                .sum();

    }

    private static void demoStreamIntermediateOperations(List<Integer> numbers) {
        List<Integer> squareNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * number)
                .toList();
        System.out.println(squareNumbers);
    }

    private static void demoStreamTerminalOperations(List<Integer> numbers) {
        Stream<Integer> streamOfNumbers = numbers.stream();

//        numbers.forEach(System.out::print);

        Double averageValue = numbers.stream()
                .collect(averagingDouble(number -> number));
        System.out.println("Average value: " + averageValue);

        Set<Integer> uniqueNumbers = new HashSet<>(numbers); // HashSet
        System.out.println("Unique numbers: " + uniqueNumbers);

        Integer sum = numbers.stream().reduce((number1, number2) -> number1 + number2)
                .orElse(0); //29
        Integer sum2 = numbers.stream().reduce(10, (n1, n2) -> n1 + n2); //39
        System.out.println("Sum with reduce: " + sum);
        System.out.println("Sum with reduce and initial value as 10: " + sum2);

        Integer maxValue = numbers.stream()
                .max(Comparator.comparingInt(n -> n)).orElse(-1);
        System.out.println("Max value: " + maxValue);
    }

    private static void demoWithStreamApiApproach(List<Integer> numbers) {
        List<Integer> numberSquares = numbers.stream()
                .distinct()
                .map(number -> number * number)
                .toList();
        System.out.println(numberSquares);

    }

    private static void demoWithClassicApproach(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new LinkedList<>();

        for (int number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }

        List<Integer> numberSquares = new ArrayList<>(uniqueNumbers.size());

        for (int uniqueNumber : uniqueNumbers) {
            int square = uniqueNumber * uniqueNumber;
            numberSquares.add(square);
        }

        System.out.println(numberSquares);
    }
}
