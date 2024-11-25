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
public class Product {
    //fields
    String ma;
    String ten;
    String dv;
    double gia;
    int nam;
    int sl;
    double S;
    //constructors
    public Product (String ma, String ten, String dv, double gia, int nam) {
        this.ma = ma;
        this.ten = ten;
        this.dv = dv;
        this.gia = gia;
        this.nam = nam;  
    }
    // methods
    public void InputNumber (){
        System.out.println("Nhap so luong: ");
        Scanner sc = new Scanner(System.in);
        sl = sc.nextInt();
        sc.close();
    }
    public void Calculate () {
        S = sl*gia;
    }
    public void Output (){
        System.out.println(ma+";"+ten+";"+dv+";"+gia+";"+nam);  
    }  
      
}
