/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class RaceBike extends Bike
{
	/**
	 * Declares 'closedWheels' as 'private boolean'
	 */
	private boolean closedWheels;
	/**
	 * Declares 'wheelWidth' as 'private int'
	 */
	private int wheelWidth;
	
	public boolean getClosedwheels() { return closedWheels; }
	public void setClosedwheels(boolean newClosedwheels) { closedWheels = newClosedwheels; }
	
	public int getWheelwidth() { return wheelWidth; }
	public void setWheelwidth(int newWheelwidth) { wheelWidth = newWheelwidth; }
	
	/**
	 * Constructor for 'RaceBike'
	 <p>
	 * Initializes all variables
	 * 
	 * @param newName              Name of the vehicle (as String)
	 * @param newMaxSpeed          Maximum speed of vehicle in km/h (as int)
	 * @param newLength            Length of vehicle in m (as double)
	 * @param newMass              Mass of vehicle in kg (as int)
	 * @param newlights            Amount of lights on bike (as int)
	 * @param newLightpowersource  Power source for lights (as String)
	 * @param newClosedwheels      If the wheels are closed or not (as boolean)
	 * @param newWheelwidth        Width of the wheels in cm (as int)
	 */
	public RaceBike(String newName, int newMaxSpeed, double newLength, int newMass, int newlights, String newLightpowersource, boolean newClosedwheels, int newWheelwidth)
	{
		super(newName, newMaxSpeed, newLength, newMass, newlights, newLightpowersource);
		
		setClosedwheels(newClosedwheels);
		setWheelwidth(newWheelwidth);
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
		System.out.println("\tClosed wheels: " + getClosedwheels());
		System.out.println("\tWheel width: " + getWheelwidth());
	}
}
