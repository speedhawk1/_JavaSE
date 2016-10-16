package cn.edu.tsinghua.training.java.demo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Administrator
 * 2016/10/16.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("c:/");
//        System.out.println(file.length()/1024/1024);
//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());

//        System.out.println(file.canRead());
//        System.out.println(file.canWrite());

//        try {
//            System.out.println(file.createNewFile());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        System.out.println(file.delete());

//        System.out.println(file.isHidden());

//        System.out.println(new Date(file.lastModified()));

        for (String s : file.list()) {
            System.out.println(s);
        }

//        for (File f : file.listFiles()) {
//            System.out.println(f.getName() + " : " + f.isFile());
//        }

//        System.out.println(file.mkdir()); // make directory
//        System.out.println(file.mkdirs());



    }
}
