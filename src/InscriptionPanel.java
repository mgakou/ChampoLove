import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
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
	JRadioButton hommeButton = new JRadioButton("Homme");
	JRadioButton femmeButton = new JRadioButton("Femme");
	JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 18, 100, 1));
	JButton enregistrerButton = new JButton("Enregistrer");
	
	public InscriptionPanel() {
	    // Panel principal
	    this.setLayout(new GridLayout(7, 2));
//	    this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
//	    this.setBackground(new Color(240, 199, 199));

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
	    
	    
	    ButtonGroup genreGroup = new ButtonGroup();
	    genreGroup.add(hommeButton);
	    genreGroup.add(femmeButton);
	    
	    JPanel genrePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
	    genrePanel.add(hommeButton);
	    genrePanel.add(femmeButton);
	    this.add(genreLabel);
	    this.add(genrePanel);

	    // Label et champ Age
	    JLabel ageLabel = new JLabel("Age : ");
	    ageLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    
	    ageSpinner.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(ageLabel);
	    this.add(ageSpinner);

        this.add(enregistrerButton);
    }
	public JButton getButtonEnregistrer() {
        return enregistrerButton;
    }
	public boolean verifie_champs() {
	    String nom = nomField.getText();
	    String prenom = prenomField.getText();
	    int age = (int) ageSpinner.getValue();
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

	public JTextField getNomField() {
        return nomField;
    }

    public JTextField getPrenomField() {
        return prenomField;
    }


    public JTextField getVilleField() {
        return villeField;
    }

    public JTextField getTelField() {
        return telField;
    }

    public String getGenre() {
        if (hommeButton.isSelected()) {
            return "Homme";
        }
        else return "Femme";
    }
    public JSpinner getAgeSpinner() {
        return ageSpinner;
    }
    
}
        
        