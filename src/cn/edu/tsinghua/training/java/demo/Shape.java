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
// Rectangle
// Triangle

// Test
class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(1.2);
//        Shape circle = new Circle(1.2);
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.test());
    }
}
