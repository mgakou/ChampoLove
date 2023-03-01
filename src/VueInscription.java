import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VueInscription extends JPanel{

	public VueInscription() {
		// TODO Auto-generated constructor stub
		this.setLayout(new BorderLayout());;
		JLabel titre = new JLabel("Parler nous de vous !");
		titre.setFont(new Font("Tahoma", Font.PLAIN, 40));
		//this.add(titre,BorderLayout.NORTH);
		
		JLabel labelNom = new JLabel("Nom");
		labelNom.setFont(new Font("Tahoma", Font.PLAIN, 20));
		labelNom.setBounds(200, 300, 50, 50);
		this.add(labelNom);
		
		JTextField champsNom = new JTextField(25);
		this.add(champsNom);
		
		JTextField surnameField = new JTextField(25);
		JTextField countryField = new JTextField(25);
		JTextField phoneNumberField = new JTextField(25);
		JTextField ageField = new JTextField(25);

		
		
//		
//		
//		this.add(labelPrenom);
//		this.add(labelPays);
//		this.add(labelNumero);
//		this.add(labelAge);
//		
//		this.add(surnameField);
//		this.add(countryField);
//		this.add(phoneNumberField);
//		this.add(ageField);
	}

}
