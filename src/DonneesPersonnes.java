import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class DonneesPersonnes {
    private Map<String, Personne> personnes;
    
    public DonneesPersonnes() {
        personnes = new HashMap<>();
    }
    
    public void ajouterPersonne(String nom, Personne personne) {
        personnes.put(nom, personne);
    }
    
    public Personne getPersonne(String nom) {
        return personnes.get(nom);
    }
    File img_p1 = new File("image_projet/homme_projet/1.jpg");
    String[] affinite_p1 = {"Musique","Arts","Yoga","Salarié"};
    Personne p1 = new Personne("Albert Law",25,000,affinite_p1,img_p1);
    

    File img_p2 = new File("image_projet/homme_projet/2.jpg");
    String[] affinite_p2 = {"Photographie","Arts","Cuisine","Litterature","Sport"};
    Personne p2 = new Personne("Albert Law",42,000,affinite_p2,img_p2);

    File img_p3 = new File("image_projet/homme_projet/3.jpg");
    String[] affinite_p3 = {"Vegetarien","Arts","Cuisine","Musique","Sport","Voyage"};
    Personne p3 = new Personne("Albert Law",42,000,affinite_p3,img_p3);
    
    // Autres méthodes pour accéder et modifier les données des personnes
}
