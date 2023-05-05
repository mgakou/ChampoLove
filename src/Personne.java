import java.awt.Image;
import java.io.File;

public class Personne {
	private String genre;
    private int score;
    private String nom;
    private int age;
    private int telephone;
    private String[] affinites;
    private File photo;
    
    public Personne(String genre,String nom, int age, int telephone, String[] affinites, File photo) {
        this.genre=genre;
    	this.nom = nom;
        this.age = age;
        this.telephone = telephone;
        this.affinites = affinites;
        this.photo = photo;
    }
    public String getGenre() {
    	return genre;
    }
    public String getNom() {
    	return nom;
    }
    public int getAge() {
    	return age;
    }
    public String[] getAffinités() {
        return affinites;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Getters et setters pour tous les attributs
}
