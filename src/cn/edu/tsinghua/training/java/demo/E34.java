package cn.edu.tsinghua.training.java.demo;

import java.util.Hashtable;
import java.util.Random;

/**
 * Created by Administrator
 * 2016/9/25.
 */
// 随机生成[1， 20]数10000次，使用两种方法实现（java.lang.Math，java.util.Random），并判断两种方法的效率和分布。
public class E34 {
    public static void main(String[] args) {

        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < 20; i++) {
            hashtable.put(i + 1, 0);
        }

//        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
//            int r = (int) (Math.random() * 20) + 1;
            Random random = new Random();
            int r = random.nextInt(20) + 1;
            hashtable.put(r, hashtable.get(r) + 1); // *****
//            System.out.println(r);
        }
//        System.out.println(System.currentTimeMillis() - start);

        for (Integer integer : hashtable.keySet()) {
            System.out.println(integer + "\t-\t" + hashtable.get(integer));
        }
    }
}

/*
1 3
2 1503
3

 */
