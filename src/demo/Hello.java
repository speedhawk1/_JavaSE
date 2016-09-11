package demo;

/**
 * Created by Administrator
 * 2016/9/10.
 */
public class Hello {
    public static void main(String[] args) {
        long l = 1L; // int
        float f = 1.2f;

//        char c = 65535;
//        char c = '中';
//        char c = '\t';
//        char c = '\123';
        char c = '\u9fbb';

        String s = "hi...";
        System.out.println(s);

        int i = 1;
        int j = 2;

        System.out.println(i / j);

        --i;

        System.out.println(i++); // 0
        System.out.println(i); // 1

        System.out.println((-i) % j);

        System.out.println(i != j); // boolean

        String s1 = new String("hi...");

        System.out.println(s1);
        System.out.println(s != s1);

        System.out.println(i);
        System.out.println(j);

        System.out.println((i > j) & (i++ > 0));
        System.out.println(i);

        int z = 0;
        z += i; // z = z + i;
        System.out.println(z);

//        z = (i < j) ? 100 : -1;

        if (i < j) {
            z = 100;
        } else {
            z = -1;
        }
        System.out.println(z);

        int k = 65; // [,]
        char c1 = (char) k;
//        char c2 = 100;
//        int k = c2;
        System.out.println((int)c1);

        String s2 = "abc";

        switch (s2) {
            case "abc":
                System.out.println("abc...");
                break;
            default:
                System.out.println("default...");
        }

        for (int m = 0; m < 10; m++) {
            System.out.println(m);
        }

    }
}
