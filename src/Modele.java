import java.io.File;

public class Modele {
    private DonneesPersonnes donneesPersonnes;
    
    public Modele() {
        donneesPersonnes = new DonneesPersonnes();
        
        File img_p1 = new File("image_projet/homme_projet/1.jpg");
        String[] affinite_p1 = {"Musique","Arts","Yoga","Salarié"};
        Personne p1 = new Personne("Albert Law",25,000,affinite_p1,img_p1);
        donneesPersonnes.ajouterPersonne("Albert Law", p1);
        
        File img_p2 = new File("image_projet/femme_projet/1.jpg");
        String[] affinite_p2 = {"Voyages", "Danse", "Cuisine", "Sport"};
        Personne p2 = new Personne("Sophie Dupont", 30, 123456, affinite_p2, img_p2);
        donneesPersonnes.ajouterPersonne("Sophie Dupont", p2);
        
        File img_p3 = new File("image_projet/homme_projet/3.jpg");
        String[] affinite_p3 = {"Vegetarien","Arts","Cuisine","Musique","Sport","Voyage"};
        Personne p3 = new Personne("Sophie Dupont",42,000,affinite_p3,img_p3);
        donneesPersonnes.ajouterPersonne("Sophie Dupont", p3);

        // Ajouter d'autres personnes ici...
    }
    
    // Autres méthodes de la classe Modele...
}
