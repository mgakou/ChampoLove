import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Application extends JFrame{
	
	// Je crée une instance de la classe Application
	private static Application inst;
	private DonneesUtilisateurs donneesUtilisateurs;
	public Application() {
		// inst est initialisée avec la référence à 
		// l'instance courante de la JFrame principale dans le constructeur de la classe.
		inst=this;
		this.donneesUtilisateurs=new DonneesUtilisateurs();
		Modele modl = new Modele();
		ConnexionPanel connexionPanel = new ConnexionPanel();
		InscriptionPanel ins= new InscriptionPanel();
		AffinitesPanel affiniteP=new AffinitesPanel();
		Controleur ctrl = new Controleur(connexionPanel,ins,affiniteP,modl);
		
		this.add(connexionPanel);
		
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
	// On s'assure qu'il y'a qu'une seule et unique instance durant l'execution
	public DonneesUtilisateurs getDonneesUtilisateurs() {
	    return donneesUtilisateurs;
	}

}
