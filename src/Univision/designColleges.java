package Univision;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;



public class designColleges extends JFrame {

    public designColleges() {
        setTitle("Design Colleges");
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
           {
        scaleImage("/images/d1.png", 100, 100),
        "<html><b>National Institute of Fashion Technology - [NIFT], New Delhi</b>NIFT 2024 Cutoff : 160</html>",
        "<html>₹ 3,41,700<br>B.Des<br>1st Year Fees</html>",
        "<html>₹ 7,00,000 Avg<br>₹ 12,00,000 Max</html>",
        "<html>4 / 5 </html>",
        "<html>#9th/30 </html>"
    },
    {
        scaleImage("/images/d2.jpg", 100, 100),
        "<html><b>National Institute of Fashion Technology - [NIFT], Bangalore</b><br>Bangalore, Karnataka</html>",
        "<html>₹ 3,41,700<br>B.Des<br>1st Year Fees</html>",
        "<html>₹ 19,00,000<br>Highest Package</html>",
        "<html>3.8 / 5 </html>",
        "<html>#16th/30 </html>"
    },
    {
        scaleImage("/images/d3.png", 80, 90),
        "<html><b>Pearl Academy West Campus, New Delhi</b><br>New Delhi, Delhi NCR<br>NID 2023 Cutoff : 66</html>",
        "<html>₹ 7,79,200<br>B.Des<br>1st Year Fees</html>",
        "<html>₹ 20,27,000<br>Highest Package</html>",
        "<html>3.8 / 5</html>",
        "<html>#13th/40</html>"
    },
    {
        scaleImage("/images/d4.png", 100, 100),
        "<html><b>Amity School of Fashion Technology - [ASFT], Noida</b><br>Noida, Uttar Pradesh<br>AICTE Approved</html>",
        "<html>₹ 1,68,000<br>B.Des<br>1st Year Fees</html>",
        "<html>₹ 4,50,000 Avg<br>₹ 7,00,000 Max</html>",
        "<html>4.1 / 5 </html>",
        "<html>#3th/40</html>"
    }
};}
    // Data for Average colleges
    private Object[][] getAverageData() {
        return new Object[][] {
           {
         
        scaleImage("/images/d5.png", 100, 100),
        "<html><b>Pearl Academy, Jaipur</b><br>Jaipur, Rajasthan</html>",
        "<html>₹ 7,41,200<br>B.Des<br>1st Year Fees</html>",
        "<html>₹ 20,27,000<br>Highest Package</html>",
        "<html>4 / 5</html>",
        "<html>#23th/40</html>"
    },
    {
        scaleImage("/images/d6.png", 100, 100),
        "<html><b>IMS Design and Innovation Academy - [DIA], Noida</b><br>Noida, Uttar Pradesh</html>",
        "<html>₹ 4,00,000<br>B.Des<br>1st Year Fees</html>",
        "<html>₹ 8,00,000 Avg<br>₹ 30,00,000 High</html>",
        "<html>4.3 / 5</html>",
        "<html>#38th/40 </html>"
    },
    {
        scaleImage("/images/d7.png", 100, 100),
        "<html><b>Amity University, Lucknow</b><br>Lucknow, Uttar Pradesh</html>",
        "<html>₹ 1,68,000<br>B.Des<br>1st Year Fees</html>",
        "<html>₹ 8,00,000 Avg<br>₹ 45,00,000 High</html>",
        "<html>4.1 / 5</html>",
        "<html>#17th/40 </html>"
    },
    {
        scaleImage("/images/d8.png", 100, 100),
        "<html><b>Army Institute of Fashion and Design - [AIFD], Bangalore</b><br>Bangalore, Karnataka</html>",
        "<html>₹ 2,58,931<br>B.Des<br>1st Year Fees</html>",
        "<html>₹ 5,82,000 Avg<br>₹ 8,63,000 High</html>",
        "<html>4.4 / 5</html>",
        "<html>#38th/40 </html>"
    }
};}

    // Data for Low-rated colleges
    private Object[][] getLowData() {
        return new Object[][] {
     {
        scaleImage("/images/d9.png", 100, 100),
        "<html><b>Pearl Academy, Mumbai</b><br>Mumbai, Maharashtra</html>",
        "<html><b>₹ 7,79,200</b><br>B.Des<br>1st Year Fees</html>",
        "<html><b>₹ 20,27,000</b><br>Highest Package</html>",
        "<html>3.5 / 5</html>",
        "<html>#11th/40 </html>"
    },
    {
        scaleImage("/images/d10.jpg", 100, 100),
        "<html><b>IIT Bombay - Indian Institute of Technology - [IITB]</b><br>Mumbai, Maharashtra<br>AICTE, UGC Approved<br><b>B.Des</b></html>",
        "<html><b>₹ 2,30,700</b><br>B.Des<br>1st Year Fees</html>",
        "<html><b>₹ 23,50,000</b> Avg<br><b>₹ 1,00,00,000</b> High</html>",
        "<html>4.4 / 5</html>",
        "<html>#4th/30 </html>"
    },
    {
        scaleImage("/images/d11.png", 100, 100),
        "<html><b>IIT Hyderabad - Indian Institute of Technology - [IITH]</b><br>Hyderabad, Telangana<br>UGC Approved<br><b>B.Des</b></html>",
        "<html><b>₹ 2,41,888</b><br>B.Des<br>1st Year Fees</html>",
        "<html><b>₹ 20,07,000</b> Avg<br><b>₹ 63,78,000</b> High</html>",
        "<html>4.3 / 5</html>",
        "<html>#7th/30</html>"
    },
    {
        scaleImage("/images/d12.png", 100, 100),
        "<html><b>Delhi Technological University - [DTU]</b><br>New Delhi, Delhi NCR<br>UGC, NBA Approved</html>",
        "<html><b>₹ 2,36,700</b><br>B.Des<br>1st Year Fees</html>",
        "<html><b>₹ 23,70,000</b> Avg<br><b>₹ 82,05,000</b> High</html>",
        "<html>4.2 / 5</html>",
        "<html>#11th/30 </html>"
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
        new designColleges();
    }
}

