/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;

import javax.swing.*;
import java.awt.*;//color
import java.awt.event.*;
import java.sql.*;

public class human_login extends JFrame implements ActionListener {
    JTextField username ;
    JPasswordField password;
    JButton login ,cancel;
    human_login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);//closes all default settings and let create own custom layout
        JLabel text = new JLabel("Human Login");
             text.setBounds(20,430,100,90);
             text.setForeground(Color.BLACK);
             text.setFont(new Font("serif" , Font.PLAIN ,60));
            add(text);
        JLabel user = new JLabel("User Name");
        user.setBounds(40,20,100,30);
        add(user);
        
        JLabel pass = new JLabel("Password");
        pass.setBounds(40,70,100,30);
        add(pass);
        
        username = new JTextField();
        username.setBounds(150,20,150 ,30);
        add(username);
        
         password = new JPasswordField();
        password.setBounds(150,70,150 ,30);
        add(password);
        
        login = new JButton("Login");
        login.setBounds(40,140,120,30);
        login.addActionListener(this);
        add(login);
        
        cancel = new JButton("Cancel");
        cancel.setBounds(180,140,120,30);
        cancel.addActionListener(this);
        add(cancel);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/human.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350 ,10,200,200);
        add(image);
        
        setBounds(500,200,600,400);
        setVisible(true);
    }
    public void actionPerformed (ActionEvent ae)
    {
        if(ae.getSource()== login)
        {
            String user = username.getText();
            String pass = password.getText();
             
            try{
                Conn c = new Conn();
                String query ="select * from human where username = '"+user+"' and pass = '"+ pass+"'" ;
                ResultSet rs = c.s.executeQuery(query);
                if(rs.next())
                {
                    setVisible(false);
                    new human_dashboard();
                }
                else{
                    JOptionPane.showMessageDialog(null, "invalid username or password");
                    setVisible(false);
                }
            
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
        else if(ae.getSource() == cancel)
        {
            setVisible(false);
        }
    }
    public static void main (String[] args)
    {
        new human_login();
    }
}

