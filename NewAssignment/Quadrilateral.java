package assignment;

public abstract class Quadrilateral 
{
    protected int base;
    protected int height;
    public Quadrilateral() 
    {
        this.base = 0;
        this.height = 0;
    }
    public Quadrilateral(int base, int height) 
    {
    	this.base = base;
        this.height = height;
    }
    abstract double area();

    public int getBase() 
    {
        return base;
    }

    public void setBase(int base) 
    {
        this.base = base;
    }

    public int getHeight() 
    {
        return height;
    }

    public void setHeight(int height) 
    {
        this.height = height;
    }
}

class Square extends Quadrilateral 
{
    public Square(int side) {
        super(side, side);
    }

    @Override
    double area() {
        return base * base;
    }
}

class Rectangle extends Quadrilateral {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    double area() {
        return base * height;
    }
}

class Parallelogram extends Quadrilateral {
    public Parallelogram(int base, int height) {
        super(base, height);
    }

    @Override
    double area() {
        return base * height;
    }
}
