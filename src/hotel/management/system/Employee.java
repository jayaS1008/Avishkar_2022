
package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Employee extends JFrame implements ActionListener{
        JTextField tfname ,tfemail,tfphone,tfsalary,tfage ,tfid;
        JRadioButton rbMale,rbFemale;
        JButton submit;
        JComboBox cbJob;
                
        private JPanel contentPane;
	private JTable table;
	private JLabel lblNewLabel;
        private JLabel lblid;
	private JLabel lblJob;
	private JLabel lblName;
        private JLabel lblage;
        private JLabel lblsalary;
        private JLabel lblemail;
        private JLabel lblphone;
        private JLabel lblgender;
	private JLabel lblDepartment;
    Employee()
    {
        setLayout(null);
        //Name
        
        lblNewLabel = new JLabel("Name");
        lblNewLabel.setBounds(100, 34, 46, 14);
	add(lblNewLabel);
	
        tfname = new JTextField();
        tfname.setBounds(200 , 30 ,150 ,30);
        add(tfname);
	
        //Age
        
        lblage = new JLabel("Age");
        lblage.setBounds(100, 80, 46, 14);
	add(lblage);
	
         tfage = new JTextField();
        tfage.setBounds(200 , 80 ,150 ,30);
        add(tfage);
        
        //gender
        
        lblgender = new JLabel("Gender");
        lblgender.setBounds(100, 130, 46, 14);
	add(lblgender);
        
        rbMale = new JRadioButton("Male");
        rbMale.setBounds(200 ,130 ,70 ,30);
        add(rbMale);
        
        rbFemale = new JRadioButton("Female");
        rbFemale.setBounds(280 ,130 ,70 ,30);
        add(rbFemale);
        
        //inorder to make sure that either of male or female get selected
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);
                
        //Job
        lblJob = new JLabel("Job");
        lblJob.setBounds(100, 170, 46, 14);
	add(lblJob);
        
        String str[] ={"Job1", "Job2" ,"Job1", "Job2"};
        cbJob = new JComboBox(str);
        cbJob.setBounds(200 , 170 ,150 ,30);
        add(cbJob);
        //Salary
        lblsalary = new JLabel("Salary");
        lblsalary.setBounds(100, 230, 46, 14);
	add(lblsalary);
	
        tfsalary = new JTextField();
        tfsalary.setBounds(200 , 230 ,150 ,30);
        add(tfsalary);
        //Phone
        lblphone = new JLabel("Phone");
        lblphone.setBounds(100, 280, 46, 14);
	add(lblphone);
	
        tfphone = new JTextField();
        tfphone.setBounds(200 , 280 ,150 ,30);
        add(tfphone);
        //Email
        lblemail = new JLabel("E-Mail");
        lblemail.setBounds(100, 330, 46, 14);
	add(lblemail);
	
        tfemail = new JTextField();
        tfemail.setBounds(200 , 330 ,150 ,30);
        add(tfemail);
        //id
        lblid = new JLabel("Id");
        lblid.setBounds(100, 380, 46, 14);
	add(lblid);
	
        tfid = new JTextField();
        tfid.setBounds(200 , 380 ,150 ,30);
        add(tfid);
        
        //Submit Button
        submit = new JButton("Submit");
        submit.setBounds(200,430,150,30);
        submit.addActionListener(this);
        add(submit);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/tenth.jpg"));
        //scaling the image
        Image i2 = i1.getImage().getScaledInstance(450, 450, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(380 , 60 ,480,370);
        add(image);
        
        getContentPane().setBackground(Color.WHITE);
        setBounds(350,200,850,540);
        setVisible(true);
        
    }
  public void actionPerformed(ActionEvent ae)
  {
      String name =tfname.getText();
      String age = tfage.getText();
      String salary = tfsalary.getText();
      String phone = tfphone.getText();
      String email = tfemail.getText();
      String id = tfid.getText();
      
      String gender =null;
      if(rbMale.isSelected())
      {
         gender="Male";
      }
      else
      {
         gender="Female"; 
      }
      
      String job =(String) cbJob.getSelectedItem();
      
      //store these values in database
      
      try
      {
          Conn conn = new Conn();
          String query ="insert into employee values('"+name+"' , '"+age+"','"+gender +"' , '"+ job+"' ,'"+salary+"' , '"+phone+"' , '"+email+"' , '"+id+"')";
          conn.s.executeUpdate(query);
          JOptionPane.showMessageDialog(null ,"employee added succesfully");
          setVisible(false);
      }
      catch(Exception e)
      {
          e.printStackTrace();
      }
      
  }
 public static void main(String[] args)
 {
    new Employee();
 }
}

