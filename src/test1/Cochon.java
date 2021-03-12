package test1;

public class Cochon extends Animal{
	public Cochon(String nom, int taille, int age, String race)
	{
		super(nom, taille, age, race);
	}
	
	public void sePresenter()
	{
		System.out.println("je suis " + nom + " je fait " + taille + " cm, j'ai " + age + " ans et je suis un " + race + ".");
	}
	
	
	public String toString()
	{
		return "je suis " + nom + " je fait " + taille + " cm, j'ai " + age + " ans et je suis un " + race + " .";
	}
}
