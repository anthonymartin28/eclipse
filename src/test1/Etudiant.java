package test1;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	
	
	private String nom;
	private String prenom;
	private int age;
	private String classe;

	private List<Animal> animaux;

	
	public Etudiant(String p_nom,String p_prenom,int p_age,String p_classe)
	{
		nom = p_nom;
		prenom = p_prenom;
		age = p_age;
		classe = p_classe;
		animaux = new ArrayList<Animal>();

		
	}
	
	public void sePresenter()
	{
		System.out.println("Je suis " + nom + " " + prenom + " j'ai " + age + " ans, je suis en " + classe + "et j'ai " +animaux.size() + " animaux :");
		for (int i=0;i < animaux.size(); i++)
		{
			System.out.println(animaux.get(i));
		}
		
	}
	
	
	
	
	public String toString()
	{
		return "Je suis " + nom + " " + prenom + " j'ai " + age + " ans, je suis en " + classe + " .";
		
	}
	
	
	
	
	
	public void addanimal(Animal anim)
	{
		animaux.add(anim);
	}
	
	public void dellanimal(int index)
	{
		animaux.remove(index);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	
	
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
}
