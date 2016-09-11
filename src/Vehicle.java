/**
 * Created by Administrator
 * 2016/9/10.
 */
public class Vehicle { // 交通工具
    String type; // car, train, plain, ...
    String color; //
    double weight; //
    double maxSpeed;


//    Vehicle() { // constructor
//        System.out.println("vehicle...");
//    }

    // Alt + Insert, Enter, Ctrl + A, Enter
    public Vehicle(String type, String color, double weight, double maxSpeed) {
        this.type = type;
        this.color = color;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
    }

    void run(String name) { // 形式参数 形参
        System.out.println(name + " is running...");
    }

    int stop() {
        return 1;
    }

    boolean transport() {
        System.out.println("");
        return true;
    }

    void test() {
//        return;
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle("轿车","黑色", 1000, 100); //
        System.out.println(car.type);
        System.out.println(car.color);
        System.out.println(car.weight);
        System.out.println(car.maxSpeed);

        car.run("我的车"); // 实际参数 实参
//        Vehicle plane = new Vehicle();

//        Vehicle bike = new Vehicle(); // Ctrl + p(parameter)
    }
}
