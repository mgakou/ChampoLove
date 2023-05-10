import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
    private JComboBox trancheAge;
    JButton chercherButton = new JButton("Chercher");

    JButton retour=new JButton("Retour");
    
    public AffinitesPanel() {
    	this.setBackground(new Color(240, 199, 199));
	      setLayout(new GridLayout(6, 2));
	      JLabel labelInteret = new JLabel("Interets");
	      JLabel labelPassion = new JLabel("Passions");
	      JLabel labelStyleDeVie= new JLabel("Style de vie");
	      JLabel labelEducation = new JLabel("Statut");
	      JLabel labelTrancheAge = new JLabel("Quelle tranche d'age ?");
	
	      labelInteret.setFont(new Font("Arial", Font.BOLD, 18));
	      labelPassion.setFont(new Font("Arial", Font.BOLD, 18));
	      labelStyleDeVie.setFont(new Font("Arial", Font.BOLD, 18));
	      labelEducation.setFont(new Font("Arial", Font.BOLD, 18));
	      labelTrancheAge.setFont(new Font("Arial", Font.BOLD, 18));
	
	      String[] interets= {"Musique","Cinema","Lecture","Cuisine","Voyage","Sport"};//Peut etre transformé ce String en Ensemble
	      String[] passion= {"Danse","Theatre","Arts","Litterature","Photographie","Yoga"};//Peut etre transformé ce String en Ensemble
	      String[] style_de_vie= {"Végétarien","Vegan","Eco-responsable","Minimaliste"};//Peut etre transformé ce String en Ensemble
	      String[] education= {"Etudiant","Salarié","Entrepeneur"}; //Peut etre transformé ce String en Ensemble
	     
	       
	      t.add("Selectionner");
	      v.add("Selectionner");
	      o.add("Selectionner");
	      p.add("Selectionner");
      
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
	        
	        String[] option = {"18-25","25-35","35-45","Plus de 45"}; 
	        trancheAge = new JComboBox<>(option);
	        this.add(labelInteret);
	        this.add(new DropDownCheckBox(v));
	        this.add(labelPassion);
	        this.add(new DropDownCheckBox(t));
	        this.add(labelStyleDeVie);
	        this.add(new DropDownCheckBox(o));
	        this.add(labelEducation);
	        this.add(new DropDownCheckBox(p));
	        this.add(labelTrancheAge);
	        this.add(trancheAge);
	        
	        this.add(retour);
	        this.add(chercherButton); 
   }
    public JButton getButtonRetour() {
    	return retour;
    }
    public String getTrancheAge() {
		return (String) trancheAge.getSelectedItem();
	}
    public Vector getV() {
    	return v;
    }
    public Vector getT() {
    	return t;
    }
    public Vector getO() {
    	return o;
    }
    public Vector getP() {
    	return p;
    }
    public Set<String> getSelectedItems(Vector v) {
        Set<String> selection = new HashSet<>();
        for (Object item : v) {
            if (item instanceof JCheckBox) {
                JCheckBox checkBox = (JCheckBox) item;
                if (checkBox.isSelected()) {
                    selection.add(checkBox.getText());
                }
            }
        }
        return selection;
    }
    public JButton getChercherButton() {
        return chercherButton;
    }
    
}
