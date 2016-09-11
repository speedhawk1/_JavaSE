package demo;

/**
 * Created by Administrator
 * 2016/9/11.
 */
public class Chinese extends Human {

    void speakChinese() {

    }
}

class Demo extends Chinese{

    public static void main(String[] args) {
        Demo demo = new Demo();
        Chinese chinese = new Chinese();
        System.out.println(chinese instanceof Demo);
    }
}
