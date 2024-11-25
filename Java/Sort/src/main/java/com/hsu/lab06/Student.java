package com.hsu.lab06;

public class Student {
    String lastName, firstName;
    int birthYear;
    float gpa;
    public Student() {
    }
    public Student(String lastName, String firstName, int birthYear, float gpa) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.gpa = gpa;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    @Override
    public String toString() {
        String S = String.format("%-20s%-20s%+20d%+20f\n",lastName,firstName,birthYear,gpa);
        return S;     
    }
}
