package com.hsu.baitapthuchanh;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        int selection=0;
        EmployeeManagement EM=new EmployeeManagement();

        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ignored) {}
        while(selection!=7){
            Scanner scanner = new Scanner(System.in); 
            System.out.println("===============================");
            System.out.println("Menu: ");
            System.out.println("1. Add employee");
            System.out.println("2. Update employee by Id");
            System.out.println("3. Remove employee by Id");
            System.out.println("4. Search employee by Id");
            System.out.println("5. Show employee list");
            System.out.println("6. Sort employee by Salary");
            System.out.println("7. Exit");
            System.out.print("Please enter a selection: ");
            try {
                selection = scanner.nextInt();
            } catch (Exception e) {
                try {
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                } catch (IOException | InterruptedException ignored) {}
                System.out.println("===============================");
                System.out.println("Invalid input. Please enter a valid number! ");
                scanner.next();
                continue;
            }
            while (selection<1||selection>7) {
                System.out.print("Your selection was wrong! please enter again: ");
                selection=scanner.nextInt();
            }
            switch (selection) {
                case 1 -> {
                    clearConsole();
                    System.out.println("Add employee: ");
                }
                case 2 -> {
                    clearConsole();
                    System.out.println("Update employee: ");
                }
                case 3 -> {
                    clearConsole();
                    System.out.println("Remove employee: ");
                }
                case 4 -> {
                    clearConsole();
                    System.out.println("Search employee: ");
                }
                case 5 -> {
                    clearConsole();
                    System.out.println("Show employee: ");
                }
                case 6 -> {
                    clearConsole();
                    System.out.println("Sort employee by salary: ");
                }
            }
        }
    }
    public static void clearConsole(){
        try {
            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ignore) {}
    }
}