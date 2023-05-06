import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Modele {
    private DonneesPersonnes donneesPersonnes;
    public Modele() {
        donneesPersonnes = new DonneesPersonnes();
        
        String genreFemme2="Femme";
        String nomFemme2="Sophie Dupont";
        File img_f2 = new File("image_projet/femme_projet/2.jpg");
        String villeP2="Strasbourg";
        int ageFemme2=30;
        int numeroFemme2=13313453;
        String[] affinite_p2 = {"Voyages", "Danse", "Cuisine", "Sport"};
        String descriptionP2 = "Je suis Sophie Dupont";
        Personne p2 = new Personne(genreFemme2,nomFemme2, ageFemme2, numeroFemme2,villeP2, affinite_p2, img_f2,descriptionP2);
        donneesPersonnes.ajouterPersonne("Sophie Dupont", p2);
        
        String genreFemme3="Femme";
        String nomFemme3="Maut Claire";
        File img_f3 = new File("image_projet/femme_projet/3.jpg");
        String villeP3="Paris";
        int ageFemme3=42;
        int numeroFemme3=13322453;
        String[] affinite_p3 = {"Vegetarien","Arts","Cuisine","Musique","Sport","Voyage"};
        String descriptionP3 = "Je suis "+ nomFemme3;
        Personne p3 = new Personne(genreFemme3,nomFemme3, ageFemme3, numeroFemme3,villeP3, affinite_p3, img_f3,descriptionP3);
        donneesPersonnes.ajouterPersonne(nomFemme3, p3);
        
        String genreFemme4="Femme";
        String nomFemme4="Charlotte Siri";
        File img_f4 = new File("image_projet/femme_projet/4.jpg");
        String villeP4="Marseille";
        int ageFemme4=23;
        int numeroFemme4=0002211;
        String[] affinite_p4 = {"Lecture","Arts","Photographie","Eco-responsable","Theatre","Sport","Voyage"};
        String descriptionP4 = "Je suis "+ nomFemme4;
        Personne p4 = new Personne(genreFemme4,nomFemme4, ageFemme4, numeroFemme4,villeP4, affinite_p4, img_f4,descriptionP4);
        donneesPersonnes.ajouterPersonne(nomFemme4, p4);
        
        String genreFemme5="Femme";
        String nomFemme5="Natalie";
        File img_f5 = new File("image_projet/femme_projet/5.jpg");
        String villeP5="Bordeaux";
        int ageFemme5=26;
        int numeroFemme5=0002211;
        String[] affinite_p5 = {"Vegan","Arts","Cuisine","Minimaliste","Sport","Entrepeneur"};
        String descriptionP5 = "Je suis "+ nomFemme5;
        Personne p5 = new Personne(genreFemme5,nomFemme5, ageFemme5, numeroFemme5,villeP5, affinite_p5, img_f5,descriptionP5);
        donneesPersonnes.ajouterPersonne(nomFemme5, p5); 

    }
    
public List<Personne> trouverMatch(String[] critères, String genreUtilisateur, String villeUtilisateur, String trancheAge) {
	List<Personne> personnes = donneesPersonnes.getListePersonnes();
    List<Personne> résultats = new ArrayList<>();

    // Parcours de toutes les personnes de la base de données
    for (Personne personne : personnes) {
        int score = 0;

        // Vérification du genre de la personne
        if (!personne.getGenre().equalsIgnoreCase(genreUtilisateur)) {
            
            // Vérification de la ville de la personne
            if (personne.getVille().equalsIgnoreCase(villeUtilisateur)) {
                score++;
            }
            
            // Comparaison des affinités de la personne avec les critères de matching
            for (String affinité : personne.getAffinités()) {
                for (String critère : critères) {
                    if (affinité.equalsIgnoreCase(critère)) {
                        score++;
                    }
                }
            }
            
            // Vérification de la tranche d'âge de la personne
            int agePersonne = personne.getAge();
            if (trancheAge.equals("18-25") && agePersonne >= 18 && agePersonne <= 25) {
                score++;
            } else if (trancheAge.equals("25-35") && agePersonne >= 25 && agePersonne <= 35) {
                score++;
            } else if (trancheAge.equals("35-45") && agePersonne >= 35 && agePersonne <= 45) {
                score++;
            } else if (trancheAge.equals("Plus de 45") && agePersonne > 45) {
                score++;
            }
            
            // Ajout de la personne à la liste des résultats si elle a un score supérieur à 0
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
