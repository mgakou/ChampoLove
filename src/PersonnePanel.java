import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

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
        JLabel infos = new JLabel(personne.getNom()+", "+age+" ans" +"\n"+personne.getVille());
        JLabel descriptionArea = new JLabel(personne.getDescription());

        // Configuration de la mise en page
        setLayout(new GridLayout(1, 2));
        add(photoLabel);
        add(infos);
        add(descriptionArea);
    }
}
