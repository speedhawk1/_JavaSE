package cn.edu.tsinghua.training.java.demo;

import java.io.*;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class outputStreamWriterTest {
    public static void main(String[] args) {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream("d:/utf8.txt"), "UTF-8")) { // InputStreamReader
            writer.write("问。。。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
