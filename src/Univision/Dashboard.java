
package Univision;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;

public class Dashboard extends JFrame implements ActionListener  {
    String username;
    JButton addStudentDetails,viewStudentDetails,updateStudentDetails, engineering,medical,design,management,top,deleteStudentDetails,addReview,about;
    Dashboard(String username){
    this.username=username;
    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setLayout(null);
    
    JPanel p1 = new JPanel();
    p1.setLayout(null);
   p1.setBackground(new Color(100, 149, 201));
       p1.setForeground(Color.WHITE);
      p1.setBorder(new LineBorder(new Color(100, 149, 201)));
   p1.setBounds(0, 0, 1600, 60);
        add(p1);
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/s.jpg"));
        Image i2 = i1.getImage().getScaledInstance(65, 65, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(5, 0, 65, 65);
        p1.add(image);
    
         JLabel heading = new JLabel ("Dashboard");
         heading.setBounds(80,20,300,40);
         heading.setFont(new Font("Arial", Font.BOLD, 25));
        heading.setForeground(Color.WHITE);
         p1.add(heading);
         
           JPanel p2 = new JPanel();
    p2.setLayout(null);
   p2.setBackground(new Color(100, 149, 201));
       p2.setForeground(Color.WHITE);
      p2.setBorder(new LineBorder(new Color(100, 149, 201)));
   p2.setBounds(0, 62, 300, 900);
        add(p2);
    
        addStudentDetails = new JButton("Add Student Details");
addStudentDetails.setBounds(0, 10, 300, 50);
addStudentDetails.setBackground(new Color(100, 149, 201));
addStudentDetails.setFont(new Font("Arial", Font.BOLD, 20));
addStudentDetails.setForeground(Color.WHITE);
addStudentDetails.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
addStudentDetails.setFocusPainted(false);
addStudentDetails.setContentAreaFilled(true);
addStudentDetails.addActionListener(this);
p2.add(addStudentDetails);



 updateStudentDetails = new JButton("Update Student Details");
updateStudentDetails.setBounds(0, 60, 300, 50);
updateStudentDetails.setBackground(new Color(100, 149, 201));
updateStudentDetails.setFont(new Font("Arial", Font.BOLD, 20));
updateStudentDetails.setForeground(Color.WHITE);
updateStudentDetails.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
updateStudentDetails.setFocusPainted(false);
updateStudentDetails.setContentAreaFilled(true);
updateStudentDetails.addActionListener(this);
p2.add(updateStudentDetails);


 viewStudentDetails = new JButton("View Student Details");
viewStudentDetails.setBounds(0, 110, 300, 50);
viewStudentDetails.setBackground(new Color(100, 149, 201));
viewStudentDetails.setFont(new Font("Arial", Font.BOLD, 20));
viewStudentDetails.setForeground(Color.WHITE);
viewStudentDetails.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
viewStudentDetails.setFocusPainted(false);
viewStudentDetails.setContentAreaFilled(true);
viewStudentDetails.addActionListener(this);

p2.add(viewStudentDetails);


       deleteStudentDetails = new JButton("Delete Student Details");
deleteStudentDetails.setBounds(0, 160, 300, 50);
deleteStudentDetails.setBackground(new Color(100, 149, 201));
deleteStudentDetails.setFont(new Font("Arial", Font.BOLD, 20));
deleteStudentDetails.setForeground(Color.WHITE);
deleteStudentDetails.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
deleteStudentDetails.setFocusPainted(false);
deleteStudentDetails.setContentAreaFilled(true);
deleteStudentDetails.addActionListener(this);
p2.add(deleteStudentDetails);
        
top = new JButton("Top Rated Colleges");
top.setBounds(0, 210, 300, 50);
top.setBackground(new Color(100, 149, 201));
top.setFont(new Font("Arial", Font.BOLD, 20));
top.setForeground(Color.WHITE);
top.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
top.setFocusPainted(false);
top.setContentAreaFilled(true);
top.addActionListener(this);
p2.add(top);
        
   engineering = new JButton("Engineering Colleges");
engineering.setBounds(0, 260, 300, 50);
engineering.setBackground(new Color(100, 149, 201));
engineering.setFont(new Font("Arial", Font.BOLD, 20));
engineering.setForeground(Color.WHITE);
engineering.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
engineering.setFocusPainted(false);
engineering.setContentAreaFilled(true);
 engineering.addActionListener(this);
p2.add(engineering);
        
design = new JButton("Design Colleges");
design.setBounds(0, 310, 300, 50);
design.setBackground(new Color(100, 149, 201));
design.setFont(new Font("Arial", Font.BOLD, 20));
design.setForeground(Color.WHITE);
design.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
design.setFocusPainted(false);
design.setContentAreaFilled(true);
design.addActionListener(this);
p2.add(design);
        
 medical = new JButton("Medical Colleges");
medical.setBounds(0, 360, 300, 50);
medical.setBackground(new Color(100, 149, 201));
medical.setFont(new Font("Arial", Font.BOLD, 20));
medical.setForeground(Color.WHITE);
medical.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
medical.setFocusPainted(false);
medical.setContentAreaFilled(true);
medical.addActionListener(this);
p2.add(medical);
      
 management = new JButton("Management Colleges");
management.setBounds(0, 410, 300, 50);
management.setBackground(new Color(100, 149, 201));
management.setFont(new Font("Arial", Font.BOLD, 20));
management.setForeground(Color.WHITE);
management.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
management.setFocusPainted(false);
management.setContentAreaFilled(true);
management.addActionListener(this);
p2.add(management);
        
 addReview = new JButton("Add Review");
addReview.setBounds(0, 460, 300, 50);
addReview.setBackground(new Color(100, 149, 201));
addReview.setFont(new Font("Arial", Font.BOLD, 20));
addReview.setForeground(Color.WHITE);
addReview.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
addReview.setFocusPainted(false);
addReview.setContentAreaFilled(true);
addReview.addActionListener(this);
p2.add(addReview);

 about = new JButton("About");
about.setBounds(0, 510, 300, 50);
about.setBackground(new Color(100, 149, 201));
about.setFont(new Font("Arial", Font.BOLD, 20));
about.setForeground(Color.WHITE);
about.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2, true));
about.setFocusPainted(false);
about.setContentAreaFilled(true);
about.addActionListener(this);
p2.add(about);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("images/uni voice theme edited.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1000, 600, Image.SCALE_SMOOTH);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel image1 = new JLabel(i6);
        image1.setBounds(300, 60, 1000, 600);
        add(image1);
    
    setVisible(true);
    
    }
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()== addStudentDetails){
            new AddStudent(username);
        }else if (ae.getSource()== viewStudentDetails){
            new viewStudentDetails(username);
        }
    else if (ae.getSource() == updateStudentDetails){
        new UpdateStudent(username);
        
    } else if (ae.getSource() == engineering){
        new engineeringColleges();
    } else if (ae.getSource() == medical){
        new medicalColleges();
    }else if (ae.getSource() == design){
        new designColleges();
    }else if (ae.getSource() == management){
        new managementColleges();
    }else if (ae.getSource() == top){
        new topColleges();
    }else if (ae.getSource() == about){
        new about();
    }else if (ae.getSource() == addReview){
        new addReview();
    }else if (ae.getSource() == deleteStudentDetails){
         new DeleteDetails(username);
    }
    }
    public static void main(String[] args){
        new Dashboard("");
    }
    
     
}
