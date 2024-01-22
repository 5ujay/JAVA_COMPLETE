
package bank.management.system;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;




public class Login extends JFrame implements ActionListener{
    
    
    JButton btnlogin,clear,btnsign;
    
    JTextField cardTextField ;
    JPasswordField pinTextField;
    
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    
    Login(){
        setLayout(null);
        
        setTitle("ATM");
        
//        for image
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/bank-building.png"));
        JLabel label=new JLabel(i1);
        label.setBounds(260, 50,100 , 100);
         add(label);
//        for text
        JLabel text =new JLabel ("Welcome To ATM");
        text.setBounds(370, 30, 800, 150);
        text.setFont(new Font("Osward",Font.BOLD, 40));
//        text.setBackground(Color.WHITE);
        text.setForeground(Color.WHITE);
        add(text);
        
//        Crad no
         JLabel cardno =new JLabel ("CARD NO : ");
        cardno.setBounds(270, 110, 800, 150);
        cardno.setFont(new Font("Arail",Font.ROMAN_BASELINE, 30));
        cardno.setForeground(Color.WHITE);
        cardTextField = new JTextField();
        cardTextField.setBounds(450, 170, 250, 30);
        cardTextField.setFont(new Font("Arail",Font.BOLD,15));
        add(cardno);
        add(cardTextField);
        
//        pin
         JLabel pin =new JLabel ("PIN            : ");
        pin.setBounds(270, 170, 800, 150);
        pin.setFont(new Font("Arial",Font.ROMAN_BASELINE, 30));
        pin.setForeground(Color.WHITE);
        pinTextField = new JPasswordField();
        pinTextField.setBounds(450, 230, 250, 30);
        pinTextField.setFont(new Font("Arail",Font.BOLD,15));
        add(pin);
        add(pinTextField);
      
//        signup button

             btnlogin = new JButton("SIGN IN");
            btnlogin.setBounds(450, 300, 120, 35);
            btnlogin.setFont(new Font("Arial",Font.BOLD,15));
            btnlogin.setBackground(Color.BLACK);
            btnlogin.setForeground(Color.WHITE);
            btnlogin.addActionListener(this);
            add(btnlogin);
            
//            clear button
            
             clear = new JButton("CLEAR");
            clear.setBounds(580, 300, 120, 35);
            clear.setFont(new Font("Arial",Font.BOLD,15));
            clear.setBackground(Color.BLACK);
            clear.setForeground(Color.WHITE);
            clear.addActionListener(this);
            add(clear);
            
//            sign up button

             btnsign = new JButton("SIGN UP");
            btnsign.setBounds(450, 350, 250, 35);
            btnsign.setFont(new Font("Arial",Font.BOLD,15));
            btnsign.setBackground(Color.BLACK);
            btnsign.setForeground(Color.WHITE);
            btnsign.addActionListener(this);
            add(btnsign);
        
         
        getContentPane().setBackground(Color.decode("#861F41"));
        
        setLocation(300,150);
        setSize(1000,600);
        setVisible(true);
    }
    public static void main(String args[]){
        new Login();
    }

//    for performing buttons
    @Override
    public void actionPerformed(ActionEvent ae) {


        if(ae.getSource() == btnlogin){
          
            conn c = new conn();
            
            String cardnumber= cardTextField.getText();
            String pinnumber = pinTextField.getText();
            
            String query = "select * from login where cardnumber = '"+cardnumber+"' and pin = '"+pinnumber+"'  ";
            
            try{
                
               ResultSet rs = c.s.executeQuery(query);
               
               if(rs.next()){
                   
                   
                   setVisible(false);
                   
                   new Transaction(pinnumber).setVisible(true);
                   
               }else{
                JOptionPane.showMessageDialog(null, "Invalid PIN or Card Number");
            }
                
                
            }catch(Exception e){
                System.out.println(e);
            }
            
            
        }else if( ae.getSource() == clear){
            
             cardTextField.setText("");
            pinTextField.setText("");
            
        }else if(ae.getSource() == btnsign){
             setVisible(false);
             
             new SignupOne().setVisible(true);
            
            
        }
    }
    
}
