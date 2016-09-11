/**
 *
 */
package demo;

import java.math.BigDecimal;

/**
 * Created by Administrator
 * 2016/9/11.
 */
public class Calculator {
    void add(int x, int y) {
        System.out.println(x + " + " + y + " = " + (x + y));
    }

    void add(double x, double y) {
        BigDecimal a = new BigDecimal(String.valueOf(x));
        BigDecimal b = new BigDecimal(String.valueOf(y));
        System.out.println(x + " + " + y + " = " + (a.add(b)));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(1, 2);
        calculator.add(1.1, 2.2);
    }
}
