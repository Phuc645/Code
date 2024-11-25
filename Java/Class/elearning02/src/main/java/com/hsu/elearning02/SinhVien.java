package com.hsu.elearning02;

public class SinhVien {
    int maSo;
    String hoTen;
    float diemLT;
    float diemTH;

    public SinhVien() {
    }

    public SinhVien(int maSo, String hoTen, float diemLT, float diemTH) {
        this.maSo = maSo;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public float getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(float diemTH) {
        this.diemTH = diemTH;
    }

    public float tinhDiem() {
        return (diemLT + diemTH*2)/3;
    }

}
