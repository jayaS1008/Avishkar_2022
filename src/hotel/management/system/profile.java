
package hotel.management.system;
 
import javax.swing.*;
import java.awt.*;//color
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class profile extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JButton b1;
    ResultSet rs = null;
    Choice c1;
   profile()
   {
       contentPane = new JPanel();
       setContentPane(contentPane);
       contentPane.setLayout(null);
       setBounds(0,0,1550,1000);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JLabel l3 = new JLabel("UPDATE YOUR PROFILE");

 
       setVisible(true);
                 
    }
    public void actionPerformed(ActionEvent ae){
        try{
          
        }
        catch(Exception e){
        }
    }
  public static void main(String[] args)
  {
     new profile();
  }
}



