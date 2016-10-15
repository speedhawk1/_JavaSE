package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public class CatchTest {

    private static int counter;

    private static void method(int n) {
        String[] strings = {"a", "b", "c", "d"};
        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * 10); // [0, 9]
            try {
                // db.connect...
                // data CRUD...
                // exception...
                System.out.println(strings[r]);
                System.out.println(100 / r);
                counter++;
            } catch (ArithmeticException e) {
                method(n - i);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("下标越界。。。");
                System.exit(0);
            } finally {
                // db.close...
                System.out.println("finally...");
            }
        }
    }

    public static void main(String[] args) {
        method(100);
        System.out.println(counter);
    }
}
