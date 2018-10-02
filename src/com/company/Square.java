package com.company;

public class Square extends Shape
{
    private int length;

    public Square(int length)
    {
        super("Square");
        this.length = length;
    }

    public double getArea()
    {
        return this.length * this.length;
    }

    public double getPerimeter()
    {
        return (4 * this.length);
    }
}
