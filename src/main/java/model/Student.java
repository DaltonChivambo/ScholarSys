package model;

import java.util.Date;

public class Student extends Person{
    private Date birthDate;
    private Classroom classroom;

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    void studentEvaluation(){

    }
}
