import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
		
		public class menu extends JFrame {
	
			static JMenuBar mb;
			static JMenu x;
			static JMenuItem m1, m2, m3;
			static JFrame f;

			public static void main(String[] args) {
			
			      JFrame frame = new JFrame("ChampoLove");
			      JMenuBar menu = new JMenuBar();
			      JMenuItem inscription = new JMenuItem("inscrption");
			      JMenu file = new JMenu("Inscrption");
			      JMenuItem newf = new JMenuItem("s'incrire");
			      JMenu contact = new JMenu("Contact");
			      JLabel label= new JLabel();
			      

			      menu.setLayout(new GridLayout(1,0));
			      menu.add(file);

			      file.add(newf);
			      file.add(inscription);

			      menu.add(contact);

			      frame.setJMenuBar(menu);
			      frame.setSize(350, 500);
			      frame.setBackground(Color.red);
			      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			      frame.setVisible(true);
			  
			}

	}

