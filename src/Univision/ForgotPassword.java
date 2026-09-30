package Univision;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.sql.*;

public class ForgotPassword extends JFrame  implements ActionListener {
     
   
     JTextField tfusername,tfname,tfquestion,tfanswer,tfpassword;
     JButton search,retrieve,back;
    
   ForgotPassword(){
       setTitle("Forgot Password");
       setBounds(250,150,850,330);
      
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/forget password 1.png"));
        Image i2 = i1.getImage().getScaledInstance(250, 270, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(570, 10, 250, 270);
        add(image);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(173, 216, 230));
        p1.setBounds(0,0,550,350);
        p1.setLayout(null);
        add(p1);
        Font labelFont = new Font("Arial", Font.BOLD, 14);

// Labels
JLabel lblusername = new JLabel("Username");
lblusername.setFont(labelFont);
lblusername.setBounds(30, 50, 130, 25);
p1.add(lblusername);

JLabel lblname = new JLabel("Name");
lblname.setFont(labelFont);
lblname.setBounds(30, 90, 130, 25);
p1.add(lblname);

JLabel lblquestion = new JLabel("Security Question");
lblquestion.setFont(labelFont);
lblquestion.setBounds(30, 125, 200, 25);
p1.add(lblquestion);

JLabel lblanswer = new JLabel("Answer");
 lblanswer.setFont(labelFont);
 lblanswer.setBounds(30, 160, 130, 25);
p1.add( lblanswer);

JLabel lblpassword = new JLabel("Password");
lblpassword.setFont(labelFont);
lblpassword.setBounds(30, 195, 130, 25);
p1.add(lblpassword);

// Text fields
tfusername = new JTextField();
tfusername.setFont(labelFont);
tfusername.setBounds(220, 50, 160, 25);
p1.add(tfusername);

tfname = new JTextField();
tfname.setEditable(false);
tfname.setFont(labelFont);
tfname.setBounds(220, 90, 160, 25);
p1.add(tfname);

tfquestion = new JTextField();
tfquestion.setEditable(false);
tfquestion.setFont(labelFont);
tfquestion.setBounds(220, 125, 240, 25);
p1.add(tfquestion);

tfanswer = new JTextField();
tfanswer.setFont(labelFont);
tfanswer.setBounds(220, 160, 160, 25);
p1.add(tfanswer);

tfpassword = new JTextField();
tfpassword.setEditable(false);
tfpassword.setFont(labelFont);
tfpassword.setBounds(220, 195, 160, 25);
p1.add(tfpassword);

// Buttons
search = new JButton("Search");
search.setFont(new Font("Arial", Font.BOLD, 14));
search.setBounds(400, 50, 100, 25);
search.setBackground(new Color(100, 149, 201));
search.setForeground(Color.WHITE);
search.setBorder(new LineBorder(new Color(100, 149, 201)));
search.addActionListener(this);
p1.add(search);

retrieve = new JButton("Retrieve");
retrieve.setFont(new Font("Arial", Font.BOLD, 14));
retrieve.setBounds(400, 160, 100, 25);
retrieve.setBackground(new Color(100, 149, 201));
retrieve.setForeground(Color.WHITE);
retrieve.setBorder(new LineBorder(new Color(100, 149, 201)));
retrieve.addActionListener(this);
p1.add(retrieve);

back = new JButton("Back");
back.setFont(new Font("Arial", Font.BOLD, 14));
back.setBounds(200, 240, 100, 30);
back.setBackground(new Color(100, 149, 201));
back.setForeground(Color.WHITE);
back.setBorder(new LineBorder(new Color(100, 149, 201)));
back.addActionListener(this);
p1.add(back);

     
        
        setVisible(true);
   }
    
   
   @Override
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == search ){
        try{
            String query = "select * from account where username = '"+tfusername.getText()+"'";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                tfname.setText(rs.getString("name"));
                tfquestion.setText(rs.getString("security"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        
    }
    
    else  if(ae.getSource() == retrieve){
        try{
            String query = "select * from account where answer = '"+tfanswer.getText()+"' AND username = '"+tfusername.getText()+"'" ;
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                tfpassword.setText(rs.getString("Password"));
              
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    
    }else{
        setVisible(false);
        new Login();
        
    }
    }
    public static void main(String[] args){
        new ForgotPassword();
    }



}
