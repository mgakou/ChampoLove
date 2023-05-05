import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Modele {
    private DonneesPersonnes donneesPersonnes;
    public Modele() {
        donneesPersonnes = new DonneesPersonnes();
        
        File img_p1 = new File("image_projet/homme_projet/1.jpg");
        String[] affinite_p1 = {"Musique","Arts","Yoga","Salarié"};
        Personne p1 = new Personne("Homme","Albert Law",25,000,affinite_p1,img_p1);
        donneesPersonnes.ajouterPersonne("Albert Law", p1);
        
        File img_p2 = new File("image_projet/femme_projet/2.jpg");
        String[] affinite_p2 = {"Voyages", "Danse", "Cuisine", "Sport"};
        Personne p2 = new Personne("Femme","Sophie Dupont", 30, 123456, affinite_p2, img_p2);
        donneesPersonnes.ajouterPersonne("Sophie Dupont", p2);
        
        File img_p3 = new File("image_projet/homme_projet/3.jpg");
        String[] affinite_p3 = {"Vegetarien","Arts","Cuisine","Musique","Sport","Voyage"};
        Personne p3 = new Personne("Femme","Maut Claire",42,000,affinite_p3,img_p3);
        donneesPersonnes.ajouterPersonne("Maut Claire", p3);
    }
    
    public List<Personne> trouverMatch(String[] critères, String genreUtilisateur) {
        List<Personne> personnes = donneesPersonnes.getListePersonnes();
        List<Personne> résultats = new ArrayList<>();

        // Parcours de toutes les personnes de la base de données
        for (Personne personne : personnes) {
            int score = 0;
            
            // Comparaison des affinités de la personne avec les critères de matching
            for (String affinité : personne.getAffinités()) {
                for (String critère : critères) {
                    if (affinité.equalsIgnoreCase(critère)) {
                        score++;
                    }
                }
            }
            
            // Exclure les personnes qui ont le même genre que l'utilisateur
            if (!personne.getGenre().equalsIgnoreCase(genreUtilisateur)) {

                // Si la personne a un score supérieur à 0, on l'ajoute à la liste des résultats
                if (score > 0) {
                    personne.setScore(score);
                    résultats.add(personne);
                }
            }
        }

        // Tri des résultats en fonction du score décroissant
        Collections.sort(résultats, new Comparator<Personne>() {
            @Override
            public int compare(Personne p1, Personne p2) {
                return p2.getScore() - p1.getScore();
            }
        });

        return résultats;
    }

}
