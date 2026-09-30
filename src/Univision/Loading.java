
package Univision;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;

public class Loading extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
    
    public void run(){
        try{
            for(int i =1;i<=101;i++){
                int max = bar.getMaximum();//100
                int value = bar.getValue();
                
                if(value<max){
                    bar.setValue(bar.getValue() +1);
                
            }else{
                    setVisible(false);
                    new Dashboard(username);
        }
                Thread.sleep(30);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    
    Loading(String name){
        this.username = name;
        t = new Thread(this);
     setBounds(300,150,650,450);
     setVisible(true);
     getContentPane().setBackground(new Color(173, 216, 230));
        setLayout(null);
        
        
        
        JLabel text = new JLabel("UNIVOICE");
        text.setBounds(200,-150,500,400);
        text.setFont(new Font("Arial", Font.BOLD, 50));
        text.setForeground(Color.WHITE);
        add(text);
        
      bar = new JProgressBar();
        bar.setBounds(170,150,300,35);
        bar.setStringPainted(true);
        add(bar);
        
        JLabel load = new JLabel("Loading please wait ...");
       load.setBounds(170,190,200,20);
        load.setFont(new Font("Arial", Font.BOLD, 16));
        load.setForeground(Color.WHITE);
        add(load);
        
        JLabel lblusername = new JLabel("Welcome " + name);
       lblusername.setBounds(10,370,200,20);
        lblusername.setFont(new Font("Arial", Font.BOLD, 16));
        lblusername.setForeground(Color.blue);
        add(lblusername);
        t.start();
    }
    
    
    
    
    
    public static void main(String[] args){
        new Loading("");
        }
}
