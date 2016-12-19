/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public abstract class Shape
{
	/**
	 * Declares 'ribLength' as 'private double'
	 */
	private double ribLength;
	
	public double getRiblength() { return ribLength; }
	public void setRiblength(double newRiblength) { ribLength = newRiblength; }
	
	/**
	 * Constructor for 'Shape'
	 <p>
	 * Initializes Shape with ribLength 1.0
	 */
	public Shape()
	{
		ribLength = 1;
	}
	
	/**
	 * Constructor for 'Shape'
	 <p>
	 * Initializes Shape with given ribLength
	 * 
	 * @param newRiblength Length of ribs (as double)
	 */
	public Shape(double newRiblength)
	{
		ribLength = newRiblength;
	}
	
	/**
	 * Abstract function volume
	 * <p>
	 * Calculates the volume of the shape
	 */
	public abstract double volume();
	
	/**
	 * Abstract function area
	 * <p>
	 * Calculates the area of the shape
	 */
	public abstract double area();
	
	/**
	 * Prints all data from a shape
	 */
	public void print()
	{
		System.out.println(this.getClass().getSimpleName() + ": ");
		System.out.println("\tRib length: " + ribLength);
		System.out.println("\tVolume: " + volume());
		System.out.println("\tArea: " + area());
		System.out.println("");
	}
}
