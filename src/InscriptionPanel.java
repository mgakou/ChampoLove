import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class InscriptionPanel extends JPanel{
	
	
	JTextField nomField = new JTextField(10);
	JTextField prenomField = new JTextField(10);
	JTextField villeField = new JTextField(10);
	JTextField telField = new JTextField(10);
	JLabel nomUtilisateur = new JLabel("Nom utilisateur");
	JTextField nomUtilisateurField = new JTextField(10);

    
    JComboBox<String> listeDeroulanteGenre;
   // JComboBox<Integer> listeDeroulanteAge;
    
	JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 18, 100, 1));
	JButton enregistrerButton = new JButton("Enregistrer");
	
	public InscriptionPanel() {
	    // Panel principal
	    this.setLayout(new GridLayout(8, 2));
//	    this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//	    this.setBackground(new Color(240, 199, 199));
	    this.add(nomUtilisateur);
	    this.add(nomUtilisateurField);
	    // Label et champ Nom
	    JLabel nomLabel = new JLabel("Nom : ");
	    nomLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    nomField.setFont(new Font("Arial", Font.PLAIN, 14));
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
	    
	    villeField.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(villeLabel);
	    this.add(villeField);

	    // Label et champ Numéro de téléphone
	    JLabel telLabel = new JLabel("Numéro de téléphone : ");
	    telLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    telField.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(telLabel);
	    this.add(telField);

	    // Label et champ Genre
	    JLabel genreLabel = new JLabel("Genre : ");
	    genreLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    String[] options = {"Homme", "Femme"};
	    listeDeroulanteGenre= new JComboBox<>(options);
	    
	    this.add(genreLabel);
	    this.add(listeDeroulanteGenre);
	    
	    

	    // Label et champ Age
	    JLabel ageLabel = new JLabel("Age : ");
	    ageLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    ageSpinner.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(ageLabel);
	    this.add(ageSpinner);

        this.add(enregistrerButton);
    }
	
	public String getGenreSelectionne() {
        return (String) listeDeroulanteGenre.getSelectedItem();
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
	    String genre = (String) listeDeroulanteGenre.getSelectedItem();
	    int age = (int) ageSpinner.getValue();
	    //String email = emailTextField.getText();
	    int telephone = Integer.parseInt(telField.getText()) ;
	    // créer un objet Utilisateur avec les données
	    Utilisateur utilisateur = new Utilisateur(nomUtilisateur, nom, prenom,genre, telephone, age);
	    // ajouter l'utilisateur au dictionnaire des données
	    donneesUtilisateurs.ajouterUtilisateur(nomUtilisateur, utilisateur);
	    System.out.println(utilisateur.toString());
	   
	}



    
}
        
        