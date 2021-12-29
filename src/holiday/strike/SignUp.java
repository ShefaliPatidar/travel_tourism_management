package holiday.strike;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class SignUp extends JFrame implements ActionListener {

		JButton b1,b2;
		JTextField f,f1,f3;
		JPasswordField f2;
		JComboBox j;
		SignUp(){
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
				l2.setBounds(50, 50, 170,25);
				l2.setForeground(Color.white);
				l2.setFont(new Font("Serif",Font.BOLD,20));
				l.add(l2);
				 f = new JTextField();
				f.setBounds(220, 50, 170, 25);
				l.add(f);
				
				JLabel l3 = new JLabel("Email Id:");
				l3.setBounds(50, 100, 170,25);
				l3.setForeground(Color.white);
				l3.setFont(new Font("Serif",Font.BOLD,20));
				l.add(l3);
				f1 = new JTextField();
				f1.setBounds(220, 100, 170, 25);
				l.add(f1);
				
				JLabel l4 = new JLabel("Password:");
				l4.setBounds(50, 150, 170,25);
				l4.setForeground(Color.white);
				l4.setFont(new Font("Serif",Font.BOLD,20));
				l.add(l4);
				f2 = new JPasswordField();
				f2.setBounds(220, 150, 170, 25);
				l.add(f2);
				
				JLabel l5 = new JLabel("Security question:");
				l5.setBounds(50, 200, 170,25);
				l5.setForeground(Color.white);
				l5.setFont(new Font("Serif",Font.BOLD,20));
				l.add(l5);
				String arr[]= {"What is your pet name?","What is your favourite food?","In what city were you born in?","What is your astrological sign?","What is your nickname?"};
				j = new JComboBox(arr);
				j.setBounds(220, 200, 170, 25);
				l.add(j);
				
				JLabel l6 = new JLabel("Answer:");
				l6.setBounds(50, 250, 170,25);
				l6.setForeground(Color.white);
				l6.setFont(new Font("Serif",Font.BOLD,20));
				l.add(l6);
				 f3 = new JTextField();
				f3.setBounds(220, 250, 170, 25);
				l.add(f3);
				
				b1 = new JButton("Create");
				b1.setFont(new Font("Serif",Font.BOLD,17));
				
				b1.setBounds(90,300,100,25);
				b1.setBackground(new Color(255,128,128));
				b1.setForeground(Color.white);
				b1.setBorder(new LineBorder(Color.white));
				b1.addActionListener(this);
				l.add(b1);
				
				
				b2 = new JButton("Back");
				b2.setBounds(250,300,100,25);
				b2.setFont(new Font("Serif",Font.BOLD,17));
				b2.setBackground(Color.white);
				b2.setForeground(new Color(255,128,128));
				b2.setBorder(new LineBorder(new Color(255,128,128)));
				l.add(b2);
				b2.addActionListener(this);
				
				ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/signup.png"));
				Image i5 = i4.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
				ImageIcon i6= new ImageIcon(i5);
				JLabel l1 = new JLabel();
				l1.setIcon(i6);
				l1.setLayout(null);
				l1.setBounds(520,0,400,400);
				l.add(l1);
		}
				
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==b1) {
						String username =f.getText();
						String email = f1.getText();
						String pass = f2.getText();
						Object ques= j.getSelectedItem();
						String ans =  f3.getText();
						String query = "insert into account values ('"+username+"' , '"+email+"' , '"+pass+"' , '"+ques+"' , '"+ans+"')";
						try {
							Conn c = new Conn();
							
							c.stmt.executeUpdate(query);
							
							JOptionPane.showMessageDialog(null, "Account successfully created!!");
							
							this.setVisible(false);
							new Login1().setVisible(true);
							
						}
						catch(Exception e1) {
							
						}
						
					}
					else if(e.getSource()==b2) {
						this.setVisible(false);
						new Login1().setVisible(true);
					}
				}
	
		public static void main(String[] args) {
		new SignUp().setVisible(true);
		}
		
}
