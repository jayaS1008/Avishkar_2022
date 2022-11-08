/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class HotelManagementSystem extends JFrame implements ActionListener{
        
        public HotelManagementSystem() {
//             setSize(1366, 519);
//             setLocation(100,0);
             setBounds(100 ,100,1366,565);
             setLayout(null);
             ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/hotel.jpg"));
             JLabel image = new JLabel(i1);
             image.setBounds(0 ,0,2000,1000);
             add(image);
             
             //anything can be written with the help of Jlabel
             JLabel text = new JLabel("Welcome to Hotel Transylvannia");
             text.setBounds(20,430,1000,90);
             text.setForeground(Color.WHITE);
             text.setFont(new Font("serif" , Font.PLAIN ,60));
             image.add(text);
             
             //Button
             //next1 -- login u as staff
             JButton next1 = new JButton("Login as Staff");
             next1.setBounds(800 ,400 ,150,50);
             next1.addActionListener(this);
             next1.setBackground(Color.WHITE);
             image.add(next1);
             
             
             JButton next2 = new JButton("Login as Manager");
             next2.setBounds(600 ,400 ,150,50);
             next2.addActionListener(this);
             next2.setBackground(Color.WHITE);
             image.add(next2);
             
             
             JButton next3 = new JButton("Login as Monster");
             next3.setBounds(400 ,400 ,150,50);
             next3.addActionListener(this);
             next3.setBackground(Color.WHITE);
             image.add(next3);
             
             JButton next4 = new JButton("Login as Human");
             next4.setBounds(200 ,400 ,150,50);
             next4.addActionListener(this);
             next4.setBackground(Color.WHITE);
             image.add(next4);
             
             
             setVisible(true);
        }    
         public void actionPerformed(ActionEvent ae)
        {
            if(ae.getActionCommand().equals("Login as Staff"))
            {
                new Login();
                setVisible(false);
            }
            if(ae.getActionCommand().equals("Login as Human"))
            {
                new human_login();
                setVisible(false);
            }
        }
        public static void main(String[] args) {
              	new HotelManagementSystem();	
	}
}
