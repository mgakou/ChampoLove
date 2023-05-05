import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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

    public List<Personne> getListePersonnes() {
        return new ArrayList<Personne>(personnes.values());
    }
    // Autres méthodes pour accéder et modifier les données des personnes
}
