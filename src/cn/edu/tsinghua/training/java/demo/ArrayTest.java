package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[] ints = new int[50];

        System.out.println(ints.length); // 运行时异常 Runtime Exception

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
            System.out.println(ints[i]);
        }

        System.out.println(ints[ints.length - 1]);

    }
}
