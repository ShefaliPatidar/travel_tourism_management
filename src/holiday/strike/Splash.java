package holiday.strike;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Splash {

	public static void main(String[] args) {
		SplashFrame a = new SplashFrame();
		a.setVisible(true);
		int x=1;
		for(int i=2;i<=700;i+=10,x+=7) {
		a.setLocation(830-((i+x)/2), 450-(i/2));
		a.setSize(x+i,i);
	}
		try {
			Thread.sleep(100);
			
		}catch(Exception e) {
			
		}
		
		}

}
class SplashFrame extends JFrame implements Runnable{
	Thread t1;
	SplashFrame(){
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("holiday/strike/icons/bc123.jpg"));
		Image i2 = i1.getImage().getScaledInstance(1160, 750, Image.SCALE_DEFAULT);
		ImageIcon i3= new ImageIcon(i2);
		JLabel l = new JLabel(i3);
		add(l);
		//setBounds(300,300,1200,500);
		
	 t1= new Thread(this);
		t1.start();
	}

	@Override
	public void run() {
		try {
			Thread.sleep(7000);
			this.setVisible(false);
			new Login1().setVisible(true);
		}catch(Exception e) {
		
	}
}
}