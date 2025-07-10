package com.java.oop.examples.ShapeArrayWithMethodReturnType;

public class Shape {

    public double area(){
        return 0;
    }
    public static Shape getShape(int i){

        if(i == 1){
            return new Rectangle(10,8);
        }
        if(i == 2){
            return new Circle(5.12);
        }
        return new Shape();
    }
}
