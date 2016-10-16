package cn.edu.tsinghua.training.java.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class DownloadImage {
    private static String imageURL = "http://tankr.net/s/custom/GWR5.jpg";

    public static void main(String[] args) throws IOException {
        URL url = new URL(imageURL);
        try (InputStream inputStream = url.openStream(); OutputStream outputStream = new FileOutputStream("d:/1.jpg")){
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
        }
    }
}
