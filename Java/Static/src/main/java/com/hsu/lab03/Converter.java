package com.hsu.lab03;
import java.util.Scanner;

public class Converter {
   private static float c;
   private static float f;
   private static float inch;
   private static float cm;
   private static float m;
   private static float foot;      
      public static void nhietDo (){
         System.out.println("Nhap so: ");
         Scanner sc = new Scanner(System.in);
         c = sc.nextFloat();
         f = (c*1.8f) + 32;
         System.out.println("Do f: "+f);
         sc.close();
   }
      
      public static void nhietDo1 (){
         System.out.println("Nhap so: ");
         Scanner sc = new Scanner(System.in);
         c = sc.nextFloat();
         c = (f-32) /1.8f;
         System.out.println("Do c: "+c);
         sc.close();
   } 
      
      public static void doDai (){
         System.out.println("Nhap so: ");
         Scanner sc = new Scanner(System.in);
         cm = sc.nextFloat();
         inch = cm/2.54f;
         System.out.println("Do dai inch: "+inch);
         sc.close();
   }
      
      public static void doDai1(){
         System.out.println("Nhap so: ");
         Scanner sc = new Scanner(System.in);
         inch = sc.nextFloat();
         cm = inch*2.54f;
         System.out.println("Do dai cm: "+cm);
         sc.close();
   }
      
      public static void duong(){
         System.out.println("Nhap so: ");
         Scanner sc = new Scanner(System.in);
         m = sc.nextFloat();
         foot = m/0.3048f;
         System.out.println("Do dai foot: "+foot);
         sc.close();

   }
      public static void duong1(){
        System.out.println("Nhap so: ");
        Scanner sc = new Scanner(System.in);
        foot = sc.nextFloat();
        m = foot*0.3048f;
        System.out.println("Do dai m: "+m);
        sc.close();
   }
   
}
