package quizapp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
    JLabel heading = new JLabel("Welcome " + name + " to Java Quiz");
    heading.setBounds(50, 20, 700, 30);
    heading.setFont(new Font("Tahoma", Font.BOLD, 18));
    heading.setForeground(Color.BLACK);
    add(heading);
        
    
    JLabel rules = new JLabel("Welcome " + name + " to Simple Minds");
    rules.setBounds(20, 90, 700, 350);
    rules.setFont(new Font("Tahoma", Font.PLAIN, 12));
    rules.setText(
            "<html>"+ 
                "1. Answer all the questions" + "<br><br>" +
                "2. when in doubt use lifeline" + "<br><br>" +
            "<html>"
);
    add(rules);
    
    back = new JButton("back");
    back.setBounds(250, 500, 100, 30);
    back.setBackground(new Color(30, 144, 254));
    back.setForeground(Color.WHITE);
    back.addActionListener(this);
    add(back);
    
    start = new JButton("Start");
    start.setBounds(400, 500, 100, 30);
    start.setBackground(new Color(30, 144, 254));
    start.setForeground(Color.WHITE);
    start.addActionListener(this);
    add(start);
    
    
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
}
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == start){
            setVisible(false);
         new Quiz(name);
        } else {
        setVisible(false);
        new Login();
        }
    }
    public static void main(String[] args) {
        new Rules("User");
    }
}
