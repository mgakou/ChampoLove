import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueInsDroite extends JPanel{

	public VueInsDroite() {
		
        JLabel message = new JLabel("<html>Bienvenue sur notre application<br/>de rencontre !</html>");
        // Définition des contraintes de la cellule pour centrer le label
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.anchor = GridBagConstraints.CENTER;
        
		message.setFont(new Font("Arial",Font.BOLD,20));
		message.setForeground(Color.black.WHITE);
		this.add(message,gbc);
		
		this.setBackground(Color.black);
	}

}
