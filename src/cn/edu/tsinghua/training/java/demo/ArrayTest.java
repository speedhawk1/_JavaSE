package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class ArrayTest {
    public static void main(String[] args) {

//        shift + alt + f10
        System.out.println(args.length);

        int[] ints = new int[10];

        System.out.println(ints.length); // 运行时异常 Runtime Exception

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
            System.out.println(ints[i]);
        }

        System.out.println(ints[ints.length - 1]);

        String[] strings = {"hello", "hi", "test", "asdf..."};

        for (int i = 0; i < strings.length; i++) {
            System.out.println(i);
            System.out.println(strings[i]);
        }

//        iter + Tab
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(strings.length);

        Object[] objects = new Object[10];
        objects[0] = 1;
        objects[1] = "hi";
        objects[2] = new ArrayTest();
        System.out.println(objects[0]);

    }
}
