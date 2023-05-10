import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PersonnePanel extends JPanel {
	
    public PersonnePanel(Personne personne) {
    	
        // Création des composants
    	File imagePersonne=personne.getPhoto();
    	BufferedImage image;
        try {
            image = ImageIO.read(imagePersonne);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }
        Image scaledImage = image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon img = new ImageIcon(scaledImage);
        
        JLabel photoLabel = new JLabel(img);

        String age =String.valueOf(personne.getAge());
        JLabel infos = new JLabel(personne.getNom()+", "+age+" ans "+"Habite à " + personne.getVille() + " (à un score " + personne.getScore()+")");
        

        // Configuration de la mise en page
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        setBackground(Color.pink);
        add(photoLabel,c);
        c.gridy = 1;
        add(infos,c);
    }
}
