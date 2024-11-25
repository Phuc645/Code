package com.hsu.lab05;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(6);
        Square s1 = new Square(7);
        Rectangle r1 = new Rectangle(7,6,null, 5,4);
        Triangle t1 = new Triangle(8,9,3,4,5);
        c1.perimeter(); 
        c1.area();
        c1.draw("vang");
        c1.output();
        s1.perimeter(); 
        s1.area();
        s1.draw("do");
        s1.output();
        r1.perimeter(); 
        r1.area();
        r1.draw("trang");
        r1.output();
        t1.perimeter(); 
        t1.area();
        t1.getType();
        t1.draw("xanh duong");
        t1.output();
    }   
}