/*
 * Created by JFormDesigner on Tue Nov 22 19:59:12 HKT 2022
 */

package Swing;

import Util.CalcUtil;

import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author B20040628
 */
public class CalcPanel extends JFrame {
    Calculator c1;
    Calculator c2;
    HashMap<Character, Boolean> numMap = new HashMap<>();
    boolean hasSymbol;


    public CalcPanel() {
        c1 = new Calculator();
        c2 = new Calculator();
        initComponents();
        c1_Disp();
        c2_Disp();

        numMap.put('0', true);
        numMap.put('1', true);
        numMap.put('2', true);
        numMap.put('3', true);
        numMap.put('4', true);
        numMap.put('5', true);
        numMap.put('6', true);
        numMap.put('7', true);
        numMap.put('8', true);
        numMap.put('9', true);
    }

    private void L_0MouseClicked(MouseEvent e) {
        addNumber(c1, "0");
        c1_Disp();
    }

    private void L_1MouseClicked(MouseEvent e) {
        addNumber(c1, "1");
        c1_Disp();
    }

    private void L_2MouseClicked(MouseEvent e) {

    }

    private void L_3MouseClicked(MouseEvent e) {

    }

    private void L_4MouseClicked(MouseEvent e) {

    }

    private void L_EquMouseClicked(MouseEvent e) {
        String res = addSymbol(c1, "=");
        //只有当等于的时候, downStrBd
        c1.downStrBd.append(res);
        c1_Disp();
    }

    private void L_AddMouseClicked(MouseEvent e) {
        addSymbol(c1, "+");
        c1_Disp();
    }

    private void DELMouseClicked(MouseEvent e) {
        //重新开辟的方式
        c1.downStrBd = new StringBuilder(100);
        //Todo:初始化0
        c1.upStrBd = new StringBuilder(100);

        c2.downStrBd = new StringBuilder(100);
        c2.upStrBd = new StringBuilder(100);
        //c2.downStrB = new StringBuilder("0");
        // 删除的方式
       /* c1.downStrB.delete(0, c1.downStrB.length());
        c1.upStrB.delete(0, c1.upStrB.length());
        //c1.upStrB.append("0");

        c2.downStrB.delete(0, c2.downStrB.length());
        c2.upStrB.delete(0, c2.upStrB.length());
        //c2.upStrB.append("0");*/
        hasSymbol = false;
        c1_Disp();
        c2_Disp();
    }


    public void c1_Disp() {
        textField1.setText(c1.upStrBd.toString());
        textField3.setText(c1.downStrBd.toString());
    }

    public void c2_Disp() {
        textField2.setText(c2.upStrBd.toString());
        textField4.setText(c2.downStrBd.toString());
    }

    public void addNumber(Calculator c, String s) {
        if (hasSymbol && isNum(c.downStrBd.charAt(c.downStrBd.length() - 1))) {
        } else {
            c.upStrBd = new StringBuilder(100);

        }
        c.upStrBd.append(s);
        c.downStrBd.append(s);
    }

    private boolean isNum(char c) {
        return numMap.get(c);
    }

