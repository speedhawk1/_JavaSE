package cn.edu.tsinghua.training.java.demo;


import static java.lang.System.out;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public class Human {

    static {

    }

    private String name;
    private static String earth;

    public static void m() {
//        name = "";
        earth = "";
//        this.earth = "";
//        stitic int i = 0;
    }

    public static void main(String[] args) {

        Human user1 = new Human();
        user1.name = "zhangsan";
        Human.earth = "zhangsan 在学校里种了一棵树。。。";
        out.println(user1.name);
        out.println(Human.earth);

        Human user2 = new Human();
        user2.name = "lisi";
        out.println(user2.name);
        out.println(Human.earth); // ?
    }
}
