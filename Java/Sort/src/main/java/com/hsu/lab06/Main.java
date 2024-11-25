package com.hsu.lab06;

public class Main {
    public static void main(String[] args) {
        DanhsachShippers ds = new DanhsachShippers();
        for (int i = 0; i < 2; i++) {
            ds.addShipper();
        }
        ds.sortbyID();
        ds.Output();
    }
}