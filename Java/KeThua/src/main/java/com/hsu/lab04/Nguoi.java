package com.hsu.lab04;
import java.util.Scanner;

public class Nguoi {
    String hoten;
    String ngaysinh;
    String diachi;
    public Nguoi () {

    }
    public Nguoi (String hoten, String ngaysinh, String diachi) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
        sc.close();
    }
    public void xuat() {
        System.out.println(hoten+"-"+ngaysinh+"-"+diachi);
    }
}
