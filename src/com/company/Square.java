package com.company;

public class Square extends Shape
{
    private int side;
    private int length;

    public Square(int side, int length)
    {
        super("Square");
        this.side = side;
        this.length = length;
    }

    public double getArea()
    {
        return this.side * this.length;
    }

    public double getPerimeter()
    {
        return (4 * this.length);
    }
}
