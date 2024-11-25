package com.hsu.e01;

import java.util.Scanner;

public class baitap12 {
    public static void main(String[] args) {
        int soluongSp;
        String hoten;
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        System.out.println("Nhap ho ten khach hang: ");
        hoten= sc0.nextLine();
        System.out.println("Nhap so luong san pham: ");
        soluongSp= sc.nextInt();
        System.out.println("Ho ten khach hang: "+hoten);
        System.out.println("So luong san pham: "+soluongSp);
        System.out.println("So phan qua duoc nhan: "+soluongSp/5);
        System.out.println("So san pham duoc giam gia: "+soluongSp%5);
        System.out.printf("Tong tien: "+(soluongSp*2035 - soluongSp%5*2035*2/100));
        sc.close();
        sc0.close();
    }
}
