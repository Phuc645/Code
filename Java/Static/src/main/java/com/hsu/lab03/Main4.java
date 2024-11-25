package com.hsu.lab03;

public class Main4 {
    public static void main (String[] args){
        SinhVien s1 = new SinhVien ("Tom",2234);
        SinhVien s2 = new SinhVien ("Ann",3560);
        s1.Output();
        s2.Output();
        System.out.println("Tong so hoc sinh: "+s2.getTong());
    }
}
