package test1;

public class Turritopsis extends Animal{
	
	private String couleur;
	
	public Turritopsis(String nom, int taille, int age, String race,String couleur)
	{
		super(nom, taille, age, race);
		this.couleur = couleur;
	}
	
	

	public void sePresenter()
	{
		System.out.println("je suis immortel je fait " + taille + " mm, j'ai " + age + " ans et je suis un " + race + " .");
	}
	
	public String toString()
	{
		return "je suis éternel je fait " + taille + " mm, j'ai " + age + " ans et je suis un " + race +" "+ nom + " " + couleur +  " !";
	}
	
	public String regen()
	{
		return "reconstitution des cellules en cours . . .";
	}
	

	
	
	
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
}
