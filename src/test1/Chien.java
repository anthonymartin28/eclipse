package test1;

public class Chien {
	private String nom;
	private int taille;
	private int age;
	private String race;
	
	public Chien(String p_nom,int p_taille,int p_age,String p_race)
	{
		nom = p_nom;
		taille = p_taille;
		age = p_age;
		race = p_race;
	}
	
	public void sePresenter()
	{
		System.out.println("je suis " + nom + " je fait " + taille + " cm, j'ai " + age + " ans et je suis un " + race + ".");
	}
	
	
	public String toString()
	{
		return "je suis " + nom + " je fait " + taille + " cm, j'ai " + age + " ans et je suis un " + race + "!";
	}
	
	
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}
}
