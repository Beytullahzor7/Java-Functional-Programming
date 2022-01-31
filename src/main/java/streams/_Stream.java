package streams;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Anna", FEMALE),
                new Person("Maria", FEMALE),
                new Person("Amy", FEMALE),
                new Person("Alexsa", PREFER_NOT_TO_SAY)
        );

       /* Set<Gender> genders = people.stream() //Set = single datas (MALE, FEMALE)
                .map(person -> person.gender)
                .collect(Collectors.toSet());

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println); */

        Predicate<Person> PersonPredicate = person -> FEMALE.equals(person.gender);

        boolean containsOnlyFemales =  people.stream()
                .anyMatch(PersonPredicate); //at least one female then it will return true

        boolean containsOnlyFemales2 =  people.stream()
                .allMatch(PersonPredicate); //all of them should be same gender to return true

        boolean containsOnlyFemales3 =  people.stream()
                .noneMatch(PersonPredicate); //gender does not contain anything to return true

        System.out.println(containsOnlyFemales);

    }


    static class Person{
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

    enum Gender{
        MALE, FEMALE, PREFER_NOT_TO_SAY;
    }
}
