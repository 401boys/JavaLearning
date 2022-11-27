/*
 * Created by JFormDesigner on Wed Nov 23 16:29:31 HKT 2022
 */

package Swing;

import Util.RelayUtil;
import Util.WAVUtil;
import Util.SoundUtil;

import java.awt.*;
import java.awt.event.*;
import java.net.MalformedURLException;
import javax.swing.*;
import javax.swing.border.*;

/**
 *
 * @author B20040628
 * @date 2022/11/26 17:34
 */



public class TestPanel extends JFrame {
    public TestPanel() {
        initComponents();
    }

    private void button1MouseClicked(MouseEvent e) throws MalformedURLException {
        WAVUtil.wav("1");
        textField1.setText("1");
    }

    private void button2MouseClicked(MouseEvent e) throws MalformedURLException {
        WAVUtil.wav("2");
        textField1.setText("2");
    }

    private void button3MouseClicked(MouseEvent e) throws MalformedURLException {
        WAVUtil.wav("3");
        textField1.setText("3");
    }

    private void button4MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("4");
        WAVUtil.wav("4");
    }

    private void button5MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("5");
        WAVUtil.wav("5");
    }

    private void button6MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("6");
        WAVUtil.wav("6");
    }

    private void button7MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("7");
        WAVUtil.wav("7");
    }

    private void button8MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("8");
        WAVUtil.wav("8");
    }

    private void button9MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("9");
        WAVUtil.wav("9");
    }

    private void button10MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("0");
        WAVUtil.wav("0");
    }
    private void button11MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("+");
        WAVUtil.wav("+");
    }

    private void button12MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("-");
        WAVUtil.wav("-");
    }

    private void button13MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("*");
        WAVUtil.wav("*");
    }

    private void button14MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("/");
        WAVUtil.wav("/");
    }

    private void button15MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText(".");
        WAVUtil.wav(".");
    }

    private void button16MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("sl");
        WAVUtil.wav("sl");
    }

    private void button17MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("sr");
        WAVUtil.wav("sr");
    }

    private void button18MouseClicked(MouseEvent e) throws MalformedURLException {
        textField1.setText("clr");
        WAVUtil.wav("clr");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        dialogPane = new JPanel();
        contentPanel = new JPanel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
        button5 = new JButton();
        button6 = new JButton();
        button7 = new JButton();
        button8 = new JButton();
        button9 = new JButton();
        button10 = new JButton();
        button11 = new JButton();
        button12 = new JButton();
        button13 = new JButton();
        button14 = new JButton();
        button15 = new JButton();
        button16 = new JButton();
        button17 = new JButton();
        button18 = new JButton();
        textField1 = new JTextField();
        buttonBar = new JPanel();
        okButton = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== dialogPane ========
        {
            dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
            dialogPane.setLayout(new BorderLayout());

            //======== contentPanel ========
            {
                contentPanel.setLayout(new GridBagLayout());
                ((GridBagLayout)contentPanel.getLayout()).columnWidths = new int[] {55, 55, 55, 55, 55, 55, 55, 55, 55, 50, 0};
                ((GridBagLayout)contentPanel.getLayout()).rowHeights = new int[] {55, 55, 0, 0};
                ((GridBagLayout)contentPanel.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
                ((GridBagLayout)contentPanel.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

                //---- button1 ----
                button1.setText("1");
                button1.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button1MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button2 ----
                button2.setText("2");
                button2.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button2MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button2, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button3 ----
                button3.setText("3");
                button3.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button3MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button3, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button4 ----
                button4.setText("4");
                button4.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button4MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button4, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button5 ----
                button5.setText("5");
                button5.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button5MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button5, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button6 ----
                button6.setText("6");
                button6.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button6MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button6, new GridBagConstraints(5, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button7 ----
                button7.setText("7");
                button7.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button7MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button7, new GridBagConstraints(6, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button8 ----
                button8.setText("8");
                button8.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button8MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button8, new GridBagConstraints(7, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button9 ----
                button9.setText("9");
                button9.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button9MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button9, new GridBagConstraints(8, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button10 ----
                button10.setText("0");
                button10.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button10MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button10, new GridBagConstraints(9, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 0), 0, 0));

                //---- button11 ----
                button11.setText("+");
                button11.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button11MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button11, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button12 ----
                button12.setText("-");
                button12.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button12MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button12, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button13 ----
                button13.setText("*");
                button13.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button13MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button13, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button14 ----
                button14.setText("/");
                button14.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button14MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button14, new GridBagConstraints(3, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button15 ----
                button15.setText(".");
                button15.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button15MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button15, new GridBagConstraints(4, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button16 ----
                button16.setText("sl");
                button16.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button16MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button16, new GridBagConstraints(5, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button17 ----
                button17.setText("sr");
                button17.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button17MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button17, new GridBagConstraints(6, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));

                //---- button18 ----
                button18.setText("ac");
                button18.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        try {
                            button18MouseClicked(e);
                        } catch (MalformedURLException ex) {
                            throw new RuntimeException(ex);
                        }
                    }
                });
                contentPanel.add(button18, new GridBagConstraints(7, 1, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 5, 5), 0, 0));
                contentPanel.add(textField1, new GridBagConstraints(0, 2, 4, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 5), 0, 0));
            }
            dialogPane.add(contentPanel, BorderLayout.NORTH);

            //======== buttonBar ========
            {
                buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
                buttonBar.setLayout(new GridBagLayout());
                ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
                ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

                //---- okButton ----
                okButton.setText("OK");
                buttonBar.add(okButton, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
                    GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                    new Insets(0, 0, 0, 0), 0, 0));
            }
            dialogPane.add(buttonBar, BorderLayout.SOUTH);
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
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JButton button10;
    private JButton button11;
    private JButton button12;
    private JButton button13;
    private JButton button14;
    private JButton button15;
    private JButton button16;
    private JButton button17;
    private JButton button18;
    private JTextField textField1;
    private JPanel buttonBar;
    private JButton okButton;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
    public static void main(String[] args) {
        new TestPanel();
    }
}
