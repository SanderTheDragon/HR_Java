/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class Hexahedron extends Shape
{
	/**
	 * Constructor for 'Hexahedron'
	 <p>
	 * Initializes Hexahedron with ribLength 1.0
	 */
	public Hexahedron()
	{
		setRiblength(1.0);
	}
	
	/**
	 * Constructor for 'Hexahedron'
	 <p>
	 * Initializes Hexahedron with given ribLength
	 * 
	 * @param newRiblength length of ribs (as double)
	 */
	public Hexahedron(double newRiblength)
	{
		setRiblength(newRiblength);
	}
	
	/**
	 * Calculates the volume of the Hexahedron
	 * 
	 * @return  Volume of Hexahedron (as double)
	 */
	public double volume()
	{
		return Math.pow(getRiblength(), 3);
	}
	
	/**
	 * Calculates the area of the Hexahedron
	 * 
	 * @return  Area of Hexahedron (as double)
	 */
	public double area()
	{
		return 6.0 * Math.pow(getRiblength(), 2);
	}
}
