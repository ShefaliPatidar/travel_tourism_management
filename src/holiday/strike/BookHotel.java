package holiday.strike;
import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.text.ChoiceFormat;

import javax.swing.*;
public class BookHotel extends JFrame implements ActionListener{
	Choice c1,c2,c3;
	JTextArea t1,t2;
	JLabel l11,l22,l33,l44,l3;
	JButton b1,b2,b3;
	
BookHotel(){
	setBounds(200,150,1100,500);
	getContentPane().setBackground(Color.white);
	setLayout(null);
	
	
	
	ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/BC.jpg"));
	Image i2 = i1.getImage().getScaledInstance(1100, 500, Image.SCALE_DEFAULT);
	ImageIcon i3= new ImageIcon(i2);
	JLabel l = new JLabel(i3);
	l.setBounds(0,0,1100,500);
	l.setLayout(null);
	add(l);
	
	JLabel l1 = new JLabel("BOOK HOTEL");
	l1.setFont(new Font("Tahoma",Font.PLAIN,24));
	l1.setForeground(Color.WHITE);
	l1.setBounds(450,10,200,25);
	l.add(l1);
	
	JLabel l2 = new JLabel("Username: ");
	l2.setBounds(10,50,100,20);
	l2.setFont(new Font("Tahoma",Font.PLAIN,16));
	l2.setForeground(Color.WHITE);
	l.add(l2);
	
	l3 = new JLabel();
	l3.setBounds(150,50,130,20);
	l3.setFont(new Font("Tahoma",Font.PLAIN,16));
	l3.setForeground(Color.WHITE);
	l.add(l3);
	
	JLabel l4 = new JLabel("Select Hotel: ");
	l4.setBounds(10,80,130,20);
	l4.setFont(new Font("Tahoma",Font.PLAIN,16));
	l4.setForeground(Color.WHITE);
	l.add(l4);
	 c1 = new Choice();
	c1.add("The Taj Hotel");
	c1.add("JW Marriott ");
	
	c1.add("Radisson Hotel");
	c1.add("Classic Hotel");
	c1.add("The Bay Club Hotel");
	c1.add("Breeze Blows Hotel");
	
	
	c1.setBounds(150,80,150,50);
	l.add(c1);
	
	JLabel l5 = new JLabel("No of persons: ");
	l5.setBounds(10,110,130,20);
	l5.setFont(new Font("Tahoma",Font.PLAIN,16));
	l5.setForeground(Color.WHITE);
	l.add(l5);
	
	t1= new JTextArea();
	t1.setBounds(150,110,150,20);
	l.add(t1);

	JLabel l6 = new JLabel("No of days: ");
	l6.setBounds(10,140,130,20);
	l6.setFont(new Font("Tahoma",Font.PLAIN,16));
	l6.setForeground(Color.WHITE);
	l.add(l6);
	
	t2= new JTextArea();
	t2.setBounds(150,140,150,20);
	l.add(t2);
	
	JLabel l7 = new JLabel("AC / NON-AC: ");
	l7.setBounds(10,170,130,20);
	l7.setFont(new Font("Tahoma",Font.PLAIN,16));
	l7.setForeground(Color.WHITE);
	l.add(l7);
	c2 = new Choice();
	c2.add("AC");
	c2.add("NON-AC ");
	c2.setBounds(150,170,150,50);
	l.add(c2);
	

	JLabel l8 = new JLabel("Food Included: ");
	l8.setBounds(10,200,130,20);
	l8.setFont(new Font("Tahoma",Font.PLAIN,16));
	l8.setForeground(Color.WHITE);
	l.add(l8);
	c3 = new Choice();
	c3.add("Yes");
	c3.add("No ");
	c3.setBounds(150,200,150,50);
	l.add(c3);

	JLabel l9 = new JLabel("ID: ");
	l9.setBounds(10,230,100,20);
	l9.setFont(new Font("Tahoma",Font.PLAIN,16));
	l9.setForeground(Color.WHITE);
	l.add(l9);
	
	 l11 = new JLabel();
	l11.setBounds(150,230,130,20);
	l11.setFont(new Font("Tahoma",Font.PLAIN,16));
	l11.setForeground(Color.WHITE);
	l.add(l11);
	
	JLabel l10 = new JLabel("Number: ");
	l10.setBounds(10,260,100,20);
	l10.setFont(new Font("Tahoma",Font.PLAIN,16));
	l10.setForeground(Color.WHITE);
	l.add(l10);
	
	 l22 = new JLabel();
	l22.setBounds(150,260,130,20);
	l22.setFont(new Font("Tahoma",Font.PLAIN,16));
	l22.setForeground(Color.WHITE);
	l.add(l22);
	JLabel l12 = new JLabel("Phone: ");
	l12.setBounds(10,290,100,20);
	l12.setFont(new Font("Tahoma",Font.PLAIN,16));
	l12.setForeground(Color.WHITE);
	l.add(l12);
	
	 l33 = new JLabel();
	l33.setBounds(150,290,130,20);
	l33.setFont(new Font("Tahoma",Font.PLAIN,16));
	l33.setForeground(Color.WHITE);
	l.add(l33);
	JLabel l13 = new JLabel("Total price: ");
	l13.setBounds(10,320,100,20);
	l13.setFont(new Font("Tahoma",Font.PLAIN,16));
	l13.setForeground(Color.WHITE);
	l.add(l13);
	
	 l44 = new JLabel();
	l44.setBounds(150,320,130,20);
	
	l44.setForeground(Color.RED);
	l.add(l44);
	
	try {
		Conn c = new Conn();
		ResultSet rs = c.stmt.executeQuery("select * from customer where username = 'Shef'");
		while(rs.next()) {
			l3.setText(rs.getString("username"));
			l11.setText(rs.getString("id"));
			l22.setText(rs.getString("number"));
			l33.setText(rs.getString("mobileno"));
			
		}
		
	}catch(Exception e) {}
	
	b1= new JButton("Check price");
	b1.setBackground(new Color(255,128,128));
	b1.setForeground(Color.WHITE);
	b1.setBounds(10,400,110,30);
	b1.addActionListener(this);
	l.add(b1);
	
	b2= new JButton("Book");
	b2.setBackground(new Color(255,128,128));
	b2.setForeground(Color.WHITE);
	b2.setBounds(140,400,90,30);
	b2.addActionListener(this);
	l.add(b2);
	
	b3= new JButton("Back");
	b3.setBackground(new Color(255,128,128));
	b3.setForeground(Color.WHITE);
	b3.setBounds(250,400,90,30);
	b3.addActionListener(this);
	l.add(b3);
	
	ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/book.jpg"));
	Image i5 = i4.getImage().getScaledInstance(620, 400, Image.SCALE_DEFAULT);
	ImageIcon i6= new ImageIcon(i5);
	JLabel l66 = new JLabel(i6);
	l66.setBounds(460,50,620,400);
	l66.setLayout(null);
	l.add(l66);
	
}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			Conn c = new Conn();
			try {
				String query = "select * from hotel where name= '"+c1.getSelectedItem()+"'";
				ResultSet rs = c.stmt.executeQuery(query);
				while(rs.next()) {
					int cost = Integer.parseInt(rs.getString("cost_per_day"));
					int foodprice = Integer.parseInt(rs.getString("food_charges"));
					int acprice = Integer.parseInt(rs.getString("ac_charges"));
					int person = Integer.parseInt(t1.getText());
					int days = Integer.parseInt(t2.getText());
					String ac=c2.getSelectedItem();
					String food=c3.getSelectedItem();
					System.out.println(person+" "+days+" "+person*days);
					if(person*days>0) {
						int total=0;
							total+= ac.equals("AC") ? acprice:0;
							total+= food.equals("Yes") ? foodprice:0;
							total+= cost;
							total = total * person * days;
							
							l44.setText(" "+total);
					}else {
						l44.setText("Please enter a valid number");
						
					}
				}
			}catch(Exception e1) {
		}
	}
	}

	public static void main(String args[]) {
	new BookHotel().setVisible(true);
}
}
