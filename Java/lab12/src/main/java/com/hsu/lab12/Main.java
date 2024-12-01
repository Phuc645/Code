package com.hsu.lab12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int chon;
        QuanlyNhanVien qlnv = new QuanlyNhanVien();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.format("1. Nhap danh sach nhan vien\n");
            System.out.format("2. Cap nhat thong tin nhan vien\n");
            System.out.format("3. Xoa nhan vien\n");
            System.out.format("4. Xuat danh sach nhan vien\n");
            System.out.format("5. Thoat\n");
            System.out.format("Nhap lua chon: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1 -> qlnv.nhap();
                case 2 -> qlnv.capnhat();
                case 3 -> qlnv.xoa();
                case 4 -> qlnv.xuat();
                case 5 -> System.out.println("Goodbye!");
                default -> System.out.println("Lua chon khong hop le!");
            }
        } while (chon != 5);
    }
}