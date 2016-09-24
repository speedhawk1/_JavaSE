package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public abstract class Shape {
    //    1. 求周长
    public abstract double getPerimeter();

    //    2. 求面积
    public abstract double getArea();
}

// Circle
class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double test() {
        return 0;
    }
}

// Square
class Square extends Shape {

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

// Rectangle
class Rectangle extends Shape {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}

// Triangle
class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        // if
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return (a + b + c);
    }

    @Override
    public double getArea() {
        double d = (a + b + c) / 2;
        return Math.sqrt(d*(d - a) * (d - b) * (d - c));
    }
}

// Test
class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(1.2);
//        Shape circle = new Circle(1.2);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.test());

        Triangle triangle = new Triangle(3, 2, 5);
        System.out.println(triangle.getArea());
    }
}
