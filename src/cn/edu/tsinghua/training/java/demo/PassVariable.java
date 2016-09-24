package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public class PassVariable {

//    int 基本数据类型
//    PassVariable 引用数据类型

    private int i;

//    public static void test(int i) { // 形式参数
//        System.out.println("2: " + i); // 0
//        i++;
//        System.out.println("3: " + i); // 1
//    }

//    public static void test(PassVariable passVariable) {
//        System.out.println(passVariable.i); // 0
//        passVariable.i ++;
//        System.out.println(passVariable.i); // 1
//    }

    public static void test(String s) {
        s += "test";
    }

    public static void main(String[] args) {
//        int i = 0;
//        System.out.println("1: " + i); // 0
//        test(i); // 实际参数
//        System.out.println("4: " + i); // ?

//        PassVariable passVariable = new PassVariable();
//        System.out.println(passVariable.i); // 0
//        test(passVariable);
//        System.out.println(passVariable.i); // ?

        String s = "test";
        test(s);
        System.out.println(s);
    }
}
