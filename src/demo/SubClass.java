package demo;

/**
 * Created by Administrator
 * 2016/9/11.
 */
public class SubClass extends SuperClass {

    String name;
    int j;
    double d2;

    void m3() {

    }

    void m4() {

    }

    public static void main(String[] args) {
        SubClass subClass = new SubClass();
        subClass.m1();
        System.out.println(subClass.i);
        subClass.m3();
        System.out.println(subClass.name);

        SuperClass superClass = new SubClass();
        superClass.m1();
    }
}
