 package holiday.strike;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
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


public class AddCustomer extends JFrame implements ActionListener{
   
	
	
	JTextField t1,t2,t3,t4,t5,t6,t7;
    JComboBox j;
    JRadioButton r1,r2;
    JButton b1,b2;
    String username;
    AddCustomer(String user)
    {
    	username=user;
        setBounds(250,150,800,500);
	getContentPane().setBackground(Color.white);
	setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/BC.jpg"));
	Image i2 = i1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
	ImageIcon i3= new ImageIcon(i2);
	JLabel l = new JLabel(i3);
	l.setBounds(0,0,800,500);
	l.setLayout(null);
	add(l);

	JLabel l1 = new JLabel("Username : ");
	l1.setBounds(45, 50, 140,25);
	l1.setForeground(Color.white);
	l1.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l1);
	t1 = new JTextField();
	t1.setBounds(210, 50, 180, 25);
	l.add(t1);
        
        JLabel l2 = new JLabel("ID : ");
	l2.setBounds(45,90, 140,25);
	l2.setForeground(Color.white);
	l2.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l2);
        j=new JComboBox(new String[]{"Passport","Aadhar Card","Pan Card","Driving License","Ration Card"} );
        j.setBounds(210,90, 180, 25);
        l.add(j);
        
        JLabel l3 = new JLabel("Number : ");
	l3.setBounds(45, 130, 140,25);
	l3.setForeground(Color.white);
	l3.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l3);
	t2 = new JTextField();
	t2.setBounds(210, 130, 180, 25);
	l.add(t2);
        
        JLabel l4 = new JLabel("Name : ");
	l4.setBounds(45, 170, 140,25);
	l4.setForeground(Color.white);
	l4.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l4);
	t3 = new JTextField();
	t3.setBounds(210, 170, 180, 25);
	l.add(t3);
        
        
        JLabel l5 = new JLabel("Gender : ");
	l5.setBounds(45,210, 140,25);
	l5.setForeground(Color.white);
	l5.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l5);
        r1=new JRadioButton("Male");
        r1.setBounds(210,210,70,25);
        r1.setBackground(new Color(255,128,128));
	r1.setForeground(Color.white);
	r1.setBorder(new LineBorder(Color.white));
        r2=new JRadioButton("Female");
        r2.setBounds(320,210,70,25);
        r2.setBackground(new Color(255,128,128));
	r2.setForeground(Color.white);
	r2.setBorder(new LineBorder(Color.white));
        l.add(r1);
        l.add(r2);        
        
        JLabel l6= new JLabel("Country : ");
	l6.setBounds(45,250, 140,25);
	l6.setForeground(Color.white);
	l6.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l6);
	t4= new JTextField();
	t4.setBounds(210, 250, 180, 25);
	l.add(t4);
        
        JLabel l7= new JLabel("Address : ");
	l7.setBounds(45,290, 140,25);
	l7.setForeground(Color.white);
	l7.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l7);
	t5= new JTextField();
	t5.setBounds(210, 290, 180, 25);
	l.add(t5);
        
        
        
        JLabel l8= new JLabel("Mobile No. : ");
	l8.setBounds(45,330, 140,25); 
	l8.setForeground(Color.white);
	l8.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l8);
	t6= new JTextField();
	t6.setBounds(210, 330,180, 25);
	l.add(t6);
        
        JLabel l9= new JLabel("E-mail : ");
	l9.setBounds(45,370, 140,25);
	l9.setForeground(Color.white);
	l9.setFont(new Font("Serif",Font.BOLD,20));
	l.add(l9);
	t7= new JTextField();
	t7.setBounds(210, 370, 180, 25);
	l.add(t7);
        
        b1=new JButton("Add");
        b1.addActionListener(this);
	b1.setFont(new Font("Serif",Font.BOLD,20));
	b1.setBounds(70,420,100,25);
	b1.setBackground(new Color(255,128,128));
	b1.setForeground(Color.white);
	b1.setBorder(new LineBorder(Color.white));
	l.add(b1);  
        
        b2= new JButton("Back");
        b2.addActionListener(this);
	b2.setFont(new Font("Serif",Font.BOLD,20));
	b2.setBounds(230,420,100,25);
	b2.setBackground(new Color(255,128,128));
	b2.setForeground(Color.white);
	b2.setBorder(new LineBorder(Color.white));
	l.add(b2);
        
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/trav.png"));
	Image i5 = i4.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
	ImageIcon i6= new ImageIcon(i5);
	JLabel l10 = new JLabel();
	l10.setIcon(i6);
	l10.setLayout(null);
	l10.setBounds(480,40,400,400);
	l.add(l10);
        
	 try{
         Conn c =new Conn();
         ResultSet rs=c.stmt.executeQuery("select * from account where username='"+username+"'");
         while(rs.next())
         {
             t1.setText(rs.getString("username"));
             t3.setText(rs.getString("name"));
         }
     }catch(Exception e){}
        
    }
    
	
    public void  actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== b1){
            String username = t1.getText();
            Object id= (String) j.getSelectedItem();
            String number =t2.getText();
            String name=t3.getText();
            String gender=null;
            if(r1.isSelected()){
                gender="Male";
            }else if (r2.isSelected()){
                gender="Female";
                }
            
            String country = t4.getText();
            String address = t5.getText();
            String mobile= t6.getText();
            String email= t7.getText();
           
           
            
            String q= "insert into customer values ('"+username+"' , '"+id+"' ,'"+number+"','"+name+"', '"+gender+"', '"+country+"' , '"+address+"' , '"+mobile+"','"+email+"')";
            try{
                Conn c =new Conn();
               
                c.stmt.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Customer details added Successfully");
                this.setVisible(false);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        else if(ae.getSource()== b2){
            this.setVisible(false);
        }
    }
        
        
        
    
    
    
    
    public static void main(String[] args) {
      new  AddCustomer("").setVisible(true);
    }
}