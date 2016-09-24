package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public interface InterfaceTest extends A, B, C, D {
    int ZERO = 0;
    double D = 1.2;

    void m();

    public static void main(String[] args) {
        System.out.println("test...");
//        InterfaceTest interfaceTest = new InterfaceTest();
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C {
    void c();
}

interface D {
    void d();
}

class InterfaceTestImpl implements InterfaceTest {

    @Override
    public void m() {

    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }
}

//interface
//abstract class



