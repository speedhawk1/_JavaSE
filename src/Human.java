/**
 * Created by Administrator
 * 2016/9/10.
 */
// 类 = 域 + 方法
// class = field + method
public class Human { //

//    1. fields

    String name;
    int age;
    char gender;
    double height;
    double weight;
    boolean isMarried;

    public Human() {
    }

    public Human(String name) {
        this.name = name;
    }

    public Human(String name, int age, char gender, double height, double weight, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    //    2. methods

    void studey() {

    }

    void work() {

    }

    void eat() {

    }

    void sleep() {

    }

    public static void main(String[] args) {
        int i; // local variable
        Human zhangsan = new Human();
        Human lisi = new Human();
    }

}
