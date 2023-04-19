import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AffinitesPanel extends JPanel {
    JButton next;

    
    Vector<JCheckBox> v= new Vector<JCheckBox>();
    Vector<JCheckBox> t= new Vector<JCheckBox>();
    Vector<JCheckBox> o= new Vector<JCheckBox>();
    Vector<JCheckBox> p= new Vector<JCheckBox>();
    Vector<JCheckBox> s= new Vector<JCheckBox>();
    
    
    

    public AffinitesPanel() {
    	
      setLayout(new GridLayout(6, 2));
      JLabel Jinterets = new JLabel("interets");
      JLabel Jpassion = new JLabel("passion");
      JLabel Jstyle_de_vie= new JLabel("style_de_vie");
      JLabel Jeducation = new JLabel("education");
      JLabel Jlangue = new JLabel("langue");
      

      

        
        String[] interets= {"Musique","Cinema","Lecture","Cuisine","Voyage","Sport"};//Peut etre transformé ce String en Ensemble
        String[] passion= {"Danse","Theatre","Arts","Litterature","Photographie","Yoga"};//Peut etre transformé ce String en Ensemble
        String[] style_de_vie= {"Végétarien","Vegan","Eco-responsable","Minimaliste"};//Peut etre transformé ce String en Ensemble
        String[] education= {"BAC","BAC+3","BAC+5"}; //Peut etre transformé ce String en Ensemble
        String[] langue= {"Français","Anglais","Italien","Espagnol"};//Peut etre transformé ce String en Ensemble
       

        for (int i=0;i<interets.length;i++) {
        	t.add(new JCheckBox(interets[i],false));
        }
        for (int i=0;i<passion.length;i++) {
        	v.add(new JCheckBox(passion[i],false));
        }
        for (int i=0;i<style_de_vie.length;i++) {
        	o.add(new JCheckBox(style_de_vie[i],false));
        }
        for (int i=0;i<education.length;i++) {
        	p.add(new JCheckBox(education[i],false));
        }
        for (int i=0;i<langue.length;i++) {
        	s.add(new JCheckBox(langue[i],false));
        }
        
        
        
        this.add(Jinterets);
        this.add(new CCC(v));
        this.add(Jpassion);
        this.add(new CCC(t));
        this.add(Jstyle_de_vie);
        this.add(new CCC(o));
        this.add(Jeducation);
        this.add(new CCC(p));
        this.add(Jlangue);
        this.add(new CCC(s));
        
        next = new JButton("Next");
        next.setBounds(150, 500, 150, 50); 
        
        next.addActionListener(e -> {
            PremiereVue vue1 = new PremiereVue();
            Application.getInstance().getContentPane().remove(AffinitesPanel.this);
            Application.getInstance().getContentPane().add(vue1);
            Application.getInstance().revalidate();
            Application.getInstance().repaint();
        });
        
        
        this.add(next); 


        
        
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
			System.out.println(chk.getLabel());
			repaint();
			
			Object[] selections=chk.getSelectedObjects();
			if (selections!=null) {
				for(Object lastItem : selections) {
					//JOptionPane.showMessageDialog(null, lastItem.toString());
				}
			}
		}
		
		
	}
}
