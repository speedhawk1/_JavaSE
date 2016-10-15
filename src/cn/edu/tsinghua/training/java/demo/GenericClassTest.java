package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public class GenericClassTest<T, S> {

    public static void main(String[] args) {
        GenericClassTest genericClassTest = new GenericClassTest();
        GenericClassTest<String, Integer> stringGenericClassTest = new GenericClassTest<>();
    }
}
