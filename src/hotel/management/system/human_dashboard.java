
package hotel.management.system;
 
import javax.swing.*;
import java.awt.*;//color
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;

public class human_dashboard extends JFrame implements ActionListener{
    private JPanel contentPane;
    private JTable table;
    private JButton b1;
    ResultSet rs = null;
    Choice c1;
   human_dashboard ()
   {
       contentPane = new JPanel();
       setContentPane(contentPane);
       contentPane.setLayout(null);
       setBounds(0,0,1550,1000);
       getContentPane().setBackground(Color.WHITE);
       setLayout(null);
       
       JLabel l1 = new JLabel("WELCOME TO HOTEL TRANSYLVANNIA");
       l1.setFont(new Font("Tahoma", Font.BOLD, 24));
       l1.setBounds(550, 0, 1020, 120);
       contentPane.add(l1);

       b1 = new JButton("BOOK ROOMS HERE");
       b1.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent ae) {
		try {
                        new booking().setVisible(true);
                        setVisible(false);
                    } 
                catch (Exception e) 
                {
                    e.printStackTrace();
		}		
	    }
	});
       b1.setFont(new Font("Tahoma", Font.BOLD, 14));
       b1.setBounds(464, 250, 200, 40);
       contentPane.add(b1);
       
       JButton b2 = new JButton("PROFILE");
      
       b2.setFont(new Font("Tahoma", Font.BOLD, 14));
       b2.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent ae) {
		try {
                        new profile().setVisible(true);
                        setVisible(false);
                    } 
                catch (Exception e) 
                {
                    e.printStackTrace();
		}		
	    }
	});
       b2.setBounds(864, 250, 200, 40);
       contentPane.add(b2);
       
       JButton b3 = new JButton("BOOK YOUR CAB");
        b3.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent ae) {
		try {
                        new book_cab().setVisible(true);
                        setVisible(false);
                    } 
                catch (Exception e) 
                {
                    e.printStackTrace();
		}		
	    }
	});
       b3.setFont(new Font("Tahoma", Font.BOLD, 14));
       b3.setBounds(464, 450, 200, 40);
       contentPane.add(b3);
       
       JButton b4 = new JButton("FEEDBACK");
       b4.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent ae) {
		try {
                        new book_cab().setVisible(true);
                        setVisible(false);
                    } 
                catch (Exception e) 
                {
                    e.printStackTrace();
		}		
	    }
	});
       b4.setFont(new Font("Tahoma", Font.BOLD, 14));
       b4.setBounds(864, 450, 200, 40);
       contentPane.add(b4);
 
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
     new human_dashboard();
  }
}

