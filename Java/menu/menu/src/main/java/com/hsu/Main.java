package com.hsu;

import static java.lang.System.out;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int selection=-1;
        Scanner scanner=new Scanner(System.in);
        Command.clearConsole();
        while(selection!=7){
            out.println("===============================");
            out.println("employee Menu: ");
            out.println("1. Add employee");
            out.println("2. Update employee by Id");
            out.println("3. Remove employee by Id");
            out.println("4. Search employee by Id");
            out.println("5. Show employee list");
            out.println("6. Sort employee by Salary");
            out.println("7. Exit");
            out.print("Please enter a selection: ");
            String input=scanner.nextLine();
            selection=Command.checkSelection(input);
            if(selection==-1||selection<1||selection>7) {
                Command.clearConsole();
                out.println("Your selection was wrong! Plearse enter a valid number!");
            }
            switch (selection) {
                case 1 -> {
                    Command.clearConsole();
                    out.println("Add employee");
                }
                case 2 -> {
                    Command.clearConsole();
                    out.println("Update employee by Id");
                }
                case 3 -> {
                    Command.clearConsole();
                    out.println("Remove employee by Id");
                }
                case 4 -> {
                    Command.clearConsole();
                    out.println("Search employee by Id");
                }
                case 5 -> {
                    Command.clearConsole();
                    out.println("Show employee list");
                }
                case 6 -> {
                    Command.clearConsole();
                    out.println("Sort employee by Salary");
                }
                case 7 -> out.println("exiting...");
            }
        }
    }
}