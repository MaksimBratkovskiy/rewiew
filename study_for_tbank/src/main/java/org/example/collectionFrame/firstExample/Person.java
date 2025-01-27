package org.example.collectionFrame.firstExample;

import java.util.ArrayList;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE;
    }

    String name;
    int age;
    Sex gender;
    String emailAddress;

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String emailAddress(){
        return emailAddress;
    }

    public Sex getGender(){
        return gender;
    }

    public static void main(String[] args) {
        List<Person> roster = new ArrayList<>();

        for (Person p : roster) {
            System.out.println(p.getName());
        }

        roster
                .stream()
                .filter(e -> e.getGender() == Sex.FEMALE)
                .forEach(e -> System.out.println(e.getName()));

        double doubleRoster = roster
                .stream()
                .filter(e -> e.getGender() == Sex.MALE)
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();


    }

}
