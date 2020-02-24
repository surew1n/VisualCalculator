package VisualCalc;

import javax.swing.*;
import java.util.ArrayList;

public class Calculator {
    private int num1;
    private int num2;
    private int total = 0;
    private boolean playSounds = false;
    private String operation = "";
    private ArrayList<Integer> values = new ArrayList<Integer>();
    private ArrayList<String> operations = new ArrayList<String>();

    public void operation(JTextField textField) {
        System.out.println(values.size());
        for(int i = 0; i < operations.size(); i++) {
            if(operations.get(i).equals("+")) {
                if(i == 0) {
                    total = (values.get(i) + values.get(i + 1));
                } else {
                    total = total + (values.get(i + 1));
                }
            } else if(operations.get(i).equals("-")) {
                if(i == 0) {
                    total = (values.get(i) - values.get(i + 1));
                } else {
                    total = total - values.get(i + 1);
                }
            } else if(operations.get(i).equals("×")) {
                if(i == 0) {
                    total = values.get(i) * values.get(i + 1);
                } else {
                    total = total * values.get(i + 1);
                }
            } else if(operations.get(i).equals("÷")) {
                if(i == 0) {
                    total = values.get(i) / values.get(i + 1);
                } else {
                    total = total / values.get(i + 1);
                }
            }
        }

        System.out.println("values size = " + values.size());
        System.out.println("operations size = " + operations.size());
        operations.clear();
        values.clear();
        textField.setText(Integer.toString(total));
    }

    public void displayText(String num, JTextField textField) {
        textField.setText(textField.getText() + num);
    }

    public void clear(JTextField textField) {
        total = 0;
        textField.setText("");
    }

    public void ce(JTextField textField) {
        textField.setText("");
    }

    public void addValue(int num, JTextField textField) {
        values.add(num);
        textField.setText("");
    }

    public void addOperation(String operation) {
        operations.add(operation);
    }

    public void playSound() {
        if(playSounds == true) {

        }
    }
}