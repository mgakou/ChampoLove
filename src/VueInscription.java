import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueInscription extends JPanel{

	public VueInscription() {
		// TODO Auto-generated constructor stub
		JLabel titre = new JLabel("Parler nous de vous !");
		titre.setFont(new Font("Tahoma", Font.PLAIN, 38));
		this.add(titre);
		
		JLabel labelNom = new JLabel("Nom");
		labelNom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(labelNom);
		
		JTextField champsNom = new JTextField(25);
		this.add(champsNom);
		
		JLabel labelPrenom = new JLabel("Prénom");
		labelPrenom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(labelPrenom);
		
		JTextField champsPrenom = new JTextField(25);
		this.add(champsPrenom);
		
		JLabel labelPays = new JLabel("Pays");
		labelPays.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(labelPays);
		
		JTextField champsPays = new JTextField(25);
		this.add(champsPays);
		
		JLabel labelNum = new JLabel("Numéro de Tél");
		labelNum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(labelNum);
		
		JTextField champsNum = new JTextField(25);
		this.add(champsNum);
		
		JLabel labelAge = new JLabel("Age");
		labelAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(labelAge);
		
		JTextField champsAge = new JTextField(25);
		this.add(champsAge);
		
		JLabel labelGenre = new JLabel("Genre");
		labelAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(labelGenre);
		
		JButton homme = new JButton("Homme");
		JButton femme = new JButton("Femme");
		//homme.setAlignmentY(BOTTOM_ALIGNMENT);
		this.add(homme);
		this.add(femme);
	}
}
