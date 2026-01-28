abstract class Shape {
    public abstract double area();
}

interface Drawable {
    void draw();
}

class Circle extends Shape implements Drawable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with radius " + radius);
    }
}

class Rectangle extends Shape implements Drawable {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle of " + length + " x " + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);

        Drawable dc = (Drawable) c;
        Drawable dr = (Drawable) r;

        System.out.println("Circle area: " + c.area());
        dc.draw();

        System.out.println("Rectangle area: " + r.area());
        dr.draw();
    }
}
