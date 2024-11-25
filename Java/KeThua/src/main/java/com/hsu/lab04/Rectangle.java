package com.hsu.lab04;

public class Rectangle {
    int length, width, area, perimeter;
    public Rectangle () {

    }
    public Rectangle (int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    @SuppressWarnings("unused")
    private void perimeter() {
        perimeter = (length + width)*2;
    }
    protected void area () {
        area = length * width;
        System.out.println("Dien tich hinh chu nhat: "+area);
    }
    public int getPerimeter() {
        return perimeter;
    }
    public int getArea() {
        return area;
    }
    @Override
    public String toString () {
        return "("+length+","+width+")";
    }
}


