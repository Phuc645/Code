package com.hsu.lab03;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int choice;
    System.out.println("=====BANG CHUYEN DOI=====");
    System.out.println("1.Do C sang do F");
    System.out.println("2.Do F sang do C");
    System.out.println("3.Inch sang cm");
    System.out.println("4.Cm sang inch");
    System.out.println("5.M sang Foot");
    System.out.println("6.Foot sang M");
    System.out.println("======================");
    System.out.println("Lua chon: ");
    Scanner sc = new Scanner(System.in);
    choice = sc.nextInt();
    switch(choice){
        case 1: 
        Converter.nhietDo();
        break;
        case 2: 
        Converter.nhietDo1();
        break;
        case 3: 
        Converter.doDai();
        break;
        case 4: 
        Converter.doDai1();
        break;
        case 5: 
        Converter.duong();
        break;
        case 6: 
        Converter.duong1();
        break;
        default:
        System.out.println("Thoat chuong trinh");
        break;
        }
        sc.close();
    }
    
}