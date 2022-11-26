package Util;

import Swing.Calculator;

/**
 * @Author mapKey
 * @Date 2022-11-26-19:04
 */
public class CalcUtil {

    public static void addNumber(Calculator c, String s) {
        c.downStrB.append(s);

    }

    public static void addSymbol(Calculator c, String s) {
        c.downStrB.append(s);
    }
}
