/**
 *
 */
package demo;

/**
 * Created by Administrator
 * 2016/9/11.
 */
public class Calculator {

    private int x;
    private int y;

    public Calculator(int x, int y) {
        this.x = x;
        if (y == 0) {
            System.out.println("y can not be zero!");
            System.exit(0);
        }
        this.y = y;
    }

    public void add() {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    public void div() {
        System.out.println(x + " / " + y + " = " + (x / y));
    }

//    public void setY(int y) {
//        // TODO: 2016/9/11 y != 0
//        this.y = y;
//    }
//
//    public int getY() {
//        return this.y;
//    }


    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class CalculatorTest{
    public static void main(String[] args) {
        Calculator calculator = new Calculator(1, 1);
        calculator.setY(0);
        System.out.println(calculator.getY());
//        calculator.div();
    }
}
