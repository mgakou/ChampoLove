import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controleur implements ActionListener {
	private ResultatMatching score = new ResultatMatching();
    private ConnexionPanel connexionPanel;
    private InscriptionPanel inscriptionPanel;
    private AffinitesPanel affinitePanel;
    private Application app;

    public Controleur(ConnexionPanel connexionPanel, InscriptionPanel inscriptionPanel, AffinitesPanel affinitePanel) {
        this.connexionPanel = connexionPanel;
        this.inscriptionPanel = inscriptionPanel;
        this.affinitePanel = affinitePanel;
        this.app = Application.getInstance();
        
        initializeButtons();
    }
   

    private void initializeButtons() {
        connexionPanel.getButton().addActionListener(this);
        inscriptionPanel.getButtonEnregistrer().addActionListener(this);
        affinitePanel.getChercherButton().addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == connexionPanel.getButton()) {
            app.getContentPane().remove(connexionPanel);
            app.getContentPane().add(inscriptionPanel);
            app.getContentPane().revalidate();
            app.getContentPane().repaint();
        } else if (e.getSource() == inscriptionPanel.getButtonEnregistrer()) {
        	// 
        	if (inscriptionPanel.verifie_champs()) {
        		inscriptionPanel.enregistrerUtilisateur();
        		
	        	app.getContentPane().remove(inscriptionPanel);
	            app.getContentPane().add(affinitePanel);
	            app.getContentPane().revalidate();
	            app.getContentPane().repaint();
        	}
        } else if (e.getSource() == affinitePanel.getChercherButton()) {
            app.getContentPane().remove(affinitePanel);
            app.getContentPane().add(connexionPanel);
            app.getContentPane().revalidate();
            app.getContentPane().repaint();
            score.calculerScore();
            
        }
        
    }



}
