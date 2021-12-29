package holiday.strike;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener{
	JButton b1,b13;
	String username;
	Dashboard(String user){
		username=user;
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setLayout(null);
		
		//Horizontal panel
		JPanel p1 = new JPanel();
		p1.setLayout(null);
		p1.setBounds(0, 0,2000,60);
		p1.setBackground(new Color(0, 0, 102));
		add(p1);
		
		//Dashboard image	
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/bgg.jpg"));
		Image i2 = i1.getImage().getScaledInstance(60, 40, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l1 = new JLabel(i3);
		l1.setBounds(10,10,80,55);
		l1.setLayout(null);
		p1.add(l1);
		
		JLabel l3  = new JLabel("  Dashboard ");
		l3.setBounds(100,15,250, 40);
		l3.setFont(new Font("Tamoha", Font.BOLD, 32));
		l3.setForeground(Color.WHITE);
		p1.add(l3);
		
		//Vertical panel
		JPanel p2 = new JPanel();
		p2.setLayout(null);
		p2.setBounds(0, 0, 230, 800);
		p2.setBackground(new Color(0,0,102));
		add(p2);
		
		//BUTTONS
		b1 = new JButton(" Add Personal Details ");
		b1.setBackground(new Color(0, 0, 102));
		b1.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b1.setForeground(Color.WHITE);
		b1.setBounds(0,60,230, 50);
		b1.addActionListener(this);
		p2.add(b1);
		
		JButton b2 = new JButton(" Update Personal Details ");
		b2.setBackground(new Color(0, 0, 102));
		b2.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b2.setForeground(Color.WHITE);
		b2.setBounds(0,110,230, 50);
		p2.add(b2);
		
		JButton b3 = new JButton(" View Details ");
		b3.setBackground(new Color(0, 0, 102));
		b3.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b3.setForeground(Color.WHITE);
		b3.setBounds(0,160,230, 50);
		p2.add(b3);

		JButton b4 = new JButton(" Delete Personal Details ");
		b4.setBackground(new Color(0, 0, 102));
		b4.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b4.setForeground(Color.WHITE);
		b4.setBounds(0,210,230, 50);
		p2.add(b4);
		
		JButton b5 = new JButton(" Check Package ");
		b5.setBackground(new Color(0, 0, 102));
		b5.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b5.setForeground(Color.WHITE);
		b5.setBounds(0,260,230, 50);
		p2.add(b5);
		
		JButton b6 = new JButton(" Book Package ");
		b6.setBackground(new Color(0, 0, 102));
		b6.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b6.setForeground(Color.WHITE);
		b6.setBounds(0,310,230, 50);
		p2.add(b6);
		
		JButton b7 = new JButton(" View Package ");
		b7.setBackground(new Color(0, 0, 102));
		b7.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b7.setForeground(Color.WHITE);
		b7.setBounds(0,360,230, 50);
		p2.add(b7);
		
		JButton b8 = new JButton(" View Hotels ");
		b8.setBackground(new Color(0, 0, 102));
		b8.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b8.setForeground(Color.WHITE);
		b8.setBounds(0,410,230, 50);
		p2.add(b8);
		
		JButton b9 = new JButton(" Book Hotel ");
		b9.setBackground(new Color(0, 0, 102));
		b9.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b9.setForeground(Color.WHITE);
		b9.setBounds(0,460,230, 50);
		p2.add(b9);
		
		JButton b10 = new JButton(" View Booked Hotel ");
		b10.setBackground(new Color(0, 0, 102));
		b10.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b10.setForeground(Color.WHITE);
		b10.setBounds(0,510,230, 50);
		p2.add(b10);
		
		JButton b11 = new JButton(" Destinations ");
		b11.setBackground(new Color(0, 0, 102));
		b11.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b11.setForeground(Color.WHITE);
		b11.setBounds(0,560,230, 50);
		p2.add(b11);
		
		JButton b12 = new JButton(" Payment");
		b12.setBackground(new Color(0, 0, 102));
		b12.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b12.setForeground(Color.WHITE);
		b12.setBounds(0,610,230, 50);
		p2.add(b12);
		
		b13 = new JButton(" Calculator ");
		b13.setBackground(new Color(0, 0, 102));
		b13.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b13.setForeground(Color.WHITE);
		b13.setBounds(0,660,230, 50);
		b13.addActionListener(this);
		p2.add(b13);
		
		JButton b14 = new JButton(" Reviews ");
		b14.setBackground(new Color(0, 0, 102));
		b14.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b14.setForeground(Color.WHITE);
		b14.setBounds(0,710,230, 50);
		p2.add(b14);
		
		JButton b15 = new JButton(" About ");
		b15.setBackground(new Color(0, 0, 102));
		b15.setFont(new Font("Tamoha", Font.PLAIN, 16));
		b15.setForeground(Color.WHITE);
		b15.setBounds(0,760,230,50);
		p2.add(b15);
		
		//Main Center Image
		ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/bgg.jpg"));
		Image i5 = i4.getImage().getScaledInstance(1450, 800, Image.SCALE_DEFAULT);
		ImageIcon i6= new ImageIcon(i5);
		JLabel l2= new JLabel(i6);
		l2.setBounds(200,40,1400, 800);
		l2.setLayout(null);
		add(l2);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == b13) {
			try {
				Runtime.getRuntime().exec("calc.exe");
			}catch(Exception e) {}
			
		}
		else if(ae.getSource()==b1) {
			this.setVisible(false);
			new AddCustomer(username).setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Dashboard("").setVisible(true);

	}
}