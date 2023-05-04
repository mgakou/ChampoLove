
public class Utilisateur {
	String nomU,nom,prenom,genre;
	int age,tel;
	public Utilisateur(String nU,String nom,String prenom,String genre, int tel,int age) {
		this.nomU=nU;
		this.nom=nom;
		this.prenom=prenom;
		this.genre=genre;
		this.age=age;
		this.tel=tel;
	}
	@Override
	public String toString() {
		return this.nomU+" "+ this.nom +" " + this.prenom+" "+this.genre+" "+ this.age+" "+this.tel;
	}
}
