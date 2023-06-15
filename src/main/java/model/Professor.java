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

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Classroom> getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(ArrayList<Classroom> classrooms) {
        this.classrooms = classrooms;
    }

    void applyAssessment(){

    }
}
