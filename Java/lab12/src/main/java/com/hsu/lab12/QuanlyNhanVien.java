package com.hsu.lab12;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanlyNhanVien {
    private ArrayList<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    public void nhap() {
        NhanVien nv = new NhanVien();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.format("Nhap ten nhan vien: ");
        String name = sc.nextLine();
        System.out.format("Nhap ma nhan vien: ");
        String ma = sc1.nextLine();
        System.out.format("Nhap so dien thoai nhan vien: ");
        String sdt = sc1.nextLine();
        System.out.format("Nhap luong nhan vien: ");
        int luong = sc.nextInt();
        System.out.format("Nhap tuoi nhan vien: ");
        int tuoi = sc.nextInt();
        dsNhanVien.add(nv);
        System.out.format("Them nhan vien thanh cong!\n");
    }
    public void capnhat() {
        NhanVien nv = new NhanVien();
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.format("Nhap ma nhan vien can cap nhat: ");
        nv.setMa(sc.nextLine());
        for (NhanVien nhanvien : dsNhanVien) {
            if (nv.getMa() == nhanvien.getMa()) {
                nv = nhanvien;
                check = true;
                break;
            }
        }
        if (check == true) {
            System.out.format("Nhap ten nhan vien: ");
            String name = sc.nextLine();
            nv.setHoTen(name);
            System.out.format("Nhap so dien thoai nhan vien: ");
            String sdt = sc1.nextLine();
            nv.setSoDienThoai(sdt);
            System.out.format("Nhap luong nhan vien: ");
            int luong = sc.nextInt();
            nv.setLuong(luong);
            System.out.format("Nhap tuoi nhan vien: ");
            int tuoi = sc.nextInt();
            nv.setTuoi(tuoi);
            System.out.format("Cap nhat thanh cong!\n");
        }
    }
    public void xoa() {
        NhanVien nv = new NhanVien();
        boolean check = false;
        Scanner sc = new Scanner(System.in);
        System.out.format("Nhap ma nhan vien can xoa: ");
        nv.setMa(sc.nextLine());
        for (NhanVien nhanvien : dsNhanVien) {
            if (nv.getMa() == nhanvien.getMa()) {
                nv = nhanvien;
                check = true;
                break;
            }
        }
        if (check == true) {
            dsNhanVien.remove(nv);
            System.out.format("Xoa thanh cong!\n");
        }
    }
    public void xuat() {
        System.out.format("%-20s%-10s%-20s%-10s%-10s", "Ho ten", "Ma", "So dien thoai", "Luong", "Tuoi");
        for (NhanVien nv : dsNhanVien) {
            System.out.format("%-20s%-10s%-20s%-10d%-10d", nv.getHoTen(), nv.getMa(), nv.getSoDienThoai(), nv.getLuong(), nv.getTuoi());
        }
    }

}
