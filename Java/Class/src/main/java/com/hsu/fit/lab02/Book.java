/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.fit.lab02;
import java.util.Scanner;

/**
 *
 * @author Ph636
 */
public class Book {
    //fields
    String name;
    String author;
    int year;
    int number;
    //constructors
    
    //methods
    public void Input () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sach: ");
        name = sc.nextLine();
        System.out.println("Nhap ten tac gia: ");
        author = sc.nextLine();
        Scanner sc0 = new Scanner(System.in);
        System.out.println("Nhap nam xuat ban: ");
        year = sc0.nextInt();
        System.out.println("Nhap so trang: ");
        number = sc0.nextInt();
        sc.close();
        sc0.close();
    }
    public void Output () {
        System.out.println(name+" - "+author+" - "+year+" - "+number+".");
    }  
}
