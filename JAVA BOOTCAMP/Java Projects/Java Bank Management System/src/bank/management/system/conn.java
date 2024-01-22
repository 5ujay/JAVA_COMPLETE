
package bank.management.system;
import java.sql.*;

public class conn {
    
   Connection c; 
   Statement s;
    public conn(){
        try{
//            class.forName(com.mysql.cj.jdbc.Driver);
            
            c = DriverManager.getConnection("jdbc:mysql:///bankmangementsystem","root","qwertyuiop");
            s = c.createStatement();
           
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
