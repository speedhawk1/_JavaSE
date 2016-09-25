package cn.edu.tsinghua.training.java.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("hi");

        System.out.println(strings.size());
        System.out.println(strings.get(1));
    }
}
