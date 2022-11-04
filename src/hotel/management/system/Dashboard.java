
package hotel.management.system;
 
import javax.swing.*;
import java.awt.*;//color
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener{
   Dashboard()
   {
      setBounds(0,0,1550,1000);
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/dash.jpg"));
//      Image i2 = i1.getImage().getScaledInstance(2048, 1107, Image.SCALE_DEFAULT);
//      ImageIcon i3 = new ImageIcon(i2);
      JLabel image = new JLabel(i1);
      image.setBounds(0,0,1548,900);
      add(image);
      
      JMenuBar mb = new JMenuBar();
      mb.setBounds(0,0,1550,30);
      image.add(mb);
     
      JMenu hotel = new JMenu("Hotel Management");
      hotel.setForeground(Color.red);
      mb.add(hotel);
      
      JMenuItem reception = new JMenuItem("Reception");
     reception.addActionListener(this);
      hotel.add(reception);
      
      JMenu admin = new JMenu("Admin");
      hotel.setForeground(Color.red);
      mb.add(admin);
      
      JMenuItem addemployee = new JMenuItem("Add Employee");
      addemployee.addActionListener(this);
      admin.add(addemployee);
      JMenuItem addrooms = new JMenuItem("Add Rooms");
      addrooms.addActionListener(this);
      admin.add(addrooms);
      JMenuItem adddrivers = new JMenuItem("Add Drivers");
//      adddrivers.addActionListener(this);
      admin.add(adddrivers);
      
      setVisible(true);
   } 
    public void actionPerformed(ActionEvent ae){
        try{
            //get the text of menu item
          if(ae.getActionCommand().equals("Add Employee"))
          {
              new Employee();
          }
          
          else if(ae.getActionCommand().equals("Reception"))
          {
              new Reception();
          }
          
          else if(ae.getActionCommand().equals("Add Rooms"))
          {
              new AddRooms();
          }
        }
        catch(Exception e){
            
        }
    }
  public static void main(String[] args)
  {
     new Dashboard();
  }
}
