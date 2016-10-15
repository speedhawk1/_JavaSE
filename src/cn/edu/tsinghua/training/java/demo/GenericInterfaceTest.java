package cn.edu.tsinghua.training.java.demo;

/**
 * Created by Administrator
 * 2016/10/15.
 */
public interface GenericInterfaceTest<T> {
    T m(T t);
}

class GenericInterfaceTestImpl<T> implements GenericInterfaceTest<T> {

    @Override
    public T m(T t) {
        return null;
    }
}
