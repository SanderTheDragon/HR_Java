public class Geheel implements Bewerkingen
{
	private int[] getallen;
	
	public Geheel(int[] a)
	{
		getallen = a;
	}
	
	public void print()
	{
		for(int i = 0; i < getallen.length; i++)
			System.out.print(getallen[i]);
		
		System.out.print("\n");
	}
	
	public void sorteer()
	{
		System.out.print("Gesorteerd: ");
		
		int[] sorted = new int[getallen.length];
		
		for (int i = 0; i < getallen.length; i++)
		{
			int index = 0;
			
			for (int j = 0; j < getallen.length; j++)
			{
				if (getallen[i] > getallen[j] || (i > j && getallen[i] == getallen[j]))
					index++;
			}
			
			sorted[index] = getallen[i];
		}
		
		getallen = sorted;
	}
	
	public void draaiom()
	{
		System.out.print("Omgedraaid: ");
		
		int[] sorted = new int[getallen.length];
		
		for (int i = 0; i < getallen.length; i++)
		{
			sorted[i] = getallen[getallen.length - (i + 1)];
		}
		
		getallen = sorted;
	}
	
	public boolean oplopend()
	{
		boolean isOplopend = true;
		
		for (int i = 1; i < getallen.length; i++)
		{
			if (getallen[i] < getallen[i - 1])
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
		
		for (int i = 1; i < getallen.length; i++)
		{
			if (getallen[i] > getallen[i - 1])
			{
				isAflopend = false;
				break;
			}
		}
		
		return isAflopend;
	}
}
