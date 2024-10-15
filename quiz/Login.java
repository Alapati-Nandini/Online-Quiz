package online.quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener {
    
    JButton rules, back;
    JTextField tfname;
    JComboBox<String> subjectBox;
    
    Login() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        JLabel subjectLabel = new JLabel("Select your subject");
        subjectLabel.setBounds(810, 120, 300, 20);
        subjectLabel.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        subjectLabel.setForeground(new Color(30, 144, 254));
        add(subjectLabel);
        
        // Dropdown box with specified subjects
        String[] subjects = {"Select","Java", "Data Warehousing", "Data Structures", "C", "C++", "Cloud Computing", "Machine Learning"};
        subjectBox = new JComboBox<>(subjects);
        subjectBox.setBounds(735, 150, 300, 25);
        subjectBox.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        add(subjectBox);
        
        JLabel name = new JLabel("Enter your name");
        name.setBounds(810, 200, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(30, 144, 254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735, 230, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(735, 300, 120, 25);
        rules.setBackground(new Color(30, 144, 254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(915, 300, 120, 25);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 500);
        setLocation(200, 150);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            String subject = (String) subjectBox.getSelectedItem();
            setVisible(false);
            new Rules(name);
        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
