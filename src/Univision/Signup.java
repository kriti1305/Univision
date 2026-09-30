
package Univision;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
import java.awt.event.*;
public class Signup extends JFrame implements ActionListener {
    JButton create,back;
    JLabel lblanswer, lblname,lblemail,lblusername,lblpassword,lblsecurity;
    JTextField tfname,tfemail,tfusername,tfanswer;
    JPasswordField tfpassword;
    Choice security;
    Signup(){
           setTitle("Signup Page");
        setBounds(250,150,900,420);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(173, 216, 230));
        p1.setBounds(0,0,500,400);
        p1.setLayout(null);
        add(p1);
        
         lblname = new JLabel("Name");
        lblname.setFont(new Font("Arial", Font.BOLD, 18));
        lblname.setBounds(50, 20, 100, 25);
        p1.add(lblname);
        
      tfname = new JTextField();
        tfname.setBounds(170,20, 250, 25);
        tfname.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfname);
        
         lblemail = new JLabel("Email");
        lblemail.setFont(new Font("Arial", Font.BOLD, 18));
        lblemail.setBounds(50, 70, 100, 25);
        p1.add(lblemail);
        
       tfemail = new JTextField();
        tfemail.setBounds(170,70, 250, 25);
        tfemail.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfemail);
        
        lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Arial", Font.BOLD, 18));
        lblusername.setBounds(50, 120, 100, 25);
        p1.add(lblusername);
        
        tfusername = new JTextField();
        tfusername.setBounds(170,120, 250, 25);
        tfusername.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfusername);
       
        lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Arial", Font.BOLD, 18));
        lblpassword.setBounds(50, 170, 100, 25);
        p1.add(lblpassword);
        
      tfpassword = new JPasswordField();
        tfpassword.setBounds(170,170, 250, 25);
      tfpassword.setBorder(BorderFactory.createEmptyBorder());
        p1.add(tfpassword);
        
       lblsecurity = new JLabel("Security Question");
        lblsecurity.setFont(new Font("Arial", Font.BOLD, 18));
        lblsecurity.setBounds(10, 220, 150, 25);
        p1.add(lblsecurity);
        
        
        security = new Choice();
        security.add(" what's your lucky number?");
        security.add("who's your favrouite teacher?");
        security.add("what's your pet name?");
        security.add("which is your fav book?");
        security.setBounds(170,220,250,25);
        p1.add(security);
       
        lblanswer = new JLabel("Answer");
       lblanswer.setFont(new Font("Arial", Font.BOLD, 18));
      lblanswer.setBounds(50, 270, 100, 25);
        p1.add(lblanswer);
        
        tfanswer = new JTextField();
        tfanswer.setBounds(170,270, 250, 25);
      tfanswer.setBorder(BorderFactory.createEmptyBorder());
        p1.add( tfanswer);
        
        
        create = new JButton("Create");
        create.setBounds(170, 320, 100, 30);
        create.setBackground(new Color(100, 149, 201));
       create.setForeground(Color.WHITE);
        create.setBorder(new LineBorder(new Color(100, 149, 201)));
        create.addActionListener(this);
        p1.add(create);

         back = new JButton("Back");
        back.setBounds(320, 320, 100, 30);
        back.setBackground(new Color(100, 149, 201));
       back.setForeground(Color.WHITE);
      back.setBorder(new LineBorder(new Color(100, 149, 201)));
      back.addActionListener(this);
        p1.add(back);
        
        
  ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/signup.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400, 420, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(500, 0, 400, 420);
        add(image);
        
        setVisible(true);
        
        
        

    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == create  ){
            String name = tfname.getText();
            String email = tfemail.getText();
            String username = tfusername.getText();
            String password = tfpassword.getText();
            String question = security.getSelectedItem();
            String answer = tfanswer.getText();
            
           String query = "INSERT INTO account VALUES('" + 
    name + "','" + 
    email + "','" + 
    username + "','" + 
    password + "','" + 
    question.replace("'", "\\'") + "','" + 
    answer + "')";

       try{
           Conn c = new Conn();
           c.s.executeUpdate(query);
           
           JOptionPane.showMessageDialog(null,"Account Created Successfully");
           setVisible(false);
           new Login();
           
       }catch (Exception e){
           e.printStackTrace();
       }
        
        }else if(ae.getSource()== back){
        setVisible(false);
        new Login();
    }
        
    }
    
    
    public static void main (String[] args){
        new Signup();
    }
    
    
    
}
