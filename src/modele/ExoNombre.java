package modele;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ExoNombre
{
	private double conversion;
	
	public ExoNombre()
	{
		this.conversion = 6.55957;
	}
	
	public ExoNombre(double conv)
	{
		this.conversion = conv;
	}
	
	public double moneyConversion(double montant)
	{
		return Math.abs(montant) / conversion;
	}
	
	public static void facture(double unit, int qte, float tva)
	{	
		if (tva > 1)
		{
			tva = tva / 100;
		}
		System.out.printf("Prix unitaire de l'article : %.2f\n", Math.abs(unit));
		System.out.printf("Quantité : %d\n", Math.abs(qte));
		System.out.printf("Taux de TVA : %.2f", Math.abs(tva));
		System.out.printf("Le montant de la facture à régler est de : %.2f\n", Math.abs(unit * qte * tva));
	}
	
	public static void multTable(int nb)
	{
		nb = Math.abs(nb);
		for (int i = 1; i < 10; i++)
		{
			System.out.printf("%d x %d = %d\n", i, nb, i * nb);
		}
	}
	
	public static void renduArgent(int payer, int verse)
	{
		if (payer > verse)
		{
			System.out.println("La somme versée n'est pas suffisante");
			return;
		}
		
		int reste = verse - payer;
		
		System.out.printf("Montant à payer : %d €\nMontant versé : %d €\nReste à payer : %d €\n", payer, verse, reste);
		System.out.println("*****************************");
		System.out.println("Rendue de monnaie :");
		
		int[] billets = {100, 50, 20, 10, 5};
		int[] pieces = {2, 1};
		
		for (int billet : billets)
		{
			int nb = reste / billet;
			reste = reste % billet;
			if (nb != 0)
			{
				System.out.printf("%d billets de %d €", nb, billet);
			}
		}
		
		for (int piece : pieces)
		{
			int nb = reste / piece;
			reste = reste % piece;
			if (nb != 0)
			{
				System.out.printf("%d pièces de %d € ", nb, piece);
			}
		}
		
		System.out.printf("\n");
	}
	
	public static void moyenne (int[] tableau)
	{
		System.out.printf("Les notes obtenues par l'élève sont : ");
		
		int sum = 0;
		
		for(int i : tableau)
		{
			System.out.printf("%d ", i);
			sum += i;
		}
		
		double moyenne = (double)sum / (double)tableau.length;
		
		System.out.printf("\nSa moyenne générale est donc de : %.2f\n", moyenne);
	}
	
	public static void getAge(Date birth)
	{
		Date today = Calendar.getInstance().getTime();
		long diffMilli = Math.abs(today.getTime() - birth.getTime());
		long diff = TimeUnit.DAYS.convert(diffMilli, TimeUnit.MILLISECONDS);
		long years = diff / 365;
		diff -= 365 * years;
		long months = diff / 30;
		diff -= 30 * months;
		System.out.printf("Age de la personne : %d ans %d mois %d jours\n", years, months, diff);
	}
}
