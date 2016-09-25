package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/25.
 */
public class _2DArray {
    public static void main(String[] args) {
//        int[][] ints = new int[3][];
//        ints[0] = new int[1];
//        ints[1] = new int[5];
//        ints[2] = new int[2];

        int[][] ints = {
                {1},
                {1, 2, 3, 4, 5},
                {1, 2}
        };

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
//                ints[i][j] = i + j;
            }
        }

        System.out.println(ints.length); // 3
        System.out.println(ints[0].length); // 1
        System.out.println(ints[1].length); // 5
        System.out.println(ints[2].length); // 2

        String[][][] strings = new String[1][2][3];
    }
}
