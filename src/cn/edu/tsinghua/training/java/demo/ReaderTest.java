package cn.edu.tsinghua.training.java.demo;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class ReaderTest {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("c:/test.txt");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
