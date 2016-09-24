package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/9/24.
 */
public abstract class AbstractClassTest {

    public abstract void test(int i);

    public void method() {

    }

    public static void main(String[] args) {
//        AbstractClassTest abstractClassTest = new AbstractClassTest();
    }
}

class SubAbstractClassTest extends AbstractClassTest {

    @Override
    public void test(int i) {

    }
}
