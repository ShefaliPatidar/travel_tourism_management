package holiday.strike;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Login1 extends JFrame implements ActionListener{ 
	
	JButton b1,b2,b3;
	JTextField f;
	JPasswordField f1;
	Login1(){
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
		
		JLabel l2 = new JLabel("Username:");
		l2.setBounds(80, 80, 130,30);
		l2.setForeground(Color.white);
		l2.setFont(new Font("Serif",Font.BOLD,20));
		l.add(l2);
		f = new JTextField();
		f.setBounds(200, 80, 170, 30);
		l.add(f);
		
		JLabel l3 = new JLabel("Password:");
		l3.setBounds(80, 150, 130,30);
		l3.setForeground(Color.white);
		l3.setFont(new Font("Serif",Font.BOLD,20));
		l.add(l3);
		f1 = new JPasswordField();
		f1.setBounds(200, 150, 170, 30);
		l.add(f1);
		
		b1 = new JButton("Login");
		b1.setFont(new Font("Serif",Font.BOLD,17));
		b1.setBounds(90,230,100,30);
		b1.setBackground(new Color(255,128,128));
		b1.setForeground(Color.white);
		b1.setBorder(new LineBorder(Color.white));
		b1.addActionListener(this);
		l.add(b1);
		
		b2 = new JButton("Sign Up");
		b2.setBounds(260,230,100,30);
		b2.setFont(new Font("Serif",Font.BOLD,17));
		b2.setBackground(Color.white);
		b2.setForeground(new Color(255,128,128));
		b2.setBorder(new LineBorder(new Color(255,128,128)));
		b2.addActionListener(this);
		l.add(b2);
		
		b3 = new JButton("Forget Password");
		b3.setBounds(150,280,150,25);
		b3.setBackground(Color.white);
		b3.setForeground(new Color(255,128,128));
		b3.addActionListener(this);
		l.add(b3);
		
		JLabel l4 = new JLabel();
		l4.setBounds(150,310,160,25);
		l4.setFont(new Font("Serif",Font.BOLD,14));
		l4.setText("Trouble logging in..?");
		l4.setForeground(Color.white);
		l.add(l4);
		

		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/login.png"));
		Image i5 = i4.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
		JLabel l1 = new JLabel();
		l1.setIcon(i6);
		l1.setLayout(null);
		l1.setBounds(520,0,400,400);
		l.add(l1);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1) {
			Conn c = new Conn();
			try {
				String username= f.getText();
				String pass= f1.getText();
				String query="select * from account where username= '"+username+"'AND pass= '"+pass+"'";
				ResultSet rs= c.stmt.executeQuery(query);
				if(rs.next())
				{
				this.setVisible(false);
				new Loading(username).setVisible(true);
				}
				else{
				JOptionPane.showMessageDialog(null, "Invalid Login");
				}
			}catch(Exception e1) {
					System.out.print("Error");
				}
			}
			else if(e.getSource()==b2) {
			this.setVisible(false);
			new SignUp().setVisible(true);
		}
		else if(e.getSource()==b3) {
			this.setVisible(false);
			new ForgotPassword().setVisible(true);
		}
	}
		
	
	public static void main(String[] args) {
		
new Login1();
	}

}
