import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InscriptionPanel extends JPanel{
	
	JTextField nomField = new JTextField();
	JTextField prenomField = new JTextField();
	JTextField telField = new JTextField();
	JLabel nomUtilisateur = new JLabel("Nom utilisateur");
	JTextField nomUtilisateurField = new JTextField();
	
    
    JComboBox<String> listeDeroulanteGenre;
    JComboBox<String> listeDeroulanteVille;
    JComboBox<Integer> listeDeroulanteAge;
	JButton enregistrerButton = new JButton("Enregistrer");
	
	public InscriptionPanel() {

	    // Panel principal
	    this.setLayout(new GridLayout(8, 2));
	    
	    this.setBackground(new Color(240, 199, 199));
	    
	    nomUtilisateur.setFont(new Font("Arial", Font.BOLD, 18));

	    this.add(nomUtilisateur);
	    this.add(nomUtilisateurField);
	    
	    // Label et champ Nom
	    JLabel nomLabel = new JLabel("Nom : ");
	    nomLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    //nomLabel.setBounds(300,100,100,100);
	    nomField.setFont(new Font("Arial", Font.PLAIN, 14));
	   // nomField.setBounds(300, 200, 100, 100);
	    this.add(nomLabel);
	    this.add(nomField);

	    // Label et champ Prénom
	    JLabel prenomLabel = new JLabel("Prénom : ");
	    prenomLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    prenomField.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(prenomLabel);
	    this.add(prenomField);

	    // Label et champ Ville
	    JLabel villeLabel = new JLabel("Ville : ");
	    villeLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    String[] optionsVille = {"Paris","Bordeaux","Marseille","Nice","Toulouse","Albi"};
	    listeDeroulanteVille=new JComboBox<>(optionsVille);
	    this.add(villeLabel);
	    this.add(listeDeroulanteVille);

	    // Label et champ Numéro de téléphone
	    JLabel telLabel = new JLabel("Numéro de téléphone : ");
	    telLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    telField.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(telLabel);
	    this.add(telField);

	    // Label et champ Genre
	    JLabel genreLabel = new JLabel("Genre : ");
	    genreLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    String[] optionsGenre = {"Homme", "Femme"};
	    listeDeroulanteGenre= new JComboBox<>(optionsGenre);
	    
	    this.add(genreLabel);
	    this.add(listeDeroulanteGenre);
	    
	    

	    // Label et champ Age
	    JLabel ageLabel = new JLabel("Age : ");
	    ageLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    DefaultComboBoxModel ageModel = new DefaultComboBoxModel();
	    for (int i = 18; i <= 60; i++) {
	        ageModel.addElement(i);
	    }
	    listeDeroulanteAge= new JComboBox(ageModel);
	    
	    this.add(ageLabel);
	    this.add(listeDeroulanteAge);
	    JPanel emptyPanel = new JPanel();
	    this.add(emptyPanel);
	    
        this.add(enregistrerButton);
        emptyPanel.setPreferredSize(new Dimension(Integer.MAX_VALUE, 0));
        emptyPanel.setBackground(new Color(240, 199, 199));
    }
	
	public String getGenreSelectionne() {
        return (String) listeDeroulanteGenre.getSelectedItem();
    }
	public String getVilleSelectionne() {
		return (String)listeDeroulanteVille.getSelectedItem();
	}
	public int getAgeSelectionne() {
		return (Integer) listeDeroulanteAge.getSelectedItem();
	}
	public JButton getButtonEnregistrer() {
        return enregistrerButton;
    }
	public boolean verifie_champs() {
	    String nom = nomField.getText();
	    String prenom = prenomField.getText();
	   
	    String tel = telField.getText();

	    if (nom.isEmpty() || prenom.isEmpty() || tel.isEmpty()) {
	        JOptionPane.showMessageDialog(this, "Tous les champs sont obligatoires", "Erreur", JOptionPane.ERROR_MESSAGE);
	        return false;
	    }
	    if (!tel.matches("\\d+")) {
	    	JOptionPane.showMessageDialog(this, "Le numéro de téléphone doit être numérique", "Erreur", JOptionPane.ERROR_MESSAGE);
	    	return false;
	  }

	    return true;
	}
	public void enregistrerUtilisateur() {
		DonneesUtilisateurs donneesUtilisateurs = Application.getInstance().getDonneesUtilisateurs();

	    // récupérer les données du formulaire
	    String nomUtilisateur = nomUtilisateurField.getText();
	    //String motDePasse = motDePasseTextField.getText();
	    String prenom = prenomField.getText();
	    String nom = nomField.getText();
	    String genre =getGenreSelectionne();
	    int age = getAgeSelectionne();
	    String ville=getVilleSelectionne();
	    //String email = emailTextField.getText();
	    int telephone = Integer.parseInt(telField.getText()) ;
	    // créer un objet Utilisateur avec les données
	    Utilisateur utilisateur = new Utilisateur(nomUtilisateur, nom, prenom,genre, telephone, age,ville);
	    // ajouter l'utilisateur au dictionnaire des données
	    donneesUtilisateurs.ajouterUtilisateur(nomUtilisateur, utilisateur);
	    System.out.println(utilisateur.toString());
	   
	}



    
}
        
        