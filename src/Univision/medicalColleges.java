package Univision;


import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class medicalColleges extends JFrame {

   
    public medicalColleges() {
        
        setTitle("Medical Colleges");
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
            { scaleImage("/images/1.m.png", 90, 100),
              "<html><b>Banaras Hindu University - [BHU], Varanasi</b><br>Varanasi, Uttar Pradesh<br>MBBS<br>NEET 2024 Cutoff : 1098</html>",
                            "₹ 13,410", "<html>₹ 2,13,000<br>₹ 1,20,00,000</html>", "3.9 / 5 ", "#7th/50 in India"},
               
            { scaleImage("/images/2m.png", 100, 100),
    "<html><b>Dr DY Patil Vidyapeeth - [DPU], Pune</b><br>Pune, Maharashtra<br>MBBS</html>",
                            "₹ 27,00,000", "<html>₹ 7,00,000<br>₹ 21,00,000</html>", "3.8 / 5 ", "#11th/50 in India"},
            
    
    { scaleImage("/images/3m.png", 160, 160),
              "<html><b>SRM Institute of Science and Technology - [SRMIST], Chennai</b><br>Chennai, Tamil Nadu MBBS</html>",
                            "₹ 25,00,000", "<html>₹ 6,60,000<br>₹ 55,00,000</html>", "4.0 / 5 ", "#18th/50 in India"},

         { scaleImage("/images/4m.jpg", 100, 100),
              "<html><b>Kalinga Institute of Industrial Technology - [KIIT], Bhubaneswar</b><br>Bhubaneswar, Odisha<br>MBBS<br>NEET 2023 Cutoff : 273827</html>",
                            "₹ 74,91,000", "<html>₹ 8,50,000<br>₹ 53,00,000</html>", "4.2 / 5 (2193)", "#25th/50 in India"}
                    
                   
        };
    }

    // Data for Average colleges
    private Object[][] getAverageData() {
        return new Object[][] {
          {
        scaleImage("/images/5m.jpg", 90, 100),
        "<html><b>Bharati Vidyapeeth Deemed University Pune, Pune</b><br>Pune, Maharashtra<br>MBBS</html>",
        "₹ 23,60,000",
        "<html>₹ 19,00,000<br>Highest Package</html>",
        "3.8 / 5 ",
        "#32th/44 in India"
    },
    {
        scaleImage("/images/6m.png", 100, 100),
        "<html><b>Institute of Medical Sciences - [IMS BHU], Varanasi</b><br>Varanasi, Uttar Pradesh<br>MBBS</html>",
        "₹ 13,410",
        "<html>₹ 8,00,000<br>₹ 45,00,000</html>",
        "4.3 / 5 ",
        "#6th/55 in India"
    },
    {
        scaleImage("/images/7m.png", 100, 100),
        "<html><b>Lady Hardinge Medical College - [LHMC], New Delhi</b><br>New Delhi, Delhi NCR<br>MBBS<br>NEET 2024 Cutoff: 826</html>",
        "₹ 1,655",
        "<html>₹ 8,00,000<br>₹ 45,00,000</html>",
        "4.1 / 5 ",
        "#9th/55 in India"
    },
    {
        scaleImage("/images/8m.png", 160, 160),
        "<html><b>SMS Medical College - [SMSMC], Jaipur</b><br>Jaipur, Rajasthan<br>MBBS<br>NEET 2024 Cutoff: 1031</html>",
        "₹ 1,19,300",
        "<html>₹ 20,27,000<br>Highest Package</html>",
        "4.1 / 5 ",
        "#43th/50 in India"
    }
}; 
    }            


    // Data for Low-rated colleges
    private Object[][] getLowData() {
        return new Object[][] {
            {  scaleImage("/images/9m.jpg", 100, 100),
        "<html><b>Amity University, Noida</b><br>Noida, Uttar Pradesh<br>NCTE, AICTE, COA, BCI, UGC Approved</html>",
        "₹ 1,60,000<br>B.Sc (Nursing)",
        "₹ 62,00,000<br>Highest Package",
        "4 / 5 ",
        "#601th/601 in India"
    },
    {
        scaleImage("/images/10m.jpg", 100, 100),
        "<html><b>Galgotias University - [GU], Greater Noida</b><br>Greater Noida, Uttar Pradesh<br>NCTE, AICTE, INC Approved</html>",
        "₹ 1,75,000<br>B.Sc (Nursing)",
        "<html>₹ 5,40,000 Avg<br>₹ 1,50,00,000 Max</html>",
        "3.8 / 5 ",
        "#31th/55 in India"
    },
    {
        scaleImage("/images/11m.jpg", 100, 100),
        "<html><b>Centurion University of Technology and Management,Bhubaneswar</b><br>Bhubaneswar, Odisha<br></html>",
        "₹ 1,25,000<br>B.Sc (Nursing)",
        "₹ 13,60,000<br>Highest Package",
        "3.8 / 5 ",
        "#29th/55 in India"
    },
    {
        scaleImage("/images/12m.png", 100, 100),
        "<html><b>Jain University, Bangalore</b><br>Bangalore, Karnataka<br>AICTE, CRISIL, UGC, NBA, AIU Approved</html>",
        "₹ 2,50,000<br>B.Sc (Nursing)",
        "<html>₹ 6,20,000 Avg<br>₹ 42,00,000 Max</html>",
        "3.9 / 5 ",
        "#95th/113 in India"
    }
};}
                


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
        new medicalColleges();
    }
}

