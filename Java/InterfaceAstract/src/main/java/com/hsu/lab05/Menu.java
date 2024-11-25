package com.hsu.lab05;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        TextPad t1 = new TextPad();
        int choice;
        System.out.println("=======================");
        System.out.println("1.New Textpad");
        System.out.println("2.Input Textpad");
        System.out.println("3.Save Textpad");
        System.out.println("4.Save as Textpad");
        System.out.println("5.Open Textpad");
        System.out.println("6.Exit");
        System.out.println("=======================");
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long chon chuc nang: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1: System.out.print("\033[H\033[2J"); 
            System.out.flush();
            break;
            case 2: t1.inputContent();
            break;
            case 3: t1.save();
            break;
            case 4: t1.saveAs("Test.txt");
            break;
            case 5: t1.open();
            break;
            case 6: 
            break;
            default:
            break;
        }
        sc.close();
    }
}

