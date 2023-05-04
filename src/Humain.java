import java.awt.Color;
import java.util.ArrayList;
import java.util.PriorityQueue;

public class Humain implements Comparable<Humain>{

String sexe;
static String[] tabSex={"homme","femme"};
String prenom;
int age;
int taille;
String ville;
String nationalité;
static String[] tabNa ={"Français","Belge","Suisse","Canada"};
Color couleurCheveux;
Color couleurPeau;
int score;
String loisir;
static String[] tabLoisir= {"interet","passion","style_de_vie","education","langue","sport"};

public Humain(String s,String p, int a, int t, String v,String n,Color cc,Color cp,String l,int sco) {
	
	this.sexe=s;
	this.prenom=p;
	this.age=a;
	this.taille=t;
	this.ville=v;
	this.nationalité=n;
	this.couleurCheveux=cc;
	this.couleurPeau=cp;
	this.score=sco;
	this.loisir=l;
}

public static  PriorityQueue<Humain> match(Humain h1){
	
	PriorityQueue<Humain> scoreFile=new PriorityQueue<>();
	
	ArrayList<Humain> listeFemme= new ArrayList<>();
	
	
	
	Humain h2= new Humain(tabSex[1],"Chloe",18,182,"Lille",tabNa[1],Color.YELLOW,Color.GREEN,tabLoisir[0],0);
	Humain h3= new Humain(tabSex[1],"Manon",40,170,"Paris",tabNa[0],Color.GRAY,Color.GREEN,tabLoisir[0],0);
	Humain h4= new Humain(tabSex[1],"Clara",24,160,"bordeaux",tabNa[2],Color.YELLOW,Color.GREEN,tabLoisir[0],0);
	Humain h5= new Humain(tabSex[1],"Aurore",32,172,"Strasborg",tabNa[3],Color.BLACK,Color.GREEN,tabLoisir[0],0);
	listeFemme.add(h2);listeFemme.add(h3);listeFemme.add(h4);listeFemme.add(h5);
	
	for(int i=0;i<listeFemme.size();i++) {
		
		if (listeFemme.get(i).age>= h1.age-5 || listeFemme.get(i).age>= h1.age+5 ) {
			listeFemme.get(i).score+=10;
			
		}
		
		else if(listeFemme.get(i).age>= h1.age-10 || listeFemme.get(i).age>= h1.age+10 ) {
				listeFemme.get(i).score+=5;}
		else {
				listeFemme.get(i).score+=1;		
	}
		if (listeFemme.get(i).taille>= h1.taille-5 || listeFemme.get(i).taille>= h1.taille+5 ) {
			listeFemme.get(i).score+=10;}
		
		else if(listeFemme.get(i).taille>= h1.taille-10 || listeFemme.get(i).taille>= h1.taille+10 ) {
				listeFemme.get(i).score+=5;}
		else {
				listeFemme.get(i).score+=1;		
	}
		
		
		
}
	for(int j=0;j<listeFemme.size();j++) {
		scoreFile.add(listeFemme.get(j));
}
	System.out.println(scoreFile);
	return scoreFile;
	
}

public String toString() {
	return this.score+" "+ this.prenom;
	
}
public static void main(String[] args) {
int i=0;
Humain h1= new Humain(tabSex[0],"Malo",50,180,"Paris",tabNa[0],Color.WHITE,Color.GREEN,tabLoisir[0],0);
	for(Humain h:match(h1)) {
	
		System.out.println(h+" "+i);
		i++;
	}
	}

@Override
public int compareTo(Humain o) {
	return this.score - o.score;
}
}


