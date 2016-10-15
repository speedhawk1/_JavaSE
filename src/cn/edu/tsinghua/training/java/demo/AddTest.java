package cn.edu.tsinghua.training.java.demo;

import java.util.ArrayList;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public class AddTest<T, S> {

    public String add(T x, S y) {
        return String.valueOf(x) + String.valueOf(y);
    }

    public static void main(String[] args) {
        AddTest<Integer, Integer> addTest = new AddTest<>();
        String a = addTest.add(1, 2);
        System.out.println(a);

        AddTest<String, AddTest> test = new AddTest<>();
        String b = test.add("hello", test);
        System.out.println(b);

        ArrayList<String> strings = new ArrayList<>(); // type safe
        strings.add("hello");
        String s = strings.get(0);
        System.out.println(s);

        ArrayList list = new ArrayList();
        list.add(123);
        String string = (String) list.get(0); // ClassCastException
        System.out.println(string); // ?

    }
}
