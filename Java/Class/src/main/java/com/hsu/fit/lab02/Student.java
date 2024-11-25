/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.fit.lab02;
import java.util.Scanner;

/**
 *
 * @author Phuc
 */
public class Student {
    //fields
    String ms;
    String ht;
    int ns,t;
    //constructors
    public Student (){
    }
    public Student (String ms, String ht, int ns){
        this.ms = ms;   
        this.ht = ht; 
        this.ns = ns; 
    }
    //methods
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma so: ");
        ms = sc.nextLine();
        System.out.println("Nhap ho va ten: ");
        ht = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap nam sinh: ");
        ns = sc1.nextInt();
        sc.close();
        sc1.close();
    }
    public void calculate() {
        t = 2024 - ns;
    }    
    public void output (){
        System.out.println("Ma so: " +ms);
        System.out.println("Ho ten: " +ht);
        System.out.println("Tuoi hien tai: " +t);
    }
}
