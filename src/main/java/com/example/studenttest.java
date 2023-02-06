package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Logger;

class STUDENT {
    String name;
    int age;
    double gpa;

    STUDENT(String name, int age, double gpa){
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

public class STUDENTTEST {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public static void main(String[] args) {
        String name;
        int age;
        double gpa;
        List<STUDENT> studentList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        Log.info("How many student details you want to enter:");
        int x = sc.nextInt();
        for(int i = 0;i<x;i++){
            Log.info("Enter Student Name, Age, GPA");
            name = sc.next();
            age = sc.nextInt();
            gpa = sc.nextDouble();
            studentList.add(new STUDENT(name,age,gpa));
        }
        sc.close();
        for(STUDENT student:studentList){
            Log.info("Name: " + student.getName());
            Log.info("Age: " + student.getAge());
            Log.info("GPA: " + student.getGpa());
        }

        Collections.sort(studentList, new Comparator<STUDENT>() {
            @Override
            public int compare(STUDENT s1, STUDENT s2) {
                return s2.getGpa().compareTo(s1.getGpa());
            }
        });
        Log.info("After Sorting ");

        for(STUDENT student:studentList){
            Log.info("Name: " + student.getName());
            Log.info("GPA: " + student.getGpa());
        }
    }
}
