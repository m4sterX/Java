package by.java.nkt.main;

import by.java.nkt.studentclass.Group;
import by.java.nkt.studentclass.Student;
import by.java.nkt.studentlogic.StudentLogic;

public class Main {
    public static void main(String[] args) {
        Group group1 = new Group(1);
        Group group2 = new Group(2);

        int[] marks = new int[]{10,9,10,9,5};
        int[] badMarks = new int[]{2,5,4,6,7};

        Student stud1 = new Student("Nikita", "Turovets", 1, marks);
        Student stud2 = new Student("Pasha", "Mitin", 1, badMarks);
        Student stud3 = new Student("Arseniy", "Mironov", 2, marks);
        Student stud4 = new Student("Gosha", "Tromp", 2, badMarks);

        Student[] students = new Student[]{stud1, stud2, stud3, stud4};
        StudentLogic logic = new StudentLogic();
        logic.showALevel(students);

    }
}
