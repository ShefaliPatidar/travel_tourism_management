package holiday.strike;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ForgotPassword extends JFrame implements ActionListener{	
	JTextField t1, t2, t3, t4, t5;
	JButton b1, b2,b3;
	
	ForgotPassword(){
		setBounds(300,200,800,400);
	//	getContentPane().setBackground(Color.WHITE);
	setLayout(null);
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/BC.jpg"));
		Image i2 = i1.getImage().getScaledInstance(800, 400, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l = new JLabel(i3);
		l.setBounds(0,0,800,400);
		l.setLayout(null);
		add(l);
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/l.jpg"));
		Image i5 = i4.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
		JLabel l6 = new JLabel(i6);
		l6.setBounds(560, 66, 200, 200);
		l6.setLayout(null);
		l.add(l6);
		
	
		
		JLabel l1 = new JLabel("Username : ");
		l1.setBounds(30, 20, 130,30);
		l1.setFont(new Font("Serif",Font.BOLD,19));
		l1.setBackground(Color.white);
		l1.setForeground(Color.white);
		l.add(l1);
		t1 = new JTextField();
		t1.setBounds(240, 20, 140, 30);
		t1.setBorder(BorderFactory.createEmptyBorder());
		l.add(t1);
		
		b1 = new JButton("Search");
		b1.setFont(new Font("Serif",Font.BOLD,17));
		b1.setBounds(395,20,100,30);
		b1.setBackground(new Color(255,128,128));
		b1.setForeground(Color.white);
		b1.setBorder(new LineBorder(Color.white));
		b1.addActionListener(this);
		l.add(b1);
		
		JLabel l2 = new JLabel("Email : ");
		l2.setBounds(30, 70, 130,30);
		l2.setFont(new Font("Serif",Font.BOLD,19));
		l2.setForeground(Color.white);
		l.add(l2);
		t2 = new JTextField();
		t2.setBounds(240, 70, 140, 30);
		t2.setBorder(BorderFactory.createEmptyBorder());
		l.add(t2);
		
		JLabel l3 = new JLabel("Your security question?");
		l3.setBounds(30, 120, 190,30);
		l3.setFont(new Font("Serif",Font.BOLD,18));
		l3.setForeground(Color.white);
		l.add(l3);
		t3 = new JTextField();
		t3.setBounds(240, 120, 230, 30);
		t3.setBorder(BorderFactory.createEmptyBorder());
		l.add(t3);
		
		JLabel l4 = new JLabel("Answer :");
		l4.setBounds(30, 170, 190,30);
		l4.setForeground(Color.white);
		l4.setFont(new Font("Serif",Font.BOLD,19));
		l.add(l4);
		t4 = new JTextField();
		t4.setBounds(240,170, 140, 30);
		t4.setBorder(BorderFactory.createEmptyBorder());
		l.add(t4);
		
		b2 = new JButton("Retrieve");
		b2.setFont(new Font("Serif",Font.BOLD,17));
		b2.setBounds(395,170,100,30);
		b2.setBackground(new Color(255,128,128));
		b2.setForeground(Color.white);
		
		b2.setBorder(new LineBorder(Color.white));
		b2.addActionListener(this);
		l.add(b2);
		
		JLabel l5 = new JLabel("Password :");
		l5.setBounds(30, 220, 190,30);
		l5.setFont(new Font("Serif",Font.BOLD,19));
		l5.setForeground(Color.white);
		l.add(l5);
		t5 = new JTextField();
		t5.setBounds(240, 220, 140, 30);
		t5.setBorder(BorderFactory.createEmptyBorder());
		l.add(t5);
		
		b3 = new JButton("Back");
		b3.setFont(new Font("Serif",Font.BOLD,17));
		b3.setBounds(160,280,100,30);
		b3.setBackground(new Color(255,128,128));
		b3.setForeground(Color.white);
		b3.setBorder(new LineBorder(Color.white));
		b3.addActionListener(this);
		l.add(b3);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		Conn conn = new Conn();
		if (ae.getSource() == b1) {
			try{
				String sql = "select * from account where username  = '"+t1.getText()+"'";
				ResultSet rs = conn.stmt.executeQuery(sql);
				while (rs.next()) {
					t2.setText(rs.getString("email"));
					t3.setText(rs.getString("security"));
				}
			}catch(Exception e) {}
			
		}else if(ae.getSource() == b2) {
			try{
				String sql = "select * from account where answer = '"+t4.getText()+"' AND username = '" + t1.getText()+"'";
				ResultSet rs = conn.stmt.executeQuery(sql);
				while (rs.next()) {
					t5.setText(rs.getString("pass"));
				}
			}catch(Exception e) {}
			
		}else if(ae.getSource() == b3) {
			new Login1().setVisible(true);
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) {
		new ForgotPassword().setVisible(true);
	}
	
}