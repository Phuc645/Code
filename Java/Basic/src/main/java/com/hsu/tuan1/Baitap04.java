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
public class Baitap04 {
    public static void main(String[] args) {
    Scanner sc =new Scanner (System.in);
    System.out.println("Nhap so: ");
    int n = sc.nextInt(); 
    if (n  == 0){
    System.out.println("Day la so khong"); 
    } else if (n % 2 == 0){
    System.out.println("Day la so chan"); 
    } else {
    System.out.println("Day la so le");       
    }
    sc.close();
    }
 }
