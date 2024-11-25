package com.hsu.e01;
import java.util.Scanner;
public class baitap11 {
    public static void main(String[] args) {
        double diem;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem sinh vien: ");
        diem = sc.nextDouble();
        if (diem == 4) 
        System.out.println("A");
        else if (diem >=3.5)
        System.out.println("B+");
        else if (diem >=3.2)
        System.out.println("B");
        else if (diem >=2.5)
        System.out.println("C+");
        else if (diem >=2)
        System.out.println("C");
        else if (diem >=1.5)
        System.out.println("D+");
        else if (diem >=1)
        System.out.println("D");
        else 
        System.out.println("F");
        sc.close();
    }
}


