package com.hsu.lab05;

public class Circle implements IShape {
    int radius;
    String color;
    public Circle(int radius) {
        this.radius = radius;
    }
    public double area() {
        return radius*radius*pi;
    }
    public double perimeter() {
        return radius*2*pi;
    }
    public void draw(String color) {
        System.out.println("Day la hinh tron mau "+color+", co ban kinh "+radius);
    }
    public void output() {
        System.out.println("Day la hinh tron co chu vi "+perimeter()+", co dien tich "+area()); 
    }
}
