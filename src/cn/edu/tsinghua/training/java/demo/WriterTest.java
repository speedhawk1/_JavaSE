package cn.edu.tsinghua.training.java.demo;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class WriterTest {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("c:/3.txt");
            writer.write("中文");
//            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
