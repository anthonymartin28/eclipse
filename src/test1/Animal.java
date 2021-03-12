package test1;

public class Animal {
	protected String nom;
	protected int taille;
	protected int age;
	protected String race;
	
	
	public Animal(String nom, int taille, int age, String race) {
		super();
		this.nom = nom;
		this.taille = taille;
		this.age = age;
		this.race = race;
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
