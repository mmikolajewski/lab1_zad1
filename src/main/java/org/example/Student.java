package org.example;

import java.util.Arrays;

public class Student extends Person{

    private static final double MIN_GRADE = 2;
    private static final double MAX_GRADE = 6;

    private long index;
    private double avgGrade;
    private Vocation vocation;
    private short[] grades;

    private static long indexNumerator;
    public Student(String name, Vocation vocation) {
        super(name);
        this.vocation = vocation;
        grades = new short[0];
        index = indexNumerator++;
        System.out.println("Utworzono studenta " + name);
    }

    public void addGrade(short grade) {
        if (grade < MIN_GRADE || grade > MAX_GRADE) {
            throw new IllegalArgumentException("Ocena musi byćw zakresie" + MIN_GRADE + " - " + MAX_GRADE);
        }
        grades = Arrays.copyOf(grades, grades.length+1);
        grades[grades.length -1] = grade;
        countAverageGrade();

    }

    private void countAverageGrade() {
        int sum = 0;
        for (short g : grades) {
            sum +=g;
        }
        avgGrade = (double) sum / grades.length;
    }

    public long getIndex() {
        return index;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public Vocation getVocation() {
        return vocation;
    }

    public short[] getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return super.toString() +
                " index=" + index +
                ", avgGrade=" + avgGrade +
                ", vocation=" + vocation +
                ", grades=" + Arrays.toString(grades);
    }
}
