package cn.edu.tsinghua.training.java.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class ReadLineTest {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("d:/article.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
