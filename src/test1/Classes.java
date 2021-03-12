package test1;

import java.util.ArrayList;
import java.util.List;

public class Classes {
	private List <Etudiant> listetudiants;
	
	public Classes ()
	{
		listetudiants = new ArrayList<Etudiant>();
	}
	
	public void PresenterClasse()
	{
		System.out.println("la classe se compose de " + listetudiants.size() +" étudiants :");
		for (int i=0;i < listetudiants.size(); i++)
		{
			System.out.println(listetudiants.get(i));
		}
	}
	
	public Etudiant getEtudiant(int index)
	{
		return listetudiants.get(index);
	}
	
	public void ajouteretudiant(Etudiant p_listetudiants)
	{
		listetudiants.add(p_listetudiants);
	}
	
	public void retireretudiant(int index)
	{
		listetudiants.remove(index);
	}
}


