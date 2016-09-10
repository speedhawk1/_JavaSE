/**
 * Created by Administrator
 * 2016/9/10.
 */
public class Vehicle { // 交通工具
    String type; // car, train, plain, ...
    String color; //
    double weight; //
    double maxSpeed;


    Vehicle() { // constructor

    }

//    Vehicle(String type, String color, double weight, double maxSpeed) {
//        this.type = type;
//        this.color = color;
//        this.weight = weight;
//        this.maxSpeed = maxSpeed;
//    }


    // Alt + Insert, Enter, Ctrl + A, Enter
    public Vehicle(String type, String color, double weight, double maxSpeed) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    void run() {
        System.out.println("running...");
    }

    void stop() {

    }

    void transport() {

    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("轿车","黑色", 1000, 100); //
        System.out.println(car.type);
        System.out.println(car.color);
        System.out.println(car.weight);
        System.out.println(car.maxSpeed);

        car.run();
        Vehicle plane = new Vehicle();

        Vehicle bike = new Vehicle(); // Ctrl + p(parameter)
    }
}
