package Util;

import Swing.Calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Stack;

/**
 * @Author mapKey
 * @Date 2022-11-26-19:04
 */
public class CalcUtil {
    public static final HashMap<String, Integer> inStackPri = new HashMap<>();

    static {
        inStackPri.put("#", 0);
        inStackPri.put("×", 5);
        inStackPri.put("÷", 5);
        inStackPri.put("+", 3);
        inStackPri.put("-", 3);
    }

    public static final HashMap<String, Integer> inComingPri = new HashMap<>();

    static {
        inComingPri.put("#", 0);
        inComingPri.put("×", 4);
        inComingPri.put("÷", 4);
        inComingPri.put("+", 2);
        inComingPri.put("-", 2);
    }



    public static String insetBlanks(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-' || s.charAt(i) == '×' || s.charAt(i) == '÷')
                result.append(" ").append(s.charAt(i)).append(" ");
            else
                result.append(s.charAt(i));
        }
        return result.toString();
    }

    /**
     * @param expression a string of a valid expression 合法字符串算出值
     * @return the value of the expression
     */
    public static String expressionToValue(String expression) {
        String temp = new String();
        Stack<String> stack = new Stack<>();
        Stack<String> stack_cal = new Stack<>();

        expression = insetBlanks(expression);
        String[] tokens = expression.split(" ");
        stack.push("#");
        for (String s : tokens) {
            if (inStackPri.containsKey(s)) {
                while (inComingPri.get(s) < inStackPri.get(stack.peek())) {
                    temp = stack.pop();
                    computeAndPush(stack_cal, temp);
                }
                stack.push(s);
            } else {
                stack_cal.push(s);
            }
        }
        while (!stack.isEmpty()) {
            temp = stack.pop();
            if (!temp.equals("#")) {
                computeAndPush(stack_cal, temp);
            }
        }
        return stack_cal.pop();
    }

    private static void computeAndPush(Stack<String> stack_cal, String temp) {
        BigDecimal a = new BigDecimal(stack_cal.pop());
        BigDecimal b = new BigDecimal(stack_cal.pop());
        switch (temp) {
            case "+":
                stack_cal.push(b.add(a).toString());
                break;
            case "-":
                stack_cal.push(b.subtract(a).toString());
                break;
            case "×":
                stack_cal.push(b.multiply(a).toString());
                break;
            case "÷":
                stack_cal.push(b.divide(a, 8, RoundingMode.HALF_UP).toString());
                break;
        }
    }




}
