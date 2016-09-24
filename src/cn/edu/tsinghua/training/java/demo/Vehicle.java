package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public abstract class Vehicle { // 约束和规范
    public String color;

    public abstract void run();
}

class Car extends Vehicle {

    @Override
    public void run() {
        System.out.println("car run...");
    }
}
