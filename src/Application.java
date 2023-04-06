import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Application extends JFrame{
	// Je crée une instance de la classe Application
	private static Application inst;
	public Application() {
		// inst est initialisée avec la référence à 
		// l'instance courante de la JFrame principale dans le constructeur de la classe.
		inst=this;

		Controleur ctrl = new Controleur();
		PremiereVue menu = new PremiereVue();
		
		this.add(menu);
		
		this.setVisible(true);
		this.setTitle("ChampoLove");
		this.setSize(450,600);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new Application();
	}
	public static Application getInstance() {
		return inst;
	}
}
