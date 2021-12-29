package holiday.strike;

import java.awt.Color;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;


public class Loading extends JFrame implements Runnable{
    JProgressBar p;
    Thread t;
    String username;
    public void run(){
        try{
        for(int i=1;i<101;i++)
        {
            int m=p.getMaximum();
            int n=p.getValue();
            if(n<m){
                p.setValue(p.getValue()+1);
            }else{
            	this.setVisible(false);
                new Dashboard(username).setVisible(true);
            	i=101;
                
                //Home
            }
        Thread.sleep(50);
        }
        }catch(Exception e){
        }
    }
    Loading(String user){
        username=user;
        setBounds(300,200,800,400);
      //  getContentPane().setBackground(Color.white);
	setLayout(null);
        t=new Thread(this);
				
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/BC.jpg"));
	Image i2 = i1.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
	ImageIcon i3= new ImageIcon(i2);
	JLabel l = new JLabel(i3);
	l.setBounds(0,0,800,400);
	l.setLayout(null);
	add(l);
       
        JLabel l1=new JLabel("Travel And Tourism Application ");
	l1.setBounds(170,40, 600,40);
	l1.setForeground(Color.white);
	l1.setFont(new Font("Railway",Font.BOLD,30));
	l.add(l1);
        
        p=new JProgressBar();
        p.setStringPainted(true);
        p.setBounds(230,100,340,25);
       
        l.add(p);
        
        JLabel l2=new JLabel("Please Wait...");
        l2.setBounds(360,140, 300,20);
	l2.setForeground(Color.yellow);
	l2.setFont(new Font("Serif",Font.BOLD,16));
	l.add(l2);
        
        JLabel l3=new JLabel("Welcome "+username);
        l3.setBounds(40,320, 300,20);
	l3.setForeground(Color.yellow);
	l3.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l3);
        
        t.start();
    }
    public static void main(String[] args) {
        new Loading("").setVisible(true);
        
    }
}