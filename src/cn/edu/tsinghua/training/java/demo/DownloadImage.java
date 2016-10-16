package cn.edu.tsinghua.training.java.demo;

import java.io.*;
import java.net.URL;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class DownloadImage {

    private static int counter;

    public static void main(String[] args) throws IOException {
        String imageURL = "http://jandan.net/tag/%E5%A4%A9%E6%96%87";
        URL url = new URL(imageURL);
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.contains("tankr")) {
                    System.out.println(++counter);
                    down("http://" + line.substring(line.indexOf("tankr"), line.indexOf(" width") - 1));
                }
            }
            System.out.println(counter);
        }
    }

    public static void down(String imageURL) throws IOException {
        URL url = new URL(imageURL);
        String fileName = counter + ".jpg";
        try (
                BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("data/" + fileName))
        ) {
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
        }
    }
}
