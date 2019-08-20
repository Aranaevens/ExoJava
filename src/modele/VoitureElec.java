package modele;

public class VoitureElec extends Voiture 
{
	private int autonomie;
	
	public VoitureElec(String marque, String modele, int nbPortes, int autonomie)
	{
		super(marque, modele, nbPortes);
		this.autonomie = autonomie;
	}

	public int getAutonomie() {
		return autonomie;
	}

	public void setAutonomie(int autonomie) {
		this.autonomie = autonomie;
	}
}
