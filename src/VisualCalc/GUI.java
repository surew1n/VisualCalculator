package VisualCalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {
    private String textOutput = "";

    public GUI() {
        Calculator calculator = new Calculator();
        JFrame frame = new JFrame("Visual Calculator");
        JPanel mainPanel = new JPanel();
        JPanel panel = new JPanel(new GridLayout(5, 4));
        JPanel textPanel = new JPanel();
        Font font = new Font("Courier", Font.BOLD, 60);
        JTextField textField = new JTextField(textOutput);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        textField.setFont(font);
        textField.setEditable(false);
        textField.setColumns(10);
        JButton b1 = new JButton("7");
        b1.setFocusPainted(false);
        b1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        b1.setFocusPainted(true);
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b2 = new JButton("8");
        b2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b3 = new JButton("9");
        b3.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b4 = new JButton("÷");
        b4.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.addValue(Integer.parseInt((textField.getText())), textField);
                        calculator.addOperation("÷");
                    }
                }
        );
        JButton b5 = new JButton("4");
        b5.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b6 = new JButton("5");
        b6.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b7 = new JButton("6");
        b7.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b8 = new JButton("×");
        b8.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.addValue(Integer.parseInt((textField.getText())), textField);
                        calculator.addOperation("×");
                    }
                }
        );
        JButton b9 = new JButton("1");
        b9.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b10 = new JButton("2");
        b10.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b11 = new JButton("3");
        b11.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b12 = new JButton("-");
        b12.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.addValue(Integer.parseInt((textField.getText())), textField);
                        calculator.addOperation("-");
                    }
                }
        );
        JButton b13 = new JButton("0");
        b13.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b14 = new JButton(".");
        b14.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.displayText(((JButton)e.getSource()).getText(), textField);
                    }
                }
        );
        JButton b15 = new JButton("=");
        b15.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.addValue(Integer.parseInt((textField.getText())), textField);
                        calculator.operation(textField);
                    }
                }
        );
        JButton b16 = new JButton("+");
        b16.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.out.println(((JButton)e.getSource()).getText() + " pressed");
                        calculator.addValue(Integer.parseInt((textField.getText())), textField);
                        calculator.addOperation("+");
                    }
                }
        );
        JButton b17 = new JButton("");
        JButton b18 = new JButton("");
        JButton b19 = new JButton("C");
        b19.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        calculator.clear(textField);
                    }
                }
        );
        JButton b20 = new JButton("");
        b17.setVisible(false);
        b18.setVisible(false);
        b20.setVisible(false);
        textPanel.add(textField);
        panel.add(b17);
        panel.add(b18);
        panel.add(b19);
        panel.add(b20);
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        panel.add(b5);
        panel.add(b6);
        panel.add(b7);
        panel.add(b8);
        panel.add(b9);
        panel.add(b10);
        panel.add(b11);
        panel.add(b12);
        panel.add(b13);
        panel.add(b14);
        panel.add(b15);
        panel.add(b16);
        mainPanel.add(textPanel);
        mainPanel.add(panel);
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
        frame.add(mainPanel);
        frame.setSize(400, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI main = new GUI();
    }

}
