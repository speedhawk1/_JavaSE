package cn.edu.tsinghua.training.java.demo;

import java.util.ArrayList;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public class ExceptionTest {

    public static void main(String[] args) {

        try {
            System.out.println(args[0]); // ArrayIndexOutOfBoundsException
            System.out.println("asdf...");
        } catch (NullPointerException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
//            System.exit(0);
        } finally {
            System.out.println("finally...");
        }

//        int x = 1;
//        int y = 0;

//        System.out.println(x / y);  // ArithmeticException 算术

//        String s = "l23";
//        int i = Integer.parseInt(s); // NumberFormatException
//        System.out.println(i + 123);

//        ArrayList list = new ArrayList();
//        list.add(123);
//        String s = (String) list.get(0); // ClassCastException

//        String s = "hello";
//        s = null;
//        System.out.println(s.length()); // NullPointerException NPE

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
