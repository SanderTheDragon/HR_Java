/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class Dodecahedron extends Shape
{
	/**
	 * Constructor for 'Dodecahedron'
	 <p>
	 * Initializes Dodecahedron with ribLength 1.0
	 */
	public Dodecahedron()
	{
		setRiblength(1.0);
	}
	
	/**
	 * Constructor for 'Dodecahedron'
	 <p>
	 * Initializes Dodecahedron with given ribLength
	 * 
	 * @param newRiblength length of ribs (as double)
	 */
	public Dodecahedron(double newRiblength)
	{
		setRiblength(newRiblength);
	}
	
	/**
	 * Calculates the volume of the Dodecahedron
	 * 
	 * @return  Volume of Dodecahedron (as double)
	 */
	public double volume()
	{
		return (1.0/4.0) * (15.0 + 7.0 * Math.sqrt(5.0)) * Math.pow(getRiblength(), 3);
	}
	
	/**
	 * Calculates the area of the Dodecahedron
	 * 
	 * @return  Area of Dodecahedron (as double)
	 */
	public double area()
	{
		return 3.0 * Math.sqrt(25.0 + 10.0 * Math.sqrt(5.0)) * Math.pow(getRiblength(), 2);
	}
}
