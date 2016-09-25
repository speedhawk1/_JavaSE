package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public class StringTest {

    private String name;
    private static int i;

    public static void main(String[] args) {

        StringTest stringTest = new StringTest();
        StringTest.i = 1;


        String s = "hellaaaaaaaaaaaaaaaaaaaao你好";
        System.out.println(s.charAt(s.length() - 1));
        System.out.println(s.length());
        String s1 = "hi";
        System.out.println(s + s1);

        System.out.println(s.contains("a")); // Ctrl + Q

        System.out.println(s.indexOf("l"));
        System.out.println(s.lastIndexOf("l"));

        System.out.println(s.replace("l", "a"));
        System.out.println(s);

        String s2 = "a  b c d e";
        String[] strings = s2.split("  ");
        for (String string : strings) {
            System.out.println(string);
        }

        System.out.println(s.startsWith("he"));
        System.out.println(s.endsWith("好"));

        System.out.println(s.substring(s.indexOf("o"), s.indexOf("o") + 2));


        System.out.println(s.toUpperCase().toLowerCase());


        String s3 = "heLLo";

        System.out.println(upper(s3));
        System.out.println(lower(s3));

        System.out.println("==============");
        String s4 = "hello";
        s4 = "hi";
        System.out.println(s4);
    }

    public static String upper(String s) {
        char[] chars = s.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] >= 'a' && chars[j] <= 'z') {
                chars[j] -= 32;
            }
        }
        return new String(chars);
    }

    public static String lower(String s) {
        char[] chars = s.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            if (chars[j] >= 'A' && chars[j] <= 'Z') {
                chars[j] += 32;
            }
        }
        return new String(chars);
    }

}
