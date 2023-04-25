

import java.awt.*;
import javax.swing.*;

public class ConnexionPanel extends JPanel {
    JButton connectButton = new JButton("Se connecter");;

    public ConnexionPanel() {
        this.setLayout(null); 
        this.setBackground(new Color(240, 199, 199));

        JLabel textLabel = new JLabel("Bienvenue sur notre App !");
        textLabel.setFont(new Font("Arial", Font.BOLD, 20));
        textLabel.setHorizontalAlignment(SwingConstants.CENTER);
        textLabel.setBounds(80, 0, 300, 50); 
        this.add(textLabel); 

        ImageIcon icon = new ImageIcon("image.png");
        Image image = icon.getImage().getScaledInstance(300, 200, Image.SCALE_DEFAULT);
        ImageIcon resizedIcon = new ImageIcon(image);
        JLabel label = new JLabel(resizedIcon);
        label.setBounds(50, 40, resizedIcon.getIconWidth(), resizedIcon.getIconHeight()); 
        this.add(label); 

        
        connectButton.setBounds(170, 500, 100, 50); 

        this.add(connectButton); 
//        connectButton.addActionListener(e -> {
//            InscriptionPanel vue2 = new InscriptionPanel();
//            Application.getInstance().getContentPane().remove(ConnexionPanel.this);
//            Application.getInstance().getContentPane().add(vue2);
//            Application.getInstance().revalidate();
//            Application.getInstance().repaint();
//        });

    }
    public JButton getButton() {
        return connectButton;
    }
}

