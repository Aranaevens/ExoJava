package modele;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.*;

public class ExoBizarre
{
	public static void categoryAge (int age)
	{
		if (age < 6)
		{
			System.out.println("Cette catégorie d'âge n'est pas gérée");
		}
		
		else if (age < 8)
		{
			System.out.printf("L'enfant qui a %d appartient à la catégorie \"Poussin\"\n", age);
		}
		
		else if (age < 10)
		{
			System.out.printf("L'enfant qui a %d appartient à la catégorie \"Pupille\"\n", age);
		}
		
		else if (age < 12)
		{
			System.out.printf("L'enfant qui a %d appartient à la catégorie \"Minime\"\n", age);
		}
		
		else
		{
			System.out.printf("L'enfant qui a %d appartient à la catégorie \"Cadet\"\n", age);
		}
	}
	
	public static void isImposable(int age, char genre)
	{
		if (genre != 'F' && genre != 'M' && genre != 'f' && genre != 'm')
		{
			System.out.println("Ce genre n'est pas pris en compte");
			return;
		}
		
		System.out.printf("Age : %d\nSexe : %c\n", age, genre);
		
		if (age < 18)
		{
			System.out.println("La personne n'est pas imposable");
		}
		
		else if (age < 20 && (genre == 'M' || genre == 'm'))
		{
			System.out.println("La personne n'est pas imposable");
		}
		
		else if (age > 35 && (genre == 'F' || genre == 'f'))
		{
			System.out.println("La personne n'est pas imposable");
		}
		
		else
		{
			System.out.println("La personne est imposable");
		}
	}
	
	public static void tabVoiture(String[] tableau)
	{
		System.out.printf("Il y a %d marques de voitures dans le tableau :\n", tableau.length);
		
		for (String voiture : tableau)
		{
			System.out.println(voiture);
		}
	}
	
	public static void tabLangues(HashMap<String, String> tableau)
	{
		for(Map.Entry<String, String> entry : tableau.entrySet())
		{
			switch (entry.getValue())
			{
			case "FRA":
				System.out.printf("Salut %s\n", entry.getKey());
				break;
			case "ESP":
				System.out.printf("Hola %s\n", entry.getKey());
				break;
			case "ENG":
				System.out.printf("Hello %s\n", entry.getKey());
				break;
			default:
				System.out.printf("Hello %s\n", entry.getKey());
				break;
			}
		}
	}
	
	public static boolean isEmailValid(String email)
	{
		var pat = Pattern.compile("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*\\.[a-zA-Z]+$");
		var mat = pat.matcher(email);
		return mat.find();
	}
}
