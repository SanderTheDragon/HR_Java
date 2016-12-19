/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class Researcher
{
	/**
	 * Checks if any item in value is null
	 * 
	 * @param shapes An array of shapes (as Shape[])
	 * 
	 * @return   True if no items are null, false if any item is null (as boolean)
	 */
	private boolean check(Shape[] shapes)
	{
		for (int i = 0; i < shapes.length; i++)
		{
			if (shapes[i] == null)
				return false;
		}
		
		return true;
	}
	
	/**
	 * Finds the maximum volume from a list and print that
	 * 
	 * @param shapes An array of shapes (as Shape[])
	 */
	public void maxVolume(Shape[] shapes)
	{
		if (!check(shapes))
		{
			System.out.println("Array is invalid!");
			System.out.println("");
			
			return;
		}
		
		Shape max = shapes[0];
		
		for (int i = 1; i < shapes.length; i++)
		{
			if (shapes[i].volume() > max.volume())
				max = shapes[i];
		}
		
		System.out.println("Maximum volume: ");
		max.print();
	}
	
	/**
	 * Finds the minimum area from a list and print that
	 * 
	 * @param shapes An array of shapes (as Shape[])
	 */
	public void minArea(Shape[] shapes)
	{
		if (!check(shapes))
		{
			System.out.println("Array is invalid!");
			System.out.println("");
			
			return;
		}
		
		Shape min = shapes[0];
		
		for (int i = 1; i < shapes.length; i++)
		{
			if (shapes[i].area() < min.area())
				min = shapes[i];
		}
		
		System.out.println("Minimum area: ");
		min.print();
	}
	
	/**
	 * Finds the maximum volume from a list and print that
	 * 
	 * @param shapes An array of shapes (as Shape[])
	 */
	public void maxRatio(Shape[] shapes)
	{
		if (!check(shapes))
		{
			System.out.println("Array is invalid!");
			System.out.println("");
			
			return;
		}
		
		Shape max = shapes[0];
		
		for (int i = 1; i < shapes.length; i++)
		{
			if (shapes[i].volume() / shapes[i].area() > max.volume() / max.area())
				max = shapes[i];
		}
		
		System.out.println("Maximum ratio: ");
		max.print();
	}
}
