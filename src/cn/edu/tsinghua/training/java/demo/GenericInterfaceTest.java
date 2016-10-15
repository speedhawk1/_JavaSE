package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public interface GenericInterfaceTest<T extends Number> {
    T m(T t);

    void method();
}

class GenericInterfaceTestImpl<T extends Number> implements GenericInterfaceTest<T> {

    @Override
    public T m(T t) {
        return null;
    }

    @Override
    public void method() {

    }

    public static void main(String[] args) {
        GenericInterfaceTestImpl<Long> test = new GenericInterfaceTestImpl<>();
    }
}
