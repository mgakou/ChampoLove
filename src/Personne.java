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
    private String description;
    private String ville;
    public Personne(String genre,String nom, int age, int telephone,String ville, String[] affinites, File photo,String desc) {
        this.genre=genre;
    	this.nom = nom;
        this.age = age;
        this.telephone = telephone;
        this.ville=ville;
        this.affinites = affinites;
        this.photo = photo;
        this.description=desc;
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
    public String getVille() {
		return ville;
	}
    public String[] getAffinités() {
        return affinites;
    }
    public File getPhoto() {
		return photo;
	}

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getDescription() {
    	return description;
	}
}
