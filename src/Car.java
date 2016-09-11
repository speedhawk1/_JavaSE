/**
 * Created by Administrator
 * 2016/9/11.
 */
public class Car extends Vehicle {

    String oilType;

    public Car(String type, String color, double weight, double maxSpeed, String oilType) {
        super(type, color, weight, maxSpeed); // 子类显式调用父类的有参构造方法
        this.oilType = oilType;
    }

//    public Car() {
//
//        System.out.println("car...");
//    }

    void fillOil() {

    }

    public static void main(String[] args) {
        Car car = new Car("car..", "red", 1, 100, "gas");
        System.out.println(car.color);
        System.out.println(car.oilType);
    }
}
