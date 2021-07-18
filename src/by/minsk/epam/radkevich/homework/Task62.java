package by.minsk.epam.radkevich.homework;

import by.minsk.epam.radkevich.practice.vechicle.Car;
import by.minsk.epam.radkevich.practice.vechicle.CarModel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Task62 {
    public static void main(String[] args) {
        String[] name = {"Петр", "Владислав", "Николай", "Дмитрий", "Илья"};
        String[] surname = {"Иванов", "Петров", "Сидоров", "Карчагин", "Череззаборногузадерищенко"};
        int age=0;
        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            Person person = new Person(name[ThreadLocalRandom.current().nextInt(0, 5)],surname[ThreadLocalRandom.current().nextInt(0, 5)],  age=ThreadLocalRandom.current().nextInt(15, 30));
            personList.add(person);
            //System.out.println(person.name + " " + person.surname  + " " + person.age);
        }

        personList.stream()
                .filter(x -> x.age < 21)

                .sorted(Comparator.comparing(Person::getSurname).thenComparing(Person::getName))
                .map(x -> x.name + " " + x.surname  + " " + x.age)
                .forEach(System.out::println);


    }


}

class Person {
    String name;
    String surname;
    int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


}