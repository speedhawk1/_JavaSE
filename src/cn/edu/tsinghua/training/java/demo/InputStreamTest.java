package cn.edu.tsinghua.training.java.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class InputStreamTest {

//    private static void method() {
//        try {
//            InputStream inputStream = new FileInputStream("");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    public static void main(String[] args) {
//        method();

        try {
            InputStream inputStream = new FileInputStream("c:/test.txt");
            System.out.println((char)inputStream.read());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
