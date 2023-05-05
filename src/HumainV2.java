
import java.awt.Color;
import java.util.ArrayList;
import java.util.PriorityQueue;

import javax.swing.ImageIcon;


public class HumainV2 implements Comparable<HumainV2>{
	String sexe;
	public String[] tabSex={"homme","femme"};
	String prenom;
	int age;
	int taille;
	String ville;
	Color couleurCheveux;
	Color couleurPeau;
	int score;
	String loisir;
	ImageIcon photo;

public HumainV2(String s,String p, int a, int t, String v,Color cc,Color cp,String l,int sco,ImageIcon ph) {
	

	this.sexe=s;
	this.prenom=p;
	this.age=a;
	this.taille=t;
	this.ville=v;
	this.couleurCheveux=cc;
	this.couleurPeau=cp;
	this.score=sco;
	this.loisir=l;
	this.photo=ph;
}

public String toString() {
	return this.score+" "+ this.prenom;
	
}

@Override
public int compareTo(HumainV2 o) {
	return this.score - o.score;
}
}