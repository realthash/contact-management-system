package com.sytem;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ManagementGUI extends JFrame {

    JPanel p1,p2,p3;
    JLabel name, text;
    JTextField forName, forText, display;
    JButton add, delete;
    public ManagementGUI(){

        p1 = new JPanel();
        p1.setLayout(new GridLayout(2, 2));
        name = new JLabel("Name : ");
        text = new JLabel("Contact : ");

        forName = new JTextField();
        forText = new JTextField();
        p1.add(name);
        p1.add(forName);
        p1.add(text);
        p1.add(forText);


        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,1));
        display = new JTextField();
        display.isDisplayable();
        p2.add(display);

        p3 = new JPanel();
        p3.setLayout(new FlowLayout());
        add = new JButton("Add contact");
        delete = new JButton("Delete Contact");

        p3.add(add);
        p3.add(delete);
        
        this.add(p1, BorderLayout.NORTH);
        this.add(p2, BorderLayout.CENTER);
        this.add(p3, BorderLayout.SOUTH);


    }

    public static void main(String[] args){
        ManagementGUI gui = new ManagementGUI();

        gui.setTitle("Contact Management System");
        gui.setSize(400,300);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
}