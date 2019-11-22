package by.java.nkt.studentlogic;

import by.java.nkt.studentclass.Student;

public class StudentLogic {
    public boolean aLevelStudent(Student student) {
        int[] marks = student.getPerformance();
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 9) {
                return false;
            }
        }
        return true;
    }
    public Student[] arrOfALevel(Student[] students) {
        Student[] aLevel = new Student[students.length];
        int j = 0;
        for (int i = 0; i < students.length; i++) {
            if (aLevelStudent(students[i])) {
                aLevel[j] = students[i];
                j++;
            }
        }
        if(j!= 0){
            return aLevel;
        } else {
            Student[] notALevel = new Student[]{null};
            return notALevel;
        }
    }
    public void showALevel(Student[] students) {
        Student[] aLevel = arrOfALevel(students);
        if (aLevel[0] == null) {
            System.out.println("students not found");
        } else {
        for (int i = 0; i < aLevel.length; i++) {
            System.out.println(aLevel[i].getSurname() + " № of group: " + aLevel[i].getGroup());
            }
        }
    }
}
