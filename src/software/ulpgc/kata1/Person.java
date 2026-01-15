package software.ulpgc.kata1;

import java.time.LocalDate;

public class Person {
    private final String name;
    private final String surname;
    private final LocalDate birthDate;

    public Person(String name, String surname, LocalDate birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int age(){
        return toYears(LocalDate.now().toEpochDay() - birthDate.toEpochDay());

    }

    private int toYears(long epochDays) {
        return (int) (epochDays / 365.25);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDate +
                ", age=" + age() +
                '}';
    }
}
