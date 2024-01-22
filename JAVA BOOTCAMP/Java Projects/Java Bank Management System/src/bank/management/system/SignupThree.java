
package bank.management.system;


//import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import java.util.*;
import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
//import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.event.*;

public class SignupThree extends JFrame implements ActionListener {
    
    
     JRadioButton r1,r2,r3,r4;
     
     JCheckBox c1,c2,c3,c4,c5,c6,c7;
     
     JButton submit,cancel;
     
     String formno;
     
     SignupThree(String formno){
        
         this.formno= formno;
         
         setLayout(null);
         
//         account details
         JLabel L1 = new JLabel("PAGE 3: Account Details ");
         L1.setFont(new Font("Arial", Font.BOLD,30));
         L1.setForeground(Color.WHITE);
         L1.setBounds(240, 20, 600, 40);
         add(L1);
         
//         account type
          JLabel type = new JLabel("Account type :");
         type.setFont(new Font("Raleway", Font.BOLD,22));
         type.setBounds(100, 100, 200, 30);
          type.setForeground(Color.WHITE);
         add(type);
         
//         saving account
          r1= new JRadioButton("Saving Account");
          r1.setFont(new Font("Raleway", Font.BOLD,22));
          r1.setBounds(100, 140, 200, 25);
          r1.setBackground(Color.decode("#861F41"));
          r1.setForeground(Color.WHITE);
          
          add(r1);
          
//          fixed deposit
          r2= new JRadioButton("Fixed Deposit Account ");
          r2.setFont(new Font("Raleway", Font.BOLD,22));
          r2.setBounds(100, 180, 300, 25);
          r2.setBackground(Color.decode("#861F41"));
          r2.setForeground(Color.WHITE);
          add(r2);
         
//          current account
           r3= new JRadioButton("Current Account");
          r3.setFont(new Font("Raleway", Font.BOLD,22));
          r3.setBounds(400, 140, 200, 25);
         r3.setBackground(Color.decode("#861F41"));
          r3.setForeground(Color.WHITE);
          add(r3);
         
//          Recurring account
           r4= new JRadioButton("Recurring Deposit Account");
          r4.setFont(new Font("Raleway", Font.BOLD,22));
          r4.setBounds(400, 180, 300, 25);
         r4.setBackground(Color.decode("#861F41"));
          r4.setForeground(Color.WHITE);
          add(r4);
          
          
         ButtonGroup r = new ButtonGroup ();
         r.add(r1);
         r.add(r2);
         r.add(r3);
         r.add(r4);
         
//         card number

         JLabel card = new JLabel("Card No : ");
         card.setFont(new Font("Raleway", Font.BOLD,22));
          card.setForeground(Color.WHITE);
         
         card.setBounds(100, 240, 200, 30);
         add(card);
         
         JLabel cardno = new JLabel("XXXX-XXXX-XXXX-XX46 ");
         cardno.setFont(new Font("Raleway", Font.BOLD,22));
           cardno.setForeground(Color.WHITE);
         cardno.setBounds(230, 240, 400, 30);
         add(cardno);
         
         JLabel cardnod = new JLabel("(After generating your 16 digit card no will be as above)");
         cardnod.setFont(new Font("Raleway", Font.BOLD,10));
           cardnod.setForeground(Color.WHITE);
         cardnod.setBounds(100, 270, 800, 15);
         add(cardnod);
         
         
         
//         pin 
         JLabel pin = new JLabel("PIN : ");
         pin.setFont(new Font("Raleway", Font.BOLD,22));
         pin.setBounds(100, 300, 200, 30);
           pin.setForeground(Color.WHITE);
         add(pin);
         
         JLabel pinno = new JLabel(" XXXX ");
         pinno.setFont(new Font("Raleway", Font.BOLD,22));
         pinno.setBounds(230, 300, 400, 30);
           pinno.setForeground(Color.WHITE);
         add(pinno);
         
         JLabel pinnod = new JLabel("(After generating your 4 digit pin will be as above)");
         pinnod.setFont(new Font("Raleway", Font.BOLD,10));
         pinnod.setBounds(100, 330, 800, 15);
           pinnod.setForeground(Color.WHITE);
         add(pinnod);
         
//         serivces required

         JLabel service = new JLabel("Services Required : ");
         service.setFont(new Font("Raleway", Font.BOLD,22));
         service.setBounds(100, 380, 300, 30);
           service.setForeground(Color.WHITE);
         add(service);
         
//         checkboxes

          c1 = new JCheckBox ("ATM Card");
          c1.setFont(new Font("Raleway", Font.BOLD,18));
          c1.setBounds(100, 430, 200, 20);
          c1.setBackground(Color.decode("#861F41"));
          c1.setForeground(Color.WHITE);
          add(c1);
          
            c2 = new JCheckBox ("Email and SMS alert");
          c2.setFont(new Font("Raleway", Font.BOLD,18));
          c2.setBounds(300, 430, 300, 20);
          c2.setBackground(Color.decode("#861F41"));
          c2.setForeground(Color.WHITE);
          add(c2);
          
            c3 = new JCheckBox ("Cheque Book");
          c3.setFont(new Font("Raleway", Font.BOLD,18));
          c3.setBounds(100, 470, 200, 20);
        c3.setBackground(Color.decode("#861F41"));
          c3.setForeground(Color.WHITE);
          add(c3);
          
            c4 = new JCheckBox ("Passbook");
          c4.setFont(new Font("Raleway", Font.BOLD,18));
          c4.setBounds(300, 470, 200, 20);
          c4.setBackground(Color.decode("#861F41"));
          c4.setForeground(Color.WHITE);
          add(c4);
          
            c5 = new JCheckBox ("Online Access of your Account ");
          c5.setFont(new Font("Raleway", Font.BOLD,18));
          c5.setBounds(100, 510, 300, 20);
         c5.setBackground(Color.decode("#861F41"));
          c5.setForeground(Color.WHITE);
          add(c5);
          
            c6 = new JCheckBox ("E- Statement");
          c6.setFont(new Font("Raleway", Font.BOLD,18));
          c6.setBounds(100, 546, 300, 20);
          c6.setBackground(Color.decode("#861F41"));
          c6.setForeground(Color.WHITE);
          add(c6);
          
            c7 = new JCheckBox ("hereby declare that the information filled above is true and best of my knowledge and belief. ");
//            c7= new JCheckBox("complete and correct to the best of my knowledge and belief.");
           c7.setFont(new Font("Raleway", Font.BOLD,15));
           c7.setBounds(100, 580, 690, 20);
           c7.setForeground(Color.WHITE);
           c7.setBackground(Color.GRAY);
           add(c7);
           
//         submit  button

            submit = new JButton("Submit");
            submit.setBounds(270, 640, 130, 30);
            submit.setFont(new Font("Arial", Font.BOLD,25));
            submit.setBackground(Color.BLACK);
            submit.setForeground(Color.WHITE);
            submit.addActionListener(this);
            add(submit);
            
//            cancel button
             cancel = new JButton("Cancel ");
            cancel.setBounds(420, 640, 130, 30);
            cancel.setFont(new Font("Arial", Font.BOLD,25));
            cancel.setBackground(Color.BLACK);
            cancel.setForeground(Color.WHITE);
            cancel.addActionListener(this);
            add(cancel);
         
         
        setSize(850,800);
        setLocation(350,50);
        getContentPane().setBackground(Color.decode("#861F41"));
        setVisible(true);
        
    }
     
