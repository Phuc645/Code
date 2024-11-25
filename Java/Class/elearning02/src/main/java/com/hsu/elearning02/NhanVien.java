package com.hsu.elearning02;

public class NhanVien {
    int maNhanvien;
    String hoTen;
    String diaChi;
    String email;
    String soDT;

    public NhanVien() {
    }

    public NhanVien(int maNhanvien, String hoTen, String diaChi, String email, String soDT) {
        this.maNhanvien = maNhanvien;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.email = email;
        this.soDT = soDT;
    }

    public int getMaNhanvien() {
        return maNhanvien;
    }

    public void setMaNhanvien(int maNhanvien) {
        this.maNhanvien = maNhanvien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

}
