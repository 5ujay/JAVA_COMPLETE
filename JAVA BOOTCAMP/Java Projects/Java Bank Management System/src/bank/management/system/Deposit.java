
package bank.management.system;
import java.awt.Font;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
//import com.toedter.calendar.JDateChooser;
//import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Deposit extends JFrame implements ActionListener{
    
    JTextField money;
    JButton deposit,back;
    JLabel l1;
    String pinnumber;
    Deposit(String pinnumber){
        
        
        this.pinnumber = pinnumber;
         ImageIcon I1= new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image I2 = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        
        ImageIcon I3 = new ImageIcon(I2);
        JLabel Image = new JLabel(I3);
        Image.setBounds(0 , 0, 900, 900);
        add(Image);
     
        
        
        
        
       l1 = new JLabel("Enter amount you want to Deposit");
        l1.setBounds(230, 320, 400, 20);
        l1.setFont(new Font("Arial", Font.BOLD,18));
        Image.add(l1);
        
         money = new JTextField();
        money.setBounds(250, 380, 260, 25);
        money.setFont(new Font("Arial", Font.BOLD,18));
        Image.add(money);
        
        
         deposit = new JButton("Deposit");
        deposit.setBounds(200, 460, 150, 25);
        deposit.setFont(new Font("Arial", Font.BOLD,20));
        deposit.setBackground(Color.BLACK);
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        Image.add(deposit);
        
//        exit

        back = new JButton("Back");
        back.setBounds(410, 460, 150, 25);
        back.setFont(new Font("Arial", Font.BOLD,20));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        Image.add(back);
        
          setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String amount = money.getText();
            Date date = new Date();
            if(ae.getSource()==deposit){
                if(money.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                }else{
                   conn c = new conn();
                    c.s.executeUpdate("insert into bank values('"+pinnumber+"', '"+date+"', 'Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Transaction(pinnumber).setVisible(true);
                }
            }else if(ae.getSource() == back){
                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            
    }
    
    public static void main(String[] args){
        new Deposit("").setVisible(true);
    }
}