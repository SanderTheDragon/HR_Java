public class App
{
	public static void main(String[] args)
	{
		Kluis kluis = new Kluis();
		
		for (int i = 0; i < 99999; i++)
		{
			if (kluis.open(Integer.toString(i)))
				break;
		}
		
		for (int i = 0; i < 47; i++)
		{
			System.out.println(kluis.haalop(i));
		}
		
		kluis.sluit();
	}
}
