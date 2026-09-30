package Univision;

import javax.swing.*;
import java.awt.*;

public class about extends JFrame {

    public about() {
        setTitle("About Us");
        setBounds(350, 100, 850, 550);
        setLayout(new BorderLayout());

        // Pink background for entire window
        getContentPane().setBackground(new Color(255, 192, 203));

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBackground(new Color(255, 192, 203)); // Light pink
        mainPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        // Heading
        JLabel heading = new JLabel("Uni Voice");
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setForeground(Color.BLUE);
        heading.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(heading);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 10)));

        // Description
        JLabel desc = new JLabel("<html><div style='text-align:center;'>"
                + "<b>Uni Voice</b> is an extensive search engine for students, parents, and the education industry.<br>"
                + "It helps users access brief, accurate, and relevant data about colleges and universities<br>"
                + "in India and abroad for better decision making."
                + "</div></html>");
        desc.setFont(new Font("Arial", Font.PLAIN, 16));
        desc.setForeground(Color.BLUE);
        desc.setAlignmentX(Component.CENTER_ALIGNMENT);
        mainPanel.add(desc);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Mission and Vision panel
        JPanel missionVisionPanel = new JPanel(new GridLayout(1, 2, 30, 0));
        missionVisionPanel.setBackground(new Color(255, 192, 203));

        JLabel mission = new JLabel("<html><div style='text-align:center;'><b>OUR MISSION</b><br><br>"
                + "College selection is the second biggest decision in one’s life.<br>"
                + "We aim to make this choice easier with validated content and an intuitive interface."
                + "</div></html>");
        mission.setFont(new Font("Arial", Font.PLAIN, 13));
        mission.setForeground(Color.BLUE);
        mission.setHorizontalAlignment(SwingConstants.CENTER);

        JLabel vision = new JLabel("<html><div style='text-align:center;'><b>OUR VISION</b><br><br>"
                + "To empower students with accurate knowledge so they can make wise decisions<br>"
                + "about their careers and alma mater."
                + "</div></html>");
        vision.setFont(new Font("Arial", Font.PLAIN, 13));
        vision.setForeground(Color.BLUE);
        vision.setHorizontalAlignment(SwingConstants.CENTER);

        missionVisionPanel.add(mission);
        missionVisionPanel.add(vision);
        mainPanel.add(missionVisionPanel);
        mainPanel.add(Box.createRigidArea(new Dimension(0, 20)));

        // Image
        try {
            ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("images/about.jpg"));
            Image img = icon.getImage().getScaledInstance(600, 150, Image.SCALE_SMOOTH); // Wider image
            JLabel imageLabel = new JLabel(new ImageIcon(img));
            imageLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            mainPanel.add(imageLabel);
        } catch (Exception e) {
            JLabel errorLabel = new JLabel("Image not found");
            errorLabel.setForeground(Color.RED);
            errorLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
            mainPanel.add(errorLabel);
        }

        mainPanel.add(Box.createRigidArea(new Dimension(0, 30)));

        // Footer Panel
        JPanel footerPanel = new JPanel();
        footerPanel.setBackground(new Color(255, 192, 203));
        footerPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JLabel footer = new JLabel("<html><div style='text-align:center;'>"
                + "Uni Voice is a one-stop platform for finding dream colleges, courses,<br>"
                + "and admission processes.<br>"
                + "You can filter options based on ranking, fees, exams, and location."
                + "</div></html>");
        footer.setFont(new Font("Arial", Font.PLAIN, 13));
        footer.setForeground(Color.BLUE);

        footerPanel.add(footer);
        mainPanel.add(footerPanel);

        add(mainPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(about::new);
    }
}
