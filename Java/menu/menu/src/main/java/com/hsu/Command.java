package com.hsu;

import java.io.IOException;

public class Command {
    public static void clearConsole(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException ignored) {}
    }
    public static int checkSelection(String input){
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            clearConsole();
            return -1;
        }
    }
}
