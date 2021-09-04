package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Daniel", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Walther", MALE),
                new Person("Samuel", MALE)
        );

        List<Person> females = new ArrayList<>();

//        System.out.println("Imperative approach");
//        for (Person person : people) {
//            if (FEMALE.equals(person.gender)) {
//                females.add(person);
//            }
//        }
//
//        for (Person female : females) {
//            if (FEMALE.equals(female.gender)) {
//                System.out.println(female);
//                ;
//            }
//        }


        /*
         * Predicate<T>: Represents a predicate (boolean-valued) of one argument
         * Predicate interface represents a simple function that takes a single value as parameter
         * and returns true or false based on the condition
         * */
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        System.out.println("Declarative approach");
        List<Person> females2 = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());
        females2.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
