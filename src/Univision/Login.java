package Univision;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {
JButton signup,fpassword,login;
JTextField tfusername;
JPasswordField  tfpassword;
    Login() {
        setTitle("Login Page");
        setSize(800, 350);
        setLocationRelativeTo(null); // Center the window on the screen
        setLayout(null);

        // Wrap everything in a main container panel with white border
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(null);
        mainPanel.setBounds(0, 0, 800, 350);
        mainPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5)); // White border of thickness 5
        add(mainPanel);

        // Left panel (with image)
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBounds(0, 0, 280, 350);
        p1.setBounds(0, 0, 280, 350);
p1.setBorder(BorderFactory.createLineBorder(Color.WHITE, 5)); // Add this line

        mainPanel.add(p1);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(280, 350, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 280, 350);
        p1.add(image);

        // Right panel
        JPanel p2 = new JPanel();
        p2.setBackground(new Color(173, 216, 230));
        p2.setLayout(null);
        p2.setBounds(280, 0, 520, 350);
        mainPanel.add(p2);

        // Shifted everything higher
        JLabel lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Arial", Font.BOLD, 18));
        lblusername.setBounds(80, 20, 100, 25);
        p2.add(lblusername);

     tfusername = new JTextField();
        tfusername.setBounds(80, 60, 300, 25);
        p2.add(tfusername);

        JLabel lblpassword = new JLabel("Password");
        lblpassword.setFont(new Font("Arial", Font.BOLD, 18));
        lblpassword.setBounds(80, 110, 100, 25);
        p2.add(lblpassword);

         tfpassword = new JPasswordField();
        tfpassword.setBounds(80, 150, 300, 25);
        p2.add(tfpassword);

       login = new JButton("Login");
        login.setBounds(80, 200, 130, 30);
        login.setBackground(new Color(100, 149, 201));
        login.setForeground(Color.WHITE);
        login.setBorder(new LineBorder(new Color(100, 149, 201)));
        login.addActionListener(this);
        p2.add(login);

    signup = new JButton("Signup");
        signup.setBounds(250, 200, 130, 30);
        signup.setForeground(new Color(100, 149, 201));
        signup.setBackground(Color.WHITE);
        signup.setBorder(new LineBorder(new Color(100, 149, 201)));
        signup.addActionListener(this);
        p2.add(signup);

        fpassword = new JButton("Forgot Password");
        fpassword.setBounds(170, 250, 130, 30);
        fpassword.setForeground(new Color(100, 149, 201));
        fpassword.setBackground(Color.WHITE);
        fpassword.setBorder(new LineBorder(new Color(100, 149, 201)));
        fpassword.addActionListener(this);
        p2.add(fpassword);
        
        JLabel text = new JLabel("Trouble in login...");
        text.setBounds(300,250,150,20);
        text.setForeground(Color.red);
        p2.add(text);

        setVisible(true);
    }
 @Override
    public void actionPerformed(ActionEvent ae){
    if(ae.getSource() == signup ){
        setVisible(false);
        new Signup();
    } else if(ae.getSource() == login ){
        try{
            String username = tfusername.getText();
            String password = tfpassword.getText();
             
            String query = "select * from account where username = '"+username+"' AND password = '"+password+"'";
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery(query);
            if(rs.next()){
            setVisible(false);
             new Loading(username);}
        else{ JOptionPane.showMessageDialog(null,"Incorrect Username or Password");
                }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }else {
        setVisible(false);
        new ForgotPassword();
    }
    }
    public static void main(String[] args) {
        new Login();
    }
}
