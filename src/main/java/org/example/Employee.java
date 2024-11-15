package org.example;

public class Employee extends Person {
    private String name;
    private int salary;
    private Occupation occupation;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
        this.occupation = Occupation.values()[0];
        System.out.println("Utworzono pracownika " + name);
    }

    public void Promote() {
        Occupation[] values = Occupation.values();
        int index = occupation.ordinal();
        if (index < values.length - 1) {
            Occupation previous = occupation;
            occupation = values[index + 1];
            System.out.println("awansowano z " + previous + " na " + occupation);
        } else {
            System.out.println("Osiągnięto max poziom awansu");
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salary=" + salary +
                ", occupation=" + occupation;
    }
}
