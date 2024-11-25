/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hsu.tuan1;
import java.util.Scanner;

/**
 *
 * @author Phuc
 */
public class Baitap03 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Nhap so: ");
        int n = sc.nextInt(); 
        sc.close();
        int S=0;
        int i;
        if (n%2 == 0){
        for (i=2;i<=n;i=i+2){
        S=S+i;
        }
        }
        else {
    for (i=1;i<=n;i=i+2) {
            S=S+i;
        }
        }
     System.out.println("Ket qua: "+S);
  
    }
}


