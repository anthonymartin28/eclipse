package test1;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		
		Turritopsis med1 = new Turritopsis("nutriculae",5,500,"Turritopsis","bleue");
		
		Cochon pepa = new Cochon("pepa pig",120,10,"pork");
		
		Chien médor = new Chien("Médor",195,12,"matin de naple");
		Chien max = new Chien("max",4,1,"chiwawa");
		//médor.sePresenter();
		
		Etudiant anthony = new Etudiant("MARTIN","Anthony",19,"BTS SIO");
		Etudiant antony = new Etudiant("LAIGNEAU","Antony",19,"BTS SIO");
		Etudiant nom2 = new Etudiant("DUPOND","George",16,"BTS SIO");
		
		
		
		anthony.addanimal(med1);
		anthony.addanimal(médor);
		anthony.addanimal(max);
		anthony.addanimal(pepa);
		
		//anthony.dellanimal(0);
		
		anthony.sePresenter();
		
		
		
		
		Classes btssio = new Classes();
		btssio.ajouteretudiant(anthony);
		btssio.ajouteretudiant(antony);
		btssio.ajouteretudiant(nom2);
		// btssio.PresenterClasse();
		btssio.getEtudiant(0);
		
		
		//int[] tab1 = new int[5]; //tableau classique
		//int[] tab2 = {1,2,3,4,5,6}; //tableau pas bien
		
		
		List <Chien> chenil = new ArrayList<Chien>();// tableau facon objet
		chenil.add(médor);
		chenil.add(max);
		
		//for (int i=0;i < chenil.size(); i++)
		//{
		//	System.out.println(chenil.get(i));
		//}
		

		
		
		//int chiffre = 36;
		//int chiffre2 = 63;
		//System.out.println(chiffre + chiffre2);
		
		//String mots = "Hello world";
		
		//System.out.println(chiffre + chiffre2 +" "+ mots);
		
		//MaClasse val1 = new MaClasse(1);
		//MaClasse val2 = new MaClasse(2);
		
		//System.out.println(val1.prop);
		//System.out.println(val2.prop);
	}

}




