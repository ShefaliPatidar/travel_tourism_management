package holiday.strike;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;


public class Paytm extends JFrame implements ActionListener {
    JButton b1;
    Paytm(){
        JEditorPane j=new JEditorPane();
        j.setEditable(false);
        
        try{
            j.setPage("https://paytm.com/credit-card-bill-payment");
        }catch(Exception e){
           j.setContentType("text/html");
           j.setText("<html>Could not Load ,Error 404 </html>");
        }
        JScrollPane js=new JScrollPane();
        getContentPane().add(js);
        b1=new JButton("Back");
        b1.addActionListener(this);
        b1.setBounds(310,20,80,40);
        j.add(b1);
        j.setBounds(300,240,700,400);
    }
    public static void main(String[] args) {
        new Paytm().setVisible(true);
        new Payment().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.setVisible(false);
    }
    
}
