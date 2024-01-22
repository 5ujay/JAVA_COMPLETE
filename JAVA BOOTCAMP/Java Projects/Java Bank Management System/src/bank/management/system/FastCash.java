package bank.management.system;

import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton a100, a500, a1000, a2000, a5000, a10000, back;
    String pinnumber;

    FastCash(String pinnumber) {

        this.pinnumber = pinnumber;

        setLayout(null);

        ImageIcon I1 = new ImageIcon(ClassLoader.getSystemResource("icons/ATM.jpg"));
        Image I2 = I1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);

        ImageIcon I3 = new ImageIcon(I2);
        JLabel Image = new JLabel(I3);
        Image.setBounds(0, 0, 900, 900);
        add(Image);

//        SELECT WITHDRAWL AMOUNT
        JLabel text = new JLabel("SELECT WITHDRAWL AMOUNT");
        text.setBounds(240, 320, 400, 20);
        text.setFont(new Font("Arial", Font.BOLD, 18));
        Image.add(text);

        a100 = new JButton("100");
        a100.setBounds(200, 410, 150, 20);
        a100.setFont(new Font("Arial", Font.BOLD, 20));
        a100.setBackground(Color.BLACK);
        a100.setForeground(Color.WHITE);
        a100.addActionListener(this);
        Image.add(a100);

//        fast cash button
        a500 = new JButton("500");
        a500.setBounds(200, 435, 150, 20);
        a500.setFont(new Font("Arial", Font.BOLD, 20));
        a500.setBackground(Color.BLACK);
        a500.setForeground(Color.WHITE);
        a500.addActionListener(this);
        Image.add(a500);

//        withdewl button
        a1000 = new JButton("1000");
        a1000.setBounds(200, 460, 150, 20);
        a1000.setFont(new Font("Arial", Font.BOLD, 20));
        a1000.setBackground(Color.BLACK);
        a1000.setForeground(Color.WHITE);
        a1000.addActionListener(this);
        Image.add(a1000);

//        pin change
        a2000 = new JButton("2000");
        a2000.setBounds(370, 410, 190, 21);
        a2000.setFont(new Font("Arial", Font.BOLD, 21));
        a2000.setBackground(Color.BLACK);
        a2000.setForeground(Color.WHITE);
        a2000.addActionListener(this);
        Image.add(a2000);

//        balance enquiry
        a5000 = new JButton("5000");
        a5000.setBounds(370, 435, 190, 21);
        a5000.setFont(new Font("Arial", Font.BOLD, 21));
        a5000.setBackground(Color.BLACK);
        a5000.setForeground(Color.WHITE);
        a5000.addActionListener(this);
        Image.add(a5000);

//               balance enquiry
        a10000 = new JButton("10,000");
        a10000.setBounds(370, 460, 190, 21);
        a10000.setFont(new Font("Arial", Font.BOLD, 21));
        a10000.setBackground(Color.BLACK);
        a10000.setForeground(Color.WHITE);
        a10000.addActionListener(this);
        Image.add(a10000);

//        Exit
        back = new JButton("Back");
        back.setBounds(280, 490, 190, 21);
        back.setFont(new Font("Arial", Font.BOLD, 21));
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        Image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
//        setUndecorated(true);
        setVisible(true);

    }

    public static void main(String args[]) {
        new FastCash("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

        try {
            String amount = ((JButton) ae.getSource()).getText().substring(3); //k

            conn c = new conn();

            ResultSet rs = c.s.executeQuery("select * from bank where pin = '" + pinnumber + "'");

            int balance = 0;

            while (rs.next()) {

                if (rs.getString("type").equals("Deposit")) {

                    balance += Integer.parseInt(rs.getString("amount"));

                } else {

                    balance -= Integer.parseInt(rs.getString("amount"));
                }

            }
            String num = "17";

            if (ae.getSource() != back && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }

            if (ae.getSource() == back) {

                this.setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            } else {
                Date date = new Date();
                c.s.executeUpdate("insert into bank values('" + pinnumber + "', '" + date + "', 'Withdrawl', '" + amount + "')");
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");

                setVisible(false);
                new Transaction(pinnumber).setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
