package Univision;

import java.awt.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;

public class viewStudentDetails extends JFrame implements ActionListener {
    JLabel labelusername, labelq, labelname, labelgender, labeldob, labelphoneno, labeladdress, label10, labelcourse, label12;
    JLabel lblusername, qualification, lblname, gender, lbldob, lblphoneno, lbladress, lbl10, lblcourse, lbl12;
    JButton back;

    viewStudentDetails(String username) {
        setBounds(350, 90, 850, 550); // Increased height to fit bottom image
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(null);

        lblusername = new JLabel("Username");
        lblusername.setFont(new Font("Arial", Font.BOLD, 18));
        lblusername.setBounds(70, 40, 150, 25);
        add(lblusername);

        labelusername = new JLabel();
        labelusername.setFont(new Font("Arial", Font.BOLD, 18));
        labelusername.setBounds(230, 40, 150, 25);
        add(labelusername);

        qualification = new JLabel("Qualification");
        qualification.setFont(new Font("Arial", Font.BOLD, 18));
        qualification.setBounds(70, 100, 150, 25);
        add(qualification);

        labelq = new JLabel();
        labelq.setFont(new Font("Arial", Font.BOLD, 18));
        labelq.setBounds(230, 100, 150, 25);
        add(labelq);

        lblname = new JLabel("Name");
        lblname.setFont(new Font("Arial", Font.BOLD, 18));
        lblname.setBounds(70, 160, 150, 25);
        add(lblname);

        labelname = new JLabel();
        labelname.setFont(new Font("Arial", Font.BOLD, 18));
        labelname.setBounds(230, 160, 150, 25);
        add(labelname);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.BOLD, 18));
        gender.setBounds(70, 220, 150, 25);
        add(gender);

        labelgender = new JLabel();
        labelgender.setFont(new Font("Arial", Font.BOLD, 18));
        labelgender.setBounds(230, 220, 150, 25);
        add(labelgender);

        lbldob = new JLabel("Date of Birth");
        lbldob.setFont(new Font("Arial", Font.BOLD, 18));
        lbldob.setBounds(70, 280, 150, 25);
        add(lbldob);

        labeldob = new JLabel();
        labeldob.setFont(new Font("Arial", Font.BOLD, 18));
        labeldob.setBounds(230, 280, 150, 25);
        add(labeldob);

        lblphoneno = new JLabel("Phone No.");
        lblphoneno.setFont(new Font("Arial", Font.BOLD, 18));
        lblphoneno.setBounds(440, 40, 150, 25);
        add(lblphoneno);

        labelphoneno = new JLabel();
        labelphoneno.setFont(new Font("Arial", Font.BOLD, 18));
        labelphoneno.setBounds(650, 40, 150, 25);
        add(labelphoneno);

        lbladress = new JLabel("Address");
        lbladress.setFont(new Font("Arial", Font.BOLD, 18));
        lbladress.setBounds(440, 100, 150, 25);
        add(lbladress);

        labeladdress = new JLabel();
        labeladdress.setFont(new Font("Arial", Font.BOLD, 18));
        labeladdress.setBounds(650, 100, 200, 25);
        add(labeladdress);

        lbl10 = new JLabel("10th Percentage");
        lbl10.setFont(new Font("Arial", Font.BOLD, 18));
        lbl10.setBounds(440, 160, 150, 25);
        add(lbl10);

        label10 = new JLabel();
        label10.setFont(new Font("Arial", Font.BOLD, 18));
        label10.setBounds(650, 160, 150, 25);
        add(label10);

        lblcourse = new JLabel("Course");
        lblcourse.setFont(new Font("Arial", Font.BOLD, 18));
        lblcourse.setBounds(440, 220, 150, 25);
        add(lblcourse);

        labelcourse = new JLabel();
        labelcourse.setFont(new Font("Arial", Font.BOLD, 18));
        labelcourse.setBounds(650, 220, 150, 25);
        add(labelcourse);

        lbl12 = new JLabel("12th Percentage");
        lbl12.setFont(new Font("Arial", Font.BOLD, 18));
        lbl12.setBounds(440, 280, 150, 25);
        add(lbl12);

        label12 = new JLabel();
        label12.setFont(new Font("Arial", Font.BOLD, 18));
        label12.setBounds(650, 280, 150, 25);
        add(label12);

        back = new JButton("Back");
        back.setBounds(340, 340, 100, 30);
        back.setBackground(new Color(100, 149, 201));
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(new Color(100, 149, 201)));
        back.addActionListener(this);
        add(back);

        // -----------------------------
        // Add Image at Bottom
        // -----------------------------
        try {
            ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/viewd.jpg"));
            Image img = icon.getImage().getScaledInstance(850, 200, Image.SCALE_SMOOTH); // Adjust width and height
            JLabel imageLabel = new JLabel(new ImageIcon(img));
            imageLabel.setBounds(0, 350, 850, 200); // Positioned at the bottom
            add(imageLabel);
        } catch (Exception e) {
            JLabel error = new JLabel("Image not found");
            error.setForeground(Color.RED);
            error.setBounds(340, 500, 10, 30);
            add(error);
        }

        try {
            Conn c = new Conn();
            String query = "SELECT * FROM student WHERE username= '" + username + "'";
            ResultSet rs = c.s.executeQuery(query);
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelq.setText(rs.getString("qualification"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labeldob.setText(rs.getString("dob"));
                labelphoneno.setText(rs.getString("phone"));
                labeladdress.setText(rs.getString("address"));
                label10.setText(rs.getString("tenth"));
                labelcourse.setText(rs.getString("course"));
                label12.setText(rs.getString("twelveth"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new viewStudentDetails("");
    }
}
