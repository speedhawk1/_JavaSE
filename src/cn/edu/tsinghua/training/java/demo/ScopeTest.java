package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public class ScopeTest {

    public void m1(int k) {
        int j = 0;
        System.out.println(j);
        System.out.println(i);

        for (int m = 0; m < 10; m++) {
            System.out.println(m);
        }

        for (int m = 0; m < 10; m++) {
            System.out.println(m);
        }
    }

    public void m2() {
        double d = 1.2;
        m1(0);
        System.out.println(this.d);
    }

    private int i;
    private double d;

    public static void main(String[] args) {
        double d = 2.3;
        ScopeTest scopeTest = new ScopeTest();
        System.out.println(scopeTest.d);
    }

}
