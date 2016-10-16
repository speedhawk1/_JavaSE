package cn.edu.tsinghua.training.java.demo;

import java.io.*;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class ReaderAndWriterTest {
    public static void main(String[] args) {
//        read c:/some.txt
//        write to c:/some_new.txt

        try (
                Reader reader = new FileReader("c:/5.txt");
                Writer writer = new FileWriter("c:/5_new.txt", true)
        ) {
            int i;
            while ((i = reader.read()) != -1) {
                writer.write(i);
            }
            throw new IOException();
        } catch (IOException e) {
            e.printStackTrace();
            try (Writer writer = new FileWriter("c:/exception.txt", true)) {
                System.out.println("out: " + e.toString());
                writer.write(e.toString());
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
