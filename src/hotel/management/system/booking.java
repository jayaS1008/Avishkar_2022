
package hotel.management.system;
 
import javax.swing.*;
import java.awt.*;//color
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class booking extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JTable table;
    private JButton submit;
    private JLabel l1,l2,l3,l4;
    private JRadioButton rb1 ,rb2;
    private JComboBox cb1,cb2;
    ResultSet rs = null;
    Choice c1;
   booking()
   {
       contentPane = new JPanel();
       setContentPane(contentPane);
       contentPane.setLayout(null);
       setBounds(100,100,1050,500);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       l1 = new JLabel("BOOK YOUR ROOM");
       l1.setFont(new Font("Tahoma", Font.BOLD, 24));
       l1.setBounds(450, 0, 1020, 120);
       contentPane.add(l1);
       
        
        rb1 = new JRadioButton("Human");
        rb1.setBounds(100 ,130 ,100 ,30);
        add(rb1);
        
        rb2 = new JRadioButton("Monster");
        rb2.setBounds(280 ,130 ,100 ,30);
        add(rb2);
        
        //inorder to make sure taht either of male or female get selected
        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
       
       l2 = new JLabel("Room Type");
       l2.setFont(new Font("Tahoma", Font.BOLD, 14));
       l2.setBounds(100, 200, 100, 25);
       contentPane.add(l2);
       
       String str[]={"General","Special"};

       cb1 = new JComboBox(str);
       cb1.setBounds(250 , 200 ,200 ,30);
       add(cb1);
       
       l3 = new JLabel("Room Type");
       l3.setFont(new Font("Tahoma", Font.BOLD, 14));
       l3.setBounds(100, 250, 100, 25);
       contentPane.add(l3);
       String s[]={"Single Bed","Double bed","Triple Bed"};
       cb2 = new JComboBox(s);
       cb2.setBounds(250 , 250 ,200 ,30);
       add(cb2);
       
       submit = new JButton("Submit");
        submit.setBounds(200,350,200,30);
        submit.addActionListener(this);
        add(submit);
       
       setVisible(true);
                 
    }
    public void actionPerformed(ActionEvent ae){
        try{
//           Message message = Message
//            .creator(new PhoneNumber("+918709595296"), // to 
//                    new PhoneNumber("+919334112900"), // from
//                    "Hey there!")
//            .create();
//        System.out.println(message.getSid());
        }
        catch(Exception e){
        }
    }
  public static void main(String[] args)
  {
     new booking();
  }
}

