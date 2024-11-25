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
public class HinhChuNhat {
    //fields
    int chieudai, chieurong;
    //constructors
    public HinhChuNhat () {

    }
    //methods
    public void Input () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu dai");
        chieudai = sc.nextInt();
        if (chieudai <= 0) {
            System.out.println("Nhap lai");
        }
        System.out.println("Nhap chieu rong");
        chieurong= sc.nextInt();
        if (chieurong <= 0) {
            System.out.println("Nhap lai");
        }
        sc.close();
    }
    int getChieudai() {
            return chieudai;
    }
    void setChieudai (int chieudai){
            this.chieudai = chieudai;
    }
    int getChieurong() {
        return chieurong;
}
    void setChieurong (int chieurong){
        this.chieurong = chieurong;
}
}
