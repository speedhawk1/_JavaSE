package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class StringBufferTest {

    private static final String ABC = "abc";

    public static void main(String[] args) {
//        String s = "";
//
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            s += ABC;
//        }
//        System.out.println(System.currentTimeMillis() - start);
//        System.out.println(s.length());

        StringBuffer stringBuffer = new StringBuffer("");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            stringBuffer.append(ABC);
        }
        System.out.println(System.currentTimeMillis() - start);
        System.out.println(stringBuffer.toString());
    }
}
