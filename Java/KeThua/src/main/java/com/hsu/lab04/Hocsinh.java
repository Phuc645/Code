package com.hsu.lab04;

import java.util.Scanner;

public class Hocsinh extends Nguoi {
    float dtb;
    public Hocsinh (String hoten, String ngaysinh, String diachi, float dtb) {
        super(hoten,ngaysinh,diachi);
        this.dtb = dtb;
    }
    public void thongBaoKhenThuong () {
        if (khenThuong() == true ) {
            System.out.println("Hoc sinh "+hoten+" duoc khen thuong");
        }
        else {
            System.out.println("Hoc sinh "+hoten+" khong duoc khen thuong");
        }
    }
    public boolean khenThuong() {
        if (dtb >= 9) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
        public void nhap() {
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        dtb = sc0.nextFloat();
        sc.close();
        sc0.close();
    }
    @Override
    public void xuat() {
        System.out.println(hoten+"-"+ngaysinh+"-"+diachi+"-"+dtb);
    }


}
