

import java.awt.*;
import javax.swing.*;

public class PremiereVue extends JPanel {
    JButton connectButton;

    public PremiereVue() {
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

        connectButton = new JButton("Se connecter");
        connectButton.setBounds(170, 500, 100, 50); 

        connectButton.addActionListener(e -> {
            DeuxiemeVue vue2 = new DeuxiemeVue();
            Application.getInstance().getContentPane().remove(PremiereVue.this);
            Application.getInstance().getContentPane().add(vue2);
            Application.getInstance().revalidate();
            Application.getInstance().repaint();
        });

        this.add(connectButton); 
    }
}

