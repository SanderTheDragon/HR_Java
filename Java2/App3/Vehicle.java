/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class Vehicle
{
	/**
	 * Declares 'name' as 'private String'
	 */
	private String name;
	/**
	 * Declares 'maxSpeed' as 'private int'
	 */
	private int maxSpeed;
	/**
	 * Declares 'length' as 'private double'
	 */
	private double length;
	/**
	 * Declares 'mass' as 'private int'
	 */
	private int mass;
	
	public String getName() { return name; }
	public void setName(String newName) { name = newName; }
	
	public int getMaxspeed() { return maxSpeed; }
	public void setMaxspeed(int newMaxspeed) { maxSpeed = newMaxspeed; }
	
	public double getLength() { return length; }
	public void setLength(double newLength) { length = newLength; }
	
	public int getMass() { return mass; }
	public void setMass(int newMass) { mass = newMass; }
	
	/**
	 * Constructor for 'Vehicle'
	 <p>
	 * Initializes all variables
	 * 
	 * @param newName          Name of the vehicle (as String)
	 * @param newMaxSpeed      Maximum speed of vehicle in km/h (as int)
	 * @param newLength        Length of vehicle in m (as double)
	 * @param newMass          Mass of vehicle in kg (as int)
	 */
	public Vehicle(String newName, int newMaxSpeed, double newLength, int newMass)
	{
		setName(newName);
		setMaxspeed(newMaxSpeed);
		setLength(newLength);
		setMass(newMass);
	}
	
	/**
	 * Prints value of all the variables
	 */
	public void print()
	{
		System.out.println("Name: " + getName() + ":");
		System.out.println("\tMaximum speed: " + getMaxspeed());
		System.out.println("\tLength: " + getLength());
		System.out.println("\tMass: " + getMass());
	}
}
