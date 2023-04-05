

import java.awt.*;

import javax.swing.*;


public class MENU extends JPanel {

    

    public MENU() {
    	


        
        //Container c = JFrame.getContentPane();

        

        

        // Création d'un panneau pour contenir les éléments de la page


        
        this.setBackground(new Color(240, 199, 199));

        

        // Ajout de la photo

        ImageIcon imageIcon = new ImageIcon("image.jpg");

        JLabel imageLabel = new JLabel(imageIcon);

        this.add(imageLabel, BorderLayout.CENTER);

        

        // Ajout du texte

        JLabel textLabel = new JLabel("Bienvenue sur notre site !");

        textLabel.setFont(new Font("Arial", Font.BOLD, 20));

        textLabel.setHorizontalAlignment(SwingConstants.CENTER);

        this.add(textLabel, BorderLayout.NORTH);

        

        // Ajout des boutons

        JPanel buttonPanel = new JPanel(new GridLayout(1, 2, 10, 0));

        JButton connectButton = new JButton("Se connecter");

        

        connectButton.addActionListener(e -> {

            // Action à effectuer lors du clic sur le bouton "Se connecter"

            //dispose(); // Fermeture de la fenêtre actuelle

            //new LoginPage().setVisible(true); // Ouverture de la page de connexion

        });



        buttonPanel.add(connectButton);

        
        this.setLayout(new BorderLayout());
        this.add(buttonPanel, BorderLayout.SOUTH);

        

        //add(this);

    }

    



}
