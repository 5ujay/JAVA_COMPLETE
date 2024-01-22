
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class BalanceEnquiry extends JFrame implements ActionListener {

   JButton back;
    
    String pinnumber;

    BalanceEnquiry(String pinnumber) {
        this.pinnumber = pinnumber;
        
             setLayout(null);
         
          ImageIcon I1= new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image I2 = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Image = new JLabel(I3);
        Image.setBounds(0 , 0, 900, 900);
        add(Image);
        
          setSize(900,900);
        setLocation(300,0);
//        setUndecorated(true);
        setVisible(true);
        
        
    back = new JButton("Back");
    back.setBounds(400, 480, 100, 25);
    back.setBackground(Color.BLACK);
    back.setForeground(Color.WHITE);
    back.addActionListener(this);
    Image.add(back);

        JLabel pintext = new JLabel();
        pintext.setBounds(220, 340, 400, 20);
        pintext.setFont(new Font("Arial", Font.BOLD,18));
        Image.add(pintext);
     
        int balance = 0;
        try{
            conn c = new conn();
            ResultSet rs = c.s.executeQuery("select * from bank where pin = '"+pinnumber+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){
        System.out.println(e);
        }
        
       pintext.setText("Your current balance is Rs. " + balance);
        
     

        setSize(900, 900);
//        setUndecorated(true);
        setLocation(300, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == back){
             setVisible(false);
        new Transaction(pinnumber).setVisible(true);
        }
       
    }

    public static void main(String[] args) {
        
        new BalanceEnquiry("").setVisible(true);
    }
}
