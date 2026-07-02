package com.sytem;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ManagementGUI extends JFrame {

    private DefaultListModel<String> listModel;
    private JList<String> list;
    JPanel p1,p2;
    JLabel name, text;
    JTextField forName, forText;
    JButton add, delete;
    public ManagementGUI(){

        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        
        Contact con = new Contact("thash" ,"070147856");
        listModel.addElement(con.toString());
        Contact con1 = new Contact("thashh" ,"070147856");
        listModel.addElement(con1.toString());

        //Input panel
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

        //Button panel
        p2 = new JPanel();
        p2.setLayout(new FlowLayout());
        add = new JButton("Add contact");
        delete = new JButton("Delete Contact");
        SimpleActionListener actionLis = new SimpleActionListener();
        add.addActionListener(actionLis);
        delete.addActionListener(actionLis);
        p2.add(add);
        p2.add(delete);
        
        this.add(p1, BorderLayout.NORTH);
        this.add(new JScrollPane(list),BorderLayout.CENTER);
        this.add(p2, BorderLayout.SOUTH);


    }

    class SimpleActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == add && ((forName.getText().length()) > 0)){
                String inputName = forName.getText().trim();
                String inputNum = forText.getText().trim();
                
                Contact contact = new Contact(inputName, inputNum);
                listModel.addElement(contact.toString());

                forName.setText("");
                forText.setText("");


            }
           if (e.getSource() == delete) {
                int selectedIndex = list.getSelectedIndex();
if(selectedIndex != -1){
    listModel.remove(selectedIndex);
}
            }
        }

    
    }

    public static void main(String[] args){
        ManagementGUI gui = new ManagementGUI();

        gui.setTitle("Contact Management System");
        gui.setSize(400,300);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
    }
}