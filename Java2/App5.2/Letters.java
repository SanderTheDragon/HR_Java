public class Letters implements Bewerkingen
{
	private char[] letters;
	
	public Letters(String s)
	{
		letters = new char[s.length()];
		
		for(int i = 0; i < s.length(); i++)
			letters[i] = s.charAt(i);
	}
	
	public void print()
	{
		System.out.print(String.valueOf(letters).trim());
		
		System.out.print("\n");
	}
	
	public void sorteer()
	{
		System.out.print("Gesorteerd: ");
		
		char[] sorted = new char[letters.length];
		
		for (int i = 0; i < letters.length; i++)
		{
			int index = 0;
			
			for (int j = 0; j < letters.length; j++)
			{
				if (Character.toLowerCase(letters[i]) > Character.toLowerCase(letters[j]) || (i > j && Character.toLowerCase(letters[i]) == Character.toLowerCase(letters[j])))
					index++;
			}
			
			sorted[index] = letters[i];
		}
		
		letters = sorted;
	}
	
	public void draaiom()
	{
		System.out.print("Omgedraaid: ");
		
		char[] sorted = new char[letters.length];
		
		for (int i = 0; i < letters.length; i++)
		{
			sorted[i] = letters[letters.length - (i + 1)];
		}
		
		letters = sorted;
	}
	
	public boolean oplopend()
	{
		boolean isOplopend = true;
		
		for (int i = 1; i < letters.length; i++)
		{
			if (Character.toLowerCase(letters[i]) < Character.toLowerCase(letters[i - 1]))
			{
				isOplopend = false;
				break;
			}
		}
		
		return isOplopend;
	}
	
	public boolean aflopend()
	{
		boolean isAflopend = true;
		
		for (int i = 1; i < letters.length; i++)
		{
			if (Character.toLowerCase(letters[i]) > Character.toLowerCase(letters[i - 1]))
			{
				isAflopend = false;
				break;
			}
		}
		
		return isAflopend;
	}
}
