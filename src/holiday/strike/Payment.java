package holiday.strike;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;


public class Payment extends JFrame implements ActionListener{
    JButton b1,b2;
    
    Payment(){
        setBounds(300,200,800,400);
	getContentPane().setBackground(Color.white);
	setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/BC.jpg"));
	Image i2 = i1.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
	ImageIcon i3= new ImageIcon(i2);
	JLabel l = new JLabel(i3);
	l.setBounds(0,0,800,400);
	l.setLayout(null);
	add(l);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/paytm.jpeg"));
	Image i5 = i4.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
	ImageIcon i6= new ImageIcon(i5);
	JLabel l1 = new JLabel();
	l1.setIcon(i6);
	l1.setLayout(null);
	l1.setBounds(0,0,800,400);
	l.add(l1);
        
        b1=new JButton("Pay");
        b1.setBounds(570,0,80,40);
        b1.addActionListener(this);
	b1.setFont(new Font("Serif",Font.BOLD,17));
	b1.setBackground(new Color(255,128,128));
	b1.setForeground(Color.white);
	b1.setBorder(new LineBorder(Color.white));
        l1.add(b1);
        
        b2=new JButton("Back");
        b2.setBounds(670,0,80,40);
        b2.addActionListener(this);
	b2.setFont(new Font("Serif",Font.BOLD,17));
	b2.setBackground(new Color(255,128,128));
	b2.setForeground(Color.white);
	b2.setBorder(new LineBorder(Color.white));
        l1.add(b2);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()== b1){
            this.setVisible(false);
            new Paytm().setVisible(true);
        }else if(ae.getSource()== b1){
            this.setVisible(false);
        }
        
        
    }
    
    public static void main(String[] args) {
        new Payment().setVisible(true);
    }
    
}