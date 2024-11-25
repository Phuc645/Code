package com.hsu.lab05;

import java.util.Scanner;

public class Point {
    int x,y,newx,newy;
    public Point() {
        
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(int newx, int newy) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap toa do x moi: ");
        newx = sc.nextInt();
        System.out.println("Nhap toa do y moi: ");
        newy = sc.nextInt();
        sc.close();
    }
    @Override
    public String toString() {
        return "("+x+", "+y+")";
    }
    
}
