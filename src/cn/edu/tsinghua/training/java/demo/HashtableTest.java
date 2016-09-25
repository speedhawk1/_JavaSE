package cn.edu.tsinghua.training.java.demo;

import java.util.Hashtable;
import java.util.Map;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class HashtableTest {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "hello");
        hashtable.put(200, "hello");

        hashtable.put(200, "test");

        System.out.println(hashtable.size());
        System.out.println(hashtable.get(200));

        for (Integer integer : hashtable.keySet()) { // iter + tab
            System.out.println(integer + " > " + hashtable.get(integer));
        }

        for (String s : hashtable.values()) {
            System.out.println(s);
        }

        for (Map.Entry<Integer, String> integerStringEntry : hashtable.entrySet()) {
            System.out.println(integerStringEntry.getKey() + " > " + integerStringEntry.getValue());
        }
    }
}
