package encaptulation;

import javax.swing.*;

public class MainAgency {
    public static void main(String[] args) {
        Agency agency = new Agency();
        agency.setAdress(JOptionPane.showInputDialog("enter the adress"));
        agency.setAgentName(JOptionPane.showInputDialog("enter the name of the agency"));
        agency.setPrice(Integer.parseInt(JOptionPane.showInputDialog("price: ")));
        JOptionPane.showMessageDialog(null,"name of the agency");
    }
}
