package cn.edu.tsinghua.training.java.demo;

import java.io.*;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class BufferedTest {
    private static final String FILE_NAME = "d:/0/software/ideaIU-2016.1.4.win.zip";
    private static final String NEW_FILE_NAME = "d:/new.zip";

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream(FILE_NAME)); OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(NEW_FILE_NAME))) {
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("total time: " + (System.currentTimeMillis() - start) / 1000 + " seconds.");
    }
}
