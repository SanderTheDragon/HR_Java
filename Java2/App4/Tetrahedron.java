/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class Tetrahedron extends Shape
{
	/**
	 * Constructor for 'Tetrahedron'
	 <p>
	 * Initializes Tetrahedron with ribLength 1.0
	 */
	public Tetrahedron()
	{
		setRiblength(1);
	}
	
	/**
	 * Constructor for 'Tetrahedron'
	 <p>
	 * Initializes Tetrahedron with given ribLength
	 * 
	 * @param newRiblength Length of ribs (as double)
	 */
	public Tetrahedron(double newRiblength)
	{
		setRiblength(newRiblength);
	}
	
	/**
	 * Calculates the volume of the Tetrahedron
	 * 
	 * @return   Volume of Tetrahedron (as double)
	 */
	public double volume()
	{
		return (1.0/12.0) *  Math.pow(getRiblength(), 3) * Math.sqrt(2.0);
	}
	
	/**
	 * Calculates the area of the Tetrahedron
	 * 
	 * @return   Area of Tetrahedron (as double)
	 */
	public double area()
	{
		return Math.pow(getRiblength(), 2) * Math.sqrt(3.0);
	}
}
