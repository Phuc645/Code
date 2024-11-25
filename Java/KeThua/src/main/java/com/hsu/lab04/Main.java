package com.hsu.lab04;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5,"Nau",3,2);
        Circle c2 = new Circle(7,"Xanh Duong",8,5);
        Circle c3 = new Circle(4,"Den",8,0);
        c1.Draw();
        c1.Area();
        c1.Perimeter();
        c2.Draw();
        c2.Area();
        c2.Perimeter();
        c3.Draw();
        c3.Area();
        c3.Perimeter();
    }
}