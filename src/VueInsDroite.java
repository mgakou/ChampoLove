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
		
		//autre possibilités
		    
		    
		    JLabel label2 = new JLabel();
		    label2.setText("<html><h1>Bienvenue</h1></html>");
		    label2.setBounds(0, 20, 200, 50);
		    JLabel label3 = new JLabel();
		    label3.setText("<html><h2>dans notre aplication</h2></html>");
		    label3.setBounds(0, 20, 200, 50);
		    JLabel label4 = new JLabel();
		    label4.setText("<html><h2>de rencontre</h2></html>");
		    label4.setBounds(0, 20, 200, 50);

		    add(label2);
		    add(label3);
		    add(label4);

		    setVisible(true);
		    
		
		this.setBackground(Color.red);
	}

}
