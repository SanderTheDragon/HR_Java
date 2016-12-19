/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class Icosahedron extends Shape
{
	/**
	 * Constructor for 'Icosahedron'
	 <p>
	 * Initializes Icosahedron with ribLength 1.0
	 */
	public Icosahedron()
	{
		setRiblength(1.0);
	}
	
	/**
	 * Constructor for 'Icosahedron'
	 <p>
	 * Initializes Icosahedron with given ribLength
	 * 
	 * @param newRiblength Length of ribs (as double)
	 */
	public Icosahedron(double newRiblength)
	{
		setRiblength(newRiblength);
	}
	
	/**
	 * Calculates the volume of the Icosahedron
	 * 
	 * @return  Volume of Icosahedron (as double)
	 */
	public double volume()
	{
		return (5.0/12.0) * (3.0 + Math.sqrt(5.0)) * Math.pow(getRiblength(), 3);
	}
	
	/**
	 * Calculates the area of the Icosahedron
	 * 
	 * @return  Area of Icosahedron (as double)
	 */
	public double area()
	{
		return 5.0 * Math.sqrt(3.0) * Math.pow(getRiblength(), 2);
	}
}
