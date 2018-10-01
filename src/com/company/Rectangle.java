package com.company;

public class Rectangle extends Shape
{
    private int height;
    private int width;

    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    public double getArea()
    {
        return this.height * this.width;
    }

    public double getPerimeter()
    {
        return (2 * this.height) + (2 * this.width);
    }

}
