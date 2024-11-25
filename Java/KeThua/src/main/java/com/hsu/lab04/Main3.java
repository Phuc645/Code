package com.hsu.lab04;

public class Main3 {
    public static void main(String[] args) {
    Hocsinh h1 = new Hocsinh("Phu Hien","06/05/2003", "555/7", 9.1f);
    Hocsinh h2 = new Hocsinh("Cat Hanh", "17/09/2005", "647", 8);
    Sinhvien s1 = new Sinhvien("Phu Hien","06/05/2003", "555/7", 9.5f,true);
    Sinhvien s2 = new Sinhvien("Cat Hanh", "17/09/2005", "647", 9.7f,false);
    h1.xuat();
    h1.khenThuong();
    h1.thongBaoKhenThuong();
    h2.xuat();
    h2.khenThuong();
    h2.thongBaoKhenThuong();
    s1.xuat();
    s1.khenThuong();
    s1.thongBaoKhenThuong();
    s2.xuat();
    s2.khenThuong();
    s2.thongBaoKhenThuong();
}
}
