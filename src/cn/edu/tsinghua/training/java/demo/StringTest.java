package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public class StringTest {

    private String name;
    private static  int i;

    public static void main(String[] args) {

        StringTest stringTest = new StringTest();
        StringTest.i = 1;


        String s = "hello";
        System.out.println(s.charAt(1));
    }
}
