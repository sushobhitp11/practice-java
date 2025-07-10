package com.java.oop.examples.ShapeArrayWithoutConstructor;

public class TestShape {

    public static void main(String[] args) {

        Shape[] s = new Shape[2];
        s[0] = new Circle();
        s[1] = new Rectangle();

        Circle c = (Circle) s[0];
        c.setRadius(5.12);
        System.out.println(s[0].area());

        Rectangle r = (Rectangle) s[1];
        r.setLength(12);
        r.setWidth(8);
        System.out.println(s[1].area());

        double a = Area(s);
        System.out.print(a);

    }
    public static double Area(Shape[] s){
        double totalArea = 0;

        for(int i = 0; i < s.length; i++){
            totalArea = totalArea + s[i].area();
        }
        return totalArea;
    }

}
