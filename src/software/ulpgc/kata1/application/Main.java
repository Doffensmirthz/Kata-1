package software.ulpgc.kata1.application;

import software.ulpgc.kata1.Person;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Cristiano", "Ronaldo", LocalDate.of(1985,2,5));
        System.out.println(p);
    }
}
