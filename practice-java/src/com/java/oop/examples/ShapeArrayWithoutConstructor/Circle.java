package com.java.oop.examples.ShapeArrayWithoutConstructor;

public class Circle extends Shape {

    public double radius;

    public final double PI = 3.14;

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius* radius;
    }
}
