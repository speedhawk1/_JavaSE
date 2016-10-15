package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public class AddTest {

    //    1. add int  x=1, y=2 // 12
    public String add(int x, int y) {
//        return "" + x + y;
        return String.valueOf(x) + String.valueOf(y);
    }
//    2. add double x=1.1, y=2.2 // 1.12.2
//    3. add boolean x=true, y=false // truefalse

    public static void main(String[] args) {
        AddTest addTest = new AddTest();

    }
}
