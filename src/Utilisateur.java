
public class Utilisateur {
	String nomU,nom,prenom,genre,ville;
	int age,tel;
	public Utilisateur(String nU,String nom,String prenom,String genre, int tel,int age,String ville) {
		this.nomU=nU;
		this.nom=nom;
		this.prenom=prenom;
		this.genre=genre;
		this.age=age;
		this.tel=tel;
		this.ville=ville;
	}
	@Override
	public String toString() {
		return this.nomU+" "+ this.nom +" " + this.prenom+" "+this.genre+" "+ this.age+" "+this.tel+" "+this.ville;
	}
}
