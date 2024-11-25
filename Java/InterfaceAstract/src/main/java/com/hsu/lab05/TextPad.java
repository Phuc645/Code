package com.hsu.lab05;
import java.time.LocalDate;
import java.util.Scanner;

public class TextPad extends Document{
    int words = 0;
    int size = 0;
    public TextPad() {
        
    }
    public int getWords() {
        for (int i = 0; i < content.length();i++) {
            char ch =content.charAt(i);
            if(Character.isWhitespace(ch))
            words++;  
        }
        return words + 1;
    }
    public int getSize() {
        for (int i = 0; i < content.length();i++) {
            char ch =content.charAt(i);
            if(!Character.isWhitespace(ch))
            size++;  
        }
        return size;
    }
    public void inputContent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap :");
        content = sc.nextLine();
        sc.close();
    }
    public void save() {
        words = getWords();
        size = getSize();
        lastModifiedDate = LocalDate.now();
    }
    public void saveAs(String newName) {
        fileName = newName;
        words = getWords();
        size = getSize();
        lastModifiedDate = LocalDate.now();
    }
    public void open() {
        System.out.println(content);
        System.out.println("Ngay tao: "+createdDate);
        System.out.println("Ngay cap nhat cuoi: "+lastModifiedDate);
        System.out.println("So tu: "+words);
        System.out.println("So ky tu: "+size);
    }
}
