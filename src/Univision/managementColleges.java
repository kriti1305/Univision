package Univision;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;



public class managementColleges extends JFrame {

    public managementColleges() {
        setTitle("Management Colleges");
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
        scaleImage("/images/mg1.png", 100, 100),
        "<html><b>IIMA - Indian Institute of Management, Ahmedabad</b><br>Ahmedabad, Gujarat | UGC Approved<br>PGPM<br>CAT 2024 Cutoff: 99</html>",
        "<html><b>₹ 26,50,000</b><br>MBA/PGDM<br>Total Fees</html>",
        "<html><b>₹ 34,36,000</b> Avg<br><b>₹ 1,15,00,000</b> High</html>",
        "<html>4.5 / 5</html>",
        "<html>#31st/100 </html>"
    },
    {
        scaleImage("/images/mg2.png", 100, 100),
        "<html><b>IIMC - Indian Institute of Management, Kolkata</b><br>Kolkata, West Bengal | UGC Approved<br>MBA<br>CAT 2024 Cutoff: 99</html>",
        "<html><b>₹ 27,00,000</b><br>MBA/PGDM<br>Total Fees</html>",
        "<html><b>₹ 35,07,000</b> Avg<br><b>₹ 1,20,00,000</b> High</html>",
        "<html>4.4 / 5</html>",
        "<html>#61st/100 </html>"
    },
    {
        scaleImage("/images/mg3.png", 100, 100),
        "<html><b>FMS Delhi - Faculty of Management Studies</b><br>New Delhi, Delhi NCR | AICTE Approved<br>MBA<br>CAT 2024 Cutoff: 98</html>",
        "<html><b>₹ 1,16,000</b><br>MBA/PGDM<br>1st Year Fees</html>",
        "<html><b>₹ 34,10,000</b> Avg</html>",
        "<html>3.9 / 5</html>",
        "<html>#12th/25 </html>"
    },
    {
        scaleImage("/images/mg4.png", 100, 100),
        "<html><b>IIML - Indian Institute of Management, Lucknow</b><br>Lucknow, Uttar Pradesh | UGC, AACSB, AMBA Approved<br>PGP-ABM<br>CAT 2024 Cutoff: 85</html>",
        "<html><b>₹ 10,95,000</b><br>MBA/PGDM<br>1st Year Fees</html>",
        "<html><b>₹ 32,30,000</b> Avg<br><b>₹ 75,00,000</b> High</html>",
        "<html>4.2 / 5</html>",
        "<html>#71st/100</html>"
    }
};}
    // Data for Average colleges
    private Object[][] getAverageData() {
        return new Object[][] {
   {
            scaleImage("/images/mg5.png", 100, 100),
            "<html><b>IIMK - Indian Institute of Management, Kozhikode</b><br>Kozhikode, Kerala | AACSB, AMBA Approved<br>PG Programme in Finance, Control & Accounting<br>CAT 2024 Cutoff: 97</html>",
            "<html><b>₹ 20,50,000</b><br>MBA/PGDM<br>Total Fees</html>",
            "<html><b>₹ 28,05,000</b> Avg<br><b>₹ 72,02,000</b> Highest</html>",
            "<html>4.2 / 5</html>",
            "<html>#86th/100</html>"
        },
        {
            scaleImage("/images/mg6.png", 100, 100),
            "<html><b>IIFT Delhi - Indian Institute of Foreign Trade</b><br>New Delhi, Delhi NCR </html>",
            "<html><b>₹ 21,92,000</b><br>MBA/PGDM<br>Total Fees</html>",
            "<html><b>₹ 27,30,000</b> Average Package</html>",
            "<html>4.3 / 5</html>",
            "<html>#11th/100</html>"
        },
        {
            scaleImage("/images/mg7.png", 100, 100),
            "<html><b>IIM Shillong - Indian Institute of Management</b><br>Shillong, Meghalaya | UGC Approved<br>PGPM<br>CAT 2024 Cutoff: 92</html>",
            "<html><b>₹ 26,18,000</b><br>MBA/PGDM<br>Total Fees</html>",
            "<html><b>₹ 26,96,000</b> Average Package</html>",
            "<html>4.1 / 5</html>",
            "<html>#6th/25</html>"
        },
        {
            scaleImage("/images/mg8.jpg", 100, 100),
            "<html><b>TISS - Tata Institute of Social Sciences, Mumbai</b><br>Mumbai, Maharashtra | UGC Approved</html>",
            "<html><b>₹ 1,00,000</b><br>MBA/PGDM<br>Total Fees</html>",
            "<html><b>₹ 27,22,000</b> Avg<br><b>₹ 49,00,000</b> High</html>",
            "<html>4 / 5</html>",
            "<html>#12th/370</html>"
        }
    };}

    // Data for Low-rated colleges
    private Object[][] getLowData() {
        return new Object[][] {
{
            scaleImage("/images/mg9.png", 100, 100),
            "<html><b>Shailesh J. Mehta School of Management, IIT Bombay - [SJMSOM]</b><br>Mumbai, Maharashtra | AICTE Approved<br>MBA Accounting<br>CAT 2024 Cutoff: 90</html>",
            "<html><b>₹ 7,17,650</b><br>MBA/PGDM<br>1st Year Fees</html>",
            "<html><b>₹ 28,01,000</b> Avg<br><b>₹ 72,00,000</b> High</html>",
            "<html>4.4 / 5</html>",
            "<html>#10th/100 </html>"
        },
        {
            scaleImage("/images/mg10.png", 100, 100),
            "<html><b>Symbiosis Institute of Business Management - [SIBM], Pune</b><br>Pune, Maharashtra </html>",
            "<html><b>₹ 12,65,000</b><br>MBA/PGDM<br>1st Year Fees</html>",
            "<html><b>₹ 28,16,000</b> Avg<br><b>₹ 49,00,000</b> High</html>",
            "<html>4.3 / 5</html>",
            "<html>#8th/200 </html>"
        },
        {
            scaleImage("/images/mg11.png", 100, 100),
            "<html><b>School of Business Management, NMIMS University - [SBM NMIMS]</b><br>Mumbai, Maharashtra | AICTE, AACSB Approved</html>",
            "<html><b>₹ 12,50,000</b><br>MBA/PGDM<br>1st Year Fees</html>",
            "<html><b>₹ 25,13,000</b> Avg<br><b>₹ 67,70,000</b> High</html>",
            "<html>4.1 / 5</html>",
            "<html>#7th/110 </html>"
        },
        {
            scaleImage("/images/mg12.jpg", 100, 100),
            "<html><b>Symbiosis Centre for Management and Human Resource Development - [SCMHRD], Pune</b><br>Pune, Maharashtra | UGC, AACSB Approved<br>MBA<br>SNAP 2024 Cutoff: 94</html>",
            "<html><b>₹ 12,50,000</b><br>MBA/PGDM<br>1st Year Fees</html>",
            "<html><b>₹ 24,28,000</b> Avg<br><b>₹ 38,00,000</b> High</html>",
            "<html>4 / 5</html>",
            "<html>#15th/200 </html>"
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
        new managementColleges();
    }
}

