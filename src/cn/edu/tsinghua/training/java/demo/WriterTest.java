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
        /*
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
        */

        try (Writer writer = new MyFileWriter("c:/5.txt")) { // try with resources
            writer.write("汉字。。。");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class MyFileWriter extends FileWriter {

    public MyFileWriter(String fileName) throws IOException {
        super(fileName);
    }

    @Override
    public void close() throws IOException {
        super.close();
        System.out.println("closed...");
    }
}
