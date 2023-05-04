import java.awt.Image;
import java.io.File;

public class Personne {
    private String nom;
    private int age;
    private int telephone;
    private String[] affinites;
    private File photo;
    
    public Personne(String nom, int age, int telephone, String[] affinites, File photo) {
        this.nom = nom;
        this.age = age;
        this.telephone = telephone;
        this.affinites = affinites;
        this.photo = photo;
    }
    
    // Getters et setters pour tous les attributs
}
