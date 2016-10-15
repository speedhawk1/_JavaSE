package cn.edu.tsinghua.training.java.demo;

import java.util.ArrayList;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(); // JDK1.7
        strings.add("test...");

        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(123);
        list.add(true);
    }
}
