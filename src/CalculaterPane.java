

import javafx.scene.shape.VLineTo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculaterPane {
    private JFrame jFrame;
    private JPanel jPanel;
    private JTextField left;
    private JTextField right;
    private JTextField oper;
    private JLabel equal;
    private JTextField jTextField;
    private JButton b1, b2, b3, b4, b5,b6,b7,b8,b9,b0;
    private JButton ob0, ob1,ob2,ob3,ob4,ob5,ob6,ob7,ob8,ob9, ob10;

    private Count count;

    public void createFrame(){
        System.out.println("测试");
        jFrame = new JFrame("简易计算器");
        jFrame.setLayout(null);
        jFrame.setBounds(200,200,500,600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jPanel = new JPanel();
        jPanel.setBounds(0, 100, 500, 400);
        jPanel.setLayout(new GridLayout(5,6));

        jTextField = new JTextField();
        left = new JTextField();
        right = new JTextField();
        oper = new JTextField();
        equal = new JLabel("=");
        left.setBounds(50, 50, 100, 50);
        oper.setBounds(160, 50, 50, 50);
        right.setBounds(220, 50, 100, 50);
        equal.setBounds(330, 50, 50, 50);
        jTextField.setBounds(380, 50, 100, 50);
        b0 = new JButton();
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        ob0 = new JButton();
        ob1 = new JButton();
        ob2 = new JButton();
        ob3 = new JButton();
        ob4 = new JButton();
        ob5 = new JButton();
        ob6 = new JButton();
        ob7 = new JButton();
        ob8 = new JButton();
        ob9 = new JButton();
        ob10 = new JButton();

        b0.setText("0");
        b1.setText("1");
        b2.setText("2");
        b3.setText("3");
        b4.setText("4");
        b5.setText("5");
        b6.setText("6");
        b7.setText("7");
        b8.setText("8");
        b9.setText("9");
        ob0.setText("+/-");
        ob1.setText("+");
        ob2.setText("-");
        ob3.setText("*");
        ob4.setText("/");
        ob5.setText("%");
        ob6.setText("sq");
        ob7.setText("1/x");
        ob8.setText("=");
        ob9.setText(".");
        ob10.setText("C");
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b0.getText());
                }else {
                    right.setText(right.getText() + b0.getText());
                }
            }
        });
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b1.getText());
                }else {
                    right.setText(right.getText() + b1.getText());
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b2.getText());
                }else {
                    right.setText(right.getText() + b2.getText());
                }
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b3.getText());
                }else {
                    right.setText(right.getText() + b3.getText());
                }
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b4.getText());
                }else {
                    right.setText(right.getText() + b4.getText());
                }
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b5.getText());
                }else {
                    right.setText(right.getText() + b5.getText());
                }
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b6.getText());
                }else {
                    right.setText(right.getText() + b6.getText());
                }
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = oper.getText();

                System.out.println("类型：" + s.getClass());
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b7.getText());
                }else {
                    right.setText(right.getText() + b7.getText());
                }
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b8.getText());
                }else {
                    right.setText(right.getText() + b8.getText());
                }
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    left.setText(left.getText() + b9.getText());
                }else {
                    right.setText(right.getText() + b9.getText());
                }
            }
        });
        ob0.addActionListener(new ActionListener() {
            boolean count = false;
            @Override
            public void actionPerformed(ActionEvent e) {
                count = !count;
                if (oper.getText().length() == 0){//说明输入第二个操作数
                    String text = left.getText();
                    double value = Double.parseDouble(text);
                    if (count){
                        left.setText("-" + left.getText());
                    }else {
                        double d = Math.abs(value);
                        left.setText(Double.toString(d));
                    }

                }else {
                    String text = right.getText();
                    double value = Integer.parseInt(text);
                    if (count){
                        right.setText("-" + right.getText());
                    }else {
                        left.setText(Double.toString(Math.abs(value)));
                    }
                }
            }
        });
        ob1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //String text = oper.getText();

                oper.setText(ob1.getText());

        }
        });
        ob2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //String text = oper.getText();

                oper.setText(ob2.getText());

            }
        });
        ob3.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //String text = oper.getText();

                oper.setText(ob3.getText());;

            }
        });
        ob4.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //String text = oper.getText();

                oper.setText(ob4.getText());

            }
        });

        ob5.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //String text = oper.getText();

                oper.setText(ob5.getText());

            }
        });
        ob6.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //String text = oper.getText();

                oper.setText(ob6.getText());

            }
        });
        ob7.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                oper.setText(ob7.getText());

            }
        });
        ob9.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //String text = oper.getText();

                if (oper.getText() != null){//说明输入第二个操作数
                    right.setText(right.getText() + ob9.getText());
                }else {
                    left.setText(left.getText() + ob9.getText());
                }

            }
        });
        ob10.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //String text = oper.getText();

                left.setText("");
                right.setText("");
                jTextField.setText("");
                oper.setText("");

            }
        });
        ob8.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                //String text = oper.getText();
                if (left.getText().length() != 0 && right.getText().length() !=0 && oper.getText().length() !=0){
                    Count c = new Count(Double.parseDouble(left.getText()), Double.parseDouble(right.getText()),
                            oper.getText());
                    double value = c.calculater();
                    String s = String.format("%.2f", value);

                    if (value != -1){
                        jTextField.setText(s);

                    }else {
                        jTextField.setText("计算错误");

                    }
                }else {

                }

            }
        });
        jFrame.add(left);
        jFrame.add(oper);
        jFrame.add(right);
        jFrame.add(equal);
        jFrame.add(jTextField);
        jFrame.add(jPanel);

        jPanel.add(b7);
        jPanel.add(b8);
        jPanel.add(b9);
        jPanel.add(ob4);
        jPanel.add(ob6);

        jPanel.add(b4);
        jPanel.add(b5);
        jPanel.add(b6);
        jPanel.add(ob3);
        jPanel.add(ob5);



        jPanel.add(b1);
        jPanel.add(b2);
        jPanel.add(b3);
        jPanel.add(ob2);
        jPanel.add(ob7);
        jPanel.add(b0);
        jPanel.add(ob0);
        jPanel.add(ob9);
        jPanel.add(ob1);
        jPanel.add(ob8);
        jPanel.add(ob10);
        jFrame.setVisible(true);
        jPanel.setVisible(true);
    }
}
