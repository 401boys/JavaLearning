package Swing;

/**
 * @Author mapKey
 * @Date 2022-11-26-18:53
 */

/**
 * @Author mapKey
 * @Date 2022-11-26-18:48
 */
public class Calculator {
    public StringBuilder downStrB;
    public StringBuilder upStrB;

    public StringBuilder getDownStrB() {
        return downStrB;
    }

    public void setDownStrB(StringBuilder downStrB) {
        this.downStrB = downStrB;
    }

    public StringBuilder getUpStrB() {
        return upStrB;
    }

    public void setUpStrB(StringBuilder upStrB) {
        this.upStrB = upStrB;
    }

    public Calculator() {
    }

    public Calculator(StringBuilder downStrB, StringBuilder upStrB) {
        this.downStrB = downStrB;
        this.upStrB = upStrB;
    }
}
