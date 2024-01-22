package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.*;
//import com.toedter.calendar.JDateChooser;
//import com.toedter.calendar.demo.DateChooserPanel;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    String formno;
    
  
   
    JTextField pannumberTextField, aadharnumTextField;
    
    JButton next;
    
    JRadioButton syes,sno,Eacc,Eaccno;
    
    JComboBox ccategory,creligion,cincome,ceducation,coccupation;
    
    
    SignupTwo(String formno){
        
        this.formno = formno;
        
         setLayout(null);
        
         setTitle("NEW ACCOUNT APPLICATION FOEM -- PAGE 2");
        
        
//        users personal Details page 2

        JLabel additonalDetails = new JLabel("PAGE 2 : Additonal Details");
        additonalDetails.setFont(new Font("Arail",Font.BOLD,22));
        additonalDetails.setBounds(280, 100, 300, 25);
        additonalDetails.setForeground(Color.WHITE);
        add(additonalDetails);
        
//        religion

        JLabel religion = new JLabel("Religion :");
        religion.setFont(new Font("Arail",Font.BOLD,22));
        religion.setBounds(120, 170, 100, 25);
        religion.setForeground(Color.WHITE);
        add(religion);
        
        String valreligion[] = {"Hindu", "Muslim","Shik","Cristain","Other"};
        creligion = new JComboBox(valreligion);  //combo box adding
        creligion.setBounds(300, 170, 400, 25);
        creligion.setFont(new Font("Arail",Font.BOLD,15));
//        creligion.setBackground(Color.LIGHT_GRAY);
       add(creligion);
        
//        category
        JLabel category = new JLabel("category :");
        category.setFont(new Font("Arail",Font.BOLD,22));
        category.setBounds(120, 220, 200, 25);
        category.setForeground(Color.WHITE);
        add(category);
        
        String valcategory[]={"General","OBC","SC","ST","Other"};
        ccategory = new JComboBox(valcategory);
        ccategory.setBounds(300, 220, 400, 25);
        ccategory.setFont(new Font("Arail",Font.BOLD,15));
       add(ccategory);
        
//        income

        JLabel income = new JLabel("Income :");
        income.setFont(new Font("Arail",Font.BOLD,22));
        income.setBounds(120, 270, 200, 20);
        income.setForeground(Color.WHITE);
        add(income);
        
        String valincome[] = {"Between 1 to 3 LPA ","Between 3 to 5 LPA","Between 5 to 7 LPA","Between 7 to 10 LPA","Greater than 10 LPA ","Null"};
        cincome = new JComboBox(valincome);
        cincome.setBounds(300, 270, 400, 25);
        cincome.setFont(new Font("Arail",Font.BOLD,15));
        add(cincome);
        
//        educational qualifications

        JLabel educational = new JLabel("Educational ");
        educational.setFont(new Font("Arail",Font.BOLD,22));
        educational.setBounds(120, 320, 200, 20);
        educational.setForeground(Color.WHITE);
        add(educational);
        
        JLabel qualifications = new JLabel("Qualifications :");
        qualifications.setFont(new Font("Arail",Font.BOLD,22));
        qualifications.setBounds(120, 350, 200, 20);
        qualifications.setForeground(Color.WHITE);
        add(qualifications);
        
        String valeducation[]={"B.E Graduate","Graduate","Non-Graduate","Doctrate","Other Certifications","Other"};
        ceducation = new JComboBox(valeducation);
        ceducation.setFont(new Font("Arail",Font.BOLD,15));
        ceducation.setBounds(300, 350, 400, 25);
        add(ceducation);
        
        
//        occupation
        
        JLabel occupation = new JLabel("Occupation :");
        occupation.setFont(new Font("Arail",Font.BOLD,22));
        occupation.setBounds(120, 420, 200, 20);
        occupation.setForeground(Color.WHITE);
        add(occupation);
        
         String valoccupation[]={"Salaried","Bussinesmen","Student","Servicemen","Retired","Other"};
        coccupation = new JComboBox(valoccupation);
        coccupation.setFont(new Font("Arail",Font.BOLD,15));
        coccupation.setBounds(300, 420, 400, 25);
        add(coccupation);
        
        
//     pannumber

        JLabel pannumber = new JLabel("PAN Number :");
        pannumber.setFont(new Font("Arail",Font.BOLD,22));
        pannumber.setBounds(120, 470, 200, 20);
        pannumber.setForeground(Color.WHITE);
        add(pannumber);
        
        pannumberTextField = new JTextField();
        pannumberTextField.setBounds(300, 470, 400, 25);
        pannumberTextField.setFont(new Font("Arail",Font.BOLD,15));
       add(pannumberTextField);
        
//        aadharnum
        JLabel aadharnum = new JLabel("Aadhar Number :");
        aadharnum.setFont(new Font("Arail",Font.BOLD,22));
        aadharnum.setBounds(120, 520, 200, 25);
        aadharnum.setForeground(Color.WHITE);
        add(aadharnum);
        
        aadharnumTextField = new JTextField();
        aadharnumTextField.setBounds(300, 520, 400, 25);
        aadharnumTextField.setFont(new Font("Arail",Font.BOLD,15));
       add(aadharnumTextField);
        
//        seniorcitizen

        JLabel seniorcitizen = new JLabel("Senior Citizen :");
        seniorcitizen.setFont(new Font("Arail",Font.BOLD,22));
        seniorcitizen.setBounds(120, 570, 200, 20);
        seniorcitizen.setForeground(Color.WHITE);
        add(seniorcitizen);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300, 570, 180, 20);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(510, 570, 185, 20);
        add(sno);
        
        ButtonGroup seniorcitizengroup = new ButtonGroup();
        seniorcitizengroup.add(syes);
        seniorcitizengroup.add(sno);
        
