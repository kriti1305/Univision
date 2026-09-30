package Univision;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class engineeringColleges extends JFrame {

    public engineeringColleges() {
        setTitle("Engineering Colleges");
        setBounds(350, 100, 850, 550);
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(null);
        

        JTabbedPane tab = new JTabbedPane();
        tab.setBounds(0, 0, 850, 550);

        // Add different tables to each tab
        tab.addTab("Top Rated", null, createCollegePanel(getTopRatedData()));
        tab.addTab("Average Rated", null, createCollegePanel(getAverageData()));
        tab.addTab("Low Rated", null, createCollegePanel(getLowData()));

        add(tab);
        setVisible(true);
    }

    private JPanel createCollegePanel(Object[][] data) {
        JPanel panel = new JPanel(null);
        panel.setBackground(Color.WHITE);

        String[] columnNames = {
            " ", "College", "Course Fees", "Placement", "User Reviews", "India Rank"
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int column) {
                return column == 0 ? Icon.class : String.class;
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(model);
        table.setRowHeight(115);
        table.setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.setBackground(Color.WHITE);
        table.setShowGrid(true);
        table.setGridColor(Color.LIGHT_GRAY);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        JTableHeader header = table.getTableHeader();
        header.setFont(new Font("SansSerif", Font.BOLD, 16));
        header.setBackground(new Color(200, 230, 255));

        TableColumnModel columnModel = table.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(100);
        columnModel.getColumn(1).setPreferredWidth(200);
        columnModel.getColumn(2).setPreferredWidth(120);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(150);
        columnModel.getColumn(5).setPreferredWidth(130);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(0, 0, 850, 550);
        scrollPane.getViewport().setBackground(Color.WHITE);

        panel.add(scrollPane);
        return panel;
    }

    // Data for Top Rated colleges
    private Object[][] getTopRatedData() {
        return new Object[][] {
            { scaleImage("/images/b.e.jpg", 90, 100),
              "<html><b>IIT Bombay</b><br>Mumbai<br>B.Tech CSE<br>Cutoff: 68</html>",
              "₹2,30,700", "<html>₹23.5L Avg<br>₹1Cr High</html>", "4.4 / 5", "#1 / 762" },
                { scaleImage("/images/2.jpg", 160, 160),
              "<html><b>SRM IST</b><br>Chennai<br>B.Tech<br>Cutoff: NA</html>",
              "₹2,75,000", "<html>₹6.6L Avg<br>₹55L High</html>", "4 / 5", "#83 / 762" },
            { scaleImage("/images/3.jpg", 160, 160),
              "<html><b>IIT Madras</b><br>Chennai<br>B.Tech AI<br>Cutoff: 419</html>",
              "₹2,53,417", "<html>₹21.4L Avg<br>₹1.98Cr High</html>", "4.3 / 5", "#3 / 762" },
              { scaleImage("/images/4.png", 90, 100),
           "<html><b>IIT BHU</b><br>Varanasi, UP<br>B.Tech + M.Tech Math & Computing<br>Cutoff: 2154</html>",
                "₹2,28,315", "<html>₹31L Avg<br>₹1.68Cr High</html>", "4.3 / 5 ", "#9 / 762"},
              
           
        };
    }

    // Data for Average colleges
    private Object[][] getAverageData() {
        return new Object[][] {
            { scaleImage("/images/5.png", 90, 100),
              "<html><b>IIT Kharagpur</b><br>Kharagpur, West Bengal<br>JEE-Advanced 2024 Cutoff: 898</html>", 
                  "₹ 2,23,600", "₹ 2,14,00,000", "4.4 / 5 ", "#5/762"},
            { scaleImage("/images/6.jpg", 120, 120),
               "<html><b>NM Institute of Engineering and Technology</b><br>Bhubaneswar, Odisha<br>OJEE 2023 Cutoff: 1208234</html>", 
                "₹ 72,000", "₹ 10,00,000", "3.5 / 5 ", "#258/762"},

             { scaleImage("/images/7.jpg", 90, 100),
              "<html><b>IIT Guwahati</b><br>Guwahati, Assam<br>JEE-Advanced 2024 Cutoff: 1021</html>", 
                     "₹ 2,43,700", "₹ 2,40,00,000", "4.3 / 5 ", "#7/762"},
              { scaleImage("/images/8.png", 90, 100),
               "<html><b>NIT Trichy</b><br>Tiruchirappalli, Tamil Nadu<br>JEE-Main 2024 Cutoff: 1224</html>", 
                     "₹ 1,80,000", "₹ 40,00,000", "4.2 / 5 ", "#11/762"}
        };
              
    }            


    // Data for Low-rated colleges
    private Object[][] getLowData() {
        return new Object[][] {
            { scaleImage("/images/9.jpg", 90, 100),
                 "<html><b>ISM Dhanbad - Indian Institute of Technology</b><br>Dhanbad,Jharkhand JEE-Advanced Cutoff : 4956</html>",
                    "₹ 2,45,250",
                    "<html>₹ 17,01,000 (Avg)<br>₹ 83,00,000 (Highest)</html>",
                    "4.3 / 5 ",
                    "#13/762"
                },

            { scaleImage("/images/10.jpg", 90, 100),
              
                    "<html><b>International Institute of Information Technology</b><br>Hyderabad, Telangana JEE-Main 2024 Cutoff : 5392",
                   "₹ 4,50,000",
                    "<html>₹ 26,34,000 (Avg)<br>₹ 1,05,00,000 (Highest)</html>",
                    "4.2 / 5 ",
                    "#15/762"
                },

             { scaleImage("/images/11.jpg", 90, 100),
                                 "<html><b>IIT Patna - Indian Institute of Technology</b><br>Patna, Bihar"
                    
                    + "JEE-Advanced 2024 Cutoff : 5683</html>",
                    "₹ 2,73,250",
                    "<html>₹ 23,90,000 (Avg)<br>₹ 82,05,000 (Highest)</html>",
                    "4.2 / 5 ",
                    "#17/762"
                },
              { scaleImage("/images/12.jpg", 90, 100),
             
                
                   "<html><b>Indian Institute of Information Technology</b><br>Allahabad, Uttar Pradesh "
                    
                    + "JEE-Main 2024 Cutoff : 5392</html>",
                    "₹ 1,04,000",
                    "<html>₹ 25,78,000 (Avg)<br>₹ 1,21,00,000 (Highest)</html>",
                    "4.3 / 5 ",
                    "#19/762"
                }
        };
    }

                


    // Image scaling utility
    private ImageIcon scaleImage(String path, int width, int height) {
        java.net.URL imgUrl = getClass().getResource(path);
        if (imgUrl == null) {
            System.err.println("Image not found: " + path);
            return new ImageIcon(); // Empty icon placeholder
        }
        ImageIcon icon = new ImageIcon(imgUrl);
        Image img = icon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        return new ImageIcon(img);
    }

    public static void main(String[] args) {
        new engineeringColleges();
    }
}
