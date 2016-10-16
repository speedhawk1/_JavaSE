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
        try {
            Writer writer = new FileWriter("c:/2.txt");
            writer.write("中文");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
