package com.hsu.lab04;

public class Main2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,3);
        Box b = new Box(2,4,6);
        r.area();
        System.out.println("Chu vi hinh chu nhat: "+r.getPerimeter());
        b.area();
        b.Volume();


    }
}
