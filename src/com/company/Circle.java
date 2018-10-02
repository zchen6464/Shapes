package com.company;

public class Circle extends Shape
{
    private int radius;

    public Circle( int radius)
    {
        super("Circle");
        this.radius = radius;
    }

    public double getArea() {return this.radius * this.radius * Math.PI;}





    public double getPerimeter() {return 2* this.radius * Math.PI; }




}
