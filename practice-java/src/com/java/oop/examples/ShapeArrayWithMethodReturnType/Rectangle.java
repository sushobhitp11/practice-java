package com.java.oop.examples.ShapeArrayWithMethodReturnType;

public class Rectangle extends Shape{

    public double length;
    public double width;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }
}
