/**
 * Created by Administrator
 * 2016/9/11.
 */
public class Parent {
    {
        System.out.println("parent constructor block");
    }

    static {
        System.out.println("parent static block");
    }

    public Parent() {
        System.out.println("parent constructor");
    }
}

class Child extends Parent {
    {
        System.out.println("child constructor block");
    }

    static {
        System.out.println("child static block");
    }

    public Child() {
        System.out.println("child constructor");
    }
}

class Test {
    public static void main(String[] args) {
        new Child();
    }
}