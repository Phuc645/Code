package com.hsu.lab03;

public class SanPham {
    private String ten;
    private float gia;
    private int soLuong;
    private static float tongTien = 0;
    public SanPham (String ten, int gia, int soLuong) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong; 
        tongTien += getThanhtien();
    }
    public float getThanhtien () {
        return gia*soLuong;
    }
    public static float getTongtien (){
        return tongTien;
    }
    public void xuat () {
        System.out.println(ten+" - "+gia+" - "+soLuong+" - "+getThanhtien());
    }

}