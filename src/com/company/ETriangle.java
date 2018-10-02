package com.company;

public class ETriangle extends Shape
{
    private int side;

    public ETriangle(int side)
    {
        super("ETriangle");
        this.side = side;

    }
       public double getArea() {return ( Math.sqrt(3) / 4 ) * side * side;  }

       public double getPerimeter() {return 3 * side; }

}
