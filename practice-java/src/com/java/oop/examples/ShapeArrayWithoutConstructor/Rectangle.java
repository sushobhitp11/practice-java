package com.java.oop.examples.ShapeArrayWithoutConstructor;

public class Rectangle extends Shape{

    public double length;

    public double width;

    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double area() {
        return length*width;
    }
}
