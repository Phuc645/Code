package com.hsu.elearning02;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyNhanSu {
    ArrayList<NhanVien> dsNhanVien = new ArrayList<NhanVien>();

    public void xemDanhSach() {
        for (NhanVien nv : dsNhanVien) {
            System.out.format("%-20d%-20s%-20s%-20s%-20s", nv.maNhanvien, nv.hoTen, nv.diaChi, nv.diaChi, nv.soDT);
        }
    }

    public void themNhanVien() {
        NhanVien nv = new NhanVien();
        Scanner sc = new Scanner(System.in);
        Scanner sc0 = new Scanner(System.in);
        System.out.format("Nhap ten: ");
        nv.hoTen = sc.nextLine();
        System.out.format("Nhap ma: ");
        nv.maNhanvien = sc0.nextInt();
        System.out.format("Nhap dia chi: ");
        nv.diaChi = sc.nextLine();
        System.out.format("Nhap email ");
        nv.email = sc.nextLine();
        System.out.format("Nhap SDT: ");
        nv.soDT = sc.nextLine();
        dsNhanVien.add(nv);
        sc.close();
        sc0.close();
        
    }

    public void capNhat () {
        
    }

    public void xoaNhanVien() {

    }
}
