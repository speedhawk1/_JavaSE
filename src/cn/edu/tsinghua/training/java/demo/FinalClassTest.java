package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public final class FinalClassTest {

    private static final int ONE_TWO_THREE = 123; // 常量

    public FinalClassTest() {
//        i = 0;
    }

    public final void m() {

    }

    public static void main(String[] args) {
        FinalClassTest finalClassTest = new FinalClassTest();
//        finalClassTest.i = 0;
    }
}

//class SubFinalClassTest extends FinalClassTest {
////    @Override
////    public void m() {
////        super.m();
////    }
//}

//class SubString extends String {}