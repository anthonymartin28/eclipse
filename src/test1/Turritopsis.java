package test1;

public class Turritopsis {
	private int taille;
	private int age;
	private String race;
	
	public Turritopsis(int p_taille,int p_age,String p_race)
	{
		taille = p_taille;
		age = p_age;
		race = p_race;
	}
	
	public void sePresenter()
	{
		System.out.println("je suis immortel je fait " + taille + " mm, j'ai " + age + " ans et je suis un " + race + " .");
	}
	
	
	public String toString()
	{
		return "je suis éternel je fait " + taille + " mm, j'ai " + age + " ans et je suis un " + race + " !";
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
