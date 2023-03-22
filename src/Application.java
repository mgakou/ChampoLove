import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Application extends JFrame{

	public Application() {
		VueInscription vueIns =new VueInscription();
		
		this.add(vueIns);
		
		//this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setTitle("ChampoLove");
		this.setSize(700,700);
		this.setResizable(false);
		
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (int) screenSize.getWidth() / 2;
        int centerY = (int) screenSize.getHeight() / 2;
        this.setLocation(centerX - this.getWidth() / 2, centerY - this.getHeight() / 2);
        
        
		this.setBackground(new Color(237,245,255));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Application();
	}
}
