package elan;

import modele.ExoPhrase;
import modele.ExoBizarre;
import modele.ExoNombre;
import modele.Personne;
import modele.Voiture;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

/**
 * @author loki
 *
 */
public class Test {
	
	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException
	{
		String ex_one = "Notre formation DL commence aujourd'hui";
		var forEx = new ExoPhrase(ex_one);
		forEx.charCount();
		
		forEx.wCount();
		
		forEx.wReplace("aujourd'hui", "demain");
		
		System.out.printf(ExoPhrase.isPalindrome(ex_one) ? "true\n" : "false\n");
		System.out.printf(ExoPhrase.isPalindrome("Engage le jeu que je le gagne") ? "true\n" : "false\n");
		
		var conv = new ExoNombre();
		var conv_deeux = new ExoNombre(3.5);
		double montant = 100;
		System.out.printf("Montant en francs : %.0f\n%.0f francs = %.2f€\n", montant, montant, conv.moneyConversion(montant));
		System.out.printf("Montant en francs : %.0f\n%.0f francs = %.2f€\n", montant, montant, conv_deeux.moneyConversion(montant));
		
		ExoNombre.facture(9.99, 5, 20);
		
		ExoNombre.multTable(8);
		
		ExoBizarre.isImposable(32, 'F');
		ExoBizarre.isImposable(36, 'f');
		ExoBizarre.isImposable(36, 'M');
		
		ExoNombre.renduArgent(152, 200);
		
		var map = new HashMap<String, String>();
		map.put("Mickael", "FRA");
		map.put("Virgile", "ESP");
		map.put("Marie-Claire", "ENG");
		
		ExoBizarre.tabLangues(map);
		
		int[] notes = {10, 12, 8, 19, 3, 16, 11, 13, 9};
		ExoNombre.moyenne(notes);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.FRANCE);
		Date birth = sdf.parse("17/01/1985");
		ExoNombre.getAge(birth);
		
		Personne p1 = new Personne("DUPONT", "Michel", sdf.parse("19/02/1980"));
		Personne p2 = new Personne("DUCHEMIN", "Alice", sdf.parse("17/01/1985"));
		
		p1.afficherAge();
		p2.afficherAge();
		
		var v1 = new Voiture("Peugeot", "408", 5);
		var v2 = new Voiture("Citroën", "C4", 3);
		
		v1.demarrer();
		v1.accelerer(30);
		v1.infos();
		
		v2.infos();
		
		System.out.printf("elan@elan-formation.fr ");
		System.out.printf(ExoBizarre.isEmailValid("elan@elan-formation.fr") ? "est une adresse e-mail valide\n" : "est une adresse e-mail invalide\n");
		System.out.printf("contact@elan ");
		System.out.printf(ExoBizarre.isEmailValid("contact@elan") ? "est une adresse e-mail valide\n" : "est une adresse e-mail invalide\n");
	}
}
