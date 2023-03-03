import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class Application extends JFrame{

	public Application() {
		VueInscription vueIns =new VueInscription();
		
		this.add(vueIns);
		//this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setTitle("ChampoLove");
		this.setSize(350,650);
		this.setBackground(new Color(237,245,255));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Application();
	}
}
