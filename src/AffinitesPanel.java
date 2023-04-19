import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

public class AffinitesPanel extends JPanel {
    
    Vector<JCheckBox> v= new Vector<JCheckBox>();

    public AffinitesPanel() {
        //setLayout(new GridLayout(10, 1));

        
        String[] interets= {"Musique","Cinema","Lecture","Cuisine","Voyage","Sport"};//Peut etre transformé ce String en Ensemble
        String[] passion= {"Danse","Theatre","Arts","Litterature","Photographie","Yoga"};//Peut etre transformé ce String en Ensemble
        String[] style_de_vie= {"Végétarien","Vegan","Eco-responsable","Minimaliste"};//Peut etre transformé ce String en Ensemble
        String[] education= {"BAC","BAC+3","BAC+5"}; //Peut etre transformé ce String en Ensemble
        String[] langue= {"Français","Anglais","Italien","Espagnol"};//Peut etre transformé ce String en Ensemble
       

        for (int i=0;i<interets.length;i++) {
        	v.add(new JCheckBox(interets[i],false));
        }
        for (int i=0;i<passion.length;i++) {
        	v.add(new JCheckBox(passion[i],false));
        }
        for (int i=0;i<style_de_vie.length;i++) {
        	v.add(new JCheckBox(style_de_vie[i],false));
        }
        for (int i=0;i<education.length;i++) {
        	v.add(new JCheckBox(education[i],false));
        }
        for (int i=0;i<langue.length;i++) {
        	v.add(new JCheckBox(langue[i],false));
        }
        this.add(new CCC(v));
       // getRootPane().add(new CCC(v));
   }
}

class CCC extends JComboBox {
	
	public CCC(Vector v) {
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
			
			repaint();
			
			Object[] selections=chk.getSelectedObjects();
			if (selections!=null) {
				for(Object lastItem : selections) {
					JOptionPane.showMessageDialog(null, lastItem.toString());
				}
			}
		}
		
		
	}
}




