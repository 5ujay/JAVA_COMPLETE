
package bank.management.system;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.BLACK;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.awt.event.*;
//import java.sql.*;
//import java.util.Date;


public class PinChange extends JFrame implements ActionListener{
    
    JTextField pintextField, repintextField;
    
    JButton change,back;
    String pinnumber;
    
    PinChange(String pinnumber){
        this.pinnumber = pinnumber;
        
           setLayout(null);
         
          ImageIcon I1= new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image I2 = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Image = new JLabel(I3);
        Image.setBounds(0 , 0, 900, 900);
        add(Image);
        
        
        //       "Change Your PIN"
        JLabel text = new JLabel("Change Your PIN : ");
        
        
         JLabel pintext = new JLabel("New PIN : ");
        pintext.setBounds(240, 420, 400, 20);
        pintext.setFont(new Font("Arial", Font.BOLD,18));
        Image.add(pintext);
        
        pintextField = new JTextField("");
        pintextField.setBounds(360, 420, 150, 20);
        pintextField.setFont(new Font("Arial", Font.BOLD,18));
        Image.add(pintextField);
        
         JLabel repintext = new JLabel("Confirm PIN : ");
        repintext.setBounds(240, 460, 400, 20);
        repintext.setFont(new Font("Arial", Font.BOLD,18));
        Image.add(repintext);
        
        repintextField = new JTextField("");
        repintextField.setBounds(360, 460, 150, 20);
        repintextField.setFont(new Font("Arial", Font.BOLD,18));
        Image.add(repintextField);
        
        change = new JButton("CHANGE");
        change.setBounds(240, 490, 100, 20);
        change.setFont(new Font("Arial",Font.BOLD,15));
        change.setForeground(Color.WHITE);
        change.setBackground(BLACK);
        change.addActionListener(this);
        Image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(400, 490, 100, 20);
        back.setFont(new Font("Arial",Font.BOLD,15));
        back.setForeground(Color.WHITE);
        back.setBackground(BLACK);
        back.addActionListener(this);
        Image.add(back);
        
        
        
        
        
        
          
         setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
    
        
    }
    
    public static void main(String args[]){
        new PinChange("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        if(ae.getSource() == change){
                try{
                    
            String npin = pintextField.getText();
            String rpin = repintextField.getText();
            
            if(npin == null ? rpin != null : !npin.equals(rpin)){
                
                JOptionPane.showMessageDialog(null, "Enter Pin does not match");
                return;
                
            }
            if(npin.equals("") ){
                JOptionPane.showMessageDialog(null, "Enter a PIN");
               
            }
              if(rpin.equals("") ){
                JOptionPane.showMessageDialog(null, "Enter a PIN");
               
            }
            
            conn c = new conn();
            
            String query1="Update bank set pin ='"+rpin+"' where pin = '"+pinnumber+"'  ";
            String query2="Update login set pin ='"+rpin+"' where pin = '"+pinnumber+"'  ";
            String query3="Update signupthree set pin ='"+rpin+"' where pin = '"+pinnumber+"'  ";
            
            c.s.executeUpdate(query1);
            c.s.executeUpdate(query2);
            c.s.executeUpdate(query3);
            
            JOptionPane.showMessageDialog(null, "Your PIN is updated successfully");
            
            setVisible(false);
            new Transaction(rpin).setVisible(true);
            
        }catch(Exception e){
            System.out.println(e);
        }
                
        }else{
            setVisible(false);
            
            new Transaction(pinnumber).setVisible(true);
        }
    
    }
    
}
