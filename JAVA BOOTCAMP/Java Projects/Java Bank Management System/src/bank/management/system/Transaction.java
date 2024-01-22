package bank.management.system;

import java.awt.Font;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
//import com.toedter.calendar.JDateChooser;
//import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener {

    JButton deposit, fastcash, exit, Withdrawl, ministatement, pinchange, balance;
    String pinnumber;

    Transaction(String pinnumber) {

        this.pinnumber = pinnumber;

        setLayout(null);
//        setting an image
        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image I2 = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);

        ImageIcon I3 = new ImageIcon(I2);
        JLabel Image = new JLabel(I3);
        Image.setBounds(0, 0, 900, 900);
        add(Image);

//        text select transaction
        JLabel text = new JLabel("Please select your Transaction");
        text.setBounds(240, 320, 400, 20);
        text.setFont(new Font("Arial", Font.BOLD, 18));
        Image.add(text);

//        deposit button
        deposit = new JButton("Deposit");
        deposit.setBounds(200, 410, 150, 20);
        deposit.setFont(new Font("Arial", Font.BOLD, 20));
        deposit.setBackground(Color.BLACK);
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        Image.add(deposit);

//        withdewl button
        Withdrawl = new JButton("Withdrawl");
        Withdrawl.setBounds(200, 435, 150, 20);
        Withdrawl.setFont(new Font("Arial", Font.BOLD, 20));
        Withdrawl.setBackground(Color.BLACK);
        Withdrawl.setForeground(Color.WHITE);
        Withdrawl.addActionListener(this);
        Image.add(Withdrawl);

//        fast cash button
        fastcash = new JButton("Fast Cash");
        fastcash.setBounds(200, 460, 150, 20);
        fastcash.setFont(new Font("Arial", Font.BOLD, 20));
        fastcash.setBackground(Color.BLACK);
        fastcash.setForeground(Color.WHITE);
        fastcash.addActionListener(this);
        Image.add(fastcash);

//        ministatement button
        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(280, 490, 190, 21);
        ministatement.setFont(new Font("Arial", Font.BOLD, 21));
        ministatement.setBackground(Color.BLACK);
        ministatement.setForeground(Color.WHITE);
        ministatement.addActionListener(this);
        Image.add(ministatement);

//        pin change
        pinchange = new JButton("PIN change");
        pinchange.setBounds(370, 410, 190, 21);
        pinchange.setFont(new Font("Arial", Font.BOLD, 21));
        pinchange.setBackground(Color.BLACK);
        pinchange.setForeground(Color.WHITE);
        pinchange.addActionListener(this);
        Image.add(pinchange);

//        balance enquiry
        balance = new JButton("Balance Check");
        balance.setBounds(370, 435, 190, 21);
        balance.setFont(new Font("Arial", Font.BOLD, 21));
        balance.setBackground(Color.BLACK);
        balance.setForeground(Color.WHITE);
        balance.addActionListener(this);
        Image.add(balance);

//        Exit
        exit = new JButton("Exit");
        exit.setBounds(370, 460, 190, 21);
        exit.setFont(new Font("Arial", Font.BOLD, 21));
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        Image.add(exit);

        setSize(900, 900);
        setLocation(300, 0);
//        setUndecorated(true);
        setVisible(true);

    }

    public static void main(String args[]) {
        new Transaction("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        if (ae.getSource() == exit) {
            
            System.exit(0);
        } 
        else if (ae.getSource() == deposit) {

            setVisible(false);

            new Deposit(pinnumber).setVisible(true);

        } 
        else if (ae.getSource() == Withdrawl) {
            
            setVisible(false);

            new Withdrawl(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == fastcash){
            
            setVisible(false);
            
            new FastCash(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == pinchange){
            
            setVisible(false);
            
            new PinChange(pinnumber).setVisible(true);
        }
        else if (ae.getSource() == balance ){
            
            setVisible(false);
            
            new BalanceEnquiry(pinnumber).setVisible(true);
        }
        else if(ae.getSource() == ministatement ){
            
            setVisible(false);
            
            new MiniStatement(pinnumber).setVisible(true);
        }
        

    }
}
