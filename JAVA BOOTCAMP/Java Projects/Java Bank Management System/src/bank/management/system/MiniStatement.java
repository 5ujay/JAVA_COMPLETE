
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class MiniStatement extends JFrame implements ActionListener{
    String pinnumber;
    String formno ;
    MiniStatement(String pinnumber){
        
        this.pinnumber= pinnumber;
        this.formno=formno;
        setLayout(null);
        
        setTitle("Mini Statement");
        setSize(400,400);
        setLocation(1200,100);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
        
        

        JLabel bank = new JLabel(" INDIAN BANK ");
        bank.setBounds(150, 50, 200, 15);
        bank.setBackground(Color.BLACK);
        bank.setFont(new Font("Arial",Font.BOLD,15));
        add(bank);
        
//        for the card number
        
        JLabel card = new JLabel("");
        card.setBounds(90, 100, 300, 20);
        add(card);
        
        JLabel cardno = new JLabel ("Card No :");
        cardno.setBounds(20, 100, 300, 20);
        cardno.setFont(new Font("Arial",Font.BOLD,14));
        add(cardno);
       
        
        try{
            conn c = new conn();
            
            ResultSet rs = c.s.executeQuery("select * from login where pin = '"+pinnumber+"'");
            
            while(rs.next()){
                card.setText(rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+ rs.getString("cardnumber").substring(12));
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
//        ================================================================ for the bank details
        JLabel mini = new JLabel();
        mini.setBounds(20, 150, 400, 15);
        mini.setFont(new Font("Arial",Font.BOLD,14));
        add(mini);
        
        try{
            
            conn c = new conn();
            
          ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"' ");
          
          while(rs.next()){
              mini.setText(mini.getText() + "<html>"+ rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+rs.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount"));
          }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
//        for account type detail
        JLabel acct = new JLabel();
        acct.setBounds(20, 200, 1000, 15);
        acct.setFont(new Font("Arial",Font.BOLD,14));
        add(acct);
        
          try{
            
            conn c = new conn();
//            String formno = null;
            
          ResultSet rs = c.s.executeQuery("select * from signupthree where pin = '"+pinnumber+"' ");
          
          while(rs.next()){
              acct.setText(acct.getText() +  rs.getString("accountType"));
          }
            
        }catch(Exception e){
            System.out.println(e);
        }
          
          ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/stamp.png"));
          Image I2 = I1.getImage().getScaledInstance(50, 50, Image.SCALE_AREA_AVERAGING);
          ImageIcon I3 = new ImageIcon(I2);
          
          JLabel Image = new JLabel(I3);
          Image.setBounds(150, 250, 50, 50);
          add(Image);
          

        
    }
    
    public static void main(String args[]){
        
        new MiniStatement("");
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
