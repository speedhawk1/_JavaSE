package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public class ExceptionTest {

    public static void main(String[] args) {

        try {
            System.out.println(args[0]); // ArrayIndexOutOfBoundsException
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("test...");

//        String s = "hi";
//        System.out.println(s.charAt(2)); // StringIndexOutOfBoundsException
    }
}
/*
java.lang.ArrayIndexOutOfBoundsException: 0
        at cn.edu.tsinghua.training.java.demo.ExceptionTest.main(ExceptionTest.java:12)

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
	at cn.edu.tsinghua.training.java.demo.ExceptionTest.main(ExceptionTest.java:12)
*/
