package encaptulation;

import javax.swing.*;

public class MainCar {
    public static void main(String[] args) {
        Car car = new Car();
        car.setPlaca(JOptionPane.showInputDialog("Enter the placa"));
        car.setColur(JOptionPane.showInputDialog("enter the colur"));
        car.setModelo(Integer.parseInt(JOptionPane.showInputDialog("enter the modelo")));
        JOptionPane.showMessageDialog(null,car.getModelo());


    }
}
