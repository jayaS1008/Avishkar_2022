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
             JButton next = new JButton("Next");
             next.setBounds(1366 ,565 ,150,50);
             next.addActionListener(this);
             next.setBackground(Color.WHITE);
             image.add(next);
             setVisible(true);
             
        }    
         public void actionPerformed(ActionEvent ae)
     {
        setVisible(false);
        new Login();
    }
        public static void main(String[] args) {
              	new HotelManagementSystem();	
	}
}
