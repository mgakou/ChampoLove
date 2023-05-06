import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Set;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Controleur implements ActionListener {
	//private ResultatMatching score = new ResultatMatching();
    private ConnexionPanel connexionPanel;
    private InscriptionPanel inscriptionPanel;
    private AffinitesPanel affinitePanel;
    private Modele modl;
    private Application app;
    private PersonnePanel personnePanel;
    public Controleur(ConnexionPanel connexionPanel, InscriptionPanel inscriptionPanel, AffinitesPanel affinitePanel, Modele modl) {
        this.connexionPanel = connexionPanel;
        this.inscriptionPanel = inscriptionPanel;
        this.affinitePanel = affinitePanel;
        this.app = Application.getInstance();
        this.modl=modl;
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
        } 
        else if (e.getSource() == affinitePanel.getChercherButton()) {

        	String genreUtilisateur=inscriptionPanel.getGenreSelectionne();
        	String villeUtilisateur=inscriptionPanel.getVilleSelectionne();
        	String TrancheAge = affinitePanel.getTrancheAge();
        	System.out.println(genreUtilisateur);
        	
        	Vector v=affinitePanel.getV();
        	Vector t=affinitePanel.getT();
        	Vector o=affinitePanel.getO();
        	Vector p=affinitePanel.getP();
        	// Récupérer les sélections de l'utilisateur pour chaque DropDownCheckBox
            Set<String> interetsSelectionnes = affinitePanel.getSelectedItems(v);
            Set<String> passionsSelectionnees = affinitePanel.getSelectedItems(t);
            Set<String> styleDeVieSelectionnes = affinitePanel.getSelectedItems(o);
            Set<String> educationSelectionnes = affinitePanel.getSelectedItems(p);
            // Convertir les ensembles en tableaux de chaînes
            String[] interetsArray = interetsSelectionnes.toArray(new String[0]);
            String[] passionsArray = passionsSelectionnees.toArray(new String[0]);
            String[] styleDeVieArray = styleDeVieSelectionnes.toArray(new String[0]);
            String[] educationArray = educationSelectionnes.toArray(new String[0]);
            int totalLength = interetsArray.length + passionsArray.length + styleDeVieArray.length + educationArray.length;

            String[] TabCombine = new String[totalLength];

            System.arraycopy(interetsArray, 0, TabCombine, 0, interetsArray.length);
            System.arraycopy(passionsArray, 0, TabCombine, interetsArray.length, passionsArray.length);
            System.arraycopy(styleDeVieArray, 0, TabCombine, interetsArray.length + passionsArray.length, styleDeVieArray.length);
            System.arraycopy(educationArray, 0, TabCombine, interetsArray.length + passionsArray.length + styleDeVieArray.length, educationArray.length);
            // Appeler la méthode trouverMatch() avec les critères sélectionnés
            List<Personne> resultats = modl.trouverMatch(TabCombine,genreUtilisateur,villeUtilisateur,TrancheAge);
         // Création du conteneur des résultats des personnes
            JPanel personnesPanel = new JPanel(new GridLayout(resultats.size(), 1));
            for (Personne pers : resultats) {
                personnePanel = new PersonnePanel(pers);
                personnePanel.setBorder(BorderFactory.createEmptyBorder(10, 0, 10, 0)); // Ajoute une marge
                personnesPanel.add(personnePanel);
                System.out.println(pers.getNom() + " - " + pers.getAge() + " ans " + pers.getScore());
            }

            // Création du conteneur principal avec barre de défilement
            JScrollPane scrollPane = new JScrollPane(personnesPanel);
            //scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrollPane.setPreferredSize(new Dimension(400, 400));

            app.getContentPane().remove(affinitePanel);
            app.getContentPane().add(scrollPane); // Ajoute le JScrollPane
            app.getContentPane().revalidate();
            app.getContentPane().repaint();

        }

            
        }
}
    
