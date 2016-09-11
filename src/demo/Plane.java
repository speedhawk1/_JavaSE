package demo;

/**
 * Created by Administrator
 * 2016/9/11.
 */
public class Plane extends Vehicle {

    public Plane() {
    }

    public Plane(String type, String color, double weight, double maxSpeed) {
        super(type, color, weight, maxSpeed);
    }

    boolean transport() {
        System.out.println("飞机在运输。。。");
//        super.transport();
        return true;
    }

    public static void main(String[] args) {
        Plane plane = new Plane();
        plane.transport();
    }
}
