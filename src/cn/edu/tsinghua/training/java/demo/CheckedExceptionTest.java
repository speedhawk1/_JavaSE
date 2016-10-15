package cn.edu.tsinghua.training.java.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public class CheckedExceptionTest {

    public static void main(String[] args) {
        System.out.println("input file name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        test(name);
    }

    public static void test(String name) {
        Random random = new Random();
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(name, "r"); // bug
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

        System.out.println("test");

        try {
            CheckedExceptionTest checkedExceptionTest = new CheckedExceptionTest();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public CheckedExceptionTest() throws IOException {

    }
}
