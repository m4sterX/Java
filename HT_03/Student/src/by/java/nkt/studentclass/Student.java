package by.java.nkt.studentclass;

import by.java.nkt.studentlogic.StudentLogic;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String name;
    private String surname;

    private static final int PERFORMANCE_COUNT = 5;

    private int group;

    public Student(String name, String surname, int group, int[] performance) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.performance = performance;
    }

    private int[] performance = new int[PERFORMANCE_COUNT];

    public Student() {
        name = "Not set";
        surname = "Not set";
        group = 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return group == student.group &&
                Objects.equals(name, student.name) &&
                Objects.equals(surname, student.surname) &&
                Arrays.equals(performance, student.performance);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, group);
        result = 31 * result + Arrays.hashCode(performance);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int[] getPerformance() {
        return performance;
    }

    public void setPerformance(int[] performance) {
        int[] arr = new int[this.PERFORMANCE_COUNT];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            arr[i] = performance[j];
        }
    }
    public void setPerformance(int a, int b, int c, int d, int e) {
        int[] arr = new int[this.PERFORMANCE_COUNT];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;
        arr[4] = e;

    }

}
