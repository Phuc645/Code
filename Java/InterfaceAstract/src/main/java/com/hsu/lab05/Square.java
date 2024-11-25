package com.hsu.lab05;

public class Square implements IShape {
    int edge;
    String color;
    public Square (int edge) {
        this.edge = edge;
    }
    public void draw(String color) {
        System.out.println("Day la hinh vuong mau "+color+", co canh "+edge);
    }
    public double perimeter() {
        return edge*edge;
    }
    public double area() {
        return edge*4;
    }
    public void output() {
        System.out.println("Day la hinh vuong co chu vi "+perimeter()+", co dien tich "+area()); 
    }
}
