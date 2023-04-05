import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Application extends JFrame{

	public Application() {
		MENU menu = new MENU();
		VueInsDroite vueInsD=new VueInsDroite();
		VueInsGauche vueIns =new VueInsGauche();
		this.add(menu);
		//this.add(vueInsD);
		//this.add(vueIns);
		
		//this.setLayout(new GridLayout(0,2));
		this.setVisible(true);
		this.setTitle("ChampoLove");
		this.setSize(400,550);
		//this.setResizable(false);
		
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (int) screenSize.getWidth() / 2;
        int centerY = (int) screenSize.getHeight() / 2;
        this.setLocation(centerX - this.getWidth() / 2, centerY - this.getHeight() / 2);
        
        
		//this.setBackground(new Color(237,245,255));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Application();
	}
}
