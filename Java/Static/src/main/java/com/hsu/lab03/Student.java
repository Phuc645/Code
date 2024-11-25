package com.hsu.lab03;

public class Student {
    private int id;
    private String name;
    private static int numberOfStudents = 0;
    public Student (String name){
    this.id = ++numberOfStudents;
    this.name = name;
    }
    public void output () {
        System.out.println("Ten: "+name);
        System.out.println("ID: "+id);
    }
    public int getId() {
        return id;
    }
}
