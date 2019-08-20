package modele;

import java.util.Date;
import modele.ExoNombre;

public class Personne 
{
	private String nom;
	private String prenom;
	private Date naissance;
	
	public Personne(String nom, String prenom, Date naissance)
	{
		this.nom = nom;
		this.prenom = prenom;
		this.naissance = naissance;
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

	public Date getNaissance() {
		return naissance;
	}

	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	
	public void afficherAge()
	{
		System.out.printf("%s %s ", prenom, nom);
		ExoNombre.getAge(naissance);
	}
}
