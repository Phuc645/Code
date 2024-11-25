package com.hsu.lab04;
import java.util.Scanner;

public class Sinhvien extends Hocsinh{
    boolean nckh;
    public Sinhvien(String hoten, String ngaysinh, String diachi, float dtb,boolean nckh) {
        super(hoten, ngaysinh, diachi, dtb);
        this.nckh = nckh;
    }
    public void thongBaoKhenThuong () {
        if (khenThuong() == true ) {
            System.out.println("Sinh vien "+hoten+" duoc khen thuong");
        }
        else {
            System.out.println("Sinh vien "+hoten+" khong duoc khen thuong");
        }
    }
    @Override
        public void nhap() {
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        hoten = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaysinh = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diachi = sc.nextLine();
        System.out.println("Nhap diem trung binh: ");
        dtb = sc0.nextFloat();
        System.out.println("Co nghien cuu khoa hoc khong (true/false) ? ");
        nckh = sc1.nextBoolean();
        sc.close();
        sc0.close();
        sc1.close();
    }
    @Override
    public void xuat() {
        System.out.println(hoten+"-"+ngaysinh+"-"+diachi+"-"+dtb);
    }
    @Override
    public boolean khenThuong() {
        if (dtb >= 9 && nckh == true) {
            return true;     
        }
        else {
            return false;
        }
    }


}
