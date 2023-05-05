import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;

public class DropDownCheckBox extends JComboBox{
	
	private Set<String> affinites_utilisateur = new HashSet<String>();

	public DropDownCheckBox(Vector v) {
		super(v);
		
		setRenderer(new Comborender()); 
		
		addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ourIS();
			}
		});
	}
	private void ourIS() {
		// TODO Auto-generated method stub
		Object selected = getSelectedItem();
		if (selected instanceof JCheckBox) {
			JCheckBox chk =(JCheckBox) selected;
			chk.setSelected(!chk.isSelected());
			affinites_utilisateur.add(chk.getLabel());
			System.out.println(chk.getLabel());
			repaint();
		}
	}

	public Set<String> getAffinitesUtilisateur() {
	    return affinites_utilisateur;
	}

	

}
