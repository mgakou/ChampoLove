

import java.awt.*;

import javax.swing.*;


public class PremiereVue extends JPanel {

	JButton connectButton;

    public PremiereVue() {

        this.setLayout(new BorderLayout());
        
        this.setBackground(new Color(240, 199, 199));

        

        JLabel textLabel = new JLabel("Bienvenue sur notre App !");

        textLabel.setFont(new Font("Arial", Font.BOLD, 20));

        textLabel.setHorizontalAlignment(SwingConstants.CENTER);

        this.add(textLabel, BorderLayout.NORTH);


        connectButton = new JButton("Se connecter");

        

        connectButton.addActionListener(e -> {
        	DeuxiemeVue vue2 = new DeuxiemeVue();
            Application.getInstance().getContentPane().remove(PremiereVue.this);
            Application.getInstance().getContentPane().add(vue2);
            Application.getInstance().revalidate();
            Application.getInstance().repaint();
        });
        
        this.add(connectButton, BorderLayout.SOUTH);
        

    }




}
