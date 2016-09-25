package cn.edu.tsinghua.training.java.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("hello");
        set.add("hi");
        set.add("hello");
        System.out.println(set.size());

        for (String s : set) {
            System.out.println(s);
        }
    }
}
