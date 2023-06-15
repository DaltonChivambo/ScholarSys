package model;

import java.util.ArrayList;

public class Classroom {
    private int id;
    private String acronym;
    private int year;

    private ArrayList<Student> students;
    private ArrayList<Professor> professors;
    private ArrayList<Subject> subjects;

    public Classroom(){
        students = new ArrayList<>();
        professors = new ArrayList<>();
        subjects = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
    }
    public int numberOfStudents(){
        return students.size();
    }

    public void removeStudent(Student student){
        students.remove(student);
    }
    public Student getStudent(int position){
        return students.get(position);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
