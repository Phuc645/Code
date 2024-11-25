/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tuan1;

import java.util.Scanner;

/**
 *
 * @author Ph636
 */
public class Baitap07 {
      public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Nhap so a: ");
        int a = sc.nextInt();
        System.out.println("Nhap so b: ");
        int b = sc.nextInt();
        System.out.println("Nhap so c: ");
        int c = sc.nextInt();
        double d;
        d = Math.pow(b,2) - 4*a*c;
        if (d < 0){
        System.out.println("Phuong trinh vo nghiem");   
        } else if (d == 0){
        System.out.println("Phuong trinh co nghiem kep: " +(-b/(2*a))); 
        } else {
        double x = (-b + Math.sqrt(d)) / (a*2);
        double y = (-b - Math.sqrt(d)) / (a*2);
        System.out.println("Phuong trinh co nghiem thu nhat: \n" +x);
        System.out.println("Phuong trinh co nghiem thu hai: " +y);
        sc.close();
        }
      }
}
