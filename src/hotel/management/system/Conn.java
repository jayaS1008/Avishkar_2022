/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.management.system;
//JDBC connectivity has 5 steps
import java.sql.*;

public class Conn {
    //step 2 -- create a connection
    Connection c;
    //step 3-- creating a statement
    //executing mysql queries
    
    Statement s;
    
    Conn()
    {
        //step 1 -- Register the driver class
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root" ,"Jaya@1008");
            s = c.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
}
