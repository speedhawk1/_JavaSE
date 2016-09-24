package cn.edu.tsinghua.training.java.demo;

import demo.Human; // java.lang

/**
 * Created by Administrator
 * 2016/9/24.
 */
public class Asian  extends Human {

//    public static void main(String[] args) {
//
//        Asian asian = new Asian();
//        asian.age = 1;
//    }

    @Override
    public void study() {
        super.study();
        System.out.println("Asian study...");
    }
}
