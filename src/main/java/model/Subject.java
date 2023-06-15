package model;

import java.util.ArrayList;

public class Subject {
    private int id;
    private String name;
    private float workload;

    private ArrayList<Professor> professors;
    private ArrayList<Classroom> classrooms;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWorkload() {
        return workload;
    }

    public void setWorkload(float workload) {
        if (workload > 0 ){
            this.workload = workload;
        }else {
            System.out.println("Invalid Number");
        }
    }

}
