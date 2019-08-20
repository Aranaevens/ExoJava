package modele;

public class ExoPhrase
{
	private String phrase;
	
	/*
	 * Construit un objet permettant les exos sur les phrases
	 * @param phrase
	 */
	public ExoPhrase(String input)
	{
		this.phrase = input;
	}
	
	public void charCount()
	{
		System.out.printf("La phrase \"%s\" contient %d caractères\n", phrase, phrase.chars().count());
	}
	
	public void wCount()
	{
		String[] words = phrase.split("\\s+");
		System.out.printf("La phrase \"%s\" contient %d mots\n", phrase, words.length);
	}
	
	public void wReplace(String toReplace, String into)
	{
		String phraseAlt = phrase;
		phraseAlt = phraseAlt.replaceAll(toReplace, into);
		System.out.println(phraseAlt);
	}
	
	public static boolean isPalindrome(String input)
	{
		String phraseAlt = input.toLowerCase();
		phraseAlt = phraseAlt.replaceAll("\\s+", "");
		int i = 0;
		var arr = phraseAlt.toCharArray();
		for (char ch : arr)
		{
			if (ch != arr[arr.length - i - 1])
			{
				return false;
			}
			i++;
		}
		return true;
	}
}
