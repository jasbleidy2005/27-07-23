package encaptulation;

import javax.swing.*;

public class NamePerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName(JOptionPane.showInputDialog("Enter the name"));
        System.out.println(person.getName());



        //Person person1= new Person();
        //person1.setName("pepe");


    }
}
