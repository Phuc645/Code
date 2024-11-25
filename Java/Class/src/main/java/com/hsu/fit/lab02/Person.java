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
public class Person {
    //fields
    String id;
    String name;
    String addr;
    //methods
    public void input (){
    System.out.println("Nhap id: ");
    Scanner sc = new Scanner(System.in);
    id = sc.nextLine();
    System.out.println("Nhap ten: ");
    name = sc.nextLine();
    System.out.println("Nhap dia chi: ");
    addr = sc.nextLine();
    sc.close();
    }
    public void sayHello (){
        System.out.println("I am "+name+". Hello everybody!!!");
    } 
    
}
