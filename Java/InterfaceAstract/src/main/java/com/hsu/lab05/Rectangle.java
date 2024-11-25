package com.hsu.lab05;

public class Rectangle extends Point implements IShape {
    int length, width;
    String color;

    public Rectangle() {
    }

    public Rectangle(int length, int width, String color, int x, int y) {
        super(x, y);
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public int getLength() {
        if (length < 0)
        return 0;
        else
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        if (width < 0)
        return 0;
        else
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public void draw(String color) {
        System.out.println("Day la hinh chu nhat ("+length+", "+width+")"+" co mau "+color+", duoc ve tai toa do "+"("+x+", "+y+")");
    }
    @Override
    public double area() {
        return length*width;
    }
    @Override
    public double perimeter() {
        return (length+width)*2;
    }
    public void output() {
        System.out.println("Day la hinh chu nhat co chu vi "+perimeter()+", co dien tich "+area()); 
    }
    @Override
    public String toString() {
        return "[("+x+", "+y+")"+", "+length+", "+width+"]";
    }

}
