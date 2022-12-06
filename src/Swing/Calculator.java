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
    public StringBuilder downStrBd;
    public StringBuilder upStrBd;
    //public StringBuilder downStrB = new StringBuilder();
    //public StringBuilder upStrB = new StringBuilder();

    public StringBuilder getDownStrBd() {
        return downStrBd;
    }

    public void setDownStrBd(StringBuilder downStrBd) {
        this.downStrBd = downStrBd;
    }

    public StringBuilder getUpStrBd() {
        return upStrBd;
    }

    public void setUpStrBd(StringBuilder upStrBd) {
        this.upStrBd = upStrBd;
    }

    public Calculator() {
        downStrBd = new StringBuilder(100);
        upStrBd = new StringBuilder(100);
        //upStrB.append("0");
    }

    public Calculator(StringBuilder downStrBd, StringBuilder upStrBd) {
        this.downStrBd = downStrBd;
        this.upStrBd = upStrBd;
    }
}
