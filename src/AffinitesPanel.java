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
	
	Vector<Object> v= new Vector();
    Vector<Object> t= new Vector();
    Vector<Object> o= new Vector();
    Vector<Object> p= new Vector();
    Vector<Object> s= new Vector();
    
    JButton chercherButton = new JButton("Chercher");;
    
    public AffinitesPanel() {
    	
      setLayout(new GridLayout(6, 2));
      JLabel labelInteret = new JLabel("Interets");
      JLabel labelPassion = new JLabel("Passions");
      JLabel labelStyleDeVie= new JLabel("Style de vie");
      JLabel labelEducation = new JLabel("Education");
      JLabel labelLangue = new JLabel("Langue");

      String[] interets= {"Musique","Cinema","Lecture","Cuisine","Voyage","Sport"};//Peut etre transformé ce String en Ensemble
      String[] passion= {"Danse","Theatre","Arts","Litterature","Photographie","Yoga"};//Peut etre transformé ce String en Ensemble
      String[] style_de_vie= {"Végétarien","Vegan","Eco-responsable","Minimaliste"};//Peut etre transformé ce String en Ensemble
      String[] education= {"BAC","BAC+3","BAC+5"}; //Peut etre transformé ce String en Ensemble
      String[] langue= {"Français","Anglais","Italien","Espagnol"};//Peut etre transformé ce String en Ensemble
       
        t.add("Selectionner");
        v.add("Selectionner");
        o.add("Selectionner");
        p.add("Selectionner");
        s.add("Selectionner");
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
        
        
        
        this.add(labelInteret);
        this.add(new DropDownCheckBox(v));
        this.add(labelPassion);
        this.add(new DropDownCheckBox(t));
        this.add(labelStyleDeVie);
        this.add(new DropDownCheckBox(o));
        this.add(labelEducation);
        this.add(new DropDownCheckBox(p));
        this.add(labelLangue);
        this.add(new DropDownCheckBox(s));
        
        
        
        this.add(chercherButton); 
   }
    
    public JButton getChercherButton() {
        return chercherButton;
    }
    
}
