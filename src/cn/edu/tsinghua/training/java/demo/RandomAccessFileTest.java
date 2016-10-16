package cn.edu.tsinghua.training.java.demo;

import java.io.*;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile("c:/r", "rw")) {
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(i * 0.5);
            }
            randomAccessFile.seek(8L);
            System.out.println(randomAccessFile.readDouble()); // Eed Of File
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
