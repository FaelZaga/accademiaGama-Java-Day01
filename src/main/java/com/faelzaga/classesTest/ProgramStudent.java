package main.java.com.faelzaga.classesTest;

import main.java.com.faelzaga.classesTest.entities.Student;

public class ProgramStudent {

    public static void main(String[] args) {

        Student student = new Student("Fulano",20);

        System.out.println(student);

        student.happyBirthday();
        student.happyBirthday();
        student.happyBirthday();
        student.happyBirthday();
        student.happyBirthday();

        System.out.println(student);
    }
}
