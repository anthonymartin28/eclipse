package test1;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
	
	
	private String nom;
	private String prenom;
	private int age;
	private String classe;
	private Chien chien1;
	
	Chien médor = new Chien("Médor",195,12,"matin de naple");
	Chien max = new Chien("max",4,1,"chiwawa");
	
	private List <Chien> leschiens;
	
	private List <Turritopsis> lesmed;
	
	public Etudiant(String p_nom,String p_prenom,int p_age,String p_classe)
	{
		nom = p_nom;
		prenom = p_prenom;
		age = p_age;
		classe = p_classe;
		leschiens = new ArrayList<Chien>();
		lesmed = new ArrayList<Turritopsis>();
	}
	
	public void sePresenter()
	{
		System.out.println("Je suis " + nom + " " + prenom + " j'ai " + age + " ans, je suis en " + classe + ", et j'ai " + leschiens.size() + " chien(s).");
		for (int i=0;i < leschiens.size(); i++)
		{
			System.out.println(leschiens.get(i));
		}
		
		for (int i=0;i < lesmed.size(); i++)
		{
			System.out.println(lesmed.get(i));
		}
		
	}
	
	public String toString()
	{
		return "Je suis " + nom + " " + prenom + " j'ai " + age + " ans, je suis en " + classe + ", et j'ai " + leschiens.size() + " chien(s).";
		
	}
	
	public void ajoutermed(Turritopsis p_Turritopsis)
	{
		lesmed.add(p_Turritopsis);
	}
	
	
	public void ajouterchien(Chien p_Chien)
	{
		leschiens.add(p_Chien);
	}
	
	public void retirerchien(int index)
	{
		leschiens.remove(index);
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

	
	
	public Chien getChien() {
		return chien1;
	}

	public void setChien(Chien chien1) {
		this.chien1 = chien1;
	}
}
