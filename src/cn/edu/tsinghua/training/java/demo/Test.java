package cn.edu.tsinghua.training.java.demo;


//import java.lang.String; language

/**
 * Created by Administrator
 * 2016/9/11.
 */
public class Test extends Object {

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test);
    }

    @Override
    public String toString() {
        return "a Test class instance...";
    }
}
