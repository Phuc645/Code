package com.hsu.lab03;

public class Main3 {
    public static void main(String[] args) {
        SanPham s1 = new SanPham("Cocacola",10000,67);
        SanPham s2 = new SanPham("Pepsi",12000,55);
        SanPham s3 = new SanPham("Xuc xich",20000,63);
        s1.getThanhtien();
        s2.getThanhtien();
        s3.getThanhtien();
        s1.xuat();
        s2.xuat();
        s3.xuat();
        System.out.println("Tong tien: "+SanPham.getTongtien()); 
    } 
}
        

