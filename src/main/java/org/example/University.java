package org.example;

import java.util.Arrays;
import java.util.List;

public class University {
    public static void main(String[] args) {
        System.out.println("Utworzenie Tablicy osób");
        Person[] People = new Person[5];
        Student Student1 = new Student("Nowak", Vocation.informatyka);
        Student Student2 = new Student("Kowalska", Vocation.telekomunikacja);
        Student Student3 = new Student("Biernacki", Vocation.matematyka);
        People[0] = Student1;
        People[1] = Student2;
        People[2] = Student3;
        
        Employee employee1 = new Employee("Janusz", 7000);
        Employee employee2 = new Employee("Helga", 7000);
        
        People[3] = employee1;
        People[4] = employee2;

        printAllStudents(People);
        printAllEmployess(People);
        addGradeToAllStudents(People, (short) 6);
        printAllStudents(People);
        printAllEmployess(People);

    }

    private static void printAllStudents(Person[] people) {
        for (Person person: people) {
            if (person instanceof Student)
            System.out.println(person.toString());
        }
    }
    private static void printAllEmployess(Person[] people) {
        for (Person person: people) {
            if (person instanceof Employee)
                System.out.println(person.toString());
        }
    }
    private static void addGradeToAllStudents(Person[] People, short grade) {
        for (Person person : People) {
            if (person instanceof Student) {
                ((Student) person).addGrade(grade);
            }
        }
    }

}