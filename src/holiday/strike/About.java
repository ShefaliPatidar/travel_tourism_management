package holiday.strike;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class About extends JFrame implements ActionListener{
    String s;
    JButton b1;
    About(){
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

	JLabel l2 = new JLabel("Holiday Strike ");
	l2.setBounds(300, 30, 200,30);
	l2.setForeground(Color.white);
	l2.setFont(new Font("Serif",Font.BOLD,22));
	l.add(l2);
        
        s="About Projects         \n" +
                 "\nThe objective of the Travel and Tourism Management System\n" +
               "project is to develop a system that automates the processes \n" +
                "and activities of a travel and the purpose is to design a \n" +
                "system using which one can perform all operations related to \n" +
                "traveling.\n\n\n" +
                "This application will help in accessing the information related \n" +
                "to the travel to the particular destination with great ease. \n" +
                "The users can track the information related to their tours with \n" +
                "great ease through this application. The travel agency information \n" +
                "can also be obtained through this application.\n\n" +
                "Advantages of Project:\n" +
                "\nGives accurate information\n" +
                "\nSimplifies the manual work\n" +
                "\nIt minimizes the documentation related work\n" +
                "\nProvides up to date information\n" +
                "\nFriendly Environment by providing warning messages.\n" +
                "\ntravelers details can be provided\n" +
                "\nbooking confirmation notification"
                ;
        
        TextArea t1 = new TextArea(s, 10, 40, Scrollbar.VERTICAL);
        t1.setEditable(false);
        t1.setBounds(85, 80, 600, 260);
        l.add(t1);
        
        b1=new JButton("Back");
        b1.addActionListener(this);
	b1.setFont(new Font("Serif",Font.BOLD,17));
	b1.setBounds(200,400,100,25);
	b1.setBackground(new Color(255,128,128));
	b1.setForeground(Color.white);
	b1.setBorder(new LineBorder(Color.white));
	l.add(b1);
        
    }
    public static void main(String[] args) {
        new About().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
}
