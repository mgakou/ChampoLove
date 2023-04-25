
public class Utilisateur {
	String nomU,nom,prenom;
	int age,tel;
	public Utilisateur(String nU,String nom,String prenom, int tel,int age) {
		this.nomU=nU;
		this.nom=nom;
		this.prenom=prenom;
		this.age=age;
		this.tel=tel;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return this.nomU+" "+ this.nom +" " + this.prenom+" "+this.age+" "+this.tel;
	}
}