//        existingacc

        JLabel existingacc = new JLabel("Existing Acc :");
        existingacc.setFont(new Font("Arail",Font.BOLD,22));
        existingacc.setBounds(120, 620, 200, 20);
        existingacc.setForeground(Color.WHITE);
        add(existingacc);
        
        Eacc = new JRadioButton("Yes");
        Eacc.setBounds(300, 620, 180, 20);
        add(Eacc);
        
        Eaccno = new JRadioButton("No");
        Eaccno.setBounds(510, 620, 185, 20);
        add(Eaccno);
        
        ButtonGroup marrybuttongroup = new ButtonGroup();
        marrybuttongroup.add(Eacc);
        marrybuttongroup.add(Eaccno);
       
//       next button

        next = new JButton("Next");
        next.setBounds(300, 680, 280, 35);
        next.setFont(new Font("Arial",Font.BOLD,15));
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
        
      
        
        String religion = (String)creligion.getSelectedItem();
        String category = (String) ccategory.getSelectedItem();
        String income = (String) cincome.getSelectedItem();
        String valeducation = (String) ceducation.getSelectedItem();
        String occupation=(String) coccupation.getSelectedItem();
        
        String seniorcitizen =null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }else if(sno.isSelected()){
            seniorcitizen="NO";
        }
                
        String existingacc= null;
         if(Eacc.isSelected()){
            existingacc="Yes";
        }else if(Eaccno.isSelected()){
            existingacc="No";
        }
        
        String pannumber= pannumberTextField.getText();
        String aadharnum = aadharnumTextField.getText();
        
        
      
        try{
             conn c =new conn();
             String query = "insert into signuptwo values ( '"+formno+"', '"+religion+"','"+category+"','"+income+"','"+valeducation+"','"+occupation+"', '"+seniorcitizen+"' ,'"+existingacc+"', '"+pannumber+"','"+aadharnum+"')";          
           
             c.s.executeUpdate(query);
             
///             signupThree object 

                setVisible(false);
                new SignupThree(formno).setVisible(true); 
                
            }catch(Exception e){
            System.out.println(e);
        }
        
        
    }
     public static void main(String args[]){
        new SignupTwo("");
    }

 
}
