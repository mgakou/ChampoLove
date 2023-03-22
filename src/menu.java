import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class menu implements ActionListener {
    
    JFrame frame;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    public menu() {
        frame = new JFrame("Menu");
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        menuItem = new JMenuItem("Application");
        menuItem.addActionListener(this);
        
        menu.add(menuItem);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        
        frame.setSize(700, 700);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        

        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int centerX = (int) screenSize.getWidth() / 2;
        int centerY = (int) screenSize.getHeight() / 2;
        frame.setLocation(centerX - frame.getWidth() / 2, centerY - frame.getHeight() / 2);
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItem) {
            Application otherPage = new Application();
            otherPage.setVisible(true);
            frame.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        menu Menu = new menu();
    }
}

