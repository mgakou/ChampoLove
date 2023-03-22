import javax.swing.*;
import java.awt.*;
import java.awt.*;
import java.awt.event.*;

public class MENU implements ActionListener {
    
    JFrame frame;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem menuItem;
    
    public MENU() {
    	
        frame = new JFrame("Menu");
        menuBar = new JMenuBar();
        menu = new JMenu("Menu");
        menuItem = new JMenuItem("Application");
        menuItem.addActionListener(this);
        
        menu.add(menuItem);
        menuBar.add(menu);
        
        frame.setJMenuBar(menuBar);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        int taillex = (int) screenSize.getWidth() * 3/4;
        int tailley = (int) screenSize.getHeight()  * 3/4;
        
        frame.setSize(taillex,tailley);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setUndecorated(true);
        //frame.setVisible(true);
        frame.setResizable(false);
        //frame.setBackground(new Color(0,245,255));
        frame.getContentPane().setBackground(new Color(240, 199, 199)); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        

        
        
        int tailleEcrx = (int) screenSize.getWidth() / 2;
        int tailleEcry = (int) screenSize.getHeight() / 2;
        frame.setLocation(tailleEcrx - frame.getWidth() / 2, tailleEcry - frame.getHeight() / 2);
        
        

        
        
        
        
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == menuItem) {
            Application otherPage = new Application();
            otherPage.setVisible(true);
            frame.setVisible(false);
            
        }
    }
    
    public static void main(String[] args) {
        MENU Menu = new MENU();
        
    }
}

