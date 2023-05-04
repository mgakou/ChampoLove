import java.util.HashMap;

public class DonneesUtilisateurs {
	
    private HashMap<String, Utilisateur> utilisateurs;

    public DonneesUtilisateurs() {
        utilisateurs = new HashMap<String, Utilisateur>();
    }
    public void ajouterUtilisateur(String nomUtilisateur, Utilisateur utilisateur) {
        utilisateurs.put(nomUtilisateur, utilisateur);
    }
    public Utilisateur getUtilisateur(String nomUtilisateur) {
        return utilisateurs.get(nomUtilisateur);
    }
    
}
