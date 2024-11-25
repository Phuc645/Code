package com.hsu.lab03;

public class SinhVien {
    private String ten;
    private int id;
    static int n = 0;
    public SinhVien (String ten, int id) {
        this.ten = ten;
        this.id = id;
        n++;
        
    }
    public void Output () {
        System.out.format("%-30s%d\n",ten,id);
    }
    public int getTong (){
        return n;
    }

}
