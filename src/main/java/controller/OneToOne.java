package controller;

import model.Classroom;
import model.Student;

import java.util.Date;

public class OneToOne {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();
        classroom.setAcronym("Soft Engineering");
        classroom.setYear(1);

        Student student = new Student();
        student.setName("Dalton Chivambo");
        student.setEnrollment(20202436);
        student.setBirthDate(new Date());
        student.setClassroom(classroom);

        Student student2 = new Student();
        student2.setName("Kenny Massingue");
        student2.setEnrollment(30002456);
        student2.setBirthDate(new Date());
        student2.setClassroom(classroom);

        System.out.println(student.getBirthDate());
        System.out.println(student.getClassroom().getAcronym());
        System.out.println(student.getEnrollment());

    }
}
