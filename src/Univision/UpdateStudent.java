
package Univision;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;



public class UpdateStudent extends JFrame implements ActionListener {
    JLabel labelusername, labelname, lblusername, qualification, lblname, gender, lbldob, lblphoneno, lbladress, lbl10, lblcourse, lbl12;
  
    JTextField tfphoneno, tfadress, tf10, tfcourse, tf12,tfq,tfgender,tfdob;
    JButton add, back;
  

   UpdateStudent(String username) {
        setBounds(350, 100, 850, 550);
        setLayout(null);
        getContentPane().setBackground(new Color(173, 216, 230));

       JLabel text = new JLabel("UPDATE STUDENT DETAILS");
        text.setFont(new Font("Arial", Font.BOLD, 22));
        text.setBounds(90, 5, 300, 25);
        add(text);
        
        
        
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
        qualification.setBounds(70, 80, 150, 25);
        add(qualification);

     
        tfq = new JTextField();
        tfq.setBounds(230, 80, 150, 25);
        tfq.setBorder(BorderFactory.createEmptyBorder());
        add(tfq);

        lblname = new JLabel("Name");
        lblname.setFont(new Font("Arial", Font.BOLD, 18));
        lblname.setBounds(70, 120, 150, 25);
        add(lblname);

        labelname = new JLabel();
        labelname.setFont(new Font("Arial", Font.BOLD, 18));
        labelname.setBounds(230, 120, 150, 25);
        add(labelname);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.BOLD, 18));
        gender.setBounds(70, 160, 150, 25);
        add(gender);

      
        tfgender = new JTextField();
        tfgender.setBounds(230, 160, 150, 25);
        tfgender.setBorder(BorderFactory.createEmptyBorder());
        add(tfgender);

        lbldob = new JLabel("Date of Birth");
        lbldob.setFont(new Font("Arial", Font.BOLD, 18));
        lbldob.setBounds(70, 200, 150, 25);
        add(lbldob);

        
        tfdob = new JTextField();
        tfdob.setBounds(230, 200, 150, 25);
        tfdob.setBorder(BorderFactory.createEmptyBorder());
        add(tfdob);

        lblphoneno = new JLabel("Phone No.");
        lblphoneno.setFont(new Font("Arial", Font.BOLD, 18));
        lblphoneno.setBounds(70, 240, 150, 25);
        add(lblphoneno);

        tfphoneno = new JTextField();
        tfphoneno.setBounds(230, 240, 150, 25);
        tfphoneno.setBorder(BorderFactory.createEmptyBorder());
        add(tfphoneno);

        lbladress = new JLabel("Address");
        lbladress.setFont(new Font("Arial", Font.BOLD, 18));
        lbladress.setBounds(70, 280, 150, 25);
        add(lbladress);

        tfadress = new JTextField();
        tfadress.setBounds(230, 280, 150, 25);
        tfadress.setBorder(BorderFactory.createEmptyBorder());
        add(tfadress);

        lbl10 = new JLabel("10th Percentage");
        lbl10.setFont(new Font("Arial", Font.BOLD, 18));
        lbl10.setBounds(70, 320, 150, 25);
        add(lbl10);

        tf10 = new JTextField();
        tf10.setBounds(230, 320, 150, 25);
        tf10.setBorder(BorderFactory.createEmptyBorder());
        add(tf10);

        lblcourse = new JLabel("Course");
        lblcourse.setFont(new Font("Arial", Font.BOLD, 18));
        lblcourse.setBounds(70, 360, 150, 25);
        add(lblcourse);

        tfcourse = new JTextField();
        tfcourse.setBounds(230, 360, 150, 25);
        tfcourse.setBorder(BorderFactory.createEmptyBorder());
        add(tfcourse);

        lbl12 = new JLabel("12th Percentage");
        lbl12.setFont(new Font("Arial", Font.BOLD, 18));
        lbl12.setBounds(70, 400, 150, 25);
        add(lbl12);

        tf12 = new JTextField();
        tf12.setBounds(230, 400, 150, 25);
        tf12.setBorder(BorderFactory.createEmptyBorder());
        add(tf12);

        add = new JButton("Update");
        add.setBounds(110, 460, 100, 30);
        add.setBackground(new Color(100, 149, 201));
        add.setForeground(Color.WHITE);
        add.setBorder(new LineBorder(new Color(100, 149, 201)));
        add.addActionListener(this);
        add(add);

        back = new JButton("Back");
        back.setBounds(260, 460, 100, 30);
        back.setBackground(new Color(100, 149, 201));
        back.setForeground(Color.WHITE);
        back.setBorder(new LineBorder(new Color(100, 149, 201)));
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/add student detail.jpg"));
        Image i2 = i1.getImage().getScaledInstance(410, 600, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(430, 0, 410, 600);
        add(image);

        try {
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("SELECT * FROM student WHERE username= '"+username+"'");
            while (rs.next()) {
                labelusername.setText(rs.getString("username"));
                labelname.setText(rs.getString("name"));
                tfq.setText(rs.getString("qualification"));
                tfgender.setText(rs.getString("gender"));
               tfdob.setText(rs.getString("dob"));
               tfphoneno.setText(rs.getString("phone"));
               tfadress.setText(rs.getString("address"));
               tf10.setText(rs.getString("tenth"));
               tfcourse.setText(rs.getString("course"));
               tf12.setText(rs.getString("twelveth"));


                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            String gender = tfgender.getText();
            String qualification = tfq.getText();

            String dob =tfdob.getText(); 
            String phone = tfphoneno.getText();
            String address = tfadress.getText();
            String tenth = tf10.getText();
            String course = tfcourse.getText();
            String twelveth = tf12.getText();

            String username = labelusername.getText();
            String name = labelname.getText();

            try {
                Conn c = new Conn();
               String query = "UPDATE STUDENT SET " +
               "username = '" + username + "', " +
               "qualification = '" + qualification + "', " +
               "name = '" + name + "', " +
               "gender = '" + gender + "', " +
               "dob = '" + dob + "', " +
               "phone = '" + phone + "', " +
               "address = '" + address + "', " +
               "tenth = '" + tenth + "', " +
               "course = '" + course + "', " +
               "twelveth = '" + twelveth + "' " +
               "WHERE username = '" + username + "'"; // or another condition
c.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null, "Student Details updated Successfully");
                setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == back) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new UpdateStudent("kriti13");
    }
}
