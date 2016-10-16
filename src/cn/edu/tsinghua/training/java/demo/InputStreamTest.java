package cn.edu.tsinghua.training.java.demo;

import java.io.File;
import java.io.FileInputStream;
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

        File file = new File("c:/4.txt");
        System.out.println(file.length());

        InputStream inputStream = null;
        try {
            // 基于字节的输入流
            inputStream = new FileInputStream("c:/4.txt");
            int i = inputStream.read();
            while (i != -1) {
                System.out.print((char) i);
                i = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
