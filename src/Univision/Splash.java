
 package Univision;

import java.awt.*;
import javax.swing.*;

public class Splash extends JFrame implements Runnable {
    Thread thread;

    Splash() {
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("images/opening.png"));
        Image i2 = i1.getImage().getScaledInstance(1000, 600, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);

        add(image);

        setUndecorated(true);  // Optional: removes window borders
        setVisible(true);

        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000); 
            setVisible(false);
            new Login(); // uncomment when Login class is ready
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Splash frame = new Splash();
        int x = 1;

        for (int i = 1; i <= 500; x += 7, i += 6) {
            frame.setLocation(650 - (x + i) / 2, 350 - i / 2);
            frame.setSize(x + i, i);

            try {
                Thread.sleep(4); // animation speed
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
    }
}
