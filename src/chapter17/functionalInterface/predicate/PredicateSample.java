package chapter17.functionalInterface.predicate;

import java.util.List;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        Predicate<String> predicate = (word)->word.length()==5;
        boolean result = predicate.test("hello");
        System.out.println(result);

        List<Person> people = List.of(
                new Person(24, "tom"),
                new Person(12, "Billy"),
                new Person(40, "Jerry"),
                new Person(95, "Donald"));
        //Predicate<Person> pred = (person)->person.getAge()>30;
        people.stream()
                .filter((person) ->person.getAge()==30)
                .forEach(person -> System.out.println(person));
    }
}
