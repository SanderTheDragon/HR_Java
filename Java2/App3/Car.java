/**
 * @author  Sander Wolswijk <0926815@hr.nl>
 * @version 1.0
 */
public class Car extends Vehicle
{
	/**
	 * Declares 'doorCount' as 'private int'
	 */
	private int doorCount;
	/**
	 * Declares 'fuelType' as 'private String'
	 */
	private String fuelType;
	
	public int getDoorcount() { return doorCount; }
	public void setDoorcount(int newDoorcount) { doorCount = newDoorcount; }
	
	public String getFueltype() { return fuelType; }
	public void setFueltype(String newFueltype) { fuelType = newFueltype; }
	
	/**
	 * Constructor for 'Car'
	 <p>
	 * Initializes all variables
	 * 
	 * @param newName          Name of the vehicle (as String)
	 * @param newMaxSpeed      Maximum speed of vehicle in km/h (as int)
	 * @param newLength        Length of vehicle in m (as double)
	 * @param newMass          Mass of vehicle in kg (as int)
	 * @param newDoorcount     Amount of doors (as int)
	 * @param newFueltype      Fuel type of car (as String)
	 */
	public Car(String newName, int newMaxSpeed, double newLength, int newMass, int newDoorcount, String newFueltype)
	{
		super(newName, newMaxSpeed, newLength, newMass);
		
		setDoorcount(newDoorcount);
		setFueltype(newFueltype);
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
		System.out.println("\tDoor count: " + getDoorcount());
		System.out.println("\tFuel type: " + getFueltype());
	}
}
