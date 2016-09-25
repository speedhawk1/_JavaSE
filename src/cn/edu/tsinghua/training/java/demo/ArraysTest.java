package cn.edu.tsinghua.training.java.demo;

import java.util.Arrays;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] ints = new int[10];

        Arrays.fill(ints, 1, 3, -999);

        int[] newInts = Arrays.copyOf(ints, 3);

        Arrays.sort(newInts);

        for (int anInt : newInts) {
            System.out.println(anInt);
        }

        String[] strings = {"hello", "test...", "hi", "apple"};
        Arrays.sort(strings);
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(newInts));

        String[] strings1 = new String[10];
        System.arraycopy(strings, 1, strings1, 1, 2);
        for (String s : strings1) {
            System.out.println(s);
        }
    }
}
