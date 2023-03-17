import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

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

public class VueInscription extends JPanel{

	public VueInscription() {
	    // Panel principal
	    this.setLayout(new GridLayout(8, 2, 10, 10));
	    this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	    this.setBackground(new Color(240, 199, 199));

	    // Label et champ Nom
	    JLabel nomLabel = new JLabel("Nom : ");
	    nomLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    JTextField nomField = new JTextField(10);
	    nomField.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(nomLabel);
	    this.add(nomField);

	    // Label et champ Prénom
	    JLabel prenomLabel = new JLabel("Prénom : ");
	    prenomLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    JTextField prenomField = new JTextField(10);
	    prenomField.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(prenomLabel);
	    this.add(prenomField);

	    // Label et champ Pays
	    JLabel paysLabel = new JLabel("Pays : ");
	    paysLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    JTextField paysField = new JTextField(10);
	    paysField.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(paysLabel);
	    this.add(paysField);

	    // Label et champ Ville
	    JLabel villeLabel = new JLabel("Ville : ");
	    villeLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    JTextField villeField = new JTextField(10);
	    villeField.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(villeLabel);
	    this.add(villeField);

	    // Label et champ Numéro de téléphone
	    JLabel telLabel = new JLabel("Numéro de téléphone : ");
	    telLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    JTextField telField = new JTextField(10);
	    telField.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(telLabel);
	    this.add(telField);

	    // Label et champ Genre
	    JLabel genreLabel = new JLabel("Genre : ");
	    genreLabel.setFont(new Font("Arial", Font.BOLD, 18));
	    JRadioButton hommeButton = new JRadioButton("Homme");
	    JRadioButton femmeButton = new JRadioButton("Femme");
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
	    JSpinner ageSpinner = new JSpinner(new SpinnerNumberModel(18, 18, 100, 1));
	    ageSpinner.setFont(new Font("Arial", Font.PLAIN, 14));
	    this.add(ageLabel);
	    this.add(ageSpinner);

        // Bouton Enregistrer
        JButton enregistrerButton = new JButton("Enregistrer");
        enregistrerButton.addActionListener(e -> {
            String nom = nomField.getText();
            String prenom = prenomField.getText();
            String pays = paysField.getText();
            String ville = villeField.getText();
            String tel = telField.getText();
            String genre = hommeButton.isSelected() ? "Homme" : "Femme";
            int age = (int) ageSpinner.getValue();

         // Vérifier que tous les champs sont remplis
            if (nom.isEmpty() || prenom.isEmpty() || pays.isEmpty() || ville.isEmpty() || tel.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Vérifier que le numéro de téléphone est numérique
            if (!tel.matches("\\d+")) {
                JOptionPane.showMessageDialog(this, "Le numéro de téléphone doit être numérique", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }

            // Vérifier que l'âge est supérieur ou égal à 18 ans
            if (age < 18) {
                JOptionPane.showMessageDialog(this, "Vous devez avoir au moins 18 ans pour vous inscrire", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }   
            // Faire quelque chose avec les données (par exemple les enregistrer dans une base de données)
        });
        this.add(enregistrerButton);

    }
}
