package com.hsu.lab12;

public class NhanVien {
    private String hoTen;
    private String ma;
    private String soDienThoai;
    private int luong;
    private int tuoi;

    public NhanVien() {
    }

    public NhanVien(String hoTen, String ma, String soDienThoai, int luong, int tuoi) {
        this.hoTen = hoTen;
        this.ma = ma;
        this.soDienThoai = soDienThoai;
        this.luong = luong;
        this.tuoi = tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    @Override
    public String toString() {
        String s = String.format("%-20s%-10s%-20s%-10d%-10d", hoTen, ma, soDienThoai, luong, tuoi);
        return s;
    }
}