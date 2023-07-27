package encaptulation;

import javax.swing.*;

public class MainAddition {
    public static void main(String[] args) {
        Addition addition= new Addition();
        addition.setNum1(Integer.parseInt(JOptionPane.showInputDialog("enter a number")));
        addition.setNum2(Integer.parseInt(JOptionPane.showInputDialog("enter a number")));
        JOptionPane.showMessageDialog(null," the addition : " +addition.addition());
    }
}
