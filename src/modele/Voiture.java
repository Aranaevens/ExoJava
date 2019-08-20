package modele;

public class Voiture
{
	protected String marque;
	protected String modele;
	protected int nbPortes;
	protected int vitesseActuelle;
	protected boolean marche;
	
	public Voiture(String marque, String modele, int nbPortes)
	{
		this.marque = marque;
		this.modele = modele;
		this.nbPortes = nbPortes;
		this.vitesseActuelle = 0;
		this.marche = false;
	}
	
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getModele() {
		return modele;
	}
	public void setModele(String modele) {
		this.modele = modele;
	}
	public int getNbPortes() {
		return nbPortes;
	}
	public void setNbPortes(int nbPortes) {
		this.nbPortes = nbPortes;
	}
	public int getVitesseActuelle() {
		return vitesseActuelle;
	}
	public void setVitesseActuelle(int vitesseActuelle) {
		this.vitesseActuelle = vitesseActuelle;
	}
	
	public void demarrer()
	{
		this.marche = true;
		System.out.printf("La voiture %s démarre\n", marque);
	}
	
	public void stopper()
	{
		this.marche = false;
		System.out.printf("La voiture %s s'arrête\n", marque);
	}
	
	public void accelerer(int nb)
	{
		if (!marche)
		{
			System.out.println("La voiture doit d'abord démarrer");
		}
		this.vitesseActuelle += nb;
		System.out.printf("La voiture %s accélère de %d km/h\n", marque, nb);
	}
	
	public void ralentir(int nb)
	{
		if (nb > vitesseActuelle)
		{
			vitesseActuelle = 0;
		}
		else
		{
			vitesseActuelle -= nb;
			System.out.printf("La voiture %s ralentit de %d km/h\n", marque, nb);
		}
	}
	
	public void infos()
	{
		System.out.printf("Nom et modèle du véhicule : %s %s\n", marque, modele);
		System.out.printf("Nombre de portes : %d\n", nbPortes);
		
		System.out.printf("Le véhicule %s", marque);
		System.out.printf(this.marche ? "est en marche\n" : "est à l'arrêt\n");
		
		System.out.printf("Sa vitesse actuelle est de : %d km/h\n", vitesseActuelle);
	}
}
