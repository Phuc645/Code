package com.hsu.lab04;

public class Circle extends Point {
    int radius;
    float area,perimeter;
    String color;
    public Circle () {

    }
    public Circle (int radius, String color,int x, int y) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.radius = radius;
    } 
    public void Draw () {
        System.out.println("Hinh tron co ban kinh "+radius+", mau "+color+", duoc ve tai toa do "+x+", "+y);
    }
    public void Area () {
        area = radius*radius*3.14f;
        System.out.println("Dien tich hinh tron: "+area);
    }
    public void Perimeter () {
        perimeter = radius*2*3.14f;
        System.out.println("Chu vi hinh tron: "+perimeter);
    }
}
