package holiday.strike;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ViewCustomer extends JFrame implements ActionListener {

	
	
    JButton b1;
    String username="";
    ViewCustomer(String user)
    {
    	username=user;
        setBounds(200,150,900,600);
	getContentPane().setBackground(Color.white);
	setLayout(null);
	
	
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/BC.jpg"));
	Image i2 = i1.getImage().getScaledInstance(900, 600, Image.SCALE_DEFAULT);
	ImageIcon i3= new ImageIcon(i2);
	JLabel l = new JLabel(i3);
	l.setBounds(0,0,900,600);
	l.setLayout(null);
	add(l);
	
	JLabel l111 = new JLabel("View Customer Details");
	l111.setBounds(280,5,350,40);
	l111.setForeground(Color.white);
	l111.setFont(new Font("Serif",Font.BOLD,30));
	l.add(l111);
	JLabel l1 = new JLabel("Username : ");
	l1.setBounds(45, 60, 140,25);
	l1.setForeground(Color.white);
	l1.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l1);
	JLabel l11 = new JLabel();
	l11.setBounds(210,60,140,25);
	l.add(l11);
        
     JLabel l2 = new JLabel("ID : ");
	l2.setBounds(45,110, 140,25);
	l2.setForeground(Color.white);
	l2.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l2);
	JLabel l12 = new JLabel();
	l12.setBounds(210,110,140,25);
	l.add(l12);
	
        
        JLabel l3 = new JLabel("Number : ");
	l3.setBounds(45, 160, 140,25);
	l3.setForeground(Color.white);
	l3.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l3);
	JLabel l13 = new JLabel();
	l13.setBounds(210,160,140,25);
	l.add(l13);
	
        
        JLabel l4 = new JLabel("Name : ");
	l4.setBounds(45, 210, 140,25);
	l4.setForeground(Color.white);
	l4.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l4);
	JLabel l14 = new JLabel();
	l14.setBounds(210,210,140,25);
	l.add(l14);
	
        
        
        JLabel l5 = new JLabel("Gender : ");
	l5.setBounds(45,260, 140,25);
	l5.setForeground(Color.white);
	l5.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l5);
	
	JLabel l15 = new JLabel();
	l15.setBounds(210,260,140,25);
	l.add(l15);
	
        
        JLabel l6= new JLabel("Country : ");
	l6.setBounds(450,60, 140,25);
	l6.setForeground(Color.white);
	l6.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l6);
	JLabel l16 = new JLabel();
	l16.setBounds(600,60,140,25);
	l.add(l16);
	
        
        JLabel l7= new JLabel("Address : ");
	l7.setBounds(450,110, 140,25);
	l7.setForeground(Color.white);
	l7.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l7);
	JLabel l17 = new JLabel();
	l17.setBounds(600,110,140,25);
	l.add(l17);
	
	
        
        
        
        JLabel l8= new JLabel("Mobile No. : ");
	l8.setBounds(450,160, 140,25); 
	l8.setForeground(Color.white);
	l8.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l8);
	JLabel l18 = new JLabel();
	l18.setBounds(600,160,140,25);
	l.add(l18);
	
	
        
        JLabel l9= new JLabel("E-mail : ");
	l9.setBounds(450,210, 140,25);
	l9.setForeground(Color.white);
	l9.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l9);
	JLabel l19 = new JLabel();
	l19.setBounds(600,210,140,25);
	l.add(l19);
	
	
      
        
        b1= new JButton("Back");
        b1.addActionListener(this);
	b1.setFont(new Font("Serif",Font.BOLD,20));
	b1.setBounds(370,290,100,25);
	b1.setBackground(new Color(255,128,128));
	b1.setForeground(Color.white);
	b1.setBorder(new LineBorder(Color.white));
	l.add(b1);
 
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/train1.jpg"));
	Image i5 = i4.getImage().getScaledInstance(885, 250, Image.SCALE_DEFAULT);
	ImageIcon i6= new ImageIcon(i5);
	JLabel l10 = new JLabel();
	l10.setIcon(i6);
	l10.setLayout(null);
	l10.setBounds(0,330,885,250);
	l.add(l10);
        
       try{
            Conn c =new Conn();
            ResultSet rs=c.stmt.executeQuery("select * from customer where username='"+username+"'");
            while(rs.next())
            {
                l11.setText(rs.getString("username"));
                l11.setFont(new Font("Tamoha", Font.PLAIN, 16));
                l11.setForeground(Color.white);
                l12.setText(rs.getString("id"));
                l12.setFont(new Font("Tamoha", Font.PLAIN, 16));
                l12.setForeground(Color.white);
                l13.setText(rs.getString("number"));
                l13.setFont(new Font("Tamoha", Font.PLAIN, 16));
                l13.setForeground(Color.white);
                l14.setText(rs.getString("name"));
                l14.setForeground(Color.white);
                l14.setFont(new Font("Tamoha", Font.PLAIN, 16));
                l15.setText(rs.getString("gender"));
                l15.setFont(new Font("Tamoha", Font.PLAIN, 16));
                l15.setForeground(Color.white);
                l16.setText(rs.getString("country"));
                l16.setFont(new Font("Tamoha", Font.PLAIN, 16));
                l16.setForeground(Color.white);
                l17.setText(rs.getString("address"));
                l17.setFont(new Font("Tamoha", Font.PLAIN, 16));
                l17.setForeground(Color.white);
                l18.setText(rs.getString("mobileno"));
                l18.setFont(new Font("Tamoha", Font.PLAIN, 16));
                l18.setForeground(Color.white);
                l19.setText(rs.getString("email"));
                l19.setFont(new Font("Tamoha", Font.PLAIN, 16));
                l19.setForeground(Color.white);
            }
        }catch(Exception e){
            
        }
        
    }
	
    public void  actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== b1){
            this.setVisible(false);
        }
       }
        
        
      
    
    
    
    
    public static void main(String[] args) {
      new  ViewCustomer("").setVisible(true);
    }

}

