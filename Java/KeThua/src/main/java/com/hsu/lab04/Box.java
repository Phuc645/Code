package com.hsu.lab04;

public class Box extends Rectangle {
    int height,volume;
    public Box () {

    }
    public Box (int length, int width, int height) {
        super(length,width);
        this.height = height;   
    }
    public void Volume() {
        volume = length*width*height;
        System.out.println("The tich hinh hop: "+volume);
    }
    @Override
    protected void area() {
        area = 2*(length*width + width*height + height*length );
        System.out.println("Dien tich toan phan: "+area);
    }
    @Override
    public String toString () {
        return "("+length+","+width+","+height+")";
    }
}
