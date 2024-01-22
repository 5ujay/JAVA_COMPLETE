
package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
//import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
   
    JTextField nameTextField, fnameTextField,emailTextField,addressTextField,
            cityTextField,stateTextField,pincodeTextField;
    
    JButton next;
    
    JRadioButton male,female,married,unmarried;
    
    JDateChooser datec ;
    
    SignupOne(){
        
         setLayout(null);
        
        Random ran = new Random();
        long random = Math.abs( (ran.nextLong() % 9000L )+ 1000L);
        
//        name of form application with random numbers
        JLabel formno = new JLabel("Application Form No: " + random);
        formno.setFont(new Font("Arail",Font.BOLD,35));
        formno.setBounds(200, 20, 600, 40);
        formno.setForeground(Color.WHITE);
        add(formno);
        
//        users personal Details page 1

        JLabel personaDetails = new JLabel("PAGE 1 : Personal Details");
        personaDetails.setFont(new Font("Arail",Font.BOLD,22));
        personaDetails.setBounds(280, 100, 300, 25);
        personaDetails.setForeground(Color.WHITE);
        add(personaDetails);
        
//        persons name

        JLabel name = new JLabel("Name :");
        name.setFont(new Font("Arail",Font.BOLD,22));
        name.setBounds(120, 170, 100, 20);
        name.setForeground(Color.WHITE);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setBounds(300, 170, 400, 25);
        nameTextField.setFont(new Font("Arail",Font.BOLD,15));
       add(nameTextField);
        
//        fathers name
        JLabel fname = new JLabel("Father's Name :");
        fname.setFont(new Font("Arail",Font.BOLD,22));
        fname.setBounds(120, 220, 200, 20);
        fname.setForeground(Color.WHITE);
        add(fname);
        
         fnameTextField = new JTextField();
        fnameTextField.setBounds(300, 220, 400, 25);
        fnameTextField.setFont(new Font("Arail",Font.BOLD,15));
       add(fnameTextField);
        
//        date of birth

        JLabel dob = new JLabel("Date Of Birth :");
        dob.setFont(new Font("Arail",Font.BOLD,22));
        dob.setBounds(120, 270, 200, 20);
        dob.setForeground(Color.WHITE);
        add(dob);
        
        datec = new JDateChooser(); 
        datec.setBounds(300, 270, 200, 20);
        add(datec);
        
//        Gender

        JLabel gender = new JLabel("Gender :");
        gender.setFont(new Font("Arail",Font.BOLD,22));
        gender.setBounds(120, 320, 200, 20);
        gender.setForeground(Color.WHITE);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 320, 180, 20);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(510, 320, 185, 20);
        add(female);
        
        ButtonGroup buttongroup = new ButtonGroup();
        buttongroup.add(male);
        buttongroup.add(female);
        
//        email address
        JLabel email = new JLabel("Email Address :");
        email.setFont(new Font("Arail",Font.BOLD,22));
        email.setBounds(120, 370, 200, 20);
        email.setForeground(Color.WHITE);
        add(email);
        
         emailTextField = new JTextField();
         emailTextField.setBounds(300, 370, 400, 25);
         emailTextField.setFont(new Font("Arail",Font.BOLD,15));
         add(emailTextField);
        
        
//        maraital staus
        
        JLabel marital = new JLabel("Marital Status :");
        marital.setFont(new Font("Arail",Font.BOLD,22));
        marital.setBounds(120, 420, 200, 20);
        marital.setForeground(Color.WHITE);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 420, 180, 20);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(510, 420, 185, 20);
        add(unmarried);
        
        ButtonGroup marrybuttongroup = new ButtonGroup();
        marrybuttongroup.add(married);
        marrybuttongroup.add(unmarried);
        
        
//        address

        JLabel address = new JLabel("Address :");
        address.setFont(new Font("Arail",Font.BOLD,22));
        address.setBounds(120, 470, 200, 20);
        address.setForeground(Color.WHITE);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setBounds(300, 470, 400, 25);
        addressTextField.setFont(new Font("Arail",Font.BOLD,15));
       add(addressTextField);
        
//        city
        JLabel city = new JLabel("City :");
        city.setFont(new Font("Arail",Font.BOLD,22));
        city.setBounds(120, 520, 200, 25);
        city.setForeground(Color.WHITE);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setBounds(300, 520, 400, 25);
        cityTextField.setFont(new Font("Arail",Font.BOLD,15));
       add(cityTextField);
        
//        state

        JLabel state = new JLabel("State :");
        state.setFont(new Font("Arail",Font.BOLD,22));
        state.setBounds(120, 570, 200, 20);
        state.setForeground(Color.WHITE);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setBounds(300, 570, 400, 25);
        stateTextField.setFont(new Font("Arail",Font.BOLD,15));
       add(stateTextField);
        
//        pincode

        JLabel pincode = new JLabel("Pincode :");
        pincode.setFont(new Font("Arail",Font.BOLD,22));
        pincode.setBounds(120, 620, 200, 20);
        pincode.setForeground(Color.WHITE);
        add(pincode);
        
        pincodeTextField = new JTextField();
        pincodeTextField.setBounds(300, 620, 400, 25);
        pincodeTextField.setFont(new Font("Arail",Font.BOLD,15));
       add(pincodeTextField);
       
//       next button

        next = new JButton("Next");
        next.setBounds(300, 680, 280, 35);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        
        
        
        
        setSize(850,800);
        setLocation(350,50);
       getContentPane().setBackground(Color.decode("#861F41"));
        setVisible(true);
        
    }
    
//    public static void main(String args[]){
//        new SignupOne();
//    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        throw new UnsupportedOperationException("Not supported yet.");
        // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        String formno = "" + random; //long
        
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField)datec.getDateEditor().getUiComponent()).getText();
        String gender = null;
        
        if(male.isSelected()){
            gender="Male";
        }else if(female.isSelected()){
            gender="Female";
        }
                
        String email= emailTextField.getText();
         
        String marital=null;
        if(married.isSelected()){
            marital="married";
        }else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        
        String address= addressTextField.getText();
        String city = cityTextField.getText();
        String state = addressTextField.getText();
        String pincode = pincodeTextField.getText();
        
      
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Name is required !");
                
            } if(fname.equals("")){
                JOptionPane.showMessageDialog(null, "Father's name is required !");
                
            }
             if(dob.equals("")){
                JOptionPane.showMessageDialog(null, "Date of birth is required !");
                
            } 
             if(email.equals("")){
                JOptionPane.showMessageDialog(null, "Email is required !");
                
            } if(address.equals("")){
                JOptionPane.showMessageDialog(null, "Address is required !");
                
            } if(city.equals("")){
                JOptionPane.showMessageDialog(null, "City name is required !");
                
            } if(state.equals("")){
                JOptionPane.showMessageDialog(null, "State name is required !");
                
            } if(pincode.equals("")){
                JOptionPane.showMessageDialog(null, "Pincode is required !");
                
            }
            else{
                conn c =new conn();
                String query = "insert into signup values ( '"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"', '"+address+"' ,'"+marital+"', '"+city+"','"+state+"' ,'"+pincode+"')";          
           
                c.s.executeUpdate(query);
                
//                for signupTwo object
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }   
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
     public static void main(String args[]){
        new SignupOne();
    }
    
}
