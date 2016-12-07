/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class Bike extends Vehicle
{
	/**
	 * Declares 'lights' as 'private int'
	 */
	private int lights;
	/**
	 * Declares 'lightPowerSource' as 'private String'
	 */
	private String lightPowerSource;
	
	public int getLights() { return lights; }
	public void setLights(int newlights) { lights = newlights; }
	
	public String getLightpowersource() { return lightPowerSource; }
	public void setLightpowersource(String newLightpowersource) { lightPowerSource = newLightpowersource; }
	
	/**
	 * Constructor for 'Bike'
	 <p>
	 * Initializes all variables
	 * 
	 * @param newName              Name of the vehicle (as String)
	 * @param newMaxSpeed          Maximum speed of vehicle in km/h (as int)
	 * @param newLength            Length of vehicle in m (as double)
	 * @param newMass              Mass of vehicle in kg (as int)
	 * @param newlights            Amount of lights on bike (as int)
	 * @param newLightpowersource  Power source for lights (as String)
	 */
	public Bike(String newName, int newMaxSpeed, double newLength, int newMass, int newlights, String newLightpowersource)
	{
		super(newName, newMaxSpeed, newLength, newMass);
		
		setLights(newlights);
		setLightpowersource(newLightpowersource);
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
		System.out.println("\tLights: " + getLights());
		System.out.println("\tLights power source: " + getLightpowersource());
	}
}
