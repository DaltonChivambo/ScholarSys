package model;

import java.util.ArrayList;

public class Professor extends Person{
    private String academicEducation;
    private float salary;
    private ArrayList<Subject> subjects;
    private ArrayList<Classroom> classrooms;


    public String getAcademicEducation() {
        return academicEducation;
    }

    public void setAcademicEducation(String academicEducation) {
        this.academicEducation = academicEducation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    void applyAssessment(){

    }
}