    public String addSymbol(Calculator c, String s) {
        hasSymbol = true;
        String res = CalcUtil.expressionToValue(c.downStrBd.toString());
        c.downStrBd.append(s);
        c.upStrBd = new StringBuilder(res);
        return res;
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        textField1 = new JTextField();
        textField2 = new JTextField();
        textField3 = new JTextField();
        textField4 = new JTextField();
        L_AC = new JButton();
        L_NOT = new JButton();
        L_Percent = new JButton();
        L_Div = new JButton();
        Switch_L = new JButton();
        R_AC = new JButton();
        R_NOT = new JButton();
        R_Percent = new JButton();
        R_Div = new JButton();
        L_7 = new JButton();
        L_8 = new JButton();
        L_9 = new JButton();
        L_Mul = new JButton();
        Switch_R = new JButton();
        R_7 = new JButton();
        R_8 = new JButton();
        R_9 = new JButton();
        R_Mul = new JButton();
        L_4 = new JButton();
        L_5 = new JButton();
        L_6 = new JButton();
        L_Sub = new JButton();
        R_4 = new JButton();
        R_5 = new JButton();
        R_6 = new JButton();
        R_Sub = new JButton();
        L_1 = new JButton();
        L_2 = new JButton();
        L_3 = new JButton();
        L_Add = new JButton();
        R_1 = new JButton();
        R_2 = new JButton();
        R_3 = new JButton();
        R_Add = new JButton();
        L_0 = new JButton();
        L_Dot = new JButton();
        L_Equ = new JButton();
        DEL = new JButton();
        R_0 = new JButton();
        R_Dot = new JButton();
        R_Equ = new JButton();

        //======== this ========
        setTitle("Twin-Calc");
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridBagLayout());
                ((GridBagLayout) contentPanel.getLayout()).columnWidths = new int[]{95, 95, 95, 95, 85, 95, 95, 95, 90, 0};
                ((GridBagLayout) contentPanel.getLayout()).rowHeights = new int[]{105, 15, 65, 85, 85, 85, 85, 80, 0};
                ((GridBagLayout) contentPanel.getLayout()).columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout) contentPanel.getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                contentPanel.add(textField1, new GridBagConstraints(0, 0, 4, 2, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                contentPanel.add(textField2, new GridBagConstraints(5, 0, 4, 2, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));
                contentPanel.add(textField3, new GridBagConstraints(0, 2, 4, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));
                contentPanel.add(textField4, new GridBagConstraints(5, 2, 4, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                //---- L_AC ----
                L_AC.setText("AC");
                L_AC.setFont(L_AC.getFont().deriveFont(L_AC.getFont().getStyle() | Font.BOLD, L_AC.getFont().getSize() + 10f));
                contentPanel.add(L_AC, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_NOT ----
                L_NOT.setText("+/-");
                L_NOT.setFont(L_NOT.getFont().deriveFont(L_NOT.getFont().getStyle() | Font.BOLD, L_NOT.getFont().getSize() + 15f));
                contentPanel.add(L_NOT, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_Percent ----
                L_Percent.setText("%");
                L_Percent.setFont(L_Percent.getFont().deriveFont(L_Percent.getFont().getStyle() | Font.BOLD, L_Percent.getFont().getSize() + 15f));
                contentPanel.add(L_Percent, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_Div ----
                L_Div.setText("\u00f7");
                L_Div.setFont(L_Div.getFont().deriveFont(L_Div.getFont().getStyle() | Font.BOLD, L_Div.getFont().getSize() + 20f));
                contentPanel.add(L_Div, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- Switch_L ----
                Switch_L.setText("\u2190");
                Switch_L.setFont(Switch_L.getFont().deriveFont(Switch_L.getFont().getStyle() | Font.BOLD, Switch_L.getFont().getSize() + 20f));
                contentPanel.add(Switch_L, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_AC ----
                R_AC.setText("AC");
                R_AC.setFont(R_AC.getFont().deriveFont(R_AC.getFont().getStyle() | Font.BOLD, R_AC.getFont().getSize() + 10f));
                contentPanel.add(R_AC, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_NOT ----
                R_NOT.setText("+/-");
                R_NOT.setFont(R_NOT.getFont().deriveFont(R_NOT.getFont().getStyle() | Font.BOLD, R_NOT.getFont().getSize() + 15f));
                contentPanel.add(R_NOT, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_Percent ----
                R_Percent.setText("%");
                R_Percent.setFont(R_Percent.getFont().deriveFont(R_Percent.getFont().getStyle() | Font.BOLD, R_Percent.getFont().getSize() + 15f));
                contentPanel.add(R_Percent, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_Div ----
                R_Div.setText("\u00f7");
                R_Div.setFont(R_Div.getFont().deriveFont(R_Div.getFont().getStyle() | Font.BOLD, R_Div.getFont().getSize() + 20f));
                contentPanel.add(R_Div, new GridBagConstraints(8, 3, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                //---- L_7 ----
                L_7.setText("7");
                L_7.setFont(L_7.getFont().deriveFont(L_7.getFont().getSize() + 10f));
                contentPanel.add(L_7, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_8 ----
                L_8.setText("8");
                L_8.setFont(L_8.getFont().deriveFont(L_8.getFont().getSize() + 10f));
                contentPanel.add(L_8, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_9 ----
                L_9.setText("9");
                L_9.setFont(L_9.getFont().deriveFont(L_9.getFont().getSize() + 10f));
                contentPanel.add(L_9, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_Mul ----
                L_Mul.setText("\u00d7");
                L_Mul.setFont(L_Mul.getFont().deriveFont(L_Mul.getFont().getStyle() | Font.BOLD, L_Mul.getFont().getSize() + 20f));
                contentPanel.add(L_Mul, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- Switch_R ----
                Switch_R.setText("\u2192");
                Switch_R.setFont(Switch_R.getFont().deriveFont(Switch_R.getFont().getStyle() | Font.BOLD, Switch_R.getFont().getSize() + 20f));
                contentPanel.add(Switch_R, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_7 ----
                R_7.setText("7");
                R_7.setFont(R_7.getFont().deriveFont(R_7.getFont().getSize() + 10f));
                contentPanel.add(R_7, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_8 ----
                R_8.setText("8");
                R_8.setFont(R_8.getFont().deriveFont(R_8.getFont().getSize() + 10f));
                contentPanel.add(R_8, new GridBagConstraints(6, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_9 ----
                R_9.setText("9");
                R_9.setFont(R_9.getFont().deriveFont(R_9.getFont().getSize() + 10f));
                contentPanel.add(R_9, new GridBagConstraints(7, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_Mul ----
                R_Mul.setText("\u00d7");
                R_Mul.setFont(R_Mul.getFont().deriveFont(R_Mul.getFont().getStyle() | Font.BOLD, R_Mul.getFont().getSize() + 20f));
                contentPanel.add(R_Mul, new GridBagConstraints(8, 4, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                //---- L_4 ----
                L_4.setText("4");
                L_4.setFont(L_4.getFont().deriveFont(L_4.getFont().getSize() + 10f));
                L_4.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        L_4MouseClicked(e);
                    }
                });
                contentPanel.add(L_4, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_5 ----
                L_5.setText("5");
                L_5.setFont(L_5.getFont().deriveFont(L_5.getFont().getSize() + 10f));
                contentPanel.add(L_5, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_6 ----
                L_6.setText("6");
                L_6.setFont(L_6.getFont().deriveFont(L_6.getFont().getSize() + 10f));
                contentPanel.add(L_6, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_Sub ----
                L_Sub.setText("-");
                L_Sub.setFont(L_Sub.getFont().deriveFont(L_Sub.getFont().getStyle() | Font.BOLD, L_Sub.getFont().getSize() + 20f));
                contentPanel.add(L_Sub, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_4 ----
                R_4.setText("4");
                R_4.setFont(R_4.getFont().deriveFont(R_4.getFont().getSize() + 10f));
                contentPanel.add(R_4, new GridBagConstraints(5, 5, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_5 ----
                R_5.setText("5");
                R_5.setFont(R_5.getFont().deriveFont(R_5.getFont().getSize() + 10f));
                contentPanel.add(R_5, new GridBagConstraints(6, 5, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_6 ----
                R_6.setText("6");
                R_6.setFont(R_6.getFont().deriveFont(R_6.getFont().getSize() + 10f));
                contentPanel.add(R_6, new GridBagConstraints(7, 5, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_Sub ----
                R_Sub.setText("-");
                R_Sub.setFont(R_Sub.getFont().deriveFont(R_Sub.getFont().getStyle() | Font.BOLD, R_Sub.getFont().getSize() + 20f));
                contentPanel.add(R_Sub, new GridBagConstraints(8, 5, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                //---- L_1 ----
                L_1.setText("1");
                L_1.setFont(L_1.getFont().deriveFont(L_1.getFont().getSize() + 10f));
                L_1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        L_1MouseClicked(e);
                    }
                });
                contentPanel.add(L_1, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_2 ----
                L_2.setText("2");
                L_2.setFont(L_2.getFont().deriveFont(L_2.getFont().getSize() + 10f));
                L_2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        L_2MouseClicked(e);
                    }
                });
                contentPanel.add(L_2, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_3 ----
                L_3.setText("3");
                L_3.setFont(L_3.getFont().deriveFont(L_3.getFont().getSize() + 10f));
                L_3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        L_3MouseClicked(e);
                    }
                });
                contentPanel.add(L_3, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- L_Add ----
                L_Add.setText("+");
                L_Add.setFont(L_Add.getFont().deriveFont(L_Add.getFont().getSize() + 20f));
                L_Add.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        L_AddMouseClicked(e);
                    }
                });
                contentPanel.add(L_Add, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_1 ----
                R_1.setText("1");
                R_1.setFont(R_1.getFont().deriveFont(R_1.getFont().getSize() + 10f));
                contentPanel.add(R_1, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_2 ----
                R_2.setText("2");
                R_2.setFont(R_2.getFont().deriveFont(R_2.getFont().getSize() + 10f));
                contentPanel.add(R_2, new GridBagConstraints(6, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_3 ----
                R_3.setText("3");
                R_3.setFont(R_3.getFont().deriveFont(R_3.getFont().getSize() + 10f));
                contentPanel.add(R_3, new GridBagConstraints(7, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 5), 0, 0));

                //---- R_Add ----
                R_Add.setText("+");
                R_Add.setFont(R_Add.getFont().deriveFont(R_Add.getFont().getStyle() | Font.BOLD, R_Add.getFont().getSize() + 20f));
                contentPanel.add(R_Add, new GridBagConstraints(8, 6, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 5, 0), 0, 0));

                //---- L_0 ----
                L_0.setText("0");
                L_0.setFont(L_0.getFont().deriveFont(L_0.getFont().getSize() + 10f));
                L_0.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        L_0MouseClicked(e);
                    }
                });
                contentPanel.add(L_0, new GridBagConstraints(0, 7, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- L_Dot ----
                L_Dot.setText(".");
                L_Dot.setFont(L_Dot.getFont().deriveFont(L_Dot.getFont().getStyle() | Font.BOLD, L_Dot.getFont().getSize() + 20f));
                contentPanel.add(L_Dot, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- L_Equ ----
                L_Equ.setText("=");
                L_Equ.setFont(L_Equ.getFont().deriveFont(L_Equ.getFont().getStyle() | Font.BOLD, L_Equ.getFont().getSize() + 20f));
                L_Equ.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        L_EquMouseClicked(e);
                    }
                });
                contentPanel.add(L_Equ, new GridBagConstraints(3, 7, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- DEL ----
                DEL.setText("DEL");
                DEL.setFont(DEL.getFont().deriveFont(DEL.getFont().getSize() + 10f));
                DEL.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        DELMouseClicked(e);
                    }
                });
                contentPanel.add(DEL, new GridBagConstraints(4, 7, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- R_0 ----
                R_0.setText("0");
                R_0.setFont(R_0.getFont().deriveFont(R_0.getFont().getStyle() | Font.BOLD, R_0.getFont().getSize() + 10f));
                contentPanel.add(R_0, new GridBagConstraints(5, 7, 2, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- R_Dot ----
                R_Dot.setText(".");
                R_Dot.setFont(R_Dot.getFont().deriveFont(R_Dot.getFont().getStyle() | Font.BOLD, R_Dot.getFont().getSize() + 20f));
                contentPanel.add(R_Dot, new GridBagConstraints(7, 7, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 5), 0, 0));

                //---- R_Equ ----
                R_Equ.setText("=");
                R_Equ.setFont(R_Equ.getFont().deriveFont(R_Equ.getFont().getStyle() | Font.BOLD, R_Equ.getFont().getSize() + 20f));
                contentPanel.add(R_Equ, new GridBagConstraints(8, 7, 1, 1, 0.0, 0.0,
                        GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                        new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(contentPanel, BorderLayout.CENTER);
        }
        contentPane.add(dialogPane, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JPanel dialogPane;
    private JPanel contentPanel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JButton L_AC;
    private JButton L_NOT;
    private JButton L_Percent;
    private JButton L_Div;
    private JButton Switch_L;
    private JButton R_AC;
    private JButton R_NOT;
    private JButton R_Percent;
    private JButton R_Div;
    private JButton L_7;
    private JButton L_8;
    private JButton L_9;
    private JButton L_Mul;
    private JButton Switch_R;
    private JButton R_7;
    private JButton R_8;
    private JButton R_9;
    private JButton R_Mul;
    private JButton L_4;
    private JButton L_5;
    private JButton L_6;
    private JButton L_Sub;
    private JButton R_4;
    private JButton R_5;
    private JButton R_6;
    private JButton R_Sub;
    private JButton L_1;
    private JButton L_2;
    private JButton L_3;
    private JButton L_Add;
    private JButton R_1;
    private JButton R_2;
    private JButton R_3;
    private JButton R_Add;
    private JButton L_0;
    private JButton L_Dot;
    private JButton L_Equ;
    private JButton DEL;
    private JButton R_0;
    private JButton R_Dot;
    private JButton R_Equ;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
