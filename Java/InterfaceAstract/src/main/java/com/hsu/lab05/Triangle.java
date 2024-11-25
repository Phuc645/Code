package com.hsu.lab05;


public class Triangle extends Point implements IShape {
    int a,b,c;
    public Triangle() {

    }
    public Triangle(int x, int y, int a, int b, int c) {
        super(x, y);
        this.a = a;
        this.b = b;
        this.c = c;
        if(a <=0 || b <= 0 || c <= 0 && a+b <= c || a+c <=b || b+c <= a) {
            System.out.println("Nhap lai");
        }
    }
    public void draw(String color) {
        System.out.println("Day la tam giac ("+a+", "+b+", "+c+")"+" mau "+color+" duoc ve tai toa do ("+x+", "+y+")");
    }
    public double area() {
        return Math.sqrt((a+b+c)*(a+b-c)*(b+c-a)*(c+a-b))/4;
    }
    public double perimeter() {
        return a+b+c;
    }
    public void output() {
        System.out.println("Day la hinh tam giac co chu vi "+perimeter()+", co dien tich "+area()); 
    }
    public void getType () {
        if(a == b && b == c) 
        System.out.println("Tam giac deu");
        else if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c, 2) || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a, 2) || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b, 2))
        System.out.println("Tam giac vuong");
        else if (a == b && a != c || b == c && b != a ||c == a && c != b)
        {
            if (Math.pow(a,2) + Math.pow(b,2) == Math.pow(c, 2) || Math.pow(b,2) + Math.pow(c,2) == Math.pow(a, 2) || Math.pow(a,2) + Math.pow(c,2) == Math.pow(b, 2))
            System.out.println("Tam giac vuong can");
            else
            System.out.println("Tam giac can");
        }
        else 
        System.out.println("Tam giac thuong");
    }
    @Override
    public String toString() {
        return "[("+x+", "+y+")"+", "+a+", "+b+", "+c+"]";
    }

}
