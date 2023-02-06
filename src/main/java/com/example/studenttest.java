package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Logger;

class student {
    String name;
    int age;
    double gpa;

    student(String name, int age, double gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    
    public String getName(){
        return name;
    }
    public String getAge(){
        return Integer.toString(age);
    }
    public String getGpa(){
        return Double.toString(gpa);
    }
}

public class studenttest {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        List<student> studentList = new ArrayList<>();
        studentList.add(new student("Jeeva", 20, 8.5));
        studentList.add(new student("Pradeep", 21, 8.8));
        studentList.add(new student("Bala", 22, 9.2));

        for(student student:studentList){
            Log.info("Name: " + student.getName());
            Log.info("Age: " + student.getAge());
            Log.info("GPA: " + student.getGpa());
            //Log.info();
        }

        Collections.sort(studentList, new Comparator<student>() {
            @Override
            public int compare(student s1, student s2) {
                return s2.getGpa().compareTo(s1.getGpa());
            }
        });
        Log.info("After Sorting ");

        for(student student:studentList){
            Log.info("Name: " + student.getName());
            Log.info("GPA: " + student.getGpa());
            //Log.info();
        }
    }
}
