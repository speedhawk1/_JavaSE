package cn.edu.tsinghua.training.java.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(2, "hi");

        System.out.println(map.size());
        System.out.println(map.get(2));

        for (Integer integer : map.keySet()) {
            System.out.println(integer + " > " + map.get(integer));
        }
    }
}
