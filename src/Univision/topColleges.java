package Univision;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class topColleges extends JFrame {
    private JLabel imageLabel;
    private ImageIcon[] images;
    private int index = 0;
    private Timer timer;

    public topColleges() {
        setTitle("Top Rated Colleges ");

        setBounds(350, 100, 850, 550);
        getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(null);
       
        // Image Label
        imageLabel = new JLabel();
        imageLabel.setBounds(0, 0, 850, 550);  // Position and size
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(imageLabel);

        // Load and scale 8 images
        images = new ImageIcon[] {
            loadImage("/images/eng1.png"),
            loadImage("/images/eng2.jpg"),
            loadImage("/images/med1.png"),
            loadImage("/images/med2.jpg"),
            loadImage("/images/design1.jpg"),
            loadImage("/images/design2.png"),
            loadImage("/images/mag1.jpg"),
            loadImage("/images/mag2.png")
        };

        // Show first image
        if (images[0] != null) {
            imageLabel.setIcon(images[0]);
        }

        // Timer to switch images every 2 seconds
        timer = new Timer(1500, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                index = (index + 1) % images.length;
                imageLabel.setIcon(images[index]);
            }
        });
        timer.start();
        setVisible(true);
    }

    // Load and scale image
    private ImageIcon loadImage(String path) {
        java.net.URL imgURL = getClass().getResource(path);
        if (imgURL != null) {
            ImageIcon icon = new ImageIcon(imgURL);
            Image img = icon.getImage().getScaledInstance(850, 550, Image.SCALE_SMOOTH);
            return new ImageIcon(img);
        } else {
            System.err.println("Image not found: " + path);
            return null;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            topColleges slideshow = new topColleges();
            slideshow.setVisible(true);
        });
    }
}
