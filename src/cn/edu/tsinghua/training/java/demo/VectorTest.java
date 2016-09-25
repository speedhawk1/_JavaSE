package cn.edu.tsinghua.training.java.demo;

import java.util.Vector;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();
        strings.add("hello");
        strings.add("hi");
        strings.add("hi");
        strings.add("test");
//        ...
        strings.set(3, "test new...");
        strings.remove(3);
        System.out.println(strings.get(strings.size() - 1));

        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.size());
        strings.clear();
        System.out.println(strings.size());

//        Set<String> stringSet = new HashSet<>();
//        stringSet.add("hello");
//        stringSet.add("hi");
//        stringSet.add("hi");
//        System.out.println(stringSet.size());
    }
}
