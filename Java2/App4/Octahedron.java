/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class Octahedron extends Shape
{
	/**
	 * Constructor for 'Octahedron'
	 <p>
	 * Initializes Octahedron with ribLength 1.0
	 */
	public Octahedron()
	{
		setRiblength(1.0);
	}
	
	/**
	 * Constructor for 'Octahedron'
	 <p>
	 * Initializes Octahedron with ribLength 1.0
	 * 
	 * @param newRiblength Length of ribs (as double)
	 */
	public Octahedron(double newRiblength)
	{
		setRiblength(newRiblength);
	}
	
	/**
	 * Calculates the volume of the Octahedron
	 * 
	 * @return  Volume of Octahedron (as double)
	 */
	public double volume()
	{
		return (1.0/3.0) * Math.sqrt(2.0) * Math.pow(getRiblength(), 3);
	}
	
	/**
	 * Calculates the area of the Octahedron
	 * 
	 * @return  Area of Octahedron (as double)
	 */
	public double area()
	{
		return 2.0 * Math.sqrt(3.0) * Math.pow(getRiblength(), 2);
	}
}