      public void actionPerformed(ActionEvent ae) {
      
          if(ae.getSource()== submit){
              
              String accountType = null;
              
              if(r1.isSelected()){
                  accountType="Saving Acoount";
              }
              else if(r2.isSelected()){
                  accountType="Fixed Deposit Account ";
              }
              else if(r3.isSelected()){
                  accountType="Current Account";
              }
              else if(r4.isSelected()){
                  accountType="Recurring Deposit Account";
              }
              
              Random random = new Random();
              String cardnumber = "" + Math.abs((random.nextLong() % 90000000L)+ 5040936000000000L); 
//                                                                              5040936000000000L
              String pinnumber = "" + Math.abs((random.nextLong() % 9000L ) + 1000L);
              
              String facility = "";
              
              if(c1.isSelected()){
                  facility =facility + "ATM card";
              }else if (c2.isSelected()){
                   facility =facility + "Email and SMS alert";
              }else if (c3.isSelected()){
                   facility =facility + "Cheque Book";
              }else if (c4.isSelected()){
                   facility =facility + "Passbook";
              }else if (c5.isSelected()){
                   facility =facility + "Online Access of your Account";
              }else if (c6.isSelected()){
                   facility =facility + "E- Statement";
              }
              
//              database connectivty
                try{
                    if(accountType.equals("")){
                        JOptionPane.showMessageDialog(null, "Fill all Required Fields");
                    }else{
                        conn c = new conn();
                        
                      String query1 = "Insert into signupthree values ('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')   ";
                      String query2 = "Insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')  ";
                    
                    
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);
                    
                    JOptionPane.showMessageDialog(null, "Card No : "+cardnumber+ "\n PIN : " + pinnumber);
                    
                    setVisible(false);
                    
                    new Deposit(pinnumber).setVisible(false);
                    
                    }
                    
                }catch(Exception e){
                    System.out.println(e);
                }


          }else if(ae.getSource()==cancel){
               setVisible(false);
               
               new Login().setVisible(true);
          }
      }
    
    public static void main(String args[]){
        new SignupThree("");
    }


}
