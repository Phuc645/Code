package com.hsu.lab03;

public class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student("Tom");
        Student s2 = new Student("Anna");
        Student s3 = new Student("Daisy");
        s1.output();
        s2.output();
        s3.output();
        System.out.println("Tong so hoc sinh: "+s3.getId());
    }
}
