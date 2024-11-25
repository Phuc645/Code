package com.hsu.lab06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentList {
    private ArrayList<Student> dsStudent = new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getDsStudent() {
        return dsStudent;
    }

    public void setDsStudent(ArrayList<Student> dsStudent) {
        this.dsStudent = dsStudent;
    }

    public void addStudent() {
        Student s = new Student();
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.format("Nhap ho sinh vien: ");
        s.lastName = sc.nextLine();
        System.out.format("Nhap ten sinh vien: ");
        s.firstName = sc.nextLine();
        System.out.format("Nhap nam sinh: ");
        s.birthYear = sc0.nextInt();
        System.out.format("Nhap diem GPA: ");
        s.gpa = sc1.nextFloat();
        dsStudent.add(s);
        sc.close();
        sc0.close();
        sc1.close();
    }

    public void sortbybirthYear() {
        Comparator<Student> sortBY = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.birthYear > s2.birthYear) {
                    return 1;
                } else if (s1.birthYear == s2.birthYear) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(dsStudent, sortBY);
    }

    public void sortByGPA() {
        Comparator<Student> sortGP = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.gpa > s2.gpa) {
                    return 1;
                } else if (s1.gpa == s2.gpa) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(dsStudent, sortGP);
        Collections.max(dsStudent, sortGP);
        Collections.min(dsStudent, sortGP);
    }

    public void sortByName() {
        Comparator<Student> sortN = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.firstName.compareTo(s2.firstName) > 0) {
                    return 1;
                } else if (s1.firstName.compareTo(s2.firstName) == 0) {
                    if (s1.lastName.compareTo(s2.lastName) > 0) {
                        return 1;
                    } else if (s1.lastName.compareTo(s2.lastName) == 0) {
                        return 0;
                    } else {
                        return -1;
                    }
                } else {
                    return -1;
                }
            }
        };
        Collections.sort(dsStudent, sortN);
    }


    public void Output() {
        for (Student st : dsStudent) {
            System.out.format(st.toString());
        }

    }

}
